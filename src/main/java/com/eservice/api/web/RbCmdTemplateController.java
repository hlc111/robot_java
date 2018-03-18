package com.eservice.api.web;

import com.alibaba.fastjson.JSON;
import com.eservice.api.core.Result;
import com.eservice.api.core.ResultGenerator;
import com.eservice.api.model.RbClass;
import com.eservice.api.model.RbClassRecord;
import com.eservice.api.model.RbCmdTemplate;
import com.eservice.api.model.RbStudentClass;
import com.eservice.api.service.RbCmdTemplateService;
import com.eservice.api.service.impl.RbClassRecordServiceImpl;
import com.eservice.api.service.impl.RbClassServiceImpl;
import com.eservice.api.service.impl.RbCmdTemplateServiceImpl;
import com.eservice.api.service.impl.RbStudentClassServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Wilson Hu on 2018/03/16.
 */
@RestController
@RequestMapping("/rb/cmd/template")
public class RbCmdTemplateController {
    @Resource
    private RbCmdTemplateServiceImpl rbCmdTemplateService;
    @Resource
    private RbStudentClassServiceImpl rbStudentClassService;
    @Resource
    private RbClassServiceImpl rbClassService;
    @Resource
    private RbClassRecordServiceImpl rbClassRecordService;

    @PostMapping("/add")
    public Result add(RbCmdTemplate rbCmdTemplate) {
        rbCmdTemplateService.save(rbCmdTemplate);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        rbCmdTemplateService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(RbCmdTemplate rbCmdTemplate) {
        rbCmdTemplateService.update(rbCmdTemplate);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RbCmdTemplate rbCmdTemplate = rbCmdTemplateService.findById(id);
        return ResultGenerator.genSuccessResult(rbCmdTemplate);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page,
                       @RequestParam(defaultValue = "0") Integer size,
                       @RequestParam Integer id) {

        if (id <= 0) {
            return ResultGenerator.genSuccessResult("用户ID错误！");
        } else {
            List<RbCmdTemplate> resultList = new ArrayList<>();
            //Total commands in platform
            List<RbCmdTemplate> cmdTemplateList = rbCmdTemplateService.findAll();
            Condition condition = new Condition(RbStudentClass.class);
            condition.createCriteria().andCondition("student_id = ", id);
            List<RbStudentClass> studentClassList = rbStudentClassService.findByCondition(condition);
            //Total class record IDs
            ArrayList<Integer> haveClassRecordIds = new ArrayList<>();
            for (RbStudentClass item : studentClassList) {
                if (!haveClassRecordIds.contains(item.getClassRecordId())) {
                    haveClassRecordIds.add(item.getClassRecordId());
                }
            }

            //Total command ids that use have
            ArrayList<Integer> haveCommandIds = new ArrayList<>();
            for (int i = 0; i < haveClassRecordIds.size(); i++) {
                RbClassRecord rbClassRecord = rbClassRecordService.findById(haveClassRecordIds.get(i));
                if(rbClassRecord != null) {
                    RbClass rbClass = rbClassService.findById(rbClassRecord.getClassId());
                    if (rbClass != null && rbClass.getCommand() != null) {
                        ArrayList<Integer> tempList = (ArrayList<Integer>) JSON.parseArray(rbClass.getCommand(), Integer.class);
                        for (Integer cmdId : tempList) {
                            if (!haveCommandIds.contains(cmdId)) {
                                haveCommandIds.add(cmdId);
                            }
                        }
                    }
                }
            }

            for (int j = 0; j < haveCommandIds.size(); j++) {
                for (int i = 0; i < cmdTemplateList.size(); i++) {
                    if (cmdTemplateList.get(i).getId().equals(haveCommandIds.get(j))) {
                        resultList.add(cmdTemplateList.get(i));
                        break;
                    }
                }
            }
            PageHelper.startPage(page, size);
            PageInfo pageInfo = new PageInfo(resultList);
            return ResultGenerator.genSuccessResult(pageInfo);
        }
    }
}
