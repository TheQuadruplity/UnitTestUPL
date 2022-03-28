package informatika.barang;

public class Barang {
	// Deklarasi statis ArrayBarang
    static String[][] arrayBarang = {
        {"Buku Gambar", "3", "Buku", "5000"},
        {"Pensil", "4", "ATK", "2500"},
        {"Baju", "2", "Busana", "75000"},
        {"Sepeda", "2", "Kendaraan", "1000000"}
    };

    // Deklarasi Atribut
    private int id;
    private String nama;
    private int stok;
    private String jenis;
    private int harga;

    // Method Static
    static int length(){
        return Barang.arrayBarang.length;
    }

    // Deklarasi Method
    static void addBarang(String nama, String stok, String jenis, String harga){
        int l = Barang.length();
        String[][] a = new String[l+1][4];
        for(int i = 0; i < l; i++){
            a[i] = Barang.arrayBarang[i];
        }
        a[l][0] = nama;
        a[l][1] = stok;
        a[l][2] = jenis;
        a[l][3] = harga;

        Barang.arrayBarang = a;
    }

    // Deklarasi Overloading Method
    static void addBarang(Barang barang){
        int l = Barang.length();
        String[][] a = new String[l+1][4];
        for(int i = 0; i < l; i++){
            a[i] = Barang.arrayBarang[i];
        }
        a[l][0] = barang.getNama();
        a[l][1] = String.valueOf(barang.getStok());
        a[l][2] = barang.getJenis();
        a[l][3] = String.valueOf(barang.getHarga());

        Barang.arrayBarang = a;
    }

    // Deklarasi Constructor
    public Barang(int id){
        this.id = id;
        this.nama = Barang.arrayBarang[id][0];
        this.stok = Integer.parseInt(Barang.arrayBarang[id][1]);
        this.jenis = Barang.arrayBarang[id][2];
        this.harga = Integer.parseInt(Barang.arrayBarang[id][3]);
    }

    // Berbagai Setter dan Getter
    public int getId() {
        return id;
    }
    public int getHarga() {
        return harga;
    }
    public String getJenis() {
        return jenis;
    }
    public String getNama() {
        return nama;
    }
    public int getStok() {
        return stok;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
}
