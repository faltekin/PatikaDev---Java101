import java.util.Scanner;

public class pratik2 {
    
    public static void main(String[] args){

        int n;
        int sum=0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz:");
            n = scan.nextInt();

            if(n % 4 == 0){
                sum += n;
            }

        
        } while(n % 2 == 0);

        System.out.println("Toplam :"+sum);

    }

}
