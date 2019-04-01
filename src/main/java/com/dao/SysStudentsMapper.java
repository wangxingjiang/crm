package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.pojo.SysStudents;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysStudentsMapper extends BaseMapper<SysStudents> {
        void updateStudentsById(Integer sid);
        List<SysStudents> getStudents();

}
