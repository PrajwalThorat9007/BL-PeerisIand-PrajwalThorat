import java.util.Scanner;

class Remainder{
    public static int[] QuotientRemainder(int num1,int num2){
        int quotient=num1/num2;
        int Remainder=num1%num2;
        
        return new int[] {quotient,Remainder};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        int[] result=QuotientRemainder(num1,num2);
        System.out.println(result[0]+" "+result[1]);
    }
}