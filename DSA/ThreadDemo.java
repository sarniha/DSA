class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10 ;i++)
        System.out.println("child thread");
    }
}
class myRunnable implements Runnable{
    public void run(){
    System.out.println("child thread using runnable");
            System.out.println(Thread.currentThread().getName());

    }
}
public class ThreadDemo{
    public static void main(String[] args){
        MyThread t=new MyThread();
        t.start();
        for(int i=0;i<10;i++){
        System.out.println("main thread");
        }
        myRunnable r=new myRunnable();
        Thread t1=new Thread(r);
        t1.start();
        Thread.currentThread().setName("tristan");
        

    }
}