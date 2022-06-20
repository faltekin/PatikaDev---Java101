import java.util.Scanner;

public class pratik3 {
    
    // girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program
    
    public static void main(String[] args){ 

        int n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        n = scan.nextInt();
        
        System.out.print("Dördün kuvvetleri");
        for(int i=1 ; i<=n ; i*=4){
            System.out.print(i+" ");
        }

        System.out.print("Beşin kuvvetleri");
        for(int i=1 ; i<=n ; i*=5){
            System.out.print(i+" ");
        }
        

    }

}
