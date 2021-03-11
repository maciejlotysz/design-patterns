package observer.example.notification;

import observer.example.order.Order;

public interface Observer {

    void update(Order order);
}
