package com.ctgu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author larry
 * @date 2020/8/3 11:38
 * @creed: Talk is cheap, show me the code!
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private int daId;
    private String contactName;
    private String address;
    private String contactTel;
}
