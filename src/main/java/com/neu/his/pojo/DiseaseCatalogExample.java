package com.neu.his.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DiseaseCatalogExample implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public DiseaseCatalogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDiseaseIdIsNull() {
            addCriterion("disease_id is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIsNotNull() {
            addCriterion("disease_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdEqualTo(Integer value) {
            addCriterion("disease_id =", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotEqualTo(Integer value) {
            addCriterion("disease_id <>", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThan(Integer value) {
            addCriterion("disease_id >", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("disease_id >=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThan(Integer value) {
            addCriterion("disease_id <", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("disease_id <=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIn(List<Integer> values) {
            addCriterion("disease_id in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotIn(List<Integer> values) {
            addCriterion("disease_id not in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdBetween(Integer value1, Integer value2) {
            addCriterion("disease_id between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("disease_id not between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeIsNull() {
            addCriterion("disease_code is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeIsNotNull() {
            addCriterion("disease_code is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeEqualTo(String value) {
            addCriterion("disease_code =", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeNotEqualTo(String value) {
            addCriterion("disease_code <>", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeGreaterThan(String value) {
            addCriterion("disease_code >", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("disease_code >=", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeLessThan(String value) {
            addCriterion("disease_code <", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeLessThanOrEqualTo(String value) {
            addCriterion("disease_code <=", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeLike(String value) {
            addCriterion("disease_code like", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeNotLike(String value) {
            addCriterion("disease_code not like", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeIn(List<String> values) {
            addCriterion("disease_code in", values, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeNotIn(List<String> values) {
            addCriterion("disease_code not in", values, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeBetween(String value1, String value2) {
            addCriterion("disease_code between", value1, value2, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeNotBetween(String value1, String value2) {
            addCriterion("disease_code not between", value1, value2, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIsNull() {
            addCriterion("disease_name is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIsNotNull() {
            addCriterion("disease_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameEqualTo(String value) {
            addCriterion("disease_name =", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotEqualTo(String value) {
            addCriterion("disease_name <>", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameGreaterThan(String value) {
            addCriterion("disease_name >", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("disease_name >=", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLessThan(String value) {
            addCriterion("disease_name <", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLessThanOrEqualTo(String value) {
            addCriterion("disease_name <=", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLike(String value) {
            addCriterion("disease_name like", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotLike(String value) {
            addCriterion("disease_name not like", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIn(List<String> values) {
            addCriterion("disease_name in", values, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotIn(List<String> values) {
            addCriterion("disease_name not in", values, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameBetween(String value1, String value2) {
            addCriterion("disease_name between", value1, value2, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotBetween(String value1, String value2) {
            addCriterion("disease_name not between", value1, value2, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdIsNull() {
            addCriterion("disease_icd is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdIsNotNull() {
            addCriterion("disease_icd is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdEqualTo(String value) {
            addCriterion("disease_icd =", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdNotEqualTo(String value) {
            addCriterion("disease_icd <>", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdGreaterThan(String value) {
            addCriterion("disease_icd >", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdGreaterThanOrEqualTo(String value) {
            addCriterion("disease_icd >=", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdLessThan(String value) {
            addCriterion("disease_icd <", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdLessThanOrEqualTo(String value) {
            addCriterion("disease_icd <=", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdLike(String value) {
            addCriterion("disease_icd like", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdNotLike(String value) {
            addCriterion("disease_icd not like", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdIn(List<String> values) {
            addCriterion("disease_icd in", values, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdNotIn(List<String> values) {
            addCriterion("disease_icd not in", values, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdBetween(String value1, String value2) {
            addCriterion("disease_icd between", value1, value2, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdNotBetween(String value1, String value2) {
            addCriterion("disease_icd not between", value1, value2, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseCateIdIsNull() {
            addCriterion("disease_cate_id is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCateIdIsNotNull() {
            addCriterion("disease_cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCateIdEqualTo(Short value) {
            addCriterion("disease_cate_id =", value, "diseaseCateId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCateIdNotEqualTo(Short value) {
            addCriterion("disease_cate_id <>", value, "diseaseCateId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCateIdGreaterThan(Short value) {
            addCriterion("disease_cate_id >", value, "diseaseCateId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCateIdGreaterThanOrEqualTo(Short value) {
            addCriterion("disease_cate_id >=", value, "diseaseCateId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCateIdLessThan(Short value) {
            addCriterion("disease_cate_id <", value, "diseaseCateId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCateIdLessThanOrEqualTo(Short value) {
            addCriterion("disease_cate_id <=", value, "diseaseCateId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCateIdIn(List<Short> values) {
            addCriterion("disease_cate_id in", values, "diseaseCateId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCateIdNotIn(List<Short> values) {
            addCriterion("disease_cate_id not in", values, "diseaseCateId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCateIdBetween(Short value1, Short value2) {
            addCriterion("disease_cate_id between", value1, value2, "diseaseCateId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCateIdNotBetween(Short value1, Short value2) {
            addCriterion("disease_cate_id not between", value1, value2, "diseaseCateId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table disease_catalog
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 22 23:45:36 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table disease_catalog
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}