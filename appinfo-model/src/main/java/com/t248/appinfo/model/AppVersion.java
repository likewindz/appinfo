package com.t248.appinfo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

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
    private Long appId;

    /**
     * �汾��
     */
    private String versionNo;

    /**
     * �汾����
     */
    private String versionInfo;

    /**
     * ����״̬����Դ�ڣ�data_dictionary��1 ������ 2 �ѷ��� 3 Ԥ������
     */
    private Long publishStatus;

    /**
     * ��������
     */
    private String downloadLink;

    /**
     * �汾��С����λ��M��
     */
    private BigDecimal versionSize;

    /**
     * �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    private Long createdBy;

    /**
     * ����ʱ��
     */
    private Date creationDate;

    /**
     * �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    private Long modifyBy;

    /**
     * ���¸���ʱ��
     */
    private Date modifyDate;

    /**
     * apk�ļ��ķ������洢·��
     */
    private String apkLocPath;

    /**
     * �ϴ���apk�ļ�����
     */
    private String apkFileName;

    /**
     * ��ȡ����id
     *
     * @return id - ����id
     */
    public Long getId() {
        return id;
    }

    /**
     * ��������id
     *
     * @param id ����id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡappId����Դ�ڣ�app_info�������id��
     *
     * @return appId - appId����Դ�ڣ�app_info�������id��
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * ����appId����Դ�ڣ�app_info�������id��
     *
     * @param appId appId����Դ�ڣ�app_info�������id��
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * ��ȡ�汾��
     *
     * @return versionNo - �汾��
     */
    public String getVersionNo() {
        return versionNo;
    }

    /**
     * ���ð汾��
     *
     * @param versionNo �汾��
     */
    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo == null ? null : versionNo.trim();
    }

    /**
     * ��ȡ�汾����
     *
     * @return versionInfo - �汾����
     */
    public String getVersionInfo() {
        return versionInfo;
    }

    /**
     * ���ð汾����
     *
     * @param versionInfo �汾����
     */
    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo == null ? null : versionInfo.trim();
    }

    /**
     * ��ȡ����״̬����Դ�ڣ�data_dictionary��1 ������ 2 �ѷ��� 3 Ԥ������
     *
     * @return publishStatus - ����״̬����Դ�ڣ�data_dictionary��1 ������ 2 �ѷ��� 3 Ԥ������
     */
    public Long getPublishStatus() {
        return publishStatus;
    }

    /**
     * ���÷���״̬����Դ�ڣ�data_dictionary��1 ������ 2 �ѷ��� 3 Ԥ������
     *
     * @param publishStatus ����״̬����Դ�ڣ�data_dictionary��1 ������ 2 �ѷ��� 3 Ԥ������
     */
    public void setPublishStatus(Long publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * ��ȡ��������
     *
     * @return downloadLink - ��������
     */
    public String getDownloadLink() {
        return downloadLink;
    }

    /**
     * ������������
     *
     * @param downloadLink ��������
     */
    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink == null ? null : downloadLink.trim();
    }

    /**
     * ��ȡ�汾��С����λ��M��
     *
     * @return versionSize - �汾��С����λ��M��
     */
    public BigDecimal getVersionSize() {
        return versionSize;
    }

    /**
     * ���ð汾��С����λ��M��
     *
     * @param versionSize �汾��С����λ��M��
     */
    public void setVersionSize(BigDecimal versionSize) {
        this.versionSize = versionSize;
    }

    /**
     * ��ȡ�����ߣ���Դ��dev_user��������Ϣ����û�id��
     *
     * @return createdBy - �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * ���ô����ߣ���Դ��dev_user��������Ϣ����û�id��
     *
     * @param createdBy �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return creationDate - ����ʱ��
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * ���ô���ʱ��
     *
     * @param creationDate ����ʱ��
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * ��ȡ�����ߣ���Դ��dev_user��������Ϣ����û�id��
     *
     * @return modifyBy - �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    public Long getModifyBy() {
        return modifyBy;
    }

    /**
     * ���ø����ߣ���Դ��dev_user��������Ϣ����û�id��
     *
     * @param modifyBy �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    /**
     * ��ȡ���¸���ʱ��
     *
     * @return modifyDate - ���¸���ʱ��
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * �������¸���ʱ��
     *
     * @param modifyDate ���¸���ʱ��
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * ��ȡapk�ļ��ķ������洢·��
     *
     * @return apkLocPath - apk�ļ��ķ������洢·��
     */
    public String getApkLocPath() {
        return apkLocPath;
    }

    /**
     * ����apk�ļ��ķ������洢·��
     *
     * @param apkLocPath apk�ļ��ķ������洢·��
     */
    public void setApkLocPath(String apkLocPath) {
        this.apkLocPath = apkLocPath == null ? null : apkLocPath.trim();
    }

    /**
     * ��ȡ�ϴ���apk�ļ�����
     *
     * @return apkFileName - �ϴ���apk�ļ�����
     */
    public String getApkFileName() {
        return apkFileName;
    }

    /**
     * �����ϴ���apk�ļ�����
     *
     * @param apkFileName �ϴ���apk�ļ�����
     */
    public void setApkFileName(String apkFileName) {
        this.apkFileName = apkFileName == null ? null : apkFileName.trim();
    }
}