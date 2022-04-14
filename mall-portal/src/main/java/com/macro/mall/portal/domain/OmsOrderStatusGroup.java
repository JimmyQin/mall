package com.macro.mall.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 订单状态
 *
 * @author qinrongjun
 * @date 2022/4/14 9:47
 */
@Getter
@Setter
public class OmsOrderStatusGroup {
    @ApiModelProperty("订单状态")
    private Integer status;
    @ApiModelProperty("订单数量")
    private Integer total;

}
