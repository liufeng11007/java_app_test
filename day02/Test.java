package day02;

public class Test {
    public static void main(String[] args) {
//        int a = addTest();
//        System.out.println(a);
//        System.out.println();
        Test test = new Test();
        test.useAdd();

    }
    public Test(){

    }

    public void useAdd(){
        System.out.println(addTest());
    }

    public static int addTest(){
        int a = 1;
        int b = 2;
        int sum = a + b;
//        System.out.println(sum);
        return sum;
    }
}
