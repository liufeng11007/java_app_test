import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args){
//        System.out.println("hello !!!!!!!");

        //创建一维数组
        // 第一种方式：
        String[] a = new String[5];
        a[0] = "我";
        a[1] = "是";
        a[2] = "最";
        a[3] = "棒";
        a[4] = "的";
        System.out.println(a[0]);
        System.out.println(Arrays.toString(a));
        // 第二种方式
        String[] b = {"我","是","最","棒","的"};
        System.out.println(b[3]);
        System.out.println(Arrays.toString(b));

        // 创建int类型数组
        int[] c = new int[5];
        c[0] = 100;
        c[1] = 200;
        c[2] = 300;
        c[3] = 400;
        c[4] = 500;
        System.out.println(c[4]);
        System.out.println(Arrays.toString(c));
        // 第二种方式
        int[] d = {100,200,300,400,500};
        System.out.println(d[2]);
        System.out.println(Arrays.toString(d));

        // 创建二维数组
        // 第一种方式
        String[][] e = new String[2][2];
        e[0][0] = "第一个";
        e[0][1] = "二维";
        e[1][0] = "数";
        e[1][1] = "组";
        System.out.println(e[0][1]);
        System.out.println(Arrays.deepToString(e));
        // 第二种
        String[][] f = {{"第一个","二维"},{"数","组"}};
        System.out.println(f[1][0]);
        System.out.println(Arrays.deepToString(f));
        // 创建二维数组 int 类型
        // 第一种方式
        int[][] g = new int[3][2];
        g[0][0] = 50;
        g[0][1] = 60;
        g[1][0] = 70;
        g[1][1] = 80;
        g[2][0] = 90;
        g[2][1] = 100;
        System.out.println(g[2][0]);
        System.out.println(Arrays.deepToString(g));
        // 第二种方式
        int[][] h = {{50,60},{70,80},{90,100}};
        System.out.println(g[2][1]);
        System.out.println(Arrays.deepToString(g));
    }
}
