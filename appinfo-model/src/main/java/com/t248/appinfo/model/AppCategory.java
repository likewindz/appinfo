package com.t248.appinfo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

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
    private String categoryCode;

    /**
     * ��������
     */
    private String categoryName;

    /**
     * �����ڵ�id
     */
    private Long parentId;

    /**
     * �����ߣ���Դ��backend_user�û�����û�id��
     */
    private Long createdBy;

    /**
     * ����ʱ��
     */
    private Date creationTime;

    /**
     * �����ߣ���Դ��backend_user�û�����û�id��
     */
    private Long modifyBy;

    /**
     * ���¸���ʱ��
     */
    private Date modifyDate;

    private Integer catelevel;

    /**
     * ��ȡ����ID
     *
     * @return id - ����ID
     */
    public Long getId() {
        return id;
    }

    /**
     * ��������ID
     *
     * @param id ����ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ�������
     *
     * @return categoryCode - �������
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * ���÷������
     *
     * @param categoryCode �������
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    /**
     * ��ȡ��������
     *
     * @return categoryName - ��������
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * ���÷�������
     *
     * @param categoryName ��������
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * ��ȡ�����ڵ�id
     *
     * @return parentId - �����ڵ�id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * ���ø����ڵ�id
     *
     * @param parentId �����ڵ�id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
     * @return creationTime - ����ʱ��
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * ���ô���ʱ��
     *
     * @param creationTime ����ʱ��
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
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

    /**
     * @return catelevel
     */
    public Integer getCatelevel() {
        return catelevel;
    }

    /**
     * @param catelevel
     */
    public void setCatelevel(Integer catelevel) {
        this.catelevel = catelevel;
    }
}