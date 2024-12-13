import java.util.Scanner;
public class TugasNo2 {

    static int penjumlahan(int f) {
        if (f == 0) {
            return 0; 
        }
        return f + penjumlahan(f - 1);
    }

    static void tampilkanPerhitungan(int f) {
        if (f == 1) {
            System.out.print("1");
            return;
        }
        tampilkanPerhitungan(f - 1);
        System.out.print(" + " + f);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, hasil = 0;
        System.out.print("Masukkan nilai f= ");
        f = sc.nextInt();

        System.out.print("Perhitungan= ");
        tampilkanPerhitungan(f); 

        System.out.println(); 

        hasil = penjumlahan(f);
        System.out.println("Penjumlahan dari 1 sampai " + f + " adalah= " + hasil);
    }
}

