class Mynewthread extends Thread{
    public Mynewthread(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("thank you "+this.getName());
            try{
                Thread.sleep(234);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class Mynewthread1 extends Thread{
    public Mynewthread1(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("thank you "+this.getName());
            i++;
        }
    }
}

public class ThreadMethod {
    public static void main(String[] args) {
        Mynewthread th1 = new Mynewthread("samapti");
        Mynewthread1 th2 = new Mynewthread1("samapti 2");
        th1.start();
        th2.start();
        // System.out.println(th1.getState());
        // System.out.println(Thread.currentThread().getState());
        System.out.println(th2.getState());
    }
}
