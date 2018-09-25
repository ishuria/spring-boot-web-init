package com.pns.main.bean;

/**
 * Created by zhengjiao on 18-3-21.
 * ReturnCode规则如下：
 * 规则一：1000的倍数代表成功
 * 规则二：最高的两位数代表模块划分
 * 规则三：每一类的错误码只能在该模块取值范围内新增
 */
public enum ReturnCode {
    //通用错误码取值范围COMMON_CREATE_SUCCESS(101000)~COMMON_MAX_RETURN_CODE(109999)
    COMMON_CREATE_SUCCESS(101000),
    COMMON_READ_SUCCESS(102000),
    COMMON_UPDATE_SUCCESS(103000),
    COMMON_UPLOAD_SUCCESS(104000),

    COMMON_HYSTRIX_FALLBACK(101001),
    COMMON_CREATE_DUPLICATE(101002),
    COMMON_CREATE_FAILED(101003),
    COMMON_READ_FAILED(101004),
    COMMON_READ_NOMATCH(101005),
    COMMON_READ_FAILED_REGISTER_CODE_USED(101006),
    COMMON_READ_FAILED_REGISTER_CODE_INVALID(101007),
    COMMON_UPDATE_NOMATCH(101008),
    COMMON_UPDATE_FAILED(101009),
    COMMON_UPLOAD_FAILED(101010),
    COMMON_PARAMETER_ERROR(101011),
    COMMON_INVALID_ACCESS(101012),
    COMMON_MISSING_PUBKEY_OR_PUBKEYSIGN(101013),
    COMMON_FAILED_VERIFY_PUBKEY(101014),
    COMMON_MAX_RETURN_CODE(109999),

    //config模块错误码取值范围CONFIG_SUCCESS(201000)~COMMON_MAX_RETURN_CODE(209999)
    CONFIG_SUCCESS(201000),
    CONFIG_MAX_RETURN_CODE(209999),

    //contract模块错误码取值范围CONTRACT_SUCCESS(301000)~CONTRACT_MAX_RETURN_CODE(309999)
    CONTRACT_SUCCESS(301000),
    CONTRACT_UPDATE_SUCCESS(303000),
    CONTRACT_UPDATE_FAILED(303001),
    CONTRACT_READ_FAILED(301002),
    CONTRACT_COMPANY_ID_FAIL(303010),
    CONTRACT_FILE_EXCEED_LIMIT(303011),
    CONTRACT_FILE_SUFFIX_INVALID(303012),
    CONTRACT_UUID_FAIL(303013),
    CONTRACT_VERSION_ID_FAIL(303014),
    CONTRACT_ID_FAIL(303015),
    CONTRACT_NAME_FAIL(303016),
    CONTRACT_START_DATE_FAIL(303017),
    CONTRACT_END_DATE_FAIL(303018),
    CONTRACT_DATE_VALUE_FAIL(303019),
    CONTRACT_COMPANY_ID_CHECK_FAIL(303020),
    CONTRACT_COMPANY_FROM_NULL(303021),
    CONTRACT_COMPANY_TO_NULL(303022),
    CONTRACT_COMMIT_COMPANY_ERROR(303023),
    CONTRACT_FILE_ID_NULL(303024),
    CONTRACT_STATUS_NOT_MATCHED(303025),
    CONTRACT_CONTRACT_FILE_ID_NULL(303026),
    CONTRACT_CONTRACT_FILE_ID_ERROR(303027),
    CONTRACT_UPDATE_STATUC_ERROR(303028),
    CONTRACT_COMMIT_FAILED(303029),
    CONTRACT_UPLOAD_FAILED(303030),
    CONTRACT_UPDATE_VALID_FAILED(303031),
    CONTRACT_STOP_FAILED(303032),
    CONTRACT_COMFIRM_STOP_FAILED(303033),
    CONTRACT_DELETE_FAILED(303034),
    CONTRACT_MISS_FILE_HASH(303025),
    CONTRACT_COMPANY_SAME_PARTY(303026),
    CONTRACT_MAX_RETURN_CODE(309999),

