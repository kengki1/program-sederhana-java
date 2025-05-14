
package lingkaran.BujurSangkar.Persegi.Mahasiswa;


public class Mahaiswa {
      
        String nama;
        double Uts1,Uts2,Uas;
        public Mahaiswa(String na,double ut1,double ut2,double us){
            nama = na;
            Uts1 = ut1;
            Uts2 = ut2;
            Uas = us;
        }
        public double hitFinal(){
            return(0.3 * Uts1)+(0.3 * Uts2)+(0.4 * Uas);
        }
        public String konversiNilaiHuruf(){
            double NilFi = hitFinal();
            if(NilFi >= 80)return "A";
            else if (NilFi >= 65)return "B";
            else if (NilFi >= 55)return "C";
            else if (NilFi >= 45)return "D";
            else return "E";
        }
        public void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Final: " + hitFinal());
        System.out.println("Nilai Huruf: " + konversiNilaiHuruf());
        }
}
