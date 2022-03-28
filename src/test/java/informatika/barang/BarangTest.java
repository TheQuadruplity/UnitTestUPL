package informatika.barang;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import informatika.barang.Barang;

class BarangTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		// arrange
		Barang barang = new Barang();
		
		// set
		String actual = barang.testBarang();
		String expected = "BRRRIIIHHH";
		
		// assert
		assertEquals(expected, actual);
	}

}
