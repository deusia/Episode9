//数字与静态
import java.util.Calendar;
import java.util.Date;

// 一、静态方法
// 1.静态方法没有实列，直接通过类名调用
// 2.静态方法不能调用该类的实列变量  ----》 类为一种蓝图，所以没有实物
// 3.静态方法中不能调用非静态方法
//
//二、静态变量
//1.静态变量何时存在
//当没有使用该类时，是没有的。然而当样使用该类时，JAVA虚拟机便会加载该类，且在该过程中初始化静态变量
//使用类的情况分为一下两种：
//    1、调用静态方法
//    2、创建该类的实列
//
//三、final 关键词
//用法：
//      1.标记的变量无法被修改
//      2.标记的方法无法被覆盖
//      3.表的的类无法被继承
//
public class Test {
    public static void main(String[] args) {
        double number = 3.14159265358;
//        System.out.println(Math.round(number));
//        System.out.println(Math.PI);
//        Math.random() 返回一个在0.0~1.0之间的小数
//        System.out.println(Math.random());
//        Date today = new Date();
//        String.format("%tc", today);
//        System.out.println(today);

        Calendar cal = Calendar.getInstance();
        cal.set(2019,7,21,2,27,44);
        System.out.println(cal.get(Calendar.SECOND));

        Calendar time = Calendar.getInstance();
        time.setTimeInMillis(12345);
//        System.out.println(time.toString());
//        long day =cal.getTimeInMillis();
//        System.out.println(cal.getTime());   //返回set的时间
//        cal.set(cal.DATE,35);
//        System.out.println();
    }
}