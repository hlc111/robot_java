package com.eservice.api.service.impl;

import com.eservice.api.dao.RbUserMapper;
import com.eservice.api.model.RbUser;
import com.eservice.api.service.RbUserService;
import com.eservice.api.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Wilson Hu on 2018/03/18.
 */
@Service
@Transactional
public class RbUserServiceImpl extends AbstractService<RbUser> implements RbUserService {
    @Resource
    private RbUserMapper rbUserMapper;

}
