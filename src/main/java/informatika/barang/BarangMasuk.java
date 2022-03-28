package informatika.barang;

import java.util.Scanner;

public class BarangMasuk {
    private Scanner S;

    public BarangMasuk(){
        S = new Scanner(System.in);
    }

    public void inputBarang(){
        String nama = this.S.nextLine();
        String stok = this.S.nextLine();
        String jenis = this.S.nextLine();
        String harga = this.S.nextLine();
        Barang.addBarang(nama, stok, jenis, harga);
    }

    // Overloading Method
    public void inputBarang(String nama, int stok, String jenis, int harga){
        Barang.addBarang(nama, String.valueOf(stok), jenis, String.valueOf(harga));
    }
}
