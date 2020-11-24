import java.util.ArrayList;

public class Credit extends PaymentType implements ICharge{

    private int limit;
    private ArrayList<Double> charges;



    public Credit(String cardType, int cardNumber, String expiryDate, int limit){
        super(cardType, cardNumber, expiryDate);
        this.limit = limit;
        this.charges = new ArrayList<>();

    }

    public double getTransactionFee(double paymentAmount){
        return paymentAmount * 0.12;
    }

    public void charge(double paymentAmount){
        this.charges.add(paymentAmount);
    }

    public int getLimit(){
        return this.limit;
    }
    public int getCharges(){
       return this.charges.size();
    }
}
