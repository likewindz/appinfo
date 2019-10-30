package com.t248.appinfo.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
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
    private String usercode;

    /**
     * �û�����
     */
    @Column(name = "userName")
    private String username;

    /**
     * �û���ɫ���ͣ���Դ�������ֵ����Ϊ�����ܡ������г�����Ӫ�����ۣ�
     */
    @Column(name = "userType")
    private Long usertype;

    /**
     * �����ߣ���Դ��backend_user�û�����û�id��
     */
    @Column(name = "createdBy")
    private Long createdby;

    /**
     * ����ʱ��
     */
    @Column(name = "creationDate")
    private Date creationdate;

    /**
     * �����ߣ���Դ��backend_user�û�����û�id��
     */
    @Column(name = "modifyBy")
    private Long modifyby;

    /**
     * ���¸���ʱ��
     */
    @Column(name = "modifyDate")
    private Date modifydate;

    /**
     * �û�����
     */
    @Column(name = "userPassword")
    private String userpassword;


}