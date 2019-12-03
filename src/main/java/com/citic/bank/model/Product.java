package com.citic.bank.model;

import java.util.Date;

public class Product {
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
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType == null ? null : fundType.trim();
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName == null ? null : fundName.trim();
    }

    public String getFundMger() {
        return fundMger;
    }

    public void setFundMger(String fundMger) {
        this.fundMger = fundMger == null ? null : fundMger.trim();
    }

    public String getCompyName() {
        return compyName;
    }

    public void setCompyName(String compyName) {
        this.compyName = compyName == null ? null : compyName.trim();
    }

    public String getFundStatus() {
        return fundStatus;
    }

    public void setFundStatus(String fundStatus) {
        this.fundStatus = fundStatus == null ? null : fundStatus.trim();
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel == null ? null : riskLevel.trim();
    }

    public String getFundRating() {
        return fundRating;
    }

    public void setFundRating(String fundRating) {
        this.fundRating = fundRating == null ? null : fundRating.trim();
    }

    public String getFundScale() {
        return fundScale;
    }

    public void setFundScale(String fundScale) {
        this.fundScale = fundScale == null ? null : fundScale.trim();
    }

    public String getIssueOrgan() {
        return issueOrgan;
    }

    public void setIssueOrgan(String issueOrgan) {
        this.issueOrgan = issueOrgan == null ? null : issueOrgan.trim();
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
        this.yn = yn == null ? null : yn.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}