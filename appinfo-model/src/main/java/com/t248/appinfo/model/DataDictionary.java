package com.t248.appinfo.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "data_dictionary")
public class DataDictionary {
    /**
     * ����ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ���ͱ���
     */
    @Column(name = "typeCode")
    private String typecode;

    /**
     * ��������
     */
    @Column(name = "typeName")
    private String typename;

    /**
     * ����ֵID
     */
    @Column(name = "valueId")
    private Long valueid;

    /**
     * ����ֵName
     */
    @Column(name = "valueName")
    private String valuename;

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