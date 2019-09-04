package cn.wang.service.impl;

import cn.wang.dao.ProvinceDao;
import cn.wang.dao.impl.ProvinceDaoImpl;
import cn.wang.domain.Province;
import cn.wang.service.ProvinceService;
import cn.wang.util.JedisPoolUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    private ProvinceDao dao = new ProvinceDaoImpl();
    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }

    @Override
    public String findAllJson() {
        Jedis jedis = JedisPoolUtils.getJedis();

        String province_json = jedis.get("province");
        if (province_json == null || province_json.length() == 0) {
            System.out.println("redis中没有数据，访问数据库");
            List<Province> list = dao.findAll();
            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(list);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            jedis.set("province",province_json);
            jedis.close();
        } else {
            System.out.println("redis中有数据，访问缓存");
        }
        return province_json;
    }
}
