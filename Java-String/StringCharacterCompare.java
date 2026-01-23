// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class StringCharacterCompare{
    public static char[] getCharacter(String input){
        char[] chars=new char[input.length()];
        for(int i=0;i<input.length();i++){
            chars[i]=input.charAt(i);
        }
        return chars;
    }
    public static boolean compareArray(char[] arr1,char[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your string: ");
        String input=sc.next();
        
        char[] userChar=getCharacter(input);
        
        char[] buildInChars=input.toCharArray();
        
        boolean result=compareArray(userChar,buildInChars);
        System.out.println("Are both character arrays equals? "+result);
        
    }
}