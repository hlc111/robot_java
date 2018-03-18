package com.eservice.api.web;
import com.eservice.api.core.Result;
import com.eservice.api.core.ResultGenerator;
import com.eservice.api.model.RbStudentClass;
import com.eservice.api.service.RbStudentClassService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by Wilson Hu on 2018/03/18.
*/
@RestController
@RequestMapping("/rb/student/class")
public class RbStudentClassController {
    @Resource
    private RbStudentClassService rbStudentClassService;

    @PostMapping("/add")
    public Result add(RbStudentClass rbStudentClass) {
        rbStudentClassService.save(rbStudentClass);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        rbStudentClassService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(RbStudentClass rbStudentClass) {
        rbStudentClassService.update(rbStudentClass);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RbStudentClass rbStudentClass = rbStudentClassService.findById(id);
        return ResultGenerator.genSuccessResult(rbStudentClass);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RbStudentClass> list = rbStudentClassService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
