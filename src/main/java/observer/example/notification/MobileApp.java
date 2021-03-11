package observer.example.notification;

import observer.example.order.Order;

public class MobileApp implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("Aplikacja mobilna - Paczka o numerze " + order.getOrderNumber() +
                " zmieniło status na " + order.getOrderStatus() );
    }
}
