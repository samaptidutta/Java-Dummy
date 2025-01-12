
class thread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("He is cooking......");
            System.out.println("I am happy.....");
            i++;
        }
    }
}

class thread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("He is chatting....");
            System.out.println("I am not happy....");
            i++;
        }
    }
}

public class JavaThread {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
