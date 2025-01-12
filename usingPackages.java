import MyNameMampi.friend.MampiFriend;

class using extends MampiFriend{
    void meth(){
        System.out.println(y);
    }
}

public class usingPackages {
    public static void main(String[] args) {
        System.out.println("I am using packages");
        MampiFriend m = new MampiFriend();
        m.addition(56, 44);
        System.out.println(m.x);
        
    }
}
