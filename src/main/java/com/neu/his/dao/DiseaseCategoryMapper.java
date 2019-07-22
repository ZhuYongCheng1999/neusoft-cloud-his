package com.neu.his.dao;

import com.neu.his.pojo.DiseaseCategory;
import com.neu.his.pojo.DiseaseCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiseaseCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_category
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    long countByExample(DiseaseCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_category
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int deleteByExample(DiseaseCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_category
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int deleteByPrimaryKey(Short diseaseCateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_category
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int insert(DiseaseCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_category
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int insertSelective(DiseaseCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_category
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    List<DiseaseCategory> selectByExample(DiseaseCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_category
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    DiseaseCategory selectByPrimaryKey(Short diseaseCateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_category
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int updateByExampleSelective(@Param("record") DiseaseCategory record, @Param("example") DiseaseCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_category
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int updateByExample(@Param("record") DiseaseCategory record, @Param("example") DiseaseCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_category
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int updateByPrimaryKeySelective(DiseaseCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_category
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    int updateByPrimaryKey(DiseaseCategory record);
}