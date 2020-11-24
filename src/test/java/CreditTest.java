import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditTest {

    Credit credit;

    @Before
    public void before(){
        credit = new Credit ("Credit", 12345678, "21st September 2025", 1500);
    }

    @Test
    public void canHaveCardType(){
        assertEquals("Credit", credit.getCardType());
    }

    @Test
    public void cardHasNumber(){
        assertEquals(12345678, credit.getCardNumber());
    }

    @Test
    public void cardHasExpiryDate(){
        assertEquals("21st September 2025", credit.getExpiryDate());
    }

    @Test
    public void cardhasLimit(){
        assertEquals(1500, credit.getLimit());
    }

    @Test
    public void transactionChargeIsApplied(){
        assertEquals(18.03, credit.getTransactionFee(150.25), 0.1);
    }

    @Test
    public void chargeAddedToList(){
        credit.charge(150.25);
        assertEquals(1, credit.getCharges());
    }
}
