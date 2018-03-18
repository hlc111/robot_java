package com.eservice.api.service.impl;

import com.eservice.api.dao.RbClassRecordMapper;
import com.eservice.api.model.RbClassRecord;
import com.eservice.api.service.RbClassRecordService;
import com.eservice.api.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Wilson Hu on 2018/03/18.
 */
@Service
@Transactional
public class RbClassRecordServiceImpl extends AbstractService<RbClassRecord> implements RbClassRecordService {
    @Resource
    private RbClassRecordMapper rbClassRecordMapper;

}
