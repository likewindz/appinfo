package com.t248.appinfo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "app_category")
public class AppCategory {
    /**
     * ����ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * �������
     */
    @Column(name = "categoryCode")
    private String categorycode;

    /**
     * ��������
     */
    @Column(name = "categoryName")
    private String categoryname;

    /**
     * �����ڵ�id
     */
    @Column(name = "parentId")
    private Long parentid;

    /**
     * �����ߣ���Դ��backend_user�û�����û�id��
     */
    @Column(name = "createdBy")
    private Long createdby;

    /**
     * ����ʱ��
     */
    @Column(name = "creationTime")
    private Date creationtime;

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