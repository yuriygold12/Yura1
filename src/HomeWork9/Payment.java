package HomeWork9;

import java.time.LocalDate;

public class Payment {
    private int cardNumber;
    private LocalDate paymentDate;

    public Payment() {
        this.cardNumber = 345678;
        this.paymentDate = LocalDate.now();
    }

    public Payment(int cardNumber, LocalDate paymentDate) {
        this.cardNumber = cardNumber;
        this.paymentDate = paymentDate;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }


    public void setCardNumber() {
        System.out.println("please enter card number:");

        this.cardNumber = cardNumber;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void showinfo()
    {
        System.out.println("Номер картки:"+cardNumber);
        System.out.println("Дата оплати"+paymentDate);
    }
}
