package com.ctgu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author larry
 * @date 2020/7/31 11:32
 * @creed: Talk is cheap, show me the code!
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String userId;
    private String password;
    private String userName;
    private int userSex;
    private int delTag;


}
