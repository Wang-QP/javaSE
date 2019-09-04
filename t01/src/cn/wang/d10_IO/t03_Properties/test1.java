package cn.wang.d10_IO.t03_Properties;

import java.util.Properties;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {
        /*
        java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
        Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。
        Properties集合是一个唯一和IO流相结合的集合
            可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
            可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对),读取到集合中使用

        属性列表中每个键及其对应值都是一个字符串。
            Properties集合是一个双列集合,key和value默认都是字符串
     */

        Properties p = new Properties();
        p.setProperty("xm","18");
        p.setProperty("xh","16");
        p.setProperty("xg","17");

        Set<String> set = p.stringPropertyNames();
        for (String key : set) {
            String value = p.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
