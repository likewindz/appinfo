package com.t248.appinfo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "dev_user")
public class DevUser implements Serializable {
    /**
     * ����id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * �������ʺ�
     */
    @Column(name = "devCode")
    private String devCode;

    /**
     * ����������
     */
    @Column(name = "devName")
    private String devName;

    /**
     * ����������
     */
    @Column(name = "devPassword")
    private String devPassword;

    /**
     * �����ߵ�������
     */
    @Column(name = "devEmail")
    private String devEmail;

    /**
     * �����߼��
     */
    @Column(name = "devInfo")
    private String devInfo;

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





}