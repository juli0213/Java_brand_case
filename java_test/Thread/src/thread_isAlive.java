public class thread_isAlive extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }

    public void printMsg(){
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name = "+name);
    }

    public static void main(String[] args) {
        thread_isAlive tt = new thread_isAlive();
        tt.setName("Thread");
        System.out.println("before start(), tt.isAlive()=" + tt.isAlive());
        tt.start();
        System.out.println("just after start(), tt.isAlive()=" + tt.isAlive());
        for (int i = 0; i < 10; i++) {
            tt.printMsg();

        }
        System.out.println("end of the start(), tt.isAlive()=" + tt.isAlive());
    }
}
