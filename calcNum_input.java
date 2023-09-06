import java.io.*;
import java.util.Scanner;

public class calcNum_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Isi variabel a adalah = ");
        int a = sc.nextInt();
        System.out.println("Isi variabel b adalah = ");
        int b = sc.nextInt();
        System.out.println("Isi variabel a adalah " + a);
        System.out.println("Isi variabel b adalah " + b);
        System.out.println("Hasil penjumlahan variabel a dan b = " + (a + b));
        System.out.println("Hasil pengurangan variabel a dan b = " + (a - b));
        System.out.println("Hasil perkalian variabel a dan b = " + (a * b));
        System.out.println("Hasil pembagian variabel a dan b = " + (a / b));
    }
}