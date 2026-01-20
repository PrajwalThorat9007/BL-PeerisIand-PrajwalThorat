import java.util.Scanner;

class Createsubstring{
    public static String substringCreation(String str1){
        String ans="";
        ans=ans+str1.charAt(0);
        ans=ans+str1.charAt(1);
        
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String str1=sc.next();
        String str2=substringCreation(str1);
        String str3=str1.substring(0,2);
        
        if(str2.equals(str3)){
            System.out.println("Valid substring");
        }
        else{
            System.out.println("Invalid substring");
        }
    }
}