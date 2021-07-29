import sun.awt.windows.ThemeReader;

import java.util.Date;

public class thread_synchronized {
    public static String obj1 = "obj1";
    public static String obj2 = "obj2";

    public static void main(String[] args) {
        LockA la = new LockA();
        new Thread(la).start();
        LockB lb = new LockB();
        new Thread(lb).start();

    }
}

//加锁的线程A
class LockA implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockA 开始执行");
            while(true){
//                给实例化对象加锁
                synchronized (thread_synchronized.obj1){
                    System.out.println(new Date().toString() + "LockA 锁住 obj1");
                    Thread.sleep(3000);//等待，给B能锁住的机会
                    synchronized (thread_synchronized.obj2){
                        System.out.println(new Date().toString() + "LockA 锁住 obj2");
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class LockB implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println(new Date().toString() + "LockB 开始执行");
            while (true){
                synchronized (thread_synchronized.obj2){
                    System.out.println(new Date().toString() + " LockB 锁住 obj2");
                    Thread.sleep(3000);
                    synchronized (thread_synchronized.obj1){
                        System.out.println(new Date().toString() + "LockB 锁住了 obj1");
                        Thread.sleep(60 * 1000);//站着不放
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}