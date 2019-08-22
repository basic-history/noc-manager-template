# noc-manager-template

管理后台模版，提供了基础的后台功能。



### 迁移脚本问题

新建数据库`manager-template` ，新建用户`manager-template/manager-template`执行脚本迁移工程，执行`baseline`，然后执行`migrate`即可；测试版本为`5.7.27 `。

1. Invalid default value for 'create_time'

> 从5.6.5开始（也包括5.7），DEFAULT CURRENT_TIMESTAMP子句可以指定到TIMESTAMP或者DATETIME类型列上。