    //cou模块错误码取值范围COU_SUCCESS(401000)~COU_MAX_RETURN_CODE(409999)
    COU_SUCCESS(401000),
    COU_MAX_RETURN_CODE(409999),

    //eureka模块错误码取值范围EUREKA_SUCCESS(501000)~EUREKA_MAX_RETURN_CODE(509999)
    EUREKA_SUCCESS(501000),
    EUREKA_MAX_RETURN_CODE(509999),

    //gateway模块错误码取值范围GATEWAY_SUCCESS(601000)~GATEWAY_MAX_RETURN_CODE(609999)
    GATEWAY_SUCCESS(601000),
    GATEWAY_LOGIN_FAIL(601001),
    GATEWAY_SESSION_EXPIRED(601002),
    GATEWAY_SP_TOKEN_VERIFY_FAIL(601003),
    GATEWAY_API_TOKEN_VERIFY_FAIL(601004),
    GATEWAY_MAX_RETURN_CODE(609999),

    //iv模块错误码取值范围IV_SUCCESS(701000)~IV_MAX_RETURN_CODE(709999)
    IV_SUCCESS(701000),
    IV_MAX_RETURN_CODE(709999),

    //log模块错误码取值范围LOG_SUCCESS(801000)~LOG_MAX_RETURN_CODE(809999)
    LOG_SUCCESS(801000),
    LOG_MAX_RETURN_CODE(809999),

    //message模块错误码取值范围MESSAGE_SUCCESS(901000)~MESSAGE_MAX_RETURN_CODE(909999)
    MESSAGE_SUCCESS(901000),
    MESSAGE_EXCEPTION(901001),

    MESSAGE_LOGIN_CODE_NULL(904000),
    MESSAGE_LOGIN_CODE_ERROR(904001),
    MESSAGE_USER_NOT_EXIST(904002),
    MESSAGE_SEND_LOGIN_CODE_FAILED(904003),
    MESSAGE_MAX_RETURN_CODE(909999),

    //middle模块错误码取值范围MIDDLE_SUCCESS(111000)~MIDDLE_MAX_RETURN_CODE(309999)
    MIDDLE_SUCCESS(111000),
    MIDDLE_MAX_RETURN_CODE(309999),

    //tm模块错误码取值范围TM_SUCCESS(121000)~TM_MAX_RETURN_CODE(129999)
    TM_SUCCESS(121000),
    TM_MAX_RETURN_CODE(129999),

    //user模块错误码取值范围
    USER_SUCCESS(131000),
    USER_EXCEPTION(131001),
    USER_UPDATE_SUCCESS(133000),
    USER_UPDATE_FAILED(133001),
    USER_REGISTER_COMPANY_PARAMETER_ERROR(133002),
    USER_COMPANY_PHONE_NUM_NULL(133003),
    USER_COMPANY_BUSINESS_LICENSE_NULL(133004),
    USER_COMPANY_INSTITUTION_CODE_NULL(133005),
    USER_COMPANY_IDENTIFICATION_NUM_NULL(133006),
    USER_COMPANY_SOCIAL_CREDIT_CODE_NULL(133007),
    USER_COMPANY_NAME_NULL(133008),
    USER_COMPANY_DUPLICATE(133009),
    USER_COMPANY_NOT_EXIST(133010),
    USER_COMPANY_TYPE_NULL(133011),

