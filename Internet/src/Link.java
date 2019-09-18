import java.io.*;
import java.net.*;
public class Link {
    public static void main(String[] args) {
        Link client=new Link();
        client.go();
    }
    public void go() {
        try {
            //连接到服务器,此处选择自己电脑的地址和端口
            Socket client = new Socket("47.102.133.86", 3489);
            //获取从服务器要来的流
            InputStreamReader stringReader = new InputStreamReader(client.getInputStream());
            //将获得的流转换成字符
            BufferedReader reader=new BufferedReader(stringReader);
            //将获得字符存入变量之中
            String word=reader.readLine();
            System.out.println("today you should "+word);
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }



}
