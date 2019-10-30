package com.t248.appinfo.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
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
    @Column(name = "appId")
    private Long appid;

    /**
     * ���ͼƬ�洢·��
     */
    @Column(name = "adPicPath")
    private String adpicpath;

    /**
     * �������
     */
    @Column(name = "adPV")
    private Long adpv;

    /**
     * �ֲ�λ��1-n��
     */
    @Column(name = "carouselPosition")
    private Integer carouselposition;

    /**
     * ��Чʱ��
     */
    @Column(name = "startTime")
    private Date starttime;

    /**
     * ʧЧʱ��
     */
    @Column(name = "endTime")
    private Date endtime;

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