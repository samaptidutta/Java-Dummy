public class PerfectNumber {
    
    public static boolean isPerfect(int num){
        if(num<=0)
        return false;
        int sum=1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num)
        return true;

        return false;
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        if(isPerfect(15)){
            System.out.println("perfect");
        }
        else{
            System.out.println("not a perfect");
        }
    }
}
