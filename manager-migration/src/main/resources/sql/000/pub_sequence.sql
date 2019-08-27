/*
 Navicat MySQL Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50710
 Source Host           : localhost:3306
 Source Schema         : manager-template

 Target Server Type    : MySQL
 Target Server Version : 50710
 File Encoding         : 65001

 Date: 27/08/2019 20:58:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for pub_sequence
-- ----------------------------
DROP TABLE IF EXISTS `pub_sequence`;
CREATE TABLE `pub_sequence` (
  `current_id` varchar(20) NOT NULL DEFAULT '0' COMMENT '当前值',
  `column_name` varchar(20) NOT NULL DEFAULT '' COMMENT '序列名',
  `cache_size` int(11) NOT NULL DEFAULT '0' COMMENT '缓存值，增加获取效率',
  `padding_length` int(11) NOT NULL DEFAULT '0' COMMENT '补位，缺失的位补零',
  PRIMARY KEY (`column_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pub_sequence
-- ----------------------------
BEGIN;
INSERT INTO `pub_sequence` VALUES ('0', 'pub_menu', 0, 6);
INSERT INTO `pub_sequence` VALUES ('10', 't_pay', 0, 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
