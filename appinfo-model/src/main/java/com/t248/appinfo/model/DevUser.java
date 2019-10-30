package com.t248.appinfo.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "dev_user")
public class DevUser {
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
    private String devcode;

    /**
     * ����������
     */
    @Column(name = "devName")
    private String devname;

    /**
     * ����������
     */
    @Column(name = "devPassword")
    private String devpassword;

    /**
     * �����ߵ�������
     */
    @Column(name = "devEmail")
    private String devemail;

    /**
     * �����߼��
     */
    @Column(name = "devInfo")
    private String devinfo;

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


}