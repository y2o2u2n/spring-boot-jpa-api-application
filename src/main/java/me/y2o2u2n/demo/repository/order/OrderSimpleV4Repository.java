package me.y2o2u2n.demo.repository.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderSimpleV4Repository {
    private final EntityManager em;

    public List<OrderSimpleV4Dto> findAllOrderV4Dtos() {
        return em.createQuery(
                "select new me.y2o2u2n.demo.repository.order.OrderSimpleV4Dto(o.id, m.name, o.orderDate, o.status, d.address)" +
                        " from Order o" +
                        " join o.member m" +
                        " join o.delivery d", OrderSimpleV4Dto.class)
                .getResultList();
    }
}
