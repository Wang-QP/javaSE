package cn.wang.d11_NET.t03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        while (true){
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream is = socket.getInputStream();
                        File file = new File("t01\\src\\cn\\wang\\d11_NET\\file");
                        if(!file.exists()){
                            file.mkdir();
                        }
                        String picname = "wang"+System.currentTimeMillis()+new Random().nextInt(999)+".jpg";
                        FileOutputStream fos = new FileOutputStream(file+"\\"+picname);
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes))!=-1){
                            fos.write(bytes,0,len);
                        }

                        socket.getOutputStream().write("上传成功".getBytes());
                        fos.close();
                        is.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }

                }
            }).start();

        }
    }
}
