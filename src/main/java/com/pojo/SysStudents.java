package com.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("sys_students")
public class SysStudents implements Serializable {
    private Integer sid;//学员id
    private String status;//学员状态
    private String snumber;//学员编号
    private String sname;//学员姓名
    private String sex;//性别
    private String slevel;//学员等级
    private String siphone;//学员电话
    private String sway;//学员来源途径
    private String sprogress;//进度情况
    private String snextdate;//下次跟踪时间
    private String stype;//咨询方式
    private String steacher;//咨询师
    private String update;//更新时间
    private String sestimate;//预计上门时间
}
