import java.util.Scanner;

public class HargaBelanja {
   public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Harga Barang Sebelum Diskon");
    double harga_awal = input.nextDouble();
    System.out.println("Masukkan Presentase Diskon(Cukup Masukkan Angka Tanpa %)");
    double besaran_harga = input.nextDouble();
    System.out.println("masukkan jumlah barang yang dibeli");   
    int jumlah_barang = input.nextInt();

    double harga_total_setelah_diskon = (harga_awal - (harga_awal*(besaran_harga/100))) * jumlah_barang;
    double harga_per_barang_setelah_diskon = harga_awal - (harga_awal*(besaran_harga/100));
    System.out.println("harga total setelah diskon adalah:"+""+ harga_per_barang_setelah_diskon);
    System.out.println("harga per barang setelah diskon adalah:"+""+ harga_per_barang_setelah_diskon);
   }
}
