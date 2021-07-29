public class thread_priority extends Thread{
    private int countDown = 5;
//    限制变量，一次只能有一个线程操作，不用锁，他就在内存上
    private volatile double d = 0;
//    构造函数：设置优先级并且开启线程
    public thread_priority(int priority){
        setPriority(priority);
        start();
    }
    public String toString(){
        return super.toString() +":"+countDown;
    }

    @Override
    public void run() {
        while (true){
            for (int i = 0; i < 100000; i++) {
                d = d+(Math.PI + Math.E) / (double)i;
                System.out.println(this);
                if(--countDown == 0) return;
            }
        }
    }

    public static void main(String[] args) {
        new thread_priority(Thread.MAX_PRIORITY);
        for (int i = 0; i < 5; i++) {
            new thread_priority(Thread.MIN_PRIORITY);
        }
    }
}
