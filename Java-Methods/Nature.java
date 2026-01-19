import java.util.Scanner;

class Nature{
    void Nature(int num){
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        Nature obj=new Nature();
        
        obj.Nature(num);
    }
}