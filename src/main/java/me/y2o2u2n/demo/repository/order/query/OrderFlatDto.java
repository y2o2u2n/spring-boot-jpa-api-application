package me.y2o2u2n.demo.repository.order.query;

import lombok.Data;
import me.y2o2u2n.demo.domain.Address;
import me.y2o2u2n.demo.domain.OrderStatus;

import java.time.LocalDateTime;

@Data
public class OrderFlatDto {
    private Long orderId;
    private String name;
    private LocalDateTime orderDate; // 주문시간
    private Address address;
    private OrderStatus orderStatus;
    private String itemName; // 상품 명
    private int orderPrice; // 주문 가격
    private int count; // 주문 수량

    public OrderFlatDto(Long orderId, String name, LocalDateTime orderDate, OrderStatus orderStatus, Address address, String itemName, int orderPrice, int count) {
        this.orderId = orderId;
        this.name = name;
        this.orderDate = orderDate;
        this.address = address;
        this.orderStatus = orderStatus;
        this.itemName = itemName;
        this.orderPrice = orderPrice;
        this.count = count;
    }
}
