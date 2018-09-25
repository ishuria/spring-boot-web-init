package com.pns.main.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BaseInfo implements Serializable {
    private Integer id =-1;
    private Date updateDate;
    private Date createDate;
    private String status;

    public BaseInfo(BaseInfo baseInfo) {
        this.id = baseInfo.id;
        this.updateDate = baseInfo.updateDate;
        this.createDate = baseInfo.createDate;
        this.status = baseInfo.status;
    }

}
