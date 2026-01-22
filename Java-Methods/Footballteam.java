import java.util.Scanner;

class Footballteam{
    static int sum=0;
    void SumOfHeight(int[] height){
        for(int i=0;i<height.length;i++){
            sum=sum+height[i];
        }
        System.out.println("The sum of height is "+sum);
    }
    void AvgOfHeight(int[] height){
        double avg=sum/11.0;
        
        System.out.println(avg);
    }
    void MaxHeight(int[] height){
        int maxHeight=0;
        for(int i=0;i<height.length;i++){
            if(height[i]>maxHeight){
                maxHeight=height[i];
            }
        }
        System.out.println("Max height is: "+maxHeight);
    }
    void MinHeight(int[] height){
        int minHeight=1000;
        for(int i=0;i<height.length;i++){
            if(height[i]<minHeight){
                minHeight=height[i];
            }
        }
        System.out.println("Max height is: "+minHeight);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] height=new int[5];
        System.out.println("Enter Height: ");
        for(int i=0;i<height.length;i++){
            height[i]=sc.nextInt();
        }
        Footballteam team1=new Footballteam();
        team1.SumOfHeight(height);
        team1.AvgOfHeight(height);
        team1.MaxHeight(height);
        team1.MinHeight(height);
    }
}