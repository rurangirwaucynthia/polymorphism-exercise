 public class paymentprocessor {
    public void processpayment(String cardNumber, Integer cvv) {
        System.out.println("paying with Credit Card");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("CVV: " + cvv);

    }
    public void processpayment(String paypalEmail) {
        System.out.println("paying with paypal");
        System.out.println("Email:" + paypalEmail);
    }
    public void processpayment(String walletAddress, String network) {
        System.out.println("paying with cryptoCurrency");
        System.out.println("wallet:" + walletAddress);
        System.out.println("Network:" + network);
    }

    
}
public class Main{
    public static void main(String[] args){
        paymentprocessor processor = new paymentprocessor();
        processor.processpayment("1234-5678-9012-3456", 123);
        System.out.println();
        processor.processpayment("user@example.com");
        System.out.println();
        processor.processpayment("0xAbC123...", "Ethereum");
    }
}
