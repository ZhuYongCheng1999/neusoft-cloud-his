package com.neu.his.serviceInterface;

import com.alibaba.fastjson.JSONObject;
import com.neu.his.dto.*;

import java.util.List;

public interface RegistrationManagement {
    /**
     * 挂号方法
     *
     * @param registerDTO
     * @return
     */
    JSONObject register(RegisterDTO registerDTO);

    /**
     * 退号方法
     *
     * @param registerBackDTO
     * @return
     */
    JSONObject registerBack(RegisterBackDTO registerBackDTO);

    /**
     * 收费员收费
     *
     * @param chargeInfoDTO
     * @return
     */
    JSONObject charge(ChargeInfoDTO chargeInfoDTO);

    /**
     * 挂号时根据病历号得到一些信息
     *
     * @param medicalRecordIDDTO
     * @return
     */
    JSONObject getRegistrationInfo(MedicalRecordIDDTO medicalRecordIDDTO);

    /**
     * 得到所有的科室名称
     *
     * @return
     */
    List<JSONObject> getAllDepartmentName();

    /**
     * 根据科室得到该科室所有医生姓名
     *
     * @param departmentNameDTO
     * @return
     */
    List<JSONObject> getDoctorNameByDept(DepartmentNameDTO departmentNameDTO);

    /**
     * 根据医生姓名得到其初始挂号额和已挂号额
     *
     * @param doctorIDDTO
     * @return
     */
    JSONObject getRegistrationNum(DoctorIDDTO doctorIDDTO);

    /**
     * 根据病历号获得该患者挂号信息
     *
     * @param medicalRecordIDDTO
     * @return
     */
    List<JSONObject> getRegistrationRecord(MedicalRecordIDDTO medicalRecordIDDTO);
}
