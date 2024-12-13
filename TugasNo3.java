import java.util.Scanner;
public class TugasNo3 {

    public static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }
    
    public static int hitungPasanganProduktif(int bulan) {
        if (bulan <= 2) {
            return 0;
        } else {
            return hitungPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bulan, pasanganProduktif, pasanganBelumProduktif, totalPasangan;

        System.out.print("Masukkan bulan ke- (1-12): ");
        bulan = sc.nextInt();

        totalPasangan = hitungPasanganMarmut(bulan);
        pasanganProduktif = hitungPasanganProduktif(bulan);
        pasanganBelumProduktif = totalPasangan - pasanganProduktif;

        System.out.println("Bulan ke-" + bulan + ":");
        System.out.println("Jumlah Pasangan Produktif: " + pasanganProduktif);
        System.out.println("Jumlah Pasangan Belum Produktif: " + pasanganBelumProduktif);
        System.out.println("Total Pasangan Marmut: " + totalPasangan);
    }
}