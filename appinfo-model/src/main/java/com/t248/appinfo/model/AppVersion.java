package com.t248.appinfo.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Table(name = "app_version")
public class AppVersion {
    /**
     * ����id
     */
    @Id
    private Long id;

    /**
     * appId����Դ�ڣ�app_info�������id��
     */
    @Column(name ="appId")
    private Long appId;

    /**
     * �汾��
     */
    @Column(name = "versionNo")
    private String versionNo;

    /**
     * �汾����
     */
    @Column(name = "versionInfo")
    private String versionInfo;

    /**
     * ����״̬����Դ�ڣ�data_dictionary��1 ������ 2 �ѷ��� 3 Ԥ������
     */
    @Column(name = "publishStatus")
    private Long publishStatus;

    /**
     * ��������
     */
    @Column(name = "downloadLink")
    private String downloadLink;

    /**
     * �汾��С����λ��M��
     */
    @Column(name = "versionSize")
    private BigDecimal versionSize;

    /**
     * �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    @Column(name = "createdBy")
    private Long createdBy;

    /**
     * ����ʱ��
     */
    @Column(name = "creationDate")
    private Date creationDate;

    /**
     * �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    @Column(name = "modifyBy")
    private Long modifyBy;

    /**
     * ���¸���ʱ��
     */
    @Column(name = "modifyDate")
    private Date modifyDate;

    /**
     * apk�ļ��ķ������洢·��
     */
    @Column(name = "apkLocPath")
    private String apkLocPath;

    /**
     * �ϴ���apk�ļ�����
     */
    @Column(name = "apkFileName")
    private String apkFileName;

    
    
}