package com.macro.mall.portal.trans;

import com.macro.mall.portal.domain.OmsOrderStatusCount;
import com.macro.mall.portal.domain.OmsOrderStatusGroup;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 订单转换
 *
 * @author qinrongjun
 * @date 2022/4/14 10:41
 */
@Mapper
public interface OmsOrderTransMapper {
    OmsOrderTransMapper INSTANCE = Mappers.getMapper(OmsOrderTransMapper.class);

    OmsOrderStatusCount toDTO(OmsOrderStatusGroup omsOrderStatusGroup);
}
