import java.util.Scanner;

public class pratik2 {
    
    // tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
    
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
