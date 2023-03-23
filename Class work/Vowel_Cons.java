import java.util.Scanner;
public class Vowel_Cons{
public static void main (String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter Alphabet");
char value = input.next().charAt(0);
if( value == 'a'|| value == 'e'||value == 'i'||value == 'o'||value == 'u'||value == 'A'|| value == 'E'||value == 'I'||value == 'O'||value == 'U')
{
System.out.println("Vowel");
} 
else
{
System.out.println("Consonent");

}
}
}