package com.eservice.api.service.impl;

import com.eservice.api.dao.RbStudentClassMapper;
import com.eservice.api.model.RbStudentClass;
import com.eservice.api.service.RbStudentClassService;
import com.eservice.api.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Wilson Hu on 2018/03/18.
 */
@Service
@Transactional
public class RbStudentClassServiceImpl extends AbstractService<RbStudentClass> implements RbStudentClassService {
    @Resource
    private RbStudentClassMapper rbStudentClassMapper;

}
