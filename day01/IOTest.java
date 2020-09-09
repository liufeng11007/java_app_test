package day01;

import java.io.*;

public class IOTest {
    // 第一种 异常： try  catch
    /*public static void main(String[] args) {
        File file = new File("F:\\lemon\\java\\src\\day01\\text.txt");
        try {
            FileReader fileReader = new FileReader(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("文件找不到，请检查文件路径是否准确");
        }
    }*/
    // 第二种 2异常 不在当前处理，而是把异常抛给上一级调用者
    public static void main(String[] args) throws IOException {
        writeFile("F:\\lemon\\java\\src\\day01\\text.txt");
        readFile("F:\\lemon\\java\\src\\day01\\text.txt");

        copyFile("F:\\lemon\\java\\src\\day01\\before.txt","F:\\lemon\\java\\src\\day01\\after.txt");


    }

    public static void readFile(String filePath) throws IOException {
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        // 关闭流
        bufferedReader.close();
    }

    public static void writeFile(String filePath) throws IOException {
        File file = new File(filePath);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("hello ");
        bufferedWriter.write("aaron ");
        // 换行
        bufferedWriter.newLine();
        bufferedWriter.write("Good Monning");
        // 关闭流
        bufferedWriter.close();
    }

    public static void copyFile(String srcFilePath, String targetFilePath) throws IOException {
        File srcFile = new File(srcFilePath);
        File targetFile = new File(targetFilePath);
        //创建FileInputStream对象
        FileInputStream fileInputStream = new FileInputStream(srcFile);
        //创建FileOutputStream对象
        FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
        //缓冲流--字节读取
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        // 缓冲流-字节写入
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        while(true){
            // 规定每次读取的字节长度 1024字节=1KB
            byte[] arr = new byte[1024];
            // read 返回值不是用来保存读取的结果，读取的状态，为-1 表示已经读到文件末尾
            int status = bufferedInputStream.read(arr);
            //写入
            bufferedOutputStream.write(arr);
            if(status==-1){
                break;
            }
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
