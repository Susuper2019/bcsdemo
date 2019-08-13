/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : bc

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-08-13 15:45:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `Cid` int(10) NOT NULL,
  `Cname` varchar(100) NOT NULL,
  PRIMARY KEY (`Cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '手机数码');

-- ----------------------------
-- Table structure for orderitem
-- ----------------------------
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `Oid` varchar(100) NOT NULL DEFAULT '',
  `Pid` varchar(100) NOT NULL DEFAULT '',
  `buynum` int(11) DEFAULT NULL,
  PRIMARY KEY (`Oid`,`Pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderitem
-- ----------------------------

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `oid` varchar(50) NOT NULL,
  `ordertime` datetime DEFAULT NULL,
  `total` double DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `usename` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products` (
  `Pid` varchar(100) NOT NULL,
  `Pname` varchar(50) NOT NULL,
  `price` double DEFAULT NULL,
  `Pnum` int(11) DEFAULT NULL,
  `imgurl` varchar(100) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `Cid` int(10) DEFAULT NULL,
  PRIMARY KEY (`Pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of products
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `usename` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
