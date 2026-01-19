import java.util.Scanner;
class NoHandshake{
    void NoOfhandshake(int num){
        int Handshake=(num*(num-1))/2;
        System.out.println(Handshake);
    }
    public static void main(String[] args){
        NoHandshake obj=new NoHandshake();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        obj.NoOfhandshake(num);
    }
}