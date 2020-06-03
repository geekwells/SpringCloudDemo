package org.demo.SpringCloud.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
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
