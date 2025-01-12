package numberCalculation;


public class Prime {
    int num;
    private boolean isPrime=true;
    public void PrimeNumber(int num){
        this.num=num;

        if(num<=1){
            isPrime=false;
        }
        else{
            
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }


        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    public static void main(String[] args) {
        Prime ob = new Prime();
        ob.PrimeNumber(9);
    }
}


