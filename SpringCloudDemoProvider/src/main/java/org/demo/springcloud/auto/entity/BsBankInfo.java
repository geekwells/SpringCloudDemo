package org.demo.springcloud.auto.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author autoGenerateByMyBatisPlus
 * @since 2020-08-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("bs_bank_info")
public class BsBankInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
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
