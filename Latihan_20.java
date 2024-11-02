package Tugas_Latihan;
/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Dekskipsi 
 * Progam   : Progam ini untuk menampilkan Operator, While 
 *          Target Saldo Tabungan
 */
public class Latihan_20 {
    public static void main(String[] args) {
        double saldoAwal = 3500000;
        double bungaBulanan = 8.0 / 100;
        double saldoTarget = 6000000;

        int bulan = 1;
        while (saldoAwal < saldoTarget) {
            saldoAwal += saldoAwal * bungaBulanan;
            System.out.println("Saldo di bulan ke-" + bulan + " Rp. " + String.format("%.0f", saldoAwal));
            bulan++;
        }
    }
}