package org.demo.springcloud.auto.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author autoGenerateByMyBatisPlus
 * @since 2020-07-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BsBankInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String bankNo;

    private String bankName;

    private String bankSName;

    /**
     * 创建日期
     */
    private String createDate;

    /**
     * 创建人
     */
    private String createOper;

    /**
     * 创建时间
     */
    private String createTime;


}
