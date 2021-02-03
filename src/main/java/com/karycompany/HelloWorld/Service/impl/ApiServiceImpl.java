package com.karycompany.HelloWorld.Service.impl;

import com.karycompany.HelloWorld.Service.ApiService;
import com.karycompany.HelloWorld.request.NameRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ApiServiceImpl implements ApiService {
    static final Logger logger = LogManager.getLogger(ApiServiceImpl.class.getName());

    public NameRequest printName(NameRequest name){
        logger.info(name.getName());
        logger.error("*****ERROR*****");
        return name;
    }

}
