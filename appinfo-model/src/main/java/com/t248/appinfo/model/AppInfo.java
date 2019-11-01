package com.t248.appinfo.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Table(name = "app_info")
public class AppInfo {
    /**
     * ����id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * �������
     */
    @Column(name = "softwareName")
    private String softwareName;

    /**
     * APK���ƣ�Ψһ��
     */
    @Column(name = "APKName")
    private String APKName;

    /**
     * ֧��ROM
     */
    @Column(name = "supportROM")
    private String supportROM;

    /**
     * ��������
     */
    @Column(name = "interfaceLanguage")
    private String interfaceLanguage;

    /**
     * �����С����λ��M��
     */
    @Column(name = "softwareSize")
    private BigDecimal softwareSize;

    /**
     * ��������
     */
    @Column(name = "updateDate")
    private Date updateDate;

    /**
     * ������id����Դ�ڣ�dev_user��Ŀ�����id��
     */
    @Column(name = "devId")
    private Long devId;

    /**
     * Ӧ�ü��
     */
    @Column(name = "appInfo")
    private String appInfo;

    /**
     * ״̬����Դ�ڣ�data_dictionary��1 ����� 2 ���ͨ�� 3 ��˲�ͨ�� 4 ���ϼ� 5 ���¼ܣ�
     */
    @Column(name = "status")
    private Long status;

    /**
     * �ϼ�ʱ��
     */
    @Column(name = "onSaleDate")
    private Date onSaleDate;

    /**
     * �¼�ʱ��
     */
    @Column(name = "offSaleDate")
    private Date offSaleDate;

    /**
     * ����ƽ̨����Դ�ڣ�data_dictionary��1 �ֻ� 2 ƽ�� 3 ͨ�ã�
     */
    @Column(name = "flatformId")
    private Long flatformId;

    /**
     * �����������ࣨ��Դ�ڣ�data_dictionary��
     */
    @Column(name = "categoryLevel3")
    private Long categoryLevel3;

    /**
     * ����������λ���Σ�
     */
    @Column(name = "downloads")
    private Long downloads;

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
     * ����һ�����ࣨ��Դ�ڣ�data_dictionary��
     */
    @Column(name = "categoryLevel1")
    private Long categoryLevel1;

    /**
     * �����������ࣨ��Դ�ڣ�data_dictionary��
     */
    @Column(name = "categoryLevel2")
    private Long categoryLevel2;

    /**
     * LOGOͼƬurl·��
     */
    @Column(name = "logoPicPath")
    private String logoPicPath;

    /**
     * LOGOͼƬ�ķ������洢·��
     */
    @Column(name = "logoLocPath")
    private String logoLocPath;

    /**
     * ���µİ汾id
     */
    @Column(name = "versionId")
    private Long versionId;



}