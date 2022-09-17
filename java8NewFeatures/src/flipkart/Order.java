package flipkart;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Order {

    Integer orderId;
    OrderStatus orderStatus;
    Date orderDate;
    ItemDetails itemDetails;
    List<OrderStatusHistory> orderStatusHistories;

    public Map actionEligibility(Order order) {
        Map<String, Boolean> map = new HashMap<>();

        map.put("Cancellation", (order.getOrderStatus().name().equals("Ordered")
                || order.getOrderStatus().name().equals("Shipped") ? Boolean.TRUE : Boolean.FALSE));
        map.put("Address Change", (order.getOrderStatus().name().equals("Ordered")
                ? Boolean.TRUE : Boolean.FALSE));
        if(order.getOrderStatus().name().equals("Delivered")) {
            if(order.getItemDetails().getCategory() == Category.Mobile) {
                List<OrderStatusHistory> list = order.getOrderStatusHistories()
                        .stream()
                        .filter(o -> o.getStatus() == OrderStatus.Delivered).collect(Collectors.toList());
                if(list.isEmpty()) {

                }
//                if(list.get(0).getTimestamp().getDay())
            }
        }
//        map.put("Address Change", (
//                ? Boolean.TRUE : Boolean.FALSE));

        return null;
    }





    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ItemDetails getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetails = itemDetails;
    }

    public List<OrderStatusHistory> getOrderStatusHistories() {
        return orderStatusHistories;
    }

    public void setOrderStatusHistories(List<OrderStatusHistory> orderStatusHistories) {
        this.orderStatusHistories = orderStatusHistories;
    }
}
//    Order is defined like this:
//        orderId
//        orderStatus : Ordered, Shipped, Delivered, Returned
//        orderDate
//        itemDetails :
//        itemId
//        Category : Mobile, Electronics, Fashion
//        Quantity
//        orderStatusHistory: list of orderStatus
//        status
//        timestamp
//
//public T actionEligibility(Order order) {
//
//        }
