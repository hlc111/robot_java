package com.eservice.api.service.impl;

import com.eservice.api.dao.RbCmdTemplateMapper;
import com.eservice.api.model.RbCmdTemplate;
import com.eservice.api.service.RbCmdTemplateService;
import com.eservice.api.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Wilson Hu on 2018/03/16.
 */
@Service
@Transactional
public class RbCmdTemplateServiceImpl extends AbstractService<RbCmdTemplate> implements RbCmdTemplateService {
    @Resource
    private RbCmdTemplateMapper rbCmdTemplateMapper;

}
