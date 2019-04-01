package com.serviceImpl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.SysStudentsMapper;
import com.pojo.SysStudents;
import com.service.ISysStudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class SysStudentsServiceImpl  extends ServiceImpl<SysStudentsMapper, SysStudents> implements ISysStudentsService {
    @Autowired
    private SysStudentsMapper sysStudentsMapper;
    @Override
    public Boolean insertStudent(SysStudents sysStudents) {
        return super.baseMapper.insert(sysStudents)>0;
    }

    @Override
    public void deleteStudentsById(Integer sid) {
         super.baseMapper.deleteById(sid);
    }

    @Override
    public List<SysStudents> getStudents() {
        return sysStudentsMapper.getStudents();
    }

    @Override
    public String updateStudentsById(Integer sid) {
        sysStudentsMapper.updateStudentsById(sid);
        return "修改成功";
    }
}
