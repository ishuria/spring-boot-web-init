package com.pns.main.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserInfo extends BaseInfo{
    private String mobile;
    private String passHash;
    private String chara;
    private String nickname;

}
