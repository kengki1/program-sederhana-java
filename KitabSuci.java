

import java.util.Scanner;
public class KitabSuci {
    public static void main(String[] args) {
        Scanner kay = new Scanner(System.in);
        enum agama{
            HINDU,BUDHA,YAHUDI,KATOLIK,KRISTEN,ISLAM
        }
        String agama;
        System.out.print("Masukan Agama(Menggunakan Hurif Kapital): ");
        agama = kay.next();
        switch(agama){
            case "HINDU":
                System.out.println("Kitab Suci: Veda");
                System.out.println("Nabi      :-");
                break;
            case "BUDHA":
                System.out.println("Kitab Suci: Tripitaka");
                System.out.println("Nabi      :Sidahrta Gautama");
                break;
            case "YAHUDI":
                System.out.println("Kitab Suci: Taurat");
                System.out.println("Nabi      :Musa");
                break;
            case "KATOLIK":
                System.out.println("Kitab Suci: Injil");
                System.out.println("Nabi      :Yesus");
                break;
            case "KRISTEN":
                System.out.println("Kitab Suci: Injil");
                System.out.println("Nabi      : Yesus");
                break;
            case "ISLAM":
                System.out.println("Kitab Suci: Alquran");
                System.out.println("Nabi      : Muhamad");
                break;
            default:
                System.out.println("Gunakan Huruf Kapital");
        }
    }
}
