import java.util.Scanner;
public class Circle{
public static void main(String []args){
System.out.println("Perimiter of a circle");
Scanner input = new Scanner(System.in);
float radious = input.nextFloat();
float result = (float)Math.PI*radious*radious;
System.out.println(result);
}}