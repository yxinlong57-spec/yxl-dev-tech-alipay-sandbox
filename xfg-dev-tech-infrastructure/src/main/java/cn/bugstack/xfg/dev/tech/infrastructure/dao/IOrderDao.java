package cn.bugstack.xfg.dev.tech.infrastructure.dao;

import cn.bugstack.xfg.dev.tech.infrastructure.po.PayOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IOrderDao {

    void insert(PayOrder order);

    PayOrder queryUnPayOrder(PayOrder order);

    void updateOrderPayInfo(PayOrder order);

    void changeOrderPaySuccess(PayOrder order);

}
