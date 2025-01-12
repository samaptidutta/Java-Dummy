import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age ");
        int age = sc.nextInt();
        switch(age){
            case 18->{
                System.out.println("You are at your last teenager phase");
            }
            case 21->{
                System.out.println("Congratulation! You are now adult");
            }
            case 40->{
                System.out.println("Get ready for retirement and going to explore the world!");
            }
        }
    }
}
