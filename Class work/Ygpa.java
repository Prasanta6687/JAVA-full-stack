import java.util.Scanner;
public class Ygpa{
public static void main(String []args){
System.out.println("Enter YGPA ");
Scanner input = new Scanner(System.in);
float number = input.nextFloat();
float result = (float)(number-0.75)*10;
System.out.println("Your percentage is:"+result);
}}