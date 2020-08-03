package com.ctgu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author larry
 * @date 2020/8/3 14:14
 * @creed: Talk is cheap, show me the code!
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    private int foodId;
    private String foodName;
    private String foodExplain;
    private String foodImg;
    private Double foodPrice;
    private int businessId;
    private String remarks;
}
