package cn.bugstack.xfg.dev.tech.domain.model.aggregate;

import cn.bugstack.xfg.dev.tech.domain.model.entity.OrderEntity;
import cn.bugstack.xfg.dev.tech.domain.model.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderAggregate {

    /** 用户ID */
    private String userId;
    /** 用户ID */
    private ProductEntity productEntity;

    private OrderEntity orderEntity;

}
