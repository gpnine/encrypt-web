package com.zcl.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * .
 *
 * @Author Chenglin Zhu
 * @Date 2021/7/30 11:29 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    @TableField("username")
    private String userName;
    private String password;
    private Integer status;
    private String avatar;
    @TableField("nickname")
    private String nickName;
    private Date createdTime;
    private Date updatedTime;
    private String createdBy;
    private String updatedBy;
}
