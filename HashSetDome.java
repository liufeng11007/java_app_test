import java.util.HashSet;
import java.util.Iterator;

public class HashSetDome {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet();
        hashset.add("张三");
        hashset.add("李四");
        hashset.add("王五");
        hashset.add("赵六");
        // 判断是否为空
        System.out.println("是否为空： "+hashset.isEmpty());
        // 大小
        System.out.println("大小为： "+hashset.size());
        // 是否包含 王五
        System.out.println("是否包含王五： "+hashset.contains("王五"));
        // 删除张三
        System.out.println("删除张三： "+hashset.remove("张三"));
        // 利用迭代器迭代获取set集合中的每个元素，并打印
        System.out.println("迭代器打印集合中的每个元素： ");
        Iterator<String> ite = hashset.iterator();
        while (ite.hasNext()){
            System.out.print(ite.next()+"\t");
        }
        System.out.println();
        System.out.println("增强for循环打印集合中的每个元素： ");
        // 增强for循环
        for(String arr : hashset){
            System.out.println(arr);
        }

    }
}
