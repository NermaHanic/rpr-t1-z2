package ba.unsa.etf.rpr.predavanje03;
import java.util.Scanner;

public class Main {

    public static int SumCifara(int n){
        int broj =n;
        int suma =0;
        while(broj!=0){
            suma+=broj%10;
            broj/=10;
        }
        return suma;
    }


    public static void main(String[] args) {
	// write your code here
        ispisi("Unesite broj: ");
        Scanner skener = new Scanner(System.in);
        int n = skener.nextInt();
        int i=0;
        for(i=1;i<=n;i++) {
            if (i % SumCifara(n) == 0) {
                ispisi(i);

            }
        }
    }

    public static void ispisi (String unos){
        System.out.println(unos);
    }

    public static void ispisi (int unos){
        System.out.println(unos);
    }

}


