package me.y2o2u2n.demo.api;

import lombok.Data;
import me.y2o2u2n.demo.domain.OrderItem;

@Data
class OrderItemDto {
    private String itemName;
    private int orderPrice;
    private int count;

    OrderItemDto(OrderItem orderItem) {
        this.itemName = orderItem.getItem().getName();
        this.orderPrice = orderItem.getOrderPrice();
        this.count = orderItem.getCount();
    }
}
