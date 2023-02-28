import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("EN123", 349.99);
    }

    @Test
    public void has_model_no(){
        assertEquals("EN123", engine.getModelNo());
    }

    @Test
    public void has_price(){
        assertEquals(349.99, engine.getPrice(), 0.0);
    }

}
