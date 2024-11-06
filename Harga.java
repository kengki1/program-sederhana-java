
import java.util.Scanner;
public class Harga {
    public static void main(String[] args) {
        Scanner kay = new Scanner(System.in);
        int s,m,l,xl,xxl;
        s = 30000;
        m = 38000;
        l = 45000;
        xl = 50000;
        xxl = 60000;
        int ukuran,jumlah;
        System.out.println("Daftar ukuran");
        System.out.println("1.S: "+s);
        System.out.println("2.M: "+m);
        System.out.println("3.L: "+l);
        System.out.println("4.XL: "+xl);
        System.out.println("5.XXL: "+xxl);
        System.out.print("Masukan ukuran baju yang anda beli menggunakan angka (1,2,3,4,5): ");
        ukuran = kay.nextInt();
        System.out.print("Masukan jumlah baju yang mau dibeli: ");
        jumlah = kay.nextInt();
        int jt;
        switch (ukuran){
            case 1 : jt = s*jumlah;
                     System.out.println("Harga total:Rp."+jt);
                     break;
            case 2 : jt = m*jumlah;
                     System.out.println("Harga total:Rp."+jt);
                     break;
            case 3 : jt = l*jumlah;
                     System.out.println("Harga total:Rp."+jt);
                     break;
            case 4 : jt = xl*jumlah;
                     System.out.println("Harga total:Rp."+jt);
                     break;
            case 5 : jt = xxl*jumlah;
                     System.out.println("Harga total:Rp."+jt);
                     break;
            default : System.out.println("Ukuran Yang Anda Ingankan Belum Tersedia");
        }   
    }
}
