import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {
    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("EN123", 49.99);
    }

    @Test
    public void has_model_no(){
        assertEquals("EN123", tyre.getModelNo());
    }

    @Test
    public void has_price(){
        assertEquals(49.99, tyre.getPrice(), 0.0);
    }
}
