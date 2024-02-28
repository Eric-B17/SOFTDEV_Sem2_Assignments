public class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println(Math.sqrt(1000));

    }

    @Override
    public void run() {
        System.out.println(" " + threadName);
        for (int i = 4; i > 0; i--) {
                System.out.println("The squareRoot of : " + i + " is " + Math.sqrt(i));}
    }

    public void start(){
        System.out.println("Starting " + threadName);

        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
