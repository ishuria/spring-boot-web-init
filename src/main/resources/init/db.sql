drop database if exists pns;
create database pns
  default charset = utf8
  collate utf8_general_ci;
use pns;


DROP TABLE IF EXISTS user_info;
CREATE TABLE user_info
(
  id                        INT      AUTO_INCREMENT PRIMARY KEY,
  create_date               DATETIME DEFAULT CURRENT_TIMESTAMP                             NOT NULL,
  update_date               DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
  status                    VARCHAR(20)  NULL,

  mobile                    VARCHAR(20)  NOT NULL COMMENT '手机号',
  pass_hash             VARCHAR(128) NOT NULL COMMENT '密码哈希',
  chara                     VARCHAR(128) NOT NULL COMMENT '角色',
  nickname                  VARCHAR(20)  NULL COMMENT '昵称'
);
