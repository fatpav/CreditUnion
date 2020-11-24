import java.util.ArrayList;

public class Debit extends PaymentType implements ICharge{

    private int balance;
    private int accountNumber;
    private ArrayList<Double> charges;

    public Debit(String cardType, int cardNumber, String expiryDate, int balance, int accountNumber){
        super(cardType, cardNumber, expiryDate);
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.charges = new ArrayList<>();
    }

    @Override
    public double getTransactionFee(double paymentAmount) {
        return paymentAmount * 0.02;
    }

    public void charge(double paymentAmount){
        this.charges.add(paymentAmount);
    }

    public int getBalance(){
        return this.balance;
    }

    public int getAccount(){
        return this.accountNumber;
    }

    public int getCharges(){
        return this.charges.size();
    }
}
