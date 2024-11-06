
import java.util.Scanner;
public class Gaji {
    public static void main(String[] args) {
        Scanner kay = new Scanner(System.in);
        double gaji, mk;
        String g;
        System.out.print("Masukan ganji anda: Rp.");
        gaji = kay.nextDouble();
        System.out.print("Masukan golongan (1,2,3,4): ");
        g = kay.next();
        System.out.print("Masukan masa kerja(Tahun): ");
        mk = kay.nextDouble();
        double pb = 0;
        switch (g) {
            case "1":
                if (mk <= 10) {
                    pb = 0.50;
                } else if (mk >= 11 && mk <= 20) {
                    pb = 0.60;
                } else {
                    pb = 0.70;
                }
            break;
            case "2":
                if(mk <= 10){
                pb = 0.60;
                }
                else if(mk >= 11 && mk<=20){
                pb = 0.70;
                }
                else{
                pb = 0.80;
                }
            break;
            case "3":
                if( mk <= 10){
                pb = 0.70;
                }
                 else if(mk >= 11 && mk<=20){
                pb = 0.80;
                }
                else{
                pb = 0.90;
                }
            break;
            case "4":
                if(mk <= 10){
                pb = 0.80;
                }
                else if(mk >=11 && mk < 20){
                pb = 0.90;
                }
                else{
                pb = 1.00;
                }
            break;
            default:
                System.out.println("Angka yang anda masukan salah");
        }
        double bonus = gaji *pb;
        System.out.println("Bonus anda: Rp."+bonus);
    }
}