    USER_COMPANY_FILE_EXCEED_LIMIT(133021),
    USER_COMPANY_FILE_SUFFIX_INVALID(133022),
    USER_COMPANY_FILE_UPLOAD_FAIL(133023),
    USER_PHONE_NUM_NULL(133034),
    USER_EMAIL_ADDRESS_NULL(133035),
    USER_PHONE_NUM_NOT_MATCH(133036),
    USER_DUPLICATE(133037),
    USER_NOT_EXIST(133038),
    USER_GROUP_NAME_MISSING(133058),
    USER_GROUP_NAME_TOO_LONG(133059),
    USER_GROUP_INCORRECT_PUBKEYSIGN(133060),
    USER_GROUP_MISSING_ROLE(133061),
    USER_GROUP_MISSING_MANAGED_COMPANIES(133062),
    USER_GROUP_MISSING_COMPANY(133063),
    USER_GROUP_COMPANY_UUID_NOT_EXIST(133064),
    USER_GROUP_DUPLICATE_GROUP_CONTENT(133065),
    USER_GROUP_DUPLICATE_PUB_KEY(133066),
    USER_GROUP_MISSING_GROUP_UUID(133067),
    USER_GROUP_INVALID_STATUS(133068),
    USER_GROUP_DUPLICATE_GROUP_NAME(133069),
    USER_STATUS_MISSING_FOR_UPDATE(133070),
    USER_UUID_MISSING_FOR_UPDATE(133071),
    USER_UUID_INVALID_FOR_UPDATE(133072),
    USER_PHONE_NUM_DUPLICATE(133074),
    USER_MAIL_ADDRESS_DUPLICATE(133075),
    USER_NAME_DUPLICATE_IN_SAME_COMPANY(133076),
    USER_CREATE_FAILED(133079),
    USER_INVALID_AGREEMENT_SIGN(133080),
    USER_COMPANY_UUID_NOT_MATCH(133081),

    USER_REQ_ROLE_INFO_ERROR(133301),

    //order模块错误码取值范围
    ORDER_SUCCESS(141000),
    ORDER_EXCEPTION(141001),
    ORDER_ORDER_UUID_ERROR(141002),
    ORDER_SIGN_DATE_NULL(141003),
    ORDER_CONFIRM_DATE_NULL(141004),
    ORDER_RETURN_DATE_NULL(141005),
    ORDER_WITHDRAW_DATE_NULL(141006),
    ORDER_ENC_NULL(141007),
    ORDER_PUBKEY_ENCRYPTOR_NULL(141008),
    ORDER_PUBKEY_DECODER_NULL(141009),
    ORDER_STATUS_ERROR(141010),
    ORDER_LSIT_NULL(141011),
    ORDER_COMPANY_CODE_NULL(141012),
    ORDER_LIST_NUM_ERROR(141013),
    ORDER_DAMAGE_STATUS_ERROR(141014),
    ORDER_UPDATE_ORDER_RECORD_NOT_FUND(141015),
    ORDER_MISSING_VIN_CODE(141016),
    ORDER_MISSING_ORDER_NUMBER(141017),
    ORDER_TRANSFER_ORDER_FAIL(141018),
    ORDER_FILE_HASH_NULL(141019),
    ORDER_CONFIRM_FAILED(141020),
    ORDER_RETURN_FAILED(141021),
    ORDER_CONFIRM_RETURN_FAILED(141022),
    ORDER_INVALID_FAILED(141023),
    ORDER_WITHDRAW_FAILED(141024),
    ORDER_DAMAGE_FAILED(141025),
    ORDER_RECREATE_FAILED(141026),
    ORDER_VEHICLE_SIGNED(141027),
    ORDER_WITHDRAW_CONFIRM_FAILED(141028),

    SHIPMENT_FILE_HASH_NULL(141504),

    SHIPMENT_RETURN_DATE_NULL(141505),
    SHIPMENT_WITHDRAW_DATE_NULL(141506),

    SHIPMENT_ENC_NULL(141507),
    SHIPMENT_PUBKEY_ENCRYPTOR_NULL(141508),
    SHIPMENT_PUBKEY_DECODER_NULL(141509),

