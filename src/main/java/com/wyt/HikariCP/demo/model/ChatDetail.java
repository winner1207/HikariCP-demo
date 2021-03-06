package com.wyt.HikariCP.demo.model;

import java.io.Serializable;
import java.util.Date;

public class ChatDetail implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.chat_info_id
     *
     * @mbggenerated
     */
    private Long chatInfoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.company_id
     *
     * @mbggenerated
     */
    private Long companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.staff_id
     *
     * @mbggenerated
     */
    private Long staffId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.staff_name
     *
     * @mbggenerated
     */
    private String staffName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.event_type
     *
     * @mbggenerated
     */
    private Byte eventType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.content_type
     *
     * @mbggenerated
     */
    private Byte contentType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.event_time
     *
     * @mbggenerated
     */
    private Date eventTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.send_status
     *
     * @mbggenerated
     */
    private Byte sendStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.resend_times
     *
     * @mbggenerated
     */
    private Integer resendTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.send_type
     *
     * @mbggenerated
     */
    private Byte sendType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.mid
     *
     * @mbggenerated
     */
    private Long mid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.client_mid
     *
     * @mbggenerated
     */
    private String clientMid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.create_datetime
     *
     * @mbggenerated
     */
    private Date createDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.dt1
     *
     * @mbggenerated
     */
    private Long dt1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.dt2
     *
     * @mbggenerated
     */
    private Long dt2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.dt3
     *
     * @mbggenerated
     */
    private Long dt3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.vt1
     *
     * @mbggenerated
     */
    private String vt1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.vt2
     *
     * @mbggenerated
     */
    private String vt2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.vt3
     *
     * @mbggenerated
     */
    private String vt3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.fvt1
     *
     * @mbggenerated
     */
    private String fvt1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.fvt2
     *
     * @mbggenerated
     */
    private String fvt2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_detail.fvt3
     *
     * @mbggenerated
     */
    private String fvt3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chat_detail
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.id
     *
     * @return the value of chat_detail.id
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.id
     *
     * @param id the value for chat_detail.id
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.chat_info_id
     *
     * @return the value of chat_detail.chat_info_id
     * @mbggenerated
     */
    public Long getChatInfoId() {
        return chatInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.chat_info_id
     *
     * @param chatInfoId the value for chat_detail.chat_info_id
     * @mbggenerated
     */
    public void setChatInfoId(Long chatInfoId) {
        this.chatInfoId = chatInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.company_id
     *
     * @return the value of chat_detail.company_id
     * @mbggenerated
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.company_id
     *
     * @param companyId the value for chat_detail.company_id
     * @mbggenerated
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.staff_id
     *
     * @return the value of chat_detail.staff_id
     * @mbggenerated
     */
    public Long getStaffId() {
        return staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.staff_id
     *
     * @param staffId the value for chat_detail.staff_id
     * @mbggenerated
     */
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.staff_name
     *
     * @return the value of chat_detail.staff_name
     * @mbggenerated
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.staff_name
     *
     * @param staffName the value for chat_detail.staff_name
     * @mbggenerated
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.event_type
     *
     * @return the value of chat_detail.event_type
     * @mbggenerated
     */
    public Byte getEventType() {
        return eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.event_type
     *
     * @param eventType the value for chat_detail.event_type
     * @mbggenerated
     */
    public void setEventType(Byte eventType) {
        this.eventType = eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.content_type
     *
     * @return the value of chat_detail.content_type
     * @mbggenerated
     */
    public Byte getContentType() {
        return contentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.content_type
     *
     * @param contentType the value for chat_detail.content_type
     * @mbggenerated
     */
    public void setContentType(Byte contentType) {
        this.contentType = contentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.content
     *
     * @return the value of chat_detail.content
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.content
     *
     * @param content the value for chat_detail.content
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.event_time
     *
     * @return the value of chat_detail.event_time
     * @mbggenerated
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.event_time
     *
     * @param eventTime the value for chat_detail.event_time
     * @mbggenerated
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.send_status
     *
     * @return the value of chat_detail.send_status
     * @mbggenerated
     */
    public Byte getSendStatus() {
        return sendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.send_status
     *
     * @param sendStatus the value for chat_detail.send_status
     * @mbggenerated
     */
    public void setSendStatus(Byte sendStatus) {
        this.sendStatus = sendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.resend_times
     *
     * @return the value of chat_detail.resend_times
     * @mbggenerated
     */
    public Integer getResendTimes() {
        return resendTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.resend_times
     *
     * @param resendTimes the value for chat_detail.resend_times
     * @mbggenerated
     */
    public void setResendTimes(Integer resendTimes) {
        this.resendTimes = resendTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.send_type
     *
     * @return the value of chat_detail.send_type
     * @mbggenerated
     */
    public Byte getSendType() {
        return sendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.send_type
     *
     * @param sendType the value for chat_detail.send_type
     * @mbggenerated
     */
    public void setSendType(Byte sendType) {
        this.sendType = sendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.mid
     *
     * @return the value of chat_detail.mid
     * @mbggenerated
     */
    public Long getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.mid
     *
     * @param mid the value for chat_detail.mid
     * @mbggenerated
     */
    public void setMid(Long mid) {
        this.mid = mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.client_mid
     *
     * @return the value of chat_detail.client_mid
     * @mbggenerated
     */
    public String getClientMid() {
        return clientMid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.client_mid
     *
     * @param clientMid the value for chat_detail.client_mid
     * @mbggenerated
     */
    public void setClientMid(String clientMid) {
        this.clientMid = clientMid == null ? null : clientMid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.create_datetime
     *
     * @return the value of chat_detail.create_datetime
     * @mbggenerated
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.create_datetime
     *
     * @param createDatetime the value for chat_detail.create_datetime
     * @mbggenerated
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.memo
     *
     * @return the value of chat_detail.memo
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.memo
     *
     * @param memo the value for chat_detail.memo
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.dt1
     *
     * @return the value of chat_detail.dt1
     * @mbggenerated
     */
    public Long getDt1() {
        return dt1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.dt1
     *
     * @param dt1 the value for chat_detail.dt1
     * @mbggenerated
     */
    public void setDt1(Long dt1) {
        this.dt1 = dt1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.dt2
     *
     * @return the value of chat_detail.dt2
     * @mbggenerated
     */
    public Long getDt2() {
        return dt2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.dt2
     *
     * @param dt2 the value for chat_detail.dt2
     * @mbggenerated
     */
    public void setDt2(Long dt2) {
        this.dt2 = dt2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.dt3
     *
     * @return the value of chat_detail.dt3
     * @mbggenerated
     */
    public Long getDt3() {
        return dt3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.dt3
     *
     * @param dt3 the value for chat_detail.dt3
     * @mbggenerated
     */
    public void setDt3(Long dt3) {
        this.dt3 = dt3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.vt1
     *
     * @return the value of chat_detail.vt1
     * @mbggenerated
     */
    public String getVt1() {
        return vt1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.vt1
     *
     * @param vt1 the value for chat_detail.vt1
     * @mbggenerated
     */
    public void setVt1(String vt1) {
        this.vt1 = vt1 == null ? null : vt1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.vt2
     *
     * @return the value of chat_detail.vt2
     * @mbggenerated
     */
    public String getVt2() {
        return vt2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.vt2
     *
     * @param vt2 the value for chat_detail.vt2
     * @mbggenerated
     */
    public void setVt2(String vt2) {
        this.vt2 = vt2 == null ? null : vt2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.vt3
     *
     * @return the value of chat_detail.vt3
     * @mbggenerated
     */
    public String getVt3() {
        return vt3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.vt3
     *
     * @param vt3 the value for chat_detail.vt3
     * @mbggenerated
     */
    public void setVt3(String vt3) {
        this.vt3 = vt3 == null ? null : vt3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.fvt1
     *
     * @return the value of chat_detail.fvt1
     * @mbggenerated
     */
    public String getFvt1() {
        return fvt1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.fvt1
     *
     * @param fvt1 the value for chat_detail.fvt1
     * @mbggenerated
     */
    public void setFvt1(String fvt1) {
        this.fvt1 = fvt1 == null ? null : fvt1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.fvt2
     *
     * @return the value of chat_detail.fvt2
     * @mbggenerated
     */
    public String getFvt2() {
        return fvt2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.fvt2
     *
     * @param fvt2 the value for chat_detail.fvt2
     * @mbggenerated
     */
    public void setFvt2(String fvt2) {
        this.fvt2 = fvt2 == null ? null : fvt2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_detail.fvt3
     *
     * @return the value of chat_detail.fvt3
     * @mbggenerated
     */
    public String getFvt3() {
        return fvt3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_detail.fvt3
     *
     * @param fvt3 the value for chat_detail.fvt3
     * @mbggenerated
     */
    public void setFvt3(String fvt3) {
        this.fvt3 = fvt3 == null ? null : fvt3.trim();
    }
}