package observer.example.notification;

import observer.example.order.Order;

public class TextMessage implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("SMS - Paczka o numerze " + order.getOrderNumber() +
                " zmieniło status na " + order.getOrderStatus() );
    }
}
