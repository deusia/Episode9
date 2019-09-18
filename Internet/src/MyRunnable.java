public class MyRunnable implements Runnable {

    //该Runnable接口的方法必须完成
    public void run() {
        for (int i=0;i<25;i++){
            String threadName=Thread.currentThread().getName();
            System.out.println(threadName+" is running.");
        }
    }


    public void doMore(){
        System.out.println("top o' the stack");

    }
    public void go(){
        try {
            Thread.sleep(2000);   //看样子是一个静态方法
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        doMore();
    }
}

