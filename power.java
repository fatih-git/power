import java.util.Scanner;

/**
 * @author fatih-git
 */

public class power {

    public static void main(String[] args) {

        int sayi, us, sonuc=1;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen sayıyı girin: ");
        sayi=input.nextInt();

        System.out.print("Lütfen üssü girin: ");
        us=input.nextInt();

        for(int i=us; i>0; i--){

            sonuc*=sayi;

        }

        System.out.print("Cevap= "+sonuc);

    }

}
