import java.util.Scanner;

class NaturalNo{
    void NaturalSum(int num){
        int sum=0;
        while(num>0){
            sum=sum+num;
            num--;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        NaturalNo obj=new NaturalNo();
        
        obj.NaturalSum(num);
    }
}