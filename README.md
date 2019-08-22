# noc-manager-template

管理后台模版，提供了基础的后台功能。



### 迁移脚本问题

1. Invalid default value for 'create_time'

> 从5.6.5开始（也包括5.7），DEFAULT CURRENT_TIMESTAMP子句可以指定到TIMESTAMP或者DATETIME类型列上。

测试版本为`5.7.27 `

windows可通过https://dev.mysql.com/downloads/file/?id=487685下载