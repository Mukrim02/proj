import java.util.*;
public class solution4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        short min=-32768;
        short max=32767;
        int min1=-2147483648;
        int max1=2147483647;
        long min2=-92233720368547758;
        long max2=9223372036854775807;
        if(n>min && n<max || n>min1 && n<min1 || n>min2 && n<min2){
            System.out.println(n +" can be fitted in:");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");
        }else if(n>min1 && n<min1 || n>min2 && n<min2){
            System.out.println(n +" can be fitted in:");
            System.out.println("* int");
            System.out.println("* long");
        }else{
            System.out.println("* long");
        }
        
    }
    
}
