package com.macro.mall.common.enums;

/**
 * 订单状态枚举
 *
 * @author qinrongjun
 * @date 2022/4/14 9:56
 */
public enum OmsOrderStatusEnum {
    ALL(-1,"全部"),
    PENDING (0,"待付款"),
    AWAIT_DELIVERY(1,"待发货"),
    DELIVERED(2,"已发货"),
    COMPLETED(3,"已完成"),
    CLOSED(4,"已关闭");

    private final Integer code;
    private final String name;
    
    OmsOrderStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
    
    public Integer getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }

    public static OmsOrderStatusEnum codeOf(Integer code) {
        for (OmsOrderStatusEnum orderStatusEnum : values()) {
            if (code.equals(orderStatusEnum.getCode())) {
                return orderStatusEnum;
            }
        }
        return null;
    }
}
