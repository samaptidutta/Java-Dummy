
package MyNameMampi.friend;

public class MampiFriend {
    public int x = 44;
    protected int y = 55;
    private int z = 77;
    int w =89;

    public static void addition(int a,int b){
        System.out.println("value is "+(a+b));
    }
    public static void main(String[] args) {
        System.out.println("This is mampi's friend");
        addition(56, 44);
    }
}
