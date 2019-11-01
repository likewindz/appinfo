package com.t248.appinfo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "ad_promotion")
public class AdPromotion {
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
     * ���ͼƬ�洢·��
     */
    private String adPicPath;

    /**
     * �������
     */
    private Long adPV;

    /**
     * �ֲ�λ��1-n��
     */
    private Integer carouselPosition;

    /**
     * ��Чʱ��
     */
    private Date startTime;

    /**
     * ʧЧʱ��
     */
    private Date endTime;

    /**
     * �����ߣ���Դ��backend_user�û�����û�id��
     */
    private Long createdBy;

    /**
     * ����ʱ��
     */
    private Date creationDate;

    /**
     * �����ߣ���Դ��backend_user�û�����û�id��
     */
    private Long modifyBy;

    /**
     * ���¸���ʱ��
     */
    private Date modifyDate;

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
     * ��ȡ���ͼƬ�洢·��
     *
     * @return adPicPath - ���ͼƬ�洢·��
     */
    public String getAdPicPath() {
        return adPicPath;
    }

    /**
     * ���ù��ͼƬ�洢·��
     *
     * @param adPicPath ���ͼƬ�洢·��
     */
    public void setAdPicPath(String adPicPath) {
        this.adPicPath = adPicPath == null ? null : adPicPath.trim();
    }

    /**
     * ��ȡ�������
     *
     * @return adPV - �������
     */
    public Long getAdPV() {
        return adPV;
    }

    /**
     * ���ù������
     *
     * @param adPV �������
     */
    public void setAdPV(Long adPV) {
        this.adPV = adPV;
    }

    /**
     * ��ȡ�ֲ�λ��1-n��
     *
     * @return carouselPosition - �ֲ�λ��1-n��
     */
    public Integer getCarouselPosition() {
        return carouselPosition;
    }

    /**
     * �����ֲ�λ��1-n��
     *
     * @param carouselPosition �ֲ�λ��1-n��
     */
    public void setCarouselPosition(Integer carouselPosition) {
        this.carouselPosition = carouselPosition;
    }

    /**
     * ��ȡ��Чʱ��
     *
     * @return startTime - ��Чʱ��
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * ������Чʱ��
     *
     * @param startTime ��Чʱ��
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * ��ȡʧЧʱ��
     *
     * @return endTime - ʧЧʱ��
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * ����ʧЧʱ��
     *
     * @param endTime ʧЧʱ��
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * ��ȡ�����ߣ���Դ��backend_user�û�����û�id��
     *
     * @return createdBy - �����ߣ���Դ��backend_user�û�����û�id��
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * ���ô����ߣ���Դ��backend_user�û�����û�id��
     *
     * @param createdBy �����ߣ���Դ��backend_user�û�����û�id��
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
     * ��ȡ�����ߣ���Դ��backend_user�û�����û�id��
     *
     * @return modifyBy - �����ߣ���Դ��backend_user�û�����û�id��
     */
    public Long getModifyBy() {
        return modifyBy;
    }

    /**
     * ���ø����ߣ���Դ��backend_user�û�����û�id��
     *
     * @param modifyBy �����ߣ���Դ��backend_user�û�����û�id��
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
}