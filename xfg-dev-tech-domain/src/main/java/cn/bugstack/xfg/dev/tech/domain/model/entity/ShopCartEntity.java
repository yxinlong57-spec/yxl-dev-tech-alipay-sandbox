package cn.bugstack.xfg.dev.tech.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 购物车实体
 *
 * @author 小傅哥
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShopCartEntity {

    /** 用户ID */
    private String userId;

    /** 商品ID */
    private String productId;

}
