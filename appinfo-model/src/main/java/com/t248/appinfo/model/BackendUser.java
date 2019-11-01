package com.t248.appinfo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "backend_user")
public class BackendUser {
    /**
     * ����id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * �û�����
     */
    private String userCode;

    /**
     * �û�����
     */
    private String userName;

    /**
     * �û���ɫ���ͣ���Դ�������ֵ����Ϊ�����ܡ������г�����Ӫ�����ۣ�
     */
    private Long userType;

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
     * �û�����
     */
    private String userPassword;

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
     * ��ȡ�û�����
     *
     * @return userCode - �û�����
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * �����û�����
     *
     * @param userCode �û�����
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * ��ȡ�û�����
     *
     * @return userName - �û�����
     */
    public String getUserName() {
        return userName;
    }

    /**
     * �����û�����
     *
     * @param userName �û�����
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * ��ȡ�û���ɫ���ͣ���Դ�������ֵ����Ϊ�����ܡ������г�����Ӫ�����ۣ�
     *
     * @return userType - �û���ɫ���ͣ���Դ�������ֵ����Ϊ�����ܡ������г�����Ӫ�����ۣ�
     */
    public Long getUserType() {
        return userType;
    }

    /**
     * �����û���ɫ���ͣ���Դ�������ֵ����Ϊ�����ܡ������г�����Ӫ�����ۣ�
     *
     * @param userType �û���ɫ���ͣ���Դ�������ֵ����Ϊ�����ܡ������г�����Ӫ�����ۣ�
     */
    public void setUserType(Long userType) {
        this.userType = userType;
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

    /**
     * ��ȡ�û�����
     *
     * @return userPassword - �û�����
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * �����û�����
     *
     * @param userPassword �û�����
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}