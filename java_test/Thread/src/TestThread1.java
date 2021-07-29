public class TestThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println("aaaa" + i);
        }
    }

    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1();

        Thread thread = new Thread(testThread1);
        thread.start();
        for (int i = 0;i < 100; i++){
            System.out.println("bbb" +i);
        }
    }
}
