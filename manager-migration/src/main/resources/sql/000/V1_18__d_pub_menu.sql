
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U000', 'Y', null, '0', null, null, 0, '运管顶级菜单', '1', null);

insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U001', 'Y', 'fa fa-header', '1', 'U000', null, 0, '首页管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00101', 'N', null, '2', 'U001', '/auctionHomePage/list', 0, '轮播图管理', '1', null);

insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U002', 'Y', 'fa fa-envelope-o', '1', 'U000', null, 1, '消息管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00201', 'N', null, '2', 'U002', '/MsgNotice/list', 0, '系统公告', '1', null);

insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U003', 'Y', 'fa fa-user', '1', 'U000', null, 2, '用户管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00301', 'N', null, '2', 'U003', '/userInfo/list', 0, '用户信息', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00302', 'N', null, '2', 'U003', '/userBuyer/list', 1, '买家信息', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00303', 'N', null, '2', 'U003', '/userSeller/list', 2, '卖家信息', '1', null);

insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U004', 'Y', 'fa fa-dollar', '1', 'U000', null, 3, '账户管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00401', 'N', null, '2', 'U004', '/platformAccount/list', 0, '平台账户', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00402', 'N', null, '2', 'U004', '/userAccount/list', 1, '用户账户', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00403', 'N', null, '2', 'U004', 'accountDetail/list', 2, '账户明细', '1', null);

insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U005', 'Y', 'fa fa-balance-scale', '1', 'U000', null, 4, '交易管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00501', 'N', null, '2', 'U005', '/PayAuctionOrder/list', 0, '支付记录', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00502', 'N', null, '2', 'U005', '/refundRecord/list', 1, '退款记录', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00503', 'N', null, '2', 'U005', '/payWithdrawOrder/list', 2, '提现记录', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00504', 'N', null, '2', 'U005', '/transactionManagementAuctionOrder/list', 3, '拍品订单', '1', null);

insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U006', 'Y', 'fa fa-contao', '1', 'U000', null, 5, '拍品管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00601', 'N', null, '2', 'U006', 'auctionLive/list', 0, '专场管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00602', 'N', 'fa fa-hourglass-end', '2', 'U006', 'auctionTimeItem/list', 1, '限时管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00603', 'N', null, '2', 'U006', '/auctionImpeach/list', 2, '举报拍品', '1', null);

insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U007', 'Y', 'fa fa-smile-o', '1', 'U000', null, 6, '客服管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00701', 'N', null, '2', 'U007', '/auction/list', 0, '客服订单', '1', null);

insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U008', 'Y', 'fa fa-sun-o', '1', 'U000', null, 7, '系统管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00801', 'N', null, '2', 'U008', '/pubCardBin/list', 0, '卡BIN管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00802', 'N', null, '2', 'U008', '/pubParam/list', 1, '参数管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00803', 'N', null, '2', 'U008', '/pubMenu/list', 2, '菜单管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00804', 'N', null, '2', 'U008', '/region/list', 3, '地区数据', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00805', 'N', null, '2', 'U008', '/pubUser/list', 4, '用户管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00806', 'N', null, '2', 'U008', '/pubRole/list', 5, '角色管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00807', 'N', null, '2', 'U008', '/pubTask/list', 6, '定时任务', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00808', 'N', null, '2', 'U008', '/pubLoginLog/list', 7, '登录日志', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00809', 'N', null, '2', 'U008', '/pubOperationLog/list', 8, '操作日志', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00810', 'N', null, '2', 'U008', '/pubBank/list', 9, '银行管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00811', 'N', null, '2', 'U008', '/pubBankLinked/list', 10, '联行号管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00812', 'N', null, '2', 'U008', '/pubSensitiveWord/list', 11, '敏感词管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00813', 'N', null, '2', 'U008', 'payType/list', 12, '产品管理', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00814', 'N', null, '2', 'U008', '/payTypeBank/list', 13, '产品支持银行', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00815', 'N', null, '2', 'U008', '/logistic/list', 14, '物流公司', '1', '查询');
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00816', 'N', null, '2', 'U008', 'auctionItemType/list', 15, '拍品分类', '1', null);
insert into PUB_MENU (ID, HAS_CHILD, ICON, NODE, PARENT_ID, PATH, SORT, TITLE, IS_SHOW, REMARK)
values ('U00817', 'N', null, '2', 'U008', '/pubRaisePrice/list', 16, '竞价阶梯', '1', null);




