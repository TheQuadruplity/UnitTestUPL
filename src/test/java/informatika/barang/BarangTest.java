package informatika.barang;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import informatika.barang.Barang;

class BarangTest {

	@Test
	@DisplayName("Testing Kesesuaian Array dg Objeknya")
	void test() {
		// a. Testing Length of an Array
		int actual = Barang.length();
		int expected = 6;
		assertEquals(expected, actual);
		
		// b. Testing Array properties
		int l = Barang.length();
		for(int i = 0; i<l; i++) {
			Barang b = new Barang(i);
			assertEquals(i, b.getId());
			assertEquals(Barang.arrayBarang[i][0], b.getNama());
			assertEquals(Integer.parseInt(Barang.arrayBarang[i][1]), b.getStok());
			assertEquals(Barang.arrayBarang[i][2], b.getJenis());
			assertEquals(Integer.parseInt(Barang.arrayBarang[i][3]), b.getHarga());
		}
	}

}
