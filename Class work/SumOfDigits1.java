//Prasanta Chatterjee
import java.util.Scanner;
public class SumOfDigits1{
    public static void main(String []args){
        long number = 0l,digit = 0l,sum = 0l;
        System.out.println("Enter a digit");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        while(num>0){
            digit = num%10;
            sum = sum+digit;
            num = num/10;
        }
        System.out.println(sum);
    }}