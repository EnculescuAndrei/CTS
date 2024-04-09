
interface PaymentProcessor{
    void processPayment(Double ammount);
}
class PayPal{
    void sendPayment(double ammount){
        System.out.println("Paypal ammount: "+ammount);
    }
}
class Stripe{
    void makePayment(double ammount){
        System.out.println("Stripe ammount: "+ammount);
    }
}
class PayPalAdapter implements PaymentProcessor{
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal){
        this.payPal=payPal;
    }
    @Override
    public void processPayment(Double ammount) {
        payPal.sendPayment(ammount);
    }
}
class StripeAdapter implements PaymentProcessor{
    private Stripe stripe;

    public StripeAdapter(Stripe stripe){
        this.stripe=stripe;
    }
    @Override
    public void processPayment(Double ammount) {
        stripe.makePayment(ammount);
    }
}

public class Adapter {
    public static void main(String[] args) {
        PaymentProcessor PayPalAdapter = new PayPalAdapter(new PayPal());
        PayPalAdapter.processPayment(2000.00);
        PaymentProcessor StripeAdapter = new StripeAdapter(new Stripe());
        StripeAdapter.processPayment(90.00);
    }
}