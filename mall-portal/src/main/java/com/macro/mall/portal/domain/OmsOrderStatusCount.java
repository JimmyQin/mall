package com.macro.mall.portal.domain;

import lombok.Getter;
import lombok.Setter;


/**
 * 订单状态数量
 *
 * @author qinrongjun
 * @date 2022/4/14 10:35
 */
@Getter
@Setter
public class OmsOrderStatusCount {
    private Integer all;
    private Integer pending;
    private Integer awaitDelivery;
    private Integer delivered;
    private Integer completed;
    private Integer closed;
}
