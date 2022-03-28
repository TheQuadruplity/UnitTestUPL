package informatika.barang;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BarangMasukTest {

	@Test
	@DisplayName("Testing Kesesuaian Input Barang dg Objek Hasil Inputnya")
	void test() {
		// length of Object Barang
		int len = Barang.length();
		
		// Testing Input BarangMasuk
		BarangMasuk bm = new BarangMasuk();
		bm.inputBarang("Pesawat", 5, "Kendaraan", 1500000000);
	
		Barang barang = new Barang(len);
		
		// Testing assert
		assertEquals(len, barang.getId());
		assertEquals("Pesawat", barang.getNama());
		assertEquals(5, barang.getStok());
		assertEquals("Kendaraan", barang.getJenis());
		assertEquals(1500000000, barang.getHarga());
	}
	
	@Test
	void testInputScanner() {
		BarangMasuk bm = new BarangMasuk();
		bm.inputBarang();
	}
}
