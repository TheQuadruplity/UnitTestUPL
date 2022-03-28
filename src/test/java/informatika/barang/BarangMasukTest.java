package informatika.barang;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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
	@DisplayName("Testing Keberadaan Error via AssertThrows")
	void testInputThrow() {
		Barang.addBarang("Pesawat", "lima", "Kendaraan", "satu miliar lima ratus juta");
        assertThrows(NumberFormatException.class, new Executable() {
            public void execute() throws Throwable {
                int len = Barang.length()-1;
                Barang b = new Barang(len);
            }
        });
        
        Barang.addBarang("Pesawat", "lima", "Kendaraan", "1500000000");
        assertThrows(NumberFormatException.class, new Executable() {
            public void execute() throws Throwable {
                int len = Barang.length()-1;
                Barang b = new Barang(len);
            }
        });
	}
}
