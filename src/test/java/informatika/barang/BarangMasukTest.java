package informatika.barang;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BarangMasukTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		// arrange
		BarangMasuk barangMasuk = new BarangMasuk();
		
		// set
		String actual = barangMasuk.init();
		String expected = "Data barang berhasil diinputkan!";
		
		// assert
		assertEquals(expected, actual);
	}

}
