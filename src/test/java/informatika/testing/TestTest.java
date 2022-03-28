package informatika.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTest {
    
    @Test
    void testt(){
        Testing t = new Testing();
        assertEquals("test", t.test());
    }
}
