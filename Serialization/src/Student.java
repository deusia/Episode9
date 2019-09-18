import  java.io.*;
//Student的对象要被序列化必须实现Serializable接口
public class Student implements Serializable {
    private String name;
    private int id;
    private int age;
    private  String gender;
    private  String address;

    public void setId(int id_){id=id_;}
    public int getId(){return id;}
    public void setName(String name_){name=name_;}
    public String getName(){ return name; }
    public void setAge(int age_){age=age_;}
    public int getAge(){ return age; }
    public void setAddress(String address_){address=address_;}
    public String getAddress(){return address;}

    public static void main(String[] args) {
        Student jack=new Student();
        jack.setName("Jason Gu");
        jack.setAge(55);
        jack.setAddress("中华人民共和国江苏省苏州市吴江区");
        jack.setId(15);
        //序列化学生对象
        try {
            //创建文件输出将流对象
            FileOutputStream fileString=new FileOutputStream("test.txt");
            //对象输出，参数为文件输出流的对象
            ObjectOutputStream os=new ObjectOutputStream(fileString);
            //将Student的对象jack输出
            os.writeObject(jack);
            os.close();
        }catch (Exception ex){
            ex.printStackTrace();
            ex.getCause();
        }


        //解序列学生对象
        try {
            FileInputStream fileString =new FileInputStream("test.txt");
            ObjectInputStream is=new ObjectInputStream(fileString);
            Student test=(Student) is.readObject();

            System.out.println("One type:"+test.getName());
            System.out.println("One type:"+test.getAge());
            System.out.println("One type:"+test.getAddress());
            System.out.println("One type:"+test.getId());

        }catch (Exception ex){
            ex.printStackTrace();
            ex.getCause();
        }

    }
}