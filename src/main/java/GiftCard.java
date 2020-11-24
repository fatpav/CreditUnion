public class GiftCard extends PaymentType implements ICharge {

    private double balance;

    public GiftCard(String cardType, int cardNumber, String expiryDate, double balance){
        super(cardType, cardNumber, expiryDate);
        this.balance = balance;
    }

    public double getTransactionFee(double paymentAmount){
        return 0;
    }

    public void charge(double paymentAmount){
        double newBalance = this.balance - paymentAmount;
        this.balance = newBalance;
    }

    public double getBalance(){
        return this.balance;
    }
}