    SHIPMENT_STATUS_ERROR(141510),
    SHIPMENT_CLIENT_REQ_STATUS_ERROR(141510),
    SHIPMENT_CONFIRM_DATE_NULL(141511),

    BILL_PUBKEY_DECODER_NULL(141512),
    BILL_CALCULATE_ABNORMAL_BILL(141513),
    BILL_CALCULATE_ALREADY_IN_CALCULATION(141514),

    SHIPMENT_CONFIRM_FAILED(141515),
    SHIPMENT_RETURN_FAILED(141516),
    SHIPMENT_RETURN_CONFIRM_FAILED(141517),
    SHIPMENT_WITHDRAW_FAILED(141518),
    SHIPMENT_WITHDRAW_CONFIRM_FAILED(141519),

    BILL_CREATE_FAILED(141520),
    BILL_CREATE_DUPLICATE_BILL_FAILED(141521),
    BILL_NOT_EXIST_FAILED(141522),

    SHIPMENT_RECREATE_FAILED(141523),
    SHIPMENT_PRESETTLE_CHECKING_SHIPMENT(141524),
    SHIPMENT_PRESETTLE_LOCKED_VEHICLE(141525),
    SHIPMENT_PRESETTLE_SETTLING_OR_SETTLED_SHIPMENT(141526),

    SHIPMENT_WITHDRAW_NOT_PERMIT(141527),
    SHIPMENT_VEHICLE_LOCKED_NULL(141528),
    SHIPMENT_UUID_NULL(141529),
    SHIPMENT_VINCODE_NULL(141530),

    //外部接口错误码取值范围
    API_SUCCESS(151000),
    API_UPDATE_FAIL(151001),
    API_MISSING_SOURCE_SYSTEM(151002),
    API_MISSING_PUB_KEY(151003),
    API_INVALID_PUB_KEY_SIGN(151004),
    API_MULTIPLE_SAVE(151005),
    API_MISSING_COMPANY_TYPE(151006),
    API_INVALID_COMPANY_TYPE(151007),
    API_DUPLICATE_PUB_KEY(151008),
    API_FIND_PUB_KEY_ERROR(151009),
    API_INVALID_COMPANY_CODE(151010),
    API_READ_FAIL(151011),
    API_INVALID_DATA_SIGN(151012),
    API_INVALID_JSON_FORMAT(151013),
    API_INVALID_ORDER_NUMBER(151014),
    API_TMS_PUB_KEY_NOT_EXIST(151015),
    API_MISSING_VIN_CODE(151016),
    API_MISSING_ORDER_NUMBER(151017),
    API_MISSING_SHIPMENT_NUMBER(151018),
    API_DMS_PUB_KEY_NOT_EXIST(151019),
    API_INVALID_BILL_ITEM_IDENTIFIER(151020),
    API_RECEIVE_VEHICLE_EXCEPTION(151021),
    API_MANDATORY_FEILD_ERROR(151022),
    API_INVALID_SETUP_FOR_MANAGED_GROUP(151023),

    //对账单接口错误码取值范围
    BILL_SUCCESS(161000),

    USER_MAX_RETURN_CODE(139999);

    private int value;

    private ReturnCode(int value) {
        this.value = value;
    }

