package cn.wang.d11_NET.t02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        File file = new File("t01\\src\\cn\\wang\\d11_NET\\file");
        if(!file.exists()){
            file.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(file+"\\pic.jpg");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        socket.getOutputStream().write("上传成功".getBytes());
        fos.close();
        is.close();
        socket.close();
    }
}
