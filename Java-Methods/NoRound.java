import java.util.Scanner;
class NoRound{

    void Rounds(int side1,int side2,int side3){
        int round=side1+side2+side3;
        int noRound=round/5;
        if(noRound<=0){
            System.out.println("No need to Run");
        }
        else{
            System.out.println(noRound);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();

        NoRound obj=new NoRound();
        obj.Rounds(side1, side2, side3);
    }
}