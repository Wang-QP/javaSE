package cn.wang.service;

import cn.wang.domain.Province;

import java.util.List;

public interface ProvinceService {
    public abstract List<Province> findAll();
    public abstract String findAllJson();
}
