package com.pns.main.controller;

import com.pns.main.bean.CommonConst;
import com.pns.main.bean.ResponseFormat;
import com.pns.main.bean.ReturnCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "")
@Validated
@CrossOrigin(origins = "*", maxAge = 3600)
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @RequestMapping(value = "/index", produces = {CommonConst.PRODUCE}, method = RequestMethod.GET)
    public String index() {
        ResponseFormat responseFormat = new ResponseFormat(ReturnCode.USER_SUCCESS);
        logger.info("start IndexController::index");
        logger.info("end IndexController::index");
        return "index";
    }
}
