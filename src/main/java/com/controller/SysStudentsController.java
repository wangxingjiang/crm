package com.controller;

import com.alibaba.fastjson.JSON;
import com.model.ResultModel;
import com.pojo.SysStudents;
import com.service.ISysStudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SysStudentsController {
    @Autowired
    private ISysStudentsService studentsService;
    @PostMapping("getStu")
    @ResponseBody
    public ResultModel getStuInfo(){
        List<SysStudents>  result =  studentsService.getStudents();
        return ResultModel.succ().data(result);
    }
    @GetMapping("delStu")
    public void delStuInfo(@RequestParam("sid") Integer sid){
         studentsService.deleteStudentsById(sid);
    }
    @GetMapping("insertStu")
    public void insertStuInfo(SysStudents sysStudents){
        studentsService.insertStudent(sysStudents);
    }
    @GetMapping("updateStu")
    public void updateStuInfo(@RequestParam("sid") Integer sid){
        studentsService.updateStudentsById(sid);
    }
}
