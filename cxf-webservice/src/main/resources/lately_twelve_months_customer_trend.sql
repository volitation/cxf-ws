/*
Navicat MySQL Data Transfer

Source Server         : local-mysql
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : visualization

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2017-12-13 11:22:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for lately_twelve_months_customer_trend
-- ----------------------------
DROP TABLE IF EXISTS `lately_twelve_months_customer_trend`;
CREATE TABLE `lately_twelve_months_customer_trend` (
  `MONTH` varchar(255) DEFAULT NULL,
  `TOTAL` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lately_twelve_months_customer_trend
-- ----------------------------
INSERT INTO `lately_twelve_months_customer_trend` VALUES ('201710', '3785');
INSERT INTO `lately_twelve_months_customer_trend` VALUES ('201709', '2707');
INSERT INTO `lately_twelve_months_customer_trend` VALUES ('201708', '2849');
INSERT INTO `lately_twelve_months_customer_trend` VALUES ('201707', '846');
INSERT INTO `lately_twelve_months_customer_trend` VALUES ('201706', '376');
INSERT INTO `lately_twelve_months_customer_trend` VALUES ('201705', '149');
INSERT INTO `lately_twelve_months_customer_trend` VALUES ('201704', '139');
INSERT INTO `lately_twelve_months_customer_trend` VALUES ('201703', '59');
INSERT INTO `lately_twelve_months_customer_trend` VALUES ('201702', '17');
INSERT INTO `lately_twelve_months_customer_trend` VALUES ('201701', '15');
INSERT INTO `lately_twelve_months_customer_trend` VALUES ('201612', '55');
INSERT INTO `lately_twelve_months_customer_trend` VALUES ('201611', '37');
