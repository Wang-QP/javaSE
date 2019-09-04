package cn.wang.test;

import cn.wang.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;

public class JacesonTest {
    @Test
    public void test1() throws JsonProcessingException {
        Person p = new Person();
        p.setName("xm");
        p.setAge(18);
        p.setGender("man");
        p.setDate(new Date());

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(p);
        System.out.println(s);

//        mapper.writeValue();  //写到文件或流
    }

    @Test
    public void test2() throws IOException {
        String json = "{\"name\":\"xm\",\"age\":18,\"gender\":\"man\",\"date\":\"2019-07-26\"}";

        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);
    }
}
