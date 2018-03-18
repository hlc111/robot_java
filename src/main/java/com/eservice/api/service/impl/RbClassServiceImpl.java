package com.eservice.api.service.impl;

import com.eservice.api.dao.RbClassMapper;
import com.eservice.api.model.RbClass;
import com.eservice.api.service.RbClassService;
import com.eservice.api.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Wilson Hu on 2018/03/18.
 */
@Service
@Transactional
public class RbClassServiceImpl extends AbstractService<RbClass> implements RbClassService {
    @Resource
    private RbClassMapper rbClassMapper;

}
