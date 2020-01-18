package me.y2o2u2n.demo.repository.order;

import lombok.Data;
import me.y2o2u2n.demo.domain.Address;
import me.y2o2u2n.demo.domain.OrderStatus;

import java.time.LocalDateTime;

@Data
public class OrderV4Dto {
    private Long orderId;
    private String name;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private Address address;

    public OrderV4Dto(
            Long orderId,
            String name,
            LocalDateTime orderDate,
            OrderStatus orderStatus,
            Address address
    ) {
        this.orderId = orderId;
        this.name = name;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.address = address;
    }
}
