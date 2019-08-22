create table pub_operation_log (
  id                  VARCHAR(20) primary key,
  username            VARCHAR(30),
  menu_id             VARCHAR(32 ),
  permission_id       BIGINT(20),
  controller          VARCHAR(200),
  method              VARCHAR(200),
  ip                  VARCHAR(40),
  status              TINYINT(4)
  elapsed_time        decimal(10,2),
  create_time         datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  remark              VARCHAR(4000)
) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci;