package com.ctgu.dao;

import com.ctgu.pojo.Business;
import org.apache.ibatis.annotations.Param;

/**
 * @author larry
 * @date 2020/8/3 14:23
 * @creed: Talk is cheap, show me the code!
 */
public interface BusinessDaoMapper {
//查新菜馆及其菜品信息 一对多
    Business getBusinessAndFoodsById(@Param("id") int id);
}
