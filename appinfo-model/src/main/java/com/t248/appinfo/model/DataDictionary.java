package com.t248.appinfo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

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
    private String typeCode;

    /**
     * ��������
     */
    private String typeName;

    /**
     * ����ֵID
     */
    private Long valueId;

    /**
     * ����ֵName
     */
    private String valueName;

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
     * ��ȡ���ͱ���
     *
     * @return typeCode - ���ͱ���
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * �������ͱ���
     *
     * @param typeCode ���ͱ���
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    /**
     * ��ȡ��������
     *
     * @return typeName - ��������
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * ������������
     *
     * @param typeName ��������
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * ��ȡ����ֵID
     *
     * @return valueId - ����ֵID
     */
    public Long getValueId() {
        return valueId;
    }

    /**
     * ��������ֵID
     *
     * @param valueId ����ֵID
     */
    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    /**
     * ��ȡ����ֵName
     *
     * @return valueName - ����ֵName
     */
    public String getValueName() {
        return valueName;
    }

    /**
     * ��������ֵName
     *
     * @param valueName ����ֵName
     */
    public void setValueName(String valueName) {
        this.valueName = valueName == null ? null : valueName.trim();
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