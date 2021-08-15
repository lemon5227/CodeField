import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Objects;

/**
 * ¡∑œ∞÷ÿ–¥equals
 */
public class guigu0713 {
    public static void main(String[] args) {
        Order o1 = new Order(123,"tom");
        Order o2 = new Order(123,"tom");
        System.out.println(o1.equals(o2));
    }
}
class Order{
    int OrderId;
    String OrderName;

    public Order(int orderId, String orderName) {
        OrderId = orderId;
        OrderName = orderName;
    }

    public Order() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o instanceof Order){
            Order order = (Order) o;

            return this.OrderId == order.OrderId && this.OrderName.equals(order.OrderName);
        }
        else {
            return false;
        }
    }
}
