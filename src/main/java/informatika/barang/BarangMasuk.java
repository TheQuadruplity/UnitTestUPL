package informatika.barang;

import java.util.Scanner;

public class BarangMasuk {
    private Scanner S;

    public BarangMasuk(){
        S = new Scanner(System.in);
    }

    public void inputBarang(){
        String nama = this.S.nextLine();
        int stok = this.S.nextInt();
        String jenis = this.S.nextLine();
        int harga = this.S.nextInt();
        Barang.addBarang(nama, String.valueOf(stok), jenis, String.valueOf(harga));
    }
}