    public String getDesc() {
        switch (this) {
            //--------通用错误码描述--------//
            case COMMON_CREATE_SUCCESS:
                return "Create/Insert Success";
            case COMMON_CREATE_DUPLICATE:
                return "Create/Insert Duplicated";
            case COMMON_CREATE_FAILED:
                return "Create/Insert Failed";
            case COMMON_READ_SUCCESS:
                return "Read/Search Success";
            case COMMON_READ_NOMATCH:
                return "Read/Search No Matched";
            case COMMON_READ_FAILED:
                return "Read/Search Failed";
            case COMMON_UPDATE_SUCCESS:
                return "Update Success";
            case COMMON_UPDATE_NOMATCH:
                return "Update No Matched";
            case COMMON_UPDATE_FAILED:
                return "Update Failed";
            case COMMON_UPLOAD_SUCCESS:
                return "Upload Success";
            case COMMON_UPLOAD_FAILED:
                return "Upload Failed";
            case COMMON_HYSTRIX_FALLBACK:
                return "接口熔断打回";
            case COMMON_PARAMETER_ERROR:
                return "Parameter Error";
            case COMMON_INVALID_ACCESS:
                return "Invalid Access";
            case COMMON_MISSING_PUBKEY_OR_PUBKEYSIGN:
                return "缺少公钥或签名";
            case COMMON_FAILED_VERIFY_PUBKEY:
                return "签名验证失败";

            //--------user模块错误码描述--------//
            case USER_EXCEPTION:
                return "User Module Exception";
            case USER_COMPANY_NAME_NULL:
                return "企业名称不能为空";
            case USER_COMPANY_PHONE_NUM_NULL:
                return "企业手机号码不能为空";
            case USER_COMPANY_BUSINESS_LICENSE_NULL:
                return "营业执照注册号不能为空";
            case USER_COMPANY_INSTITUTION_CODE_NULL:
                return "机构代码不能为空";
            case USER_COMPANY_IDENTIFICATION_NUM_NULL:
                return "纳税人识别号不能为空";
            case USER_COMPANY_SOCIAL_CREDIT_CODE_NULL:
                return "统一社会信用代码不能为空";
            case USER_COMPANY_DUPLICATE:
                return "企业已存在";
            case USER_COMPANY_NOT_EXIST:
                return "企业不存在";
            case USER_COMPANY_FILE_EXCEED_LIMIT:
                return "企业文件大小超出限制";
            case USER_COMPANY_FILE_SUFFIX_INVALID:
                return "企业文件后缀名无效";
            case USER_COMPANY_FILE_UPLOAD_FAIL:
                return "企业文件上传失败";
            case USER_COMPANY_TYPE_NULL:
                return "企业类型不能为空";
            case USER_PHONE_NUM_NULL:
                return "用户手机号码不能为空";
            case USER_EMAIL_ADDRESS_NULL:
                return "用户邮箱不能为空";
            case USER_PHONE_NUM_NOT_MATCH:
                return "用户手机号码不匹配";
            case USER_DUPLICATE:
                return "用户已存在";
            case USER_NOT_EXIST:
                return "用户不存在";
            case USER_GROUP_NAME_MISSING:
                return "业务组名不能为空";
            case USER_GROUP_NAME_TOO_LONG:
                return "业务组名太长";
            case USER_GROUP_INCORRECT_PUBKEYSIGN:
                return "业务组签名错误";
            case USER_GROUP_MISSING_ROLE:
                return "业务组角色不能为空";
            case USER_GROUP_MISSING_MANAGED_COMPANIES:
                return "业务组管理公司不能为空";
            case USER_GROUP_MISSING_COMPANY:
                return "业务组所属公司不能为空";
            case USER_GROUP_COMPANY_UUID_NOT_EXIST:
                return "所属公司或管理公司UUID不存在";
            case USER_GROUP_DUPLICATE_GROUP_CONTENT:
                return "业务组管理公司重复";
            case USER_GROUP_DUPLICATE_PUB_KEY:
                return "公钥重复";
            case USER_GROUP_MISSING_GROUP_UUID:
                return "更新业务组UUID不能为空";
            case USER_GROUP_INVALID_STATUS:
                return "错误的业务组状态";
            case USER_GROUP_DUPLICATE_GROUP_NAME:
                return "业务组名重复";
            case USER_STATUS_MISSING_FOR_UPDATE:
                return "用户状态不能为空";
            case USER_UUID_MISSING_FOR_UPDATE:
                return "用户UUID不能为空";
            case USER_UUID_INVALID_FOR_UPDATE:
                return "用户UUID无效";
            case USER_PHONE_NUM_DUPLICATE:
                return "手机号不能重复";
            case USER_MAIL_ADDRESS_DUPLICATE:
                return "邮箱地址不能重复";
            case USER_NAME_DUPLICATE_IN_SAME_COMPANY:
                return "同一公司内用户名不能重复";
            case USER_REQ_ROLE_INFO_ERROR:
                return "用户角色和公司类型都不能为空";
            case USER_UPDATE_FAILED:
                return "修改失败，请重试";
            case USER_CREATE_FAILED:
                return "新建失败，请重试";
            case USER_INVALID_AGREEMENT_SIGN:
                return "无效的规则签名";
            case USER_COMPANY_UUID_NOT_MATCH:
                return "企业UUID不匹配";

            //--------contract模块错误码描述--------//
            case CONTRACT_COMPANY_ID_FAIL:
                return "合同公司ID不能为空";
            case CONTRACT_COMPANY_ID_CHECK_FAIL:
                return "合同公司ID校验失败";
            case CONTRACT_COMPANY_FROM_NULL:
                return "合同甲方公司信息不存在";
            case CONTRACT_COMPANY_TO_NULL:
                return "合同乙方公司信息不存在";
            case CONTRACT_COMMIT_COMPANY_ERROR:
                return "提交合同的甲方或者乙方信息不正确";
            case CONTRACT_FILE_ID_NULL:
                return "合同文件不存在";
            case CONTRACT_STATUS_NOT_MATCHED:
                return "合同状态不匹配";
            case CONTRACT_CONTRACT_FILE_ID_NULL:
                return "合同文件ID为空";
            case CONTRACT_CONTRACT_FILE_ID_ERROR:
                return "合同文件ID错误";
            case CONTRACT_UPDATE_STATUC_ERROR:
                return "处理的合同的状态不正确";
            case CONTRACT_COMMIT_FAILED:
                return "发布失败，请重试";
            case CONTRACT_UPLOAD_FAILED:
                return "上传失败，请重试";
            case CONTRACT_UPDATE_VALID_FAILED:
                return "更新失败，请重试";
            case CONTRACT_STOP_FAILED:
                return "中止失败，请重试";
            case CONTRACT_COMFIRM_STOP_FAILED:
                return "中止失败，请重试";
            case CONTRACT_DELETE_FAILED:
                return "删除失败，请重试";
            case CONTRACT_MISS_FILE_HASH:
                return "缺失合同上链信息";
            case CONTRACT_COMPANY_SAME_PARTY:
                return "合同甲方和乙方不能相同";
            case CONTRACT_FILE_EXCEED_LIMIT:
                return "合同文件大小超过限制";
            case CONTRACT_FILE_SUFFIX_INVALID:
                return "合同文件后缀名无效";
            case CONTRACT_UUID_FAIL:
                return "合同UUID不能为空";
            case CONTRACT_VERSION_ID_FAIL:
                return "合同版本ID不能为空";

            case CONTRACT_ID_FAIL:
                return "合同编号不能为空";
            case CONTRACT_NAME_FAIL:
                return "合同名称不能为空";
            case CONTRACT_START_DATE_FAIL:
                return "合同开始时间不能为空";
            case CONTRACT_END_DATE_FAIL:
                return "合同结束时间不能为空";
            case CONTRACT_DATE_VALUE_FAIL:
                return "合同开始时间不能晚于合同结束时间";
            case CONTRACT_READ_FAILED:
                return "合同读取失败";

            case API_SUCCESS:
                return "业务受理成功";
            case API_UPDATE_FAIL:
                return "插入或更新数据失败";
            case API_MISSING_SOURCE_SYSTEM:
                return "来源系统不能为空";
            case API_MISSING_PUB_KEY:
                return "公钥和公钥签名不能为空";
            case API_INVALID_PUB_KEY_SIGN:
                return "验签失败";
            case API_MULTIPLE_SAVE:
                return "不能多次导入公钥";
            case API_MISSING_COMPANY_TYPE:
                return "企业类型不能为空";
            case API_INVALID_COMPANY_TYPE:
                return "企业类型不合法";
            case API_DUPLICATE_PUB_KEY:
                return "公钥不能重复";
            case API_FIND_PUB_KEY_ERROR:
                return "查找系统ApiKey失败";
            case API_INVALID_COMPANY_CODE:
                return "无效的企业代码";
            case API_READ_FAIL:
                return "读取失败";
            case API_INVALID_DATA_SIGN:
                return "数据签名无效";
            case API_INVALID_JSON_FORMAT:
                return "JSON格式错误";
            case API_INVALID_ORDER_NUMBER:
                return "订单号码不存在";
            case API_TMS_PUB_KEY_NOT_EXIST:
                return "TMS公钥尚未导入";
            case API_MISSING_VIN_CODE:
                return "VIN码不能为空";
            case API_MISSING_ORDER_NUMBER:
                return "订单号不能为空";
            case API_MISSING_SHIPMENT_NUMBER:
                return "运单号不能为空";
            case API_DMS_PUB_KEY_NOT_EXIST:
                return "DMS公钥尚未导入";
            case API_INVALID_BILL_ITEM_IDENTIFIER:
                return "对账单号、VIN码或对手方公钥不正确";
            case API_RECEIVE_VEHICLE_EXCEPTION:
                return "签收车辆存在不正确的订单号和车辆VINCODE";
            case API_MANDATORY_FEILD_ERROR:
                return "必填字段错误";
            case API_INVALID_SETUP_FOR_MANAGED_GROUP:
                return "业务组设置不正确";
            //--------iv模块错误码描述--------//

            //--------cou模块错误码描述--------//

            //--------message模块错误码描述-------//
            case MESSAGE_LOGIN_CODE_NULL:
                return "验证码过期";
            case MESSAGE_LOGIN_CODE_ERROR:
                return "登录验证码错误";
            case MESSAGE_USER_NOT_EXIST:
                return "用户信息不存在";
            case MESSAGE_SEND_LOGIN_CODE_FAILED:
                return "发送登录验证码失败";
            //--------middle模块错误码描述--------//
            //--------GATEWAY模块错误码描述--------//
            case GATEWAY_SP_TOKEN_VERIFY_FAIL:
                return "SP token 验证失败";
            case GATEWAY_API_TOKEN_VERIFY_FAIL:
                return "API token 验证失败";
            case GATEWAY_SESSION_EXPIRED:
                return "长时间没有操作，登录退出保护";

            //--------order模块错误码描述--------//
            case ORDER_ORDER_UUID_ERROR:
                return "订单信息不正确";

            case ORDER_SIGN_DATE_NULL:
                return "订单签收时间不能为空";
            case ORDER_CONFIRM_DATE_NULL:
                return "订单确认时间不能为空";
            case ORDER_RETURN_DATE_NULL:
                return "订单退回时间不能为空";
            case ORDER_WITHDRAW_DATE_NULL:
                return "订单撤销时间不能为空";

            case ORDER_ENC_NULL:
                return "订单加密数据不能为空";
            case ORDER_PUBKEY_ENCRYPTOR_NULL:
                return "订单加密者的公钥不能为空";
            case ORDER_PUBKEY_DECODER_NULL:
                return "订单解密者的公钥不能为空";
            case ORDER_STATUS_ERROR:
                return "订单状态不符合执行当前操作";
            case ORDER_LSIT_NULL:
                return "请求处理的订单不能为空";
            case ORDER_COMPANY_CODE_NULL:
                return "请求的企业代码不能为空";
            case ORDER_LIST_NUM_ERROR:
                return "请求的订单列表和数据库数目不一致";
            case ORDER_DAMAGE_STATUS_ERROR:
                return "请求的质损状态错误";
            case ORDER_UPDATE_ORDER_RECORD_NOT_FUND:
                return "待处理的订单记录未查找到";
            case ORDER_MISSING_VIN_CODE:
                return "车辆VINCODE不能为空";
            case ORDER_MISSING_ORDER_NUMBER:
                return "订单编号不能为空";
            case ORDER_TRANSFER_ORDER_FAIL:
                return "转发订单失败";
            case ORDER_FILE_HASH_NULL:
                return "订单上链数据不能为空";
            case ORDER_CONFIRM_FAILED:
                return "确认订单失败，请重试";
            case ORDER_RETURN_FAILED:
                return "退回订单失败，请重试";
            case ORDER_RECREATE_FAILED:
                return "订单重新提交失败，请重试";
            case ORDER_CONFIRM_RETURN_FAILED:
                return "确认退回失败，请重试";
            case ORDER_INVALID_FAILED:
                return "失效订单失败，请重试";
            case ORDER_WITHDRAW_FAILED:
                return "撤销订单失败，请重试";
            case ORDER_WITHDRAW_CONFIRM_FAILED:
                return "确认撤销订单失败，请重试";
            case ORDER_DAMAGE_FAILED:
                return "质损确认失败，请重试";
            case ORDER_VEHICLE_SIGNED:
                return "车辆已签收,禁止逆流程";
            case SHIPMENT_STATUS_ERROR:
                return "运单状态不符合执行当前操作";
            case SHIPMENT_CLIENT_REQ_STATUS_ERROR:
                return "请求的状态不正确";
            case SHIPMENT_CONFIRM_DATE_NULL:
                return "运单确认日期不能为空";
            case SHIPMENT_CONFIRM_FAILED:
                return "运单确认失败，请重试";
            case SHIPMENT_RETURN_FAILED:
                return "退回运单失败，请重试";
            case SHIPMENT_RETURN_CONFIRM_FAILED:
                return "确认退回失败，请重试";
            case SHIPMENT_RECREATE_FAILED:
                return "运单重新提交失败，请重试";
            case SHIPMENT_WITHDRAW_CONFIRM_FAILED:
                return "撤销失败，请重试";
            case BILL_CREATE_FAILED:
                return "对账单生成失败，请重试";
            case BILL_CREATE_DUPLICATE_BILL_FAILED:
                return "操作失败，重复的对账单号";
            case BILL_NOT_EXIST_FAILED:
                return "修改的对账单不存在";
            case SHIPMENT_FILE_HASH_NULL:
                return "运单上链数据不能为空";
            case SHIPMENT_RETURN_DATE_NULL:
                return "运单退回时间不能为空";
            case SHIPMENT_WITHDRAW_DATE_NULL:
                return "运单撤销时间不能为空";
            case SHIPMENT_ENC_NULL:
                return "运单加密数据不能为空";
            case SHIPMENT_PUBKEY_ENCRYPTOR_NULL:
                return "运单加密者的公钥不能为空";
            case SHIPMENT_PUBKEY_DECODER_NULL:
                return "运单解密者的公钥不能为空";
            case BILL_PUBKEY_DECODER_NULL:
                return "对账单解密者的公钥不能为空";
            case BILL_CALCULATE_ABNORMAL_BILL:
                return "不能计算特殊对账单";
            case BILL_CALCULATE_ALREADY_IN_CALCULATION:
                return "对账单已经在计算中";
            case SHIPMENT_PRESETTLE_CHECKING_SHIPMENT:
                return "不能提前结算未确认的运单";
            case SHIPMENT_PRESETTLE_LOCKED_VEHICLE:
                return "不能提前结算已锁定车辆";
            case SHIPMENT_PRESETTLE_SETTLING_OR_SETTLED_SHIPMENT:
                return "结算中或已结算的车辆不可提前结算";
            case SHIPMENT_WITHDRAW_FAILED:
                return "撤销失败，请重试";
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}

