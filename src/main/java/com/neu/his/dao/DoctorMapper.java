package com.neu.his.dao;

import com.neu.his.pojo.Doctor;
import com.neu.his.pojo.DoctorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    long countByExample(DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int deleteByExample(DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int deleteByPrimaryKey(Short doctorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int insert(Doctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int insertSelective(Doctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    List<Doctor> selectByExample(DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    Doctor selectByPrimaryKey(Short doctorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int updateByPrimaryKeySelective(Doctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int updateByPrimaryKey(Doctor record);
}