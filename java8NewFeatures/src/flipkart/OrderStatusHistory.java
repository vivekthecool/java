package flipkart;

import java.sql.Timestamp;
import java.util.Date;

public class OrderStatusHistory {
    OrderStatus status;
    Date timestamp;

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
