package com.t248.appinfo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "backend_user")
public class BackendUser {
    /**
     * ����id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * �û�����
     */
    @Column(name = "userCode")
    private String userCode;

    /**
     * �û�����
     */
    @Column(name = "userName")
    private String userName;

    /**
     * �û���ɫ���ͣ���Դ�������ֵ����Ϊ�����ܡ������г�����Ӫ�����ۣ�
     */
    @Column(name = "userType")
    private Long userType;

    /**
     * �����ߣ���Դ��backend_user�û�����û�id��
     */
    @Column(name = "createdBy")
    private Long createdBy;

    /**
     * ����ʱ��
     */
    @Column(name = "creationDate")
    private Date creationDate;

    /**
     * �����ߣ���Դ��backend_user�û�����û�id��
     */
    @Column(name = "modifyBy")
    private Long modifyBy;

    /**
     * ���¸���ʱ��
     */
    @Column(name = "modifyDate")
    private Date modifyDate;

    /**
     * �û�����
     */
    @Column(name = "userPassword")
    private String userPassword;

}