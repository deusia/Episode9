class ThreadTestDrive{
    public static void main(String[] args) {
        //创建线程任务对象
        Runnable threadJob_one = new MyRunnable();
        Runnable threadJob_two = new MyRunnable();
        //创建一条线程，并将创建的线程任务分配给该线程
        Thread myThread_one = new Thread(threadJob_one);
        Thread myThread_two = new Thread(threadJob_two);
        //给线程去个名字
        myThread_one.setName("Wan");
        myThread_two.setName("Su   n");
        //启动线程，并执行线程的任务
        myThread_one.start();
        myThread_two.start();
    }
}