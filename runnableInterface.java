class Mythread1 implements Runnable{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("I am thread");
            i++;
        }
    }
}


public class runnableInterface {
    public static void main(String[] args) {
        Mythread1 bullet1 = new Mythread1();
        Thread gun = new Thread(bullet1);

        gun.start();
    }
}
