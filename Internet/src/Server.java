import java.io.*;
import java.net.*;

public class Server{
    String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat",
            "One word: inappropriate", "Just for today, be honest.  Tell your boss what you *really* think",
            "You might want to rethink that haircut"};

    public void go() {
        try {
            //使服务器开始监听来自自己4242端口的请求
            ServerSocket serverSock = new ServerSocket(4242);
            //一个无限循环不但进行监听
            while (true) {
                //服务器申请新的端口(随机获取)处理客户端的请求,把任务交给新的socket分配的端口
                Socket sock = serverSock.accept();
                //且4242端口继续保持监听，在新的端口上服务器发回请求的任务
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    //返回数组中随机的一条字符串
    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args)
    {
        Server server = new Server();
        server.go();
    }

}
