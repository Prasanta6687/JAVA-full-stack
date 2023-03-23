import java.util.Scanner;
public class PrintEvenNumber {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int number = 0;number<=n;number++){
            if(number%2==0){
                System.out.println(number);
}
}
    }
}