import java.util.Scanner;

class pratik1{

    // 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program
    
    public static void main(String[] args){
        int t;
        int sum = 0;
        int answ;
        int s=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz");
        t = inp.nextInt();

        for(int i=0; i<=t; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum = sum + i;
                s = s + 1;
            }
        }
        answ = sum / ( s-1 );
        System.out.println(answ);
    }

}
