
import java.util.Scanner;

class simpleInterest{
    double simpleInterest(int Principle,int Rate,int Time){
        double simpleInterest=(Principle*Rate*Time)/100.0;
        return simpleInterest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Principle=sc.nextInt();
        int Rate=sc.nextInt();
        int Time=sc.nextInt();

        simpleInterest obj=new simpleInterest();

        double ans=obj.simpleInterest(Principle,Rate,Time);

        System.out.println("The simple Interest is: "+ans);

    }
}