public interface ICharge {

    double getTransactionFee(double paymentAmount);
    void charge (double paymentAmount);
}
