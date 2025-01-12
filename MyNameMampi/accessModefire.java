package MyNameMampi;

class number {
    public int a = 44;
    protected int b = 55;
    private int c = 77;
    int d =89;

    public void printnum() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

class using extends number{
    public void printnum123(){
        System.out.println(a);
        System.out.println(b);
        // System.out.println(c);
        System.out.println(d);
    }
}

public class accessModefire {

    public static void main(String[] args) {


        number n = new number();
        // n.printnum();
        System.out.println(n.a);
        System.out.println(n.b);
        // System.out.println(n.c);
        using  u = new using();
        u.printnum123();
    }
}
