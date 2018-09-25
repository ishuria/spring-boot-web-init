package com.pns.main.bean;

public class CommonConst {

    public static final String SHOW_TYPE_REGEX = "query|released";
    public static long IDLE_CONNECTION_TIME = 60000;
    public static final String PRODUCE = "application/json;charset=UTF-8";
    public static final String TEL_REGEX = "[1]\\d{10}";
    public static final String IP_REGEX = "\\d+\\.\\d+\\.\\d+\\.\\d+";
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$";
    public static final String STATUS_ONPROCESS = "OnProcess";

    //--restTemplate用---//
    public static final int REST_TEMPLATE_CONNECT_TIMEOUT = 20000;
    public static final int REST_TEMPLATE_READ_TIMEOUT = 20000;
    public static final int REST_TEMPLATE_WRITE_TIMEOUT = 20000;

    //----FeignClient用----//
    public static final String HYSTRIX_FALLBACK_DESC = "熔断打回";
    public static final String FEIGN_RESPONSE_NULL_DESC = "FeignClient响应为空";
    public static final String FEIGN_RETURNCODE_NULL_DESC = "FeignClient状态码为空";
    public static final String FEIGN_RESPONSE_FAIL = "FeignClient调用失败";


    //----MQ用----//
    public static final String TOPIC_QOGIR_LOG = "topicQogirLog";
    public static final String TOPIC_QOGIR_EMAIL= "topicQogirEmail";
    public static final String TOPIC_QOGIR_SMS= "topicQogirSMS";
    public static final String KEY_QOGIR_EMAIL= "keyQogirEmail";
    public static final String KEY_QOGIR_OPERLOG= "keyQogirlog";

    //----mongoDB-----//
    public static final String COLLECTION_QOGIR_OPERLOG= "QogirOperlog";



    //----User用----//
    public static String businessLicenseNum = "businessLicenseNum";
    public static final String GROUP_STATUS_ACTIVE = "active";
    public static final String GROUP_STATUS_INACTIVE = "inactive";
    public static final String GROUP_STATUS_INVISIBLE = "invisible";
    public static final String[] GROUP_ALL_STATUS = {GROUP_STATUS_ACTIVE, GROUP_STATUS_INACTIVE, GROUP_STATUS_INVISIBLE};
    public static final String USER_STATUS_ACTIVE = "active";
    public static final String USER_STATUS_INACTIVE = "inactive";

    public static final String SMS_DESC_LOGIN = "登录";
    public static final String SMS_DESC_REGISTER = "注册";
    public static final int SMS_TMP_LOGIN = 109341;

    public static final String SMS_QUEUE = "smsQueue";


    public static final String INVISIBLE_GROUP_NAME = "隐藏组";

    public static final String DMS_SOURCE_SYSTEM = "DMS";
    public static final String BMS_SOURCE_SYSTEM = "BMS";

    public static final String TMS_SOURCE_SYSTEM = "TMS";
    public static final String SP_SOURCE_SYSTEM = "SP";

    public static final String USER_NO_FIRST_LOGIN = "0";


}
