import java.util.Scanner;
public class TugasNo1 {

    static void deretDescendingRekursif(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print(n + " ");
        deretDescendingRekursif(n - 1);
    }

    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("Deret menggunakan fungsi Rekursif:");
        deretDescendingRekursif(n);

        System.out.println(); 

        System.out.println("Deret menggunakan fungsi Iteratif:");
        deretDescendingIteratif(n);
        
    }
}
