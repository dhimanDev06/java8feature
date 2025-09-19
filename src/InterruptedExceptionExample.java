public class InterruptedExceptionExample {
    public static void main(String[] args){
        ThrdHi thi = new ThrdHi();
        ThrdHello thello = new ThrdHello();
        thi.start();
        thello.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("⚡ Interrupting thi...");
        thello.interrupt();
    }
}

class ThrdHi extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 100;i++){
            System.out.println("Hi "+i);
            try {
                Thread.sleep(1000); // Slow down output
            } catch (InterruptedException e) {
                System.out.println("ThrdHi interrupted.");
                break;
            }

        }
    }
}
class ThrdHello extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 100;i++){
            System.out.println("Hello "+i);
            try {
                Thread.sleep(100); // Makes it interruptible
            } catch (InterruptedException e) {
                System.out.println("❌ ThrdHello interrupted during sleep.");
                break; // Exit loop on interruption
            }

        }
    }
}
