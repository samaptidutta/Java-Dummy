class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while(i<4){
            System.out.println("I am a thread hello");
            i++;
        }
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("samapti");
        MyThr t2 = new MyThr("supriti");
        t1.start();
        t2.start();

        System.out.println("The id of the thread t1 is "+t1.threadId());
        System.out.println("The id of the thread t2 is "+t2.threadId());
        System.out.println(t1.getName());
    }
}
