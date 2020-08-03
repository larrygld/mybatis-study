package com.ctgu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author larry
 * @date 2020/8/3 14:11
 * @creed: Talk is cheap, show me the code!
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Business {
    private int businessId;
    private String businessName;
    private String businessAddress;
    private String businessExplain;
    private String businessImg;
    private int orderTypeId;
    private double starPrice;
    private double deliveryPrice;
    private String remarks;

    private List<Food> foodList;
}
