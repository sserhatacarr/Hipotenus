import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kenar1, kenar2, sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Dik kenarı giriniz : ");
        kenar1 = input.nextInt();

        System.out.print("2. Dik kenarı giriniz : ");
        kenar2 = input.nextInt();

        sonuc =  Math.pow(kenar1,2) + Math.pow(kenar2,2);
        sonuc = Math.sqrt(sonuc);

        System.out.print("Hipotenüs kenar = " + sonuc);

    }
}
