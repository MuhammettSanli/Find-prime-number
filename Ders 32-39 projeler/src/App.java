import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner girdi = new Scanner(System.in)) {

            
           int sayi,bölen=0;


           System.out.println("Bir sayi giriniz.");
            sayi=girdi.nextInt();

            for(int i=1;i<=sayi;i++)
            {
                if(sayi%i==0)
                {
                    bölen++;
                }

            }
            if(bölen==2)
            {
                System.out.println("Sayı bir asal sayıdır.");
            }
            else{
                System.out.println("Sayı asal sayi değildir.");
            }

    
        }

    }
}
