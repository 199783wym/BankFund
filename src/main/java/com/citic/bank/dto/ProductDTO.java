package com.citic.bank.dto;

import java.util.Date;

/**
 * @Author: ym
 * @Date: 2019/12/4 10:04
 * @Version 1.0
 */
public class ProductDTO {
    private Long id;

    private String fundCode;

    private String fundType;

    private String fundName;

    private String fundMger;

    private String compyName;

    private String fundStatus;

    private String riskLevel;

    private String fundRating;

    private String fundScale;

    private String issueOrgan;

    private Date gmtCreat;

    private String yn;

    private String remark;

    private Double day;

    private Double month;

    private Double year;

    private Double unit;

    public Double getUnit() {
        return unit;
    }

    public void setUnit(Double unit) {
        this.unit = unit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundMger() {
        return fundMger;
    }

    public void setFundMger(String fundMger) {
        this.fundMger = fundMger;
    }

    public String getCompyName() {
        return compyName;
    }

    public void setCompyName(String compyName) {
        this.compyName = compyName;
    }

    public String getFundStatus() {
        return fundStatus;
    }

    public void setFundStatus(String fundStatus) {
        this.fundStatus = fundStatus;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getFundRating() {
        return fundRating;
    }

    public void setFundRating(String fundRating) {
        this.fundRating = fundRating;
    }

    public String getFundScale() {
        return fundScale;
    }

    public void setFundScale(String fundScale) {
        this.fundScale = fundScale;
    }

    public String getIssueOrgan() {
        return issueOrgan;
    }

    public void setIssueOrgan(String issueOrgan) {
        this.issueOrgan = issueOrgan;
    }

    public Date getGmtCreat() {
        return gmtCreat;
    }

    public void setGmtCreat(Date gmtCreat) {
        this.gmtCreat = gmtCreat;
    }

    public String getYn() {
        return yn;
    }

    public void setYn(String yn) {
        this.yn = yn;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getDay() {
        return day;
    }

    public void setDay(Double day) {
        this.day = day;
    }

    public Double getMonth() {
        return month;
    }

    public void setMonth(Double month) {
        this.month = month;
    }

    public Double getYear() {
        return year;
    }

    public void setYear(Double year) {
        this.year = year;
    }
}
