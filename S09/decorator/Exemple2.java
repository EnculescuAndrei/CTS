package ro.ase.acs.decorator;

interface Subscription{
    String getDescription();
    double getPrice();
}

class BasicSubscription implements Subscription{
    @Override
    public String getDescription() {
        return "Abonament de baza";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}


abstract class SubscriptionDecorator implements Subscription{
    protected Subscription subscription;
    public SubscriptionDecorator(Subscription subscription){
        this.subscription= subscription;
    }

    @Override
    public String getDescription() {
        return subscription.getDescription();
    }

    @Override
    public double getPrice() {
        return subscription.getPrice();
    }
}


class OfflineViewingDecorator extends SubscriptionDecorator{
    public OfflineViewingDecorator(Subscription subscription){
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription()+ ", vizionare online";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 3.0;
    }
}

class HDViewingDecorator extends SubscriptionDecorator{
    public HDViewingDecorator(Subscription subscription){
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription()+ ", vizionare in HD quality";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 3.0;
    }
}

public class Exemple2 {
    public static void main(String[] args) {
        Subscription subscription= new BasicSubscription();

        subscription= new OfflineViewingDecorator(subscription);

        subscription= new HDViewingDecorator(subscription);

        System.out.println("Description: "+ subscription.getDescription());
        System.out.println("Price: "+ subscription.getPrice());
    }
}
