package day01;

public class Huawei extends Phone{
    @Override
    public void call(){
        System.out.println("用华为手机打电话");
    }

    @Override
    public void sendMessage(){
        System.out.println("用华为手机发短信");
    }

    public static void main(String[] args) {
        Huawei hw = new Huawei();
        hw.call();
        hw.sendMessage();
    }
}
