package com.dh.admin.entity;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@Builder
public class Employee {
    private Long id;
    private String name;
    private String gender;
    private Date birthday;
    private String idCard;
    private String wedlock;
    private String nationId;
    private String nativePlace;
    private Integer politicId;
    private String email;
    private String phone;
    private String address;
    private String departmentId;
    private String jobLevelId;
    private String positionId;
    private String engageForm;
    private String degree;
    private String specialty;
    private String school;
    private Date beginDate;
    private String workState;
    private String workId;
    private Date contractTerm;
    private Date conversionTime;
    private Date departDate;
    private Date beginContract;
    private Date endContract;
    private Integer workAge;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Boolean enabled;
}
