package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.pojo.SysStudents;

import java.util.List;

public interface ISysStudentsService extends IService<SysStudents> {
    //向数据库插入学员信息
    Boolean insertStudent(SysStudents sysStudents);

    //删除学员信息
    void deleteStudentsById(Integer sid);

    //获取数据库中的学员信息
    List<SysStudents> getStudents();

    //修改学员信息
    String updateStudentsById(Integer sid);
}
