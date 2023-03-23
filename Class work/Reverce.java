//Prasanta Chatterjee
import java.util.Scanner;
public class Reverce{
    public static void main(String []args){
        System.out.println("Enter a digit");
        int reverce = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num !=0){
            reverce = reverce*10+num%10;
            num = num/10;
        }
        System.out.println(reverce);
    }}