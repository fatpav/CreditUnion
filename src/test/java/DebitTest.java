import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitTest {

    Debit debit;

    @Before
    public void before(){
        debit = new Debit("Debit", 22334455, "10th August 2027", 2500, 82345);
    }

    @Test
    public void canHaveCardType(){
        assertEquals("Debit", debit.getCardType());
    }

    @Test
    public void cardHasNumber(){
        assertEquals(22334455, debit.getCardNumber());
    }

    @Test
    public void cardHasExpiryDate(){
        assertEquals("10th August 2027", debit.getExpiryDate());
    }

    @Test
    public void cardHasBalance(){
        assertEquals(2500, debit.getBalance());
    }

    @Test
    public void cardHasAccountNumber(){
        assertEquals(82345, debit.getAccount());
    }

    @Test
    public void transactionChargeApplied(){
        assertEquals(4, debit.getTransactionFee(200.00), 0.00);
    }

    @Test
    public void canAddCharge(){
        debit.charge(200.00);
        assertEquals(1, debit.getCharges());
    }
}

