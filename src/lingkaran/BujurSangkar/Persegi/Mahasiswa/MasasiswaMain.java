
package lingkaran.BujurSangkar.Persegi.Mahasiswa;
import java.util.Scanner;
public class MasasiswaMain {
    public static void main(String[] args) {
        Scanner kay = new Scanner(System.in);
        System.out.print("Masukkan banyak mahasiswa: ");
        int jumlah = kay.nextInt();
        kay.nextLine(); 
        Mahaiswa[] mahasiswaArray = new Mahaiswa[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String n = kay.nextLine();

            System.out.print("Nilai UTS 1: ");
            double u1 = kay.nextDouble();

            System.out.print("Nilai UTS 2: ");
            double u2 = kay.nextDouble();

            System.out.print("Nilai UAS: ");
            double u = kay.nextDouble();
            kay.nextLine(); 

            mahasiswaArray[i] = new Mahaiswa(n, u1, u2, u);
        }

        System.out.println("\nHasil Mahasiswa:");
        for (Mahaiswa mhs : mahasiswaArray) {
            mhs.tampilkan();
            System.out.println();
        }

        kay.close();
    }
}
