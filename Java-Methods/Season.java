import java.util.Scanner;

class Season{
    void Seasoncheck(int date,int month){
        if(date>=20 && month==3 || month==4 || month==5 || month==6 && date<=20){
            System.out.println("It is Spring");
        }
        else{
            System.out.println("It is not Spring");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int date=sc.nextInt();
        int month=sc.nextInt();
        Season obj=new Season();
        
        obj.Seasoncheck(date,month);
    }
}