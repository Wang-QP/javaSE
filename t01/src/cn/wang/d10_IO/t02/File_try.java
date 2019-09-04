package cn.wang.d10_IO.t02;

import java.io.FileWriter;
import java.io.IOException;

public class File_try {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
            fw = new FileWriter("t01\\src\\cn\\wang\\d10_IO\\file\\c.txt",true);//续写
            for (int i = 0; i < 10; i++) {
                fw.write("helloworld"+i+"\r\n");
            }
            fw.flush();
        }catch (IOException e){
            System.out.println(e);
        }
        finally {
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static void func(){
        try(FileWriter fw = new FileWriter("t01\\src\\cn\\wang\\d10_IO\\file\\c.txt",true);){
            for (int i = 0; i < 10; i++) {
                fw.write("helloworld"+i+"\r\n");
            }
            fw.flush();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
