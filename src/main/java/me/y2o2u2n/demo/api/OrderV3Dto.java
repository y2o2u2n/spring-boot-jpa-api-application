package me.y2o2u2n.demo.api;

import lombok.Data;
import me.y2o2u2n.demo.domain.Address;
import me.y2o2u2n.demo.domain.Order;
import me.y2o2u2n.demo.domain.OrderStatus;

import java.time.LocalDateTime;

@Data
class OrderV3Dto {
    private Long orderId;
    private String name;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private Address address;

    OrderV3Dto(Order order) {
        this.orderId = order.getId();
        this.name = order.getMember().getName();
        this.orderDate = order.getOrderDate();
        this.orderStatus = order.getStatus();
        this.address = order.getDelivery().getAddress();
    }
}
