package observer.example;

import observer.example.notification.Email;
import observer.example.notification.MobileApp;
import observer.example.notification.TextMessage;
import observer.example.order.Order;

import static observer.example.order.OrderStatus.*;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(25445L, ZAREJESTROWANA);

        TextMessage textMessage = new TextMessage();
        Email email = new Email();
        MobileApp mobileApp = new MobileApp();

        order.registerObserver(textMessage);
        order.registerObserver(email);
        order.registerObserver(mobileApp);
        order.notifyObservers();

        System.out.println("-----------------------------");

        order.changeOrderStatus(W_DRODZE);

        System.out.println("-----------------------------");

        order.unregisterObserver(email);
        order.changeOrderStatus(ODEBRANA);

    }
}
