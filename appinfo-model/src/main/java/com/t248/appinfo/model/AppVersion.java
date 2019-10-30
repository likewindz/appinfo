package com.t248.appinfo.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "app_version")
public class AppVersion {
    /**
     * ����id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * appId����Դ�ڣ�app_info�������id��
     */
    @Column(name = "appId")
    private Long appid;

    /**
     * �汾��
     */
    @Column(name = "versionNo")
    private String versionno;

    /**
     * �汾����
     */
    @Column(name = "versionInfo")
    private String versioninfo;

    /**
     * ����״̬����Դ�ڣ�data_dictionary��1 ������ 2 �ѷ��� 3 Ԥ������
     */
    @Column(name = "publishStatus")
    private Long publishstatus;

    /**
     * ��������
     */
    @Column(name = "downloadLink")
    private String downloadlink;

    /**
     * �汾��С����λ��M��
     */
    @Column(name = "versionSize")
    private BigDecimal versionsize;

    /**
     * �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    @Column(name = "createdBy")
    private Long createdby;

    /**
     * ����ʱ��
     */
    @Column(name = "creationDate")
    private Date creationdate;

    /**
     * �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    @Column(name = "modifyBy")
    private Long modifyby;

    /**
     * ���¸���ʱ��
     */
    @Column(name = "modifyDate")
    private Date modifydate;

    /**
     * apk�ļ��ķ������洢·��
     */
    @Column(name = "apkLocPath")
    private String apklocpath;

    /**
     * �ϴ���apk�ļ�����
     */
    @Column(name = "apkFileName")
    private String apkfilename;


}