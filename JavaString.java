import java.util.Scanner;

public class JavaString {
    public static void main(String[] args) {
        String name = "Harryrry";
        // System.out.println(name);
        // System.out.println(name.replace('r','p'));
        // System.out.println(name.endsWith("ry"));
        // System.out.println(name.indexOf('r',2));
        System.out.println(name.lastIndexOf("rry", 7));
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the security code : ");
        String securityCode = sc.next();

        if (securityCode.equals("Welcome")) {
            System.out.println("Can be accessed");
        } else {
            System.out.println("Cannot be accessed");
        }
        sc.close();
    }

}
