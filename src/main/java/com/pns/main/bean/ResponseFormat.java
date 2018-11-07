package com.pns.main.bean;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class ResponseFormat<T> {
    private Integer returnCode;
    private String returnDesc;
    private List<T> items;
    private T data;

    public ResponseFormat(){

    }

    public ResponseFormat(ReturnCode returnCode){
        setReturnCode(returnCode.getValue());
        setReturnDesc(returnCode.getDesc());
    }

    public void setReturnCodeEx(ReturnCode returnCode){
        setReturnCode(returnCode.getValue());
        setReturnDesc(returnCode.getDesc());
    }

}
