package day01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
    public static void main(String [] args){
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("name","张三");
        hashMap.put("age","20");
        hashMap.put("height","180");
        hashMap.put("age","18");
        System.out.println(hashMap.get("name"));
        System.out.println(hashMap.get("age"));

        System.out.println(hashMap.remove("age"));
        System.out.println(hashMap.size());

        Set<String> allkeys = hashMap.keySet();
        for(String key : allkeys){
            System.out.println(key);
        }

        Collection<String> allValue = hashMap.values();
        for(String value : allValue){
            System.out.println(value);
        }
        System.out.println(hashMap.containsKey("name"));
        System.out.println(hashMap.containsValue("180"));

        Set<Entry<String, String>> allKeyValeu= hashMap.entrySet();
        for(Entry<String,String> keyvalue : allKeyValeu){
            //System.out.println("键名： "+keyvalue.getKey()+"\t"+"键值： "+keyvalue.getValue());
            System.out.println(keyvalue.getKey()+" : "+keyvalue.getValue());
            //System.out.println("键值： "+keyvalue.getValue());
        }
    }

}
