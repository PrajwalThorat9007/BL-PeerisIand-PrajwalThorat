import java.util.Scanner;

class Trigno{
    public double[] trignoFunction(double angle){
        double sin=Math.sin(angle);
        double cos=Math.cos(angle);
        double tan=sin/cos;
        
        return new double[]{sin,cos,tan};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        double num=sc.nextDouble();
        double angle=num*(Math.PI/180);
        
        Trigno obj=new Trigno();
        
        double[] ans=obj.trignoFunction(angle);
    
        System.out.println("Sin= "+ans[0]+"Cos= "+ans[1]+"Tan= "+ans[2]);
        
    }
}