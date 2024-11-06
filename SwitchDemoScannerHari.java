
import java.util.Scanner;
public class SwitchDemoScannerHari {
    public static void main(String[] args) {
        Scanner kay = new Scanner(System.in);
        int month;
        System.out.print("Masukan Bulan (1,2,3,4,5,6,7,8,9,10,11,12): ");
        month = kay.nextInt();
        String monthString;
        String hari ="";
        switch (month) {
            case 1:  monthString = "January";
                     hari = "31 Hari";
                     break;
            case 2:  monthString = "February";
                     hari = "28 Hari";
                     break;
            case 3:  monthString = "March";
                     hari = "31 Hari";
                     break;
            case 4:  monthString = "April";
                     hari = "30 Hari";
                     break;
            case 5:  monthString = "May";
                     hari = "31 Hari";
                     break;
            case 6:  monthString = "June";
                     hari = "30 Hari";
                     break;
            case 7:  monthString = "July";
                     hari = "31 Hari";
                     break;
            case 8:  monthString = "August";
                     hari = "31 Hari";
                     break;
            case 9:  monthString = "September";
                     hari = "30 Hari";
                     break;
            case 10: monthString = "October";
                     hari = "31 Hari";
                     break;
            case 11: monthString = "November";
                     hari = "30 Hari";
                     break;
            case 12: monthString = "December";
                     hari = "31 Hari";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
        System.out.println(hari);
    }
}
