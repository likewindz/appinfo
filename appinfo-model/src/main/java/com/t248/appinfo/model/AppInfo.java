package com.t248.appinfo.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

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
    private String softwarename;

    /**
     * APK���ƣ�Ψһ��
     */
    @Column(name = "APKName")
    private String apkname;

    /**
     * ֧��ROM
     */
    @Column(name = "supportROM")
    private String supportrom;

    /**
     * ��������
     */
    @Column(name = "interfaceLanguage")
    private String interfacelanguage;

    /**
     * �����С����λ��M��
     */
    @Column(name = "softwareSize")
    private BigDecimal softwaresize;

    /**
     * ��������
     */
    @Column(name = "updateDate")
    private Date updatedate;

    /**
     * ������id����Դ�ڣ�dev_user��Ŀ�����id��
     */
    @Column(name = "devId")
    private Long devid;

    /**
     * Ӧ�ü��
     */
    @Column(name = "appInfo")
    private String appinfo;

    /**
     * ״̬����Դ�ڣ�data_dictionary��1 ����� 2 ���ͨ�� 3 ��˲�ͨ�� 4 ���ϼ� 5 ���¼ܣ�
     */
    private Long status;

    /**
     * �ϼ�ʱ��
     */
    @Column(name = "onSaleDate")
    private Date onsaledate;

    /**
     * �¼�ʱ��
     */
    @Column(name = "offSaleDate")
    private Date offsaledate;

    /**
     * ����ƽ̨����Դ�ڣ�data_dictionary��1 �ֻ� 2 ƽ�� 3 ͨ�ã�
     */
    @Column(name = "flatformId")
    private Long flatformid;

    /**
     * �����������ࣨ��Դ�ڣ�data_dictionary��
     */
    @Column(name = "categoryLevel3")
    private Long categorylevel3;

    /**
     * ����������λ���Σ�
     */
    private Long downloads;

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
     * ����һ�����ࣨ��Դ�ڣ�data_dictionary��
     */
    @Column(name = "categoryLevel1")
    private Long categorylevel1;

    /**
     * �����������ࣨ��Դ�ڣ�data_dictionary��
     */
    @Column(name = "categoryLevel2")
    private Long categorylevel2;

    /**
     * LOGOͼƬurl·��
     */
    @Column(name = "logoPicPath")
    private String logopicpath;

    /**
     * LOGOͼƬ�ķ������洢·��
     */
    @Column(name = "logoLocPath")
    private String logolocpath;

    /**
     * ���µİ汾id
     */
    @Column(name = "versionId")
    private Long versionid;

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
     * ��ȡ�������
     *
     * @return softwareName - �������
     */
    public String getSoftwarename() {
        return softwarename;
    }

    /**
     * �����������
     *
     * @param softwarename �������
     */
    public void setSoftwarename(String softwarename) {
        this.softwarename = softwarename == null ? null : softwarename.trim();
    }

    /**
     * ��ȡAPK���ƣ�Ψһ��
     *
     * @return APKName - APK���ƣ�Ψһ��
     */
    public String getApkname() {
        return apkname;
    }

    /**
     * ����APK���ƣ�Ψһ��
     *
     * @param apkname APK���ƣ�Ψһ��
     */
    public void setApkname(String apkname) {
        this.apkname = apkname == null ? null : apkname.trim();
    }

    /**
     * ��ȡ֧��ROM
     *
     * @return supportROM - ֧��ROM
     */
    public String getSupportrom() {
        return supportrom;
    }

    /**
     * ����֧��ROM
     *
     * @param supportrom ֧��ROM
     */
    public void setSupportrom(String supportrom) {
        this.supportrom = supportrom == null ? null : supportrom.trim();
    }

    /**
     * ��ȡ��������
     *
     * @return interfaceLanguage - ��������
     */
    public String getInterfacelanguage() {
        return interfacelanguage;
    }

    /**
     * ���ý�������
     *
     * @param interfacelanguage ��������
     */
    public void setInterfacelanguage(String interfacelanguage) {
        this.interfacelanguage = interfacelanguage == null ? null : interfacelanguage.trim();
    }

    /**
     * ��ȡ�����С����λ��M��
     *
     * @return softwareSize - �����С����λ��M��
     */
    public BigDecimal getSoftwaresize() {
        return softwaresize;
    }

    /**
     * ���������С����λ��M��
     *
     * @param softwaresize �����С����λ��M��
     */
    public void setSoftwaresize(BigDecimal softwaresize) {
        this.softwaresize = softwaresize;
    }

    /**
     * ��ȡ��������
     *
     * @return updateDate - ��������
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * ���ø�������
     *
     * @param updatedate ��������
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * ��ȡ������id����Դ�ڣ�dev_user��Ŀ�����id��
     *
     * @return devId - ������id����Դ�ڣ�dev_user��Ŀ�����id��
     */
    public Long getDevid() {
        return devid;
    }

    /**
     * ���ÿ�����id����Դ�ڣ�dev_user��Ŀ�����id��
     *
     * @param devid ������id����Դ�ڣ�dev_user��Ŀ�����id��
     */
    public void setDevid(Long devid) {
        this.devid = devid;
    }

    /**
     * ��ȡӦ�ü��
     *
     * @return appInfo - Ӧ�ü��
     */
    public String getAppinfo() {
        return appinfo;
    }

    /**
     * ����Ӧ�ü��
     *
     * @param appinfo Ӧ�ü��
     */
    public void setAppinfo(String appinfo) {
        this.appinfo = appinfo == null ? null : appinfo.trim();
    }

    /**
     * ��ȡ״̬����Դ�ڣ�data_dictionary��1 ����� 2 ���ͨ�� 3 ��˲�ͨ�� 4 ���ϼ� 5 ���¼ܣ�
     *
     * @return status - ״̬����Դ�ڣ�data_dictionary��1 ����� 2 ���ͨ�� 3 ��˲�ͨ�� 4 ���ϼ� 5 ���¼ܣ�
     */
    public Long getStatus() {
        return status;
    }

    /**
     * ����״̬����Դ�ڣ�data_dictionary��1 ����� 2 ���ͨ�� 3 ��˲�ͨ�� 4 ���ϼ� 5 ���¼ܣ�
     *
     * @param status ״̬����Դ�ڣ�data_dictionary��1 ����� 2 ���ͨ�� 3 ��˲�ͨ�� 4 ���ϼ� 5 ���¼ܣ�
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * ��ȡ�ϼ�ʱ��
     *
     * @return onSaleDate - �ϼ�ʱ��
     */
    public Date getOnsaledate() {
        return onsaledate;
    }

    /**
     * �����ϼ�ʱ��
     *
     * @param onsaledate �ϼ�ʱ��
     */
    public void setOnsaledate(Date onsaledate) {
        this.onsaledate = onsaledate;
    }

    /**
     * ��ȡ�¼�ʱ��
     *
     * @return offSaleDate - �¼�ʱ��
     */
    public Date getOffsaledate() {
        return offsaledate;
    }

    /**
     * �����¼�ʱ��
     *
     * @param offsaledate �¼�ʱ��
     */
    public void setOffsaledate(Date offsaledate) {
        this.offsaledate = offsaledate;
    }

    /**
     * ��ȡ����ƽ̨����Դ�ڣ�data_dictionary��1 �ֻ� 2 ƽ�� 3 ͨ�ã�
     *
     * @return flatformId - ����ƽ̨����Դ�ڣ�data_dictionary��1 �ֻ� 2 ƽ�� 3 ͨ�ã�
     */
    public Long getFlatformid() {
        return flatformid;
    }

    /**
     * ��������ƽ̨����Դ�ڣ�data_dictionary��1 �ֻ� 2 ƽ�� 3 ͨ�ã�
     *
     * @param flatformid ����ƽ̨����Դ�ڣ�data_dictionary��1 �ֻ� 2 ƽ�� 3 ͨ�ã�
     */
    public void setFlatformid(Long flatformid) {
        this.flatformid = flatformid;
    }

    /**
     * ��ȡ�����������ࣨ��Դ�ڣ�data_dictionary��
     *
     * @return categoryLevel3 - �����������ࣨ��Դ�ڣ�data_dictionary��
     */
    public Long getCategorylevel3() {
        return categorylevel3;
    }

    /**
     * ���������������ࣨ��Դ�ڣ�data_dictionary��
     *
     * @param categorylevel3 �����������ࣨ��Դ�ڣ�data_dictionary��
     */
    public void setCategorylevel3(Long categorylevel3) {
        this.categorylevel3 = categorylevel3;
    }

    /**
     * ��ȡ����������λ���Σ�
     *
     * @return downloads - ����������λ���Σ�
     */
    public Long getDownloads() {
        return downloads;
    }

    /**
     * ��������������λ���Σ�
     *
     * @param downloads ����������λ���Σ�
     */
    public void setDownloads(Long downloads) {
        this.downloads = downloads;
    }

    /**
     * ��ȡ�����ߣ���Դ��dev_user��������Ϣ����û�id��
     *
     * @return createdBy - �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * ���ô����ߣ���Դ��dev_user��������Ϣ����û�id��
     *
     * @param createdby �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return creationDate - ����ʱ��
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * ���ô���ʱ��
     *
     * @param creationdate ����ʱ��
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * ��ȡ�����ߣ���Դ��dev_user��������Ϣ����û�id��
     *
     * @return modifyBy - �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    public Long getModifyby() {
        return modifyby;
    }

    /**
     * ���ø����ߣ���Դ��dev_user��������Ϣ����û�id��
     *
     * @param modifyby �����ߣ���Դ��dev_user��������Ϣ����û�id��
     */
    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    /**
     * ��ȡ���¸���ʱ��
     *
     * @return modifyDate - ���¸���ʱ��
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * �������¸���ʱ��
     *
     * @param modifydate ���¸���ʱ��
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * ��ȡ����һ�����ࣨ��Դ�ڣ�data_dictionary��
     *
     * @return categoryLevel1 - ����һ�����ࣨ��Դ�ڣ�data_dictionary��
     */
    public Long getCategorylevel1() {
        return categorylevel1;
    }

    /**
     * ��������һ�����ࣨ��Դ�ڣ�data_dictionary��
     *
     * @param categorylevel1 ����һ�����ࣨ��Դ�ڣ�data_dictionary��
     */
    public void setCategorylevel1(Long categorylevel1) {
        this.categorylevel1 = categorylevel1;
    }

    /**
     * ��ȡ�����������ࣨ��Դ�ڣ�data_dictionary��
     *
     * @return categoryLevel2 - �����������ࣨ��Դ�ڣ�data_dictionary��
     */
    public Long getCategorylevel2() {
        return categorylevel2;
    }

    /**
     * ���������������ࣨ��Դ�ڣ�data_dictionary��
     *
     * @param categorylevel2 �����������ࣨ��Դ�ڣ�data_dictionary��
     */
    public void setCategorylevel2(Long categorylevel2) {
        this.categorylevel2 = categorylevel2;
    }

    /**
     * ��ȡLOGOͼƬurl·��
     *
     * @return logoPicPath - LOGOͼƬurl·��
     */
    public String getLogopicpath() {
        return logopicpath;
    }

    /**
     * ����LOGOͼƬurl·��
     *
     * @param logopicpath LOGOͼƬurl·��
     */
    public void setLogopicpath(String logopicpath) {
        this.logopicpath = logopicpath == null ? null : logopicpath.trim();
    }

    /**
     * ��ȡLOGOͼƬ�ķ������洢·��
     *
     * @return logoLocPath - LOGOͼƬ�ķ������洢·��
     */
    public String getLogolocpath() {
        return logolocpath;
    }

    /**
     * ����LOGOͼƬ�ķ������洢·��
     *
     * @param logolocpath LOGOͼƬ�ķ������洢·��
     */
    public void setLogolocpath(String logolocpath) {
        this.logolocpath = logolocpath == null ? null : logolocpath.trim();
    }

    /**
     * ��ȡ���µİ汾id
     *
     * @return versionId - ���µİ汾id
     */
    public Long getVersionid() {
        return versionid;
    }

    /**
     * �������µİ汾id
     *
     * @param versionid ���µİ汾id
     */
    public void setVersionid(Long versionid) {
        this.versionid = versionid;
    }
}