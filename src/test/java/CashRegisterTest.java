import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashRegisterTest {

    private CashRegister cr = new CashRegister();

    @Test

    public void testGetTotalCount() {
        assertEquals(0.0, cr.getTotalCount(),0.000001);
    }
}
