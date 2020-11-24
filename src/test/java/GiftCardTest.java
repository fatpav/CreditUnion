import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftcard;

    @Before
    public void before (){
        giftcard = new GiftCard("Gift", 69696969, "1st January 2021", 100);
    }

    @Test
    public void cardHasBalance(){
        assertEquals(100, giftcard.getBalance(), 0.0);
    }

    @Test
    public void cardHasNoTransactionFee(){
        assertEquals(0, giftcard.getTransactionFee(50), 0.0);
    }

    @Test
    public void chargesReduceBalance(){
        giftcard.charge(50.00);
        assertEquals(50.00, giftcard.getBalance(), 0.0);
    }
}
