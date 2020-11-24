import java.util.ArrayList;

public abstract class PaymentType implements ICharge {

    private String cardType;
    private int cardNumber;
    private String expiryDate;


    public PaymentType(String cardType, int cardNumber, String expiryDate){
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expiryDate= expiryDate;
    }

    public String getCardType() {
        return cardType;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
