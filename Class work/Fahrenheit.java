import java.util.Scanner;
public class Fahrenheit{
public static void main(String[] args){
System.out.println("Fahrenheit to celsius scale >>> Enter Fahrenheit number:");
Scanner input = new Scanner(System.in);
float C = input.nextFloat();
float f = (float)(C*9/5)+32;
System.out.println(f);
}}  