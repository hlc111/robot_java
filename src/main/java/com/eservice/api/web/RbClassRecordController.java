package com.eservice.api.web;
import com.eservice.api.core.Result;
import com.eservice.api.core.ResultGenerator;
import com.eservice.api.model.RbClassRecord;
import com.eservice.api.service.RbClassRecordService;
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
@RequestMapping("/rb/class/record")
public class RbClassRecordController {
    @Resource
    private RbClassRecordService rbClassRecordService;

    @PostMapping("/add")
    public Result add(RbClassRecord rbClassRecord) {
        rbClassRecordService.save(rbClassRecord);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        rbClassRecordService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(RbClassRecord rbClassRecord) {
        rbClassRecordService.update(rbClassRecord);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RbClassRecord rbClassRecord = rbClassRecordService.findById(id);
        return ResultGenerator.genSuccessResult(rbClassRecord);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RbClassRecord> list = rbClassRecordService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
