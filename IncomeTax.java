public class IncomeTax {
    public static void main(String[] args) {
        float tax = 0;
        float income =3.5f;
        if(income<2.5f){
            tax=tax+0;
        }
        else if(income>2.5f && income<5.0f){
            tax=tax+0.05f*(income-2.5f);
        }

        else if(income>5.0f && income<10.0f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(income-5.0f);
        }
        else if(income>=10.0f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(10.f-5.0f);
            tax=tax+0.3f*(income-10.f);
        }
        System.out.println("Your given tax is "+ tax);
    }
}
