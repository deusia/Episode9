import java.io.*;
public class WriteFile {
    public static void main(String[] args){
        //把字符串写入文本文件
        try {
            FileWriter writer=new FileWriter("Author.txt");
            writer.write("Arutoria Pendoragon");
            writer.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
