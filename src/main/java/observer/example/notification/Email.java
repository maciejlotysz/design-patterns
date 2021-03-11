package observer.example.notification;

import observer.example.order.Order;

public class Email implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Email - Paczka o numerze " + order.getOrderNumber() +
                " zmieniło status na " + order.getOrderStatus() );
    }
}
