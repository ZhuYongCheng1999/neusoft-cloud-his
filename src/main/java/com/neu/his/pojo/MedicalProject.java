package com.neu.his.pojo;

import java.io.Serializable;
import java.util.Date;

public class MedicalProject implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_project.medical_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private Short medicalId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_project.regist_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private Integer registId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_project.item_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private Short itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_project.item_name
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private String itemName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_project.project_urgent
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private Boolean projectUrgent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_project.medical_execution
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private Boolean medicalExecution;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_project.item_amount
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private Byte itemAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_project.project_time
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private Date projectTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_project.check_doctor_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private Short checkDoctorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_project.medical_project_result
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private String medicalProjectResult;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medical_project.begin_doctor_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    private Short beginDoctorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_project.medical_id
     *
     * @return the value of medical_project.medical_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Short getMedicalId() {
        return medicalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_project.medical_id
     *
     * @param medicalId the value for medical_project.medical_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setMedicalId(Short medicalId) {
        this.medicalId = medicalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_project.regist_id
     *
     * @return the value of medical_project.regist_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Integer getRegistId() {
        return registId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_project.regist_id
     *
     * @param registId the value for medical_project.regist_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setRegistId(Integer registId) {
        this.registId = registId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_project.item_id
     *
     * @return the value of medical_project.item_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Short getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_project.item_id
     *
     * @param itemId the value for medical_project.item_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setItemId(Short itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_project.item_name
     *
     * @return the value of medical_project.item_name
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_project.item_name
     *
     * @param itemName the value for medical_project.item_name
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_project.project_urgent
     *
     * @return the value of medical_project.project_urgent
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Boolean getProjectUrgent() {
        return projectUrgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_project.project_urgent
     *
     * @param projectUrgent the value for medical_project.project_urgent
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setProjectUrgent(Boolean projectUrgent) {
        this.projectUrgent = projectUrgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_project.medical_execution
     *
     * @return the value of medical_project.medical_execution
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Boolean getMedicalExecution() {
        return medicalExecution;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_project.medical_execution
     *
     * @param medicalExecution the value for medical_project.medical_execution
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setMedicalExecution(Boolean medicalExecution) {
        this.medicalExecution = medicalExecution;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_project.item_amount
     *
     * @return the value of medical_project.item_amount
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Byte getItemAmount() {
        return itemAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_project.item_amount
     *
     * @param itemAmount the value for medical_project.item_amount
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setItemAmount(Byte itemAmount) {
        this.itemAmount = itemAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_project.project_time
     *
     * @return the value of medical_project.project_time
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Date getProjectTime() {
        return projectTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_project.project_time
     *
     * @param projectTime the value for medical_project.project_time
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setProjectTime(Date projectTime) {
        this.projectTime = projectTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_project.check_doctor_id
     *
     * @return the value of medical_project.check_doctor_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Short getCheckDoctorId() {
        return checkDoctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_project.check_doctor_id
     *
     * @param checkDoctorId the value for medical_project.check_doctor_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setCheckDoctorId(Short checkDoctorId) {
        this.checkDoctorId = checkDoctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_project.medical_project_result
     *
     * @return the value of medical_project.medical_project_result
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public String getMedicalProjectResult() {
        return medicalProjectResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_project.medical_project_result
     *
     * @param medicalProjectResult the value for medical_project.medical_project_result
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setMedicalProjectResult(String medicalProjectResult) {
        this.medicalProjectResult = medicalProjectResult == null ? null : medicalProjectResult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medical_project.begin_doctor_id
     *
     * @return the value of medical_project.begin_doctor_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Short getBeginDoctorId() {
        return beginDoctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medical_project.begin_doctor_id
     *
     * @param beginDoctorId the value for medical_project.begin_doctor_id
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setBeginDoctorId(Short beginDoctorId) {
        this.beginDoctorId = beginDoctorId;
    }
}