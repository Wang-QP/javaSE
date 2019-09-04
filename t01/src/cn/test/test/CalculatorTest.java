package cn.test.test;

import cn.test.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    /**
     * 初始化代码
     * 用于资源申请，所以测试方法在执行前都会先执行此方法
     */
    @Before
    public void init(){
        System.out.println("init...");
    }

    /**
     * 释放资源的方法
     * 在所以测试方法执行完后都会执行此方法
     */
    @After
    public void close(){
        System.out.println("close...");
    }

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        int add = c.add(1, 2);
        System.out.println(add);

        //断言
        Assert.assertEquals(3,add);
    }

    @Test
    public void testSub() {
        Calculator c = new Calculator();
        int sub = c.sub(1,2);
        System.out.println("testSub...");
        Assert.assertEquals(-1,sub);
    }
}
