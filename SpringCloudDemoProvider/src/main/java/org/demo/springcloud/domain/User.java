package org.demo.springcloud.domain;

import lombok.Data;
import javax.validation.constraints.NotNull;


/**
 * 用户信息
 */
@Data
public class User {
    /**
     * 用户id
     */
    @NotNull
    private String userId;
    /**
     * 姓名
     */
    private String name;
    private String sex;

    private int age;
}
