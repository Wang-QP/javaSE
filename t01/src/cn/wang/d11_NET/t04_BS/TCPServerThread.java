package cn.wang.d11_NET.t04_BS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerThread {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        while (true){
            try {
                Socket socket = server.accept();
                InputStream is = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line = br.readLine();
                System.out.println(line);
                String[] arr = line.split(" ");
                String htmlpath = arr[1].substring(1);

                FileInputStream fis = new FileInputStream(htmlpath);
                OutputStream os = socket.getOutputStream();

                os.write("HTTP/1.1 200 OK\r\n".getBytes());
                os.write("Content‐Type:text/html\r\n".getBytes());
                os.write("\r\n".getBytes());

                byte[] bytes = new byte[1024];
                int len = 0;
                while ((len = fis.read(bytes))!=-1){
                    os.write(bytes,0,len);
                }
                fis.close();
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

//        server.close();
    }
}
