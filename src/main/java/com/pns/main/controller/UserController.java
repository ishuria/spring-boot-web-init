package com.pns.main.controller;

import com.pns.main.bean.CommonConst;
import com.pns.main.bean.ResponseFormat;
import com.pns.main.bean.ReturnCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user")
@Validated
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @RequestMapping(value = "/signUp", produces = {CommonConst.PRODUCE}, method = RequestMethod.GET)
    public String signUp() {
        ResponseFormat responseFormat = new ResponseFormat(ReturnCode.USER_SUCCESS);
        logger.info("start UserController::signUp");
        logger.info("end UserController::signUp");
        return "user/signUp";
    }

    @RequestMapping(value = "/signIn", produces = {CommonConst.PRODUCE}, method = RequestMethod.GET)
    public String signIn() {
        ResponseFormat responseFormat = new ResponseFormat(ReturnCode.USER_SUCCESS);
        logger.info("start UserController::signIn");
        logger.info("end UserController::signIn");
        return "user/signIn";
    }

    @RequestMapping(value = "/signOut", produces = {CommonConst.PRODUCE}, method = RequestMethod.GET)
    public String signOut() {
        ResponseFormat responseFormat = new ResponseFormat(ReturnCode.USER_SUCCESS);
        logger.info("start UserController::signOut");
        logger.info("end UserController::signOut");
        return "user/signOut";
    }


    @RequestMapping(value = "/postSignIn", produces = {CommonConst.PRODUCE}, method = RequestMethod.POST)
    public String postSignIn() {
        ResponseFormat responseFormat = new ResponseFormat(ReturnCode.USER_SUCCESS);
        logger.info("start UserController::postSignIn");
        logger.info("end UserController::postSignIn");
        return "user/signIn";
    }
}
