package com.t248.appinfo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "backend_user")
public class BackendUser {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户编码
     */
    @Column(name = "userCode")
    private String userCode;

    /**
     * 用户名称
     */
    @Column(name = "userName")
    private String userName;

    /**
     * 用户角色类型（来源于数据字典表，分为：超管、财务、市场、运营、销售）
     */
    @Column(name = "userType")
    private Long userType;

    /**
     * 创建者（来源于backend_user用户表的用户id）
     */
    @Column(name = "createdBy")
    private Long createdBy;

    /**
     * 创建时间
     */
    @Column(name = "creationDate")
    private Date creationDate;

    /**
     * 更新者（来源于backend_user用户表的用户id）
     */
    @Column(name = "modifyBy")
    private Long modifyBy;

    /**
     * 最新更新时间
     */
    @Column(name = "modifyDate")
    private Date modifyDate;

    /**
     * 用户密码
     */
    @Column(name = "userPassword")
    private String userPassword;

}