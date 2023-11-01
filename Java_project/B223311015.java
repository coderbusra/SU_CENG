package scanner_project;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class scanner_odevi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String isim = scanner.nextLine().toLowerCase();

        System.out.print("Soyadınızı giriniz: ");
        String soyIsim = scanner.nextLine().toLowerCase();

        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        Date buYil = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int buYi1 = Integer.parseInt(dateFormat.format(buYil));

        int dogumYili = buYi1 - age;

        System.out.println(isim.toUpperCase() + " " +soyIsim.toUpperCase() + " " + dogumYili + " yılında doğdu.");
    }
}
