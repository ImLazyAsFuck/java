public class Main{
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard(1000);
        PaymentMethod debitCard = new DebitCard(1000);
        PaymentMethod cash = new Cash(1000);

        System.out.println("Credit Card Payment:");
        System.out.println("Fee: " + creditCard.calculateFee());
        System.out.println("Total Amount: " + creditCard.processPayment());
        System.out.println("Total Amount in USD: " + creditCard.processPayment("USD"));

        System.out.println("\nDebit Card Payment:");
        System.out.println("Fee: " + debitCard.calculateFee());
        System.out.println("Total Amount: " + debitCard.processPayment());
        System.out.println("Total Amount in USD: " + debitCard.processPayment("USD"));

        System.out.println("\nCash Payment:");
        System.out.println("Fee: " + cash.calculateFee());
        System.out.println("Total Amount: " + cash.processPayment());
        System.out.println("Total Amount in USD: " + cash.processPayment("USD"));
    }
}