SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', 'IT部');
INSERT INTO `department` VALUES ('2', '采购部');
INSERT INTO `department` VALUES ('3', '销售部');

-- ----------------------------
-- Table structure for `depot`
-- ----------------------------
DROP TABLE IF EXISTS `depot`;
CREATE TABLE `depot` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `maxCapacity` decimal(19,2) DEFAULT NULL,
  `capacity` decimal(19,2) DEFAULT NULL,
  `totlaAmount` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of depot
-- ----------------------------

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `department_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4AFD4ACE851EFECF` (`department_id`),
  CONSTRAINT `FK4AFD4ACE851EFECF` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', 'admin', 'admin', 'amdin@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('2', 'roleAdmin', 'roleAdmin', 'roleAdmin@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('3', 'admin1', 'admin1', 'amdin1@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('4', 'admin2', 'admin2', 'amdin2@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('5', 'admin3', 'admin3', 'amdin3@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('6', 'admin4', 'admin4', 'amdin4@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('7', 'admin5', 'admin5', 'amdin5@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('8', 'admin6', 'admin6', 'amdin6@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('9', 'admin7', 'admin7', 'amdin7@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('10', 'admin8', 'admin8', 'amdin8@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('11', 'admin9', 'admin9', 'amdin9@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('12', 'admin10', 'admin10', 'amdin10@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('13', 'admin11', 'admin11', 'amdin11@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('14', 'admin12', 'admin12', 'amdin12@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('15', 'admin13', 'admin13', 'amdin13@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('16', 'admin14', 'admin14', 'amdin14@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('17', 'admin15', 'admin15', 'amdin15@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('18', 'admin16', 'admin16', 'amdin16@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('19', 'admin17', 'admin17', 'amdin17@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('20', 'admin18', 'admin18', 'amdin18@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('21', 'admin19', 'admin19', 'amdin19@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('22', 'admin20', 'admin20', 'amdin20@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('23', 'admin21', 'admin21', 'amdin21@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('24', 'admin22', 'admin22', 'amdin22@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('25', 'admin23', 'admin23', 'amdin23@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('26', 'admin24', 'admin24', 'amdin24@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('27', 'admin25', 'admin25', 'amdin25@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('28', 'admin26', 'admin26', 'amdin26@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('29', 'admin27', 'admin27', 'amdin27@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('30', 'admin28', 'admin28', 'amdin28@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('31', 'admin29', 'admin29', 'amdin29@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('32', 'admin30', 'admin30', 'amdin30@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('33', 'admin31', 'admin31', 'amdin31@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('34', 'admin32', 'admin32', 'amdin32@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('35', 'admin33', 'admin33', 'amdin33@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('36', 'admin34', 'admin34', 'amdin34@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('37', 'admin35', 'admin35', 'amdin35@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('38', 'admin36', 'admin36', 'amdin36@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('39', 'admin37', 'admin37', 'amdin37@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('40', 'admin38', 'admin38', 'amdin38@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('41', 'admin39', 'admin39', 'amdin39@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('42', 'admin40', 'admin40', 'amdin40@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('43', 'admin41', 'admin41', 'amdin41@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('44', 'admin42', 'admin42', 'amdin42@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('45', 'admin43', 'admin43', 'amdin43@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('46', 'admin44', 'admin44', 'amdin44@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('47', 'admin45', 'admin45', 'amdin45@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('48', 'admin46', 'admin46', 'amdin46@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('49', 'admin47', 'admin47', 'amdin47@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('50', 'admin48', 'admin48', 'amdin48@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('51', 'admin49', 'admin49', 'amdin49@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('52', 'admin50', 'admin50', 'amdin50@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('53', 'admin51', 'admin51', 'amdin51@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('54', 'admin52', 'admin52', 'amdin52@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('55', 'admin53', 'admin53', 'amdin53@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('56', 'admin54', 'admin54', 'amdin54@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('57', 'admin55', 'admin55', 'amdin55@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('58', 'admin56', 'admin56', 'amdin56@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('59', 'admin57', 'admin57', 'amdin57@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('60', 'admin58', 'admin58', 'amdin58@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('61', 'admin59', 'admin59', 'amdin59@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('62', 'admin60', 'admin60', 'amdin60@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('63', 'admin61', 'admin61', 'amdin61@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('64', 'admin62', 'admin62', 'amdin62@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('65', 'admin63', 'admin63', 'amdin63@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('66', 'admin64', 'admin64', 'amdin64@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('67', 'admin65', 'admin65', 'amdin65@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('68', 'admin66', 'admin66', 'amdin66@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('69', 'admin67', 'admin67', 'amdin67@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('70', 'admin68', 'admin68', 'amdin68@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('71', 'admin69', 'admin69', 'amdin69@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('72', 'admin70', 'admin70', 'amdin70@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('73', 'admin71', 'admin71', 'amdin71@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('74', 'admin72', 'admin72', 'amdin72@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('75', 'admin73', 'admin73', 'amdin73@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('76', 'admin74', 'admin74', 'amdin74@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('77', 'admin75', 'admin75', 'amdin75@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('78', 'admin76', 'admin76', 'amdin76@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('79', 'admin77', 'admin77', 'amdin77@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('80', 'admin78', 'admin78', 'amdin78@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('81', 'admin79', 'admin79', 'amdin79@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('82', 'admin80', 'admin80', 'amdin80@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('83', 'admin81', 'admin81', 'amdin81@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('84', 'admin82', 'admin82', 'amdin82@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('85', 'admin83', 'admin83', 'amdin83@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('86', 'admin84', 'admin84', 'amdin84@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('87', 'admin85', 'admin85', 'amdin85@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('88', 'admin86', 'admin86', 'amdin86@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('89', 'admin87', 'admin87', 'amdin87@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('90', 'admin88', 'admin88', 'amdin88@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('91', 'admin89', 'admin89', 'amdin89@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('92', 'admin90', 'admin90', 'amdin90@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('93', 'admin91', 'admin91', 'amdin91@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('94', 'admin92', 'admin92', 'amdin92@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('95', 'admin93', 'admin93', 'amdin93@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('96', 'admin94', 'admin94', 'amdin94@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('97', 'admin95', 'admin95', 'amdin95@gmail.com', '25', '1');
INSERT INTO `employee` VALUES ('98', 'admin96', 'admin96', 'amdin96@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('99', 'admin97', 'admin97', 'amdin97@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('100', 'admin98', 'admin98', 'amdin98@gmail.com', '25', '3');
INSERT INTO `employee` VALUES ('101', 'admin99', 'admin99', 'amdin99@gmail.com', '25', '2');
INSERT INTO `employee` VALUES ('102', 'admin100', 'admin100', 'amdin100@gmail.com', '25', '2');

-- ----------------------------
-- Table structure for `employee_role`
-- ----------------------------
DROP TABLE IF EXISTS `employee_role`;
CREATE TABLE `employee_role` (
  `employee_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`employee_id`,`role_id`),
  KEY `FK87184F674D26E00F` (`role_id`),
  KEY `FK87184F6710B1828F` (`employee_id`),
  CONSTRAINT `FK87184F6710B1828F` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `FK87184F674D26E00F` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee_role
-- ----------------------------
INSERT INTO `employee_role` VALUES ('1', '1');
INSERT INTO `employee_role` VALUES ('2', '2');

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK24897F76799044` (`parent_id`),
  CONSTRAINT `FK24897F76799044` FOREIGN KEY (`parent_id`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '系统管理', null, 'js/zTree/css/zTreeStyle/img/diy/1_close.png', null);
INSERT INTO `menu` VALUES ('2', '角色管理', 'role.action', 'js/zTree/css/zTreeStyle/img/diy/2.png', '1');
INSERT INTO `menu` VALUES ('3', '菜单管理', 'menu.action', 'js/zTree/css/zTreeStyle/img/diy/3.png', '1');
INSERT INTO `menu` VALUES ('4', '资源管理', 'resource.action', 'js/zTree/css/zTreeStyle/img/diy/4.png', '1');
INSERT INTO `menu` VALUES ('5', '组织机构', null, 'js/zTree/css/zTreeStyle/img/diy/1_open.png', null);
INSERT INTO `menu` VALUES ('6', '部门管理', 'department.action', 'js/zTree/css/zTreeStyle/img/diy/5.png', '5');
INSERT INTO `menu` VALUES ('7', '员工管理', 'employee.action', 'js/zTree/css/zTreeStyle/img/diy/6.png', '5');
INSERT INTO `menu` VALUES ('8', '基础数据', null, 'js/zTree/css/zTreeStyle/img/diy/1_close.png', null);
INSERT INTO `menu` VALUES ('9', '数据字典类型', 'systemDictionaryType.action', 'js/zTree/css/zTreeStyle/img/diy/7.png', '8');
INSERT INTO `menu` VALUES ('10', '数据字典明细', 'systemDictionaryDetail.action', 'js/zTree/css/zTreeStyle/img/diy/8.png', '8');
INSERT INTO `menu` VALUES ('11', '产品类型', 'productType.action', 'js/zTree/css/zTreeStyle/img/diy/9.png', '8');
INSERT INTO `menu` VALUES ('12', '产品管理', 'product.action', 'js/zTree/css/zTreeStyle/img/diy/2.png', '8');
INSERT INTO `menu` VALUES ('13', '供应商管理', 'supplier.action', 'js/zTree/css/zTreeStyle/img/diy/3.png', '8');
INSERT INTO `menu` VALUES ('14', '采购模块', null, 'js/zTree/css/zTreeStyle/img/diy/1_open.png', null);
INSERT INTO `menu` VALUES ('15', '采购管理', 'purchaseBill.action', 'js/zTree/css/zTreeStyle/img/diy/4.png', '14');
INSERT INTO `menu` VALUES ('16', '采购报表', 'purchaseBillItem.action', 'js/zTree/css/zTreeStyle/img/diy/5.png', '14');

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL,
  `costPrice` decimal(19,2) DEFAULT NULL,
  `salePrice` decimal(19,2) DEFAULT NULL,
  `types_id` bigint(20) NOT NULL,
  `unit_id` bigint(20) NOT NULL,
  `brand_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK50C664CF8DF77FB5` (`types_id`),
  KEY `FK50C664CF422B987E` (`brand_id`),
  KEY `FK50C664CF329AED61` (`unit_id`),
  CONSTRAINT `FK50C664CF329AED61` FOREIGN KEY (`unit_id`) REFERENCES `systemdictionarydetail` (`id`),
  CONSTRAINT `FK50C664CF422B987E` FOREIGN KEY (`brand_id`) REFERENCES `systemdictionarydetail` (`id`),
  CONSTRAINT `FK50C664CF8DF77FB5` FOREIGN KEY (`types_id`) REFERENCES `producttype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '产品1', 'red', null, '1.00', '1.00', '2', '3', '1');
INSERT INTO `product` VALUES ('2', '产品2', 'green', null, '2.00', '2.00', '7', '4', '2');

-- ----------------------------
-- Table structure for `productstock`
-- ----------------------------
DROP TABLE IF EXISTS `productstock`;
CREATE TABLE `productstock` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `num` decimal(19,2) DEFAULT NULL,
  `amount` decimal(19,2) DEFAULT NULL,
  `price` decimal(19,2) DEFAULT NULL,
  `incomeDate` datetime DEFAULT NULL,
  `warning` bit(1) DEFAULT NULL,
  `topNum` decimal(19,2) DEFAULT NULL,
  `bottomNum` decimal(19,2) DEFAULT NULL,
  `product_id` bigint(20) NOT NULL,
  `depot_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK459B4B879F064DC5` (`depot_id`),
  KEY `FK459B4B87D6A81925` (`product_id`),
  CONSTRAINT `FK459B4B87D6A81925` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
  CONSTRAINT `FK459B4B879F064DC5` FOREIGN KEY (`depot_id`) REFERENCES `depot` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of productstock
-- ----------------------------

-- ----------------------------
-- Table structure for `producttype`
-- ----------------------------
DROP TABLE IF EXISTS `producttype`;
CREATE TABLE `producttype` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `descs` varchar(255) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKA8168A931A015E4` (`parent_id`),
  CONSTRAINT `FKA8168A931A015E4` FOREIGN KEY (`parent_id`) REFERENCES `producttype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of producttype
-- ----------------------------
INSERT INTO `producttype` VALUES ('1', '汽车', '汽车', null);
INSERT INTO `producttype` VALUES ('2', '奥迪', '奥迪', '1');
INSERT INTO `producttype` VALUES ('3', '奔驰', '奔驰', '1');
INSERT INTO `producttype` VALUES ('4', '大众', '大众', '1');
INSERT INTO `producttype` VALUES ('5', '电视', '电视', null);
INSERT INTO `producttype` VALUES ('6', '3D电视', '3D电视', '5');
INSERT INTO `producttype` VALUES ('7', '液晶电视', '液晶电视', '5');

-- ----------------------------
-- Table structure for `purchasebill`
-- ----------------------------
DROP TABLE IF EXISTS `purchasebill`;
CREATE TABLE `purchasebill` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `vdate` datetime DEFAULT NULL,
  `totalAmount` decimal(19,2) DEFAULT NULL,
  `totalNum` decimal(19,2) DEFAULT NULL,
  `inputTime` datetime DEFAULT NULL,
  `auditorTime` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `supplier_id` bigint(20) NOT NULL,
  `auditor_id` bigint(20) DEFAULT NULL,
  `inputUser_id` bigint(20) NOT NULL,
  `buyer_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9BD788C89FE0CD6A` (`buyer_id`),
  KEY `FK9BD788C83FF7A83F` (`auditor_id`),
  KEY `FK9BD788C8A902BD48` (`inputUser_id`),
  KEY `FK9BD788C812C245CF` (`supplier_id`),
  CONSTRAINT `FK9BD788C812C245CF` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`id`),
  CONSTRAINT `FK9BD788C83FF7A83F` FOREIGN KEY (`auditor_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `FK9BD788C89FE0CD6A` FOREIGN KEY (`buyer_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `FK9BD788C8A902BD48` FOREIGN KEY (`inputUser_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchasebill
-- ----------------------------
INSERT INTO `purchasebill` VALUES ('1', '2014-10-21 00:00:00', '5.00', '3.00', '2014-10-21 23:01:12', null, '0', '1', null, '1', '4');
INSERT INTO `purchasebill` VALUES ('2', '2014-10-21 00:00:00', '22.00', '22.00', '2014-10-21 23:01:27', null, '0', '1', null, '1', '4');
INSERT INTO `purchasebill` VALUES ('3', '2014-10-21 00:00:00', '4.00', '2.00', '2014-10-21 23:01:39', null, '0', '2', null, '1', '4');

-- ----------------------------
-- Table structure for `purchasebillitem`
-- ----------------------------
DROP TABLE IF EXISTS `purchasebillitem`;
CREATE TABLE `purchasebillitem` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `price` decimal(19,2) DEFAULT NULL,
  `num` decimal(19,2) DEFAULT NULL,
  `amount` decimal(19,2) DEFAULT NULL,
  `descs` varchar(255) DEFAULT NULL,
  `product_id` bigint(20) NOT NULL,
  `bill_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5FF8D3FBD6A81925` (`product_id`),
  KEY `FK5FF8D3FB60931610` (`bill_id`),
  CONSTRAINT `FK5FF8D3FB60931610` FOREIGN KEY (`bill_id`) REFERENCES `purchasebill` (`id`),
  CONSTRAINT `FK5FF8D3FBD6A81925` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchasebillitem
-- ----------------------------
INSERT INTO `purchasebillitem` VALUES ('1', '1.00', '1.00', '1.00', '1', '1', '1');
INSERT INTO `purchasebillitem` VALUES ('2', '2.00', '2.00', '4.00', '', '2', '1');
INSERT INTO `purchasebillitem` VALUES ('3', '1.00', '11.00', '11.00', '', '1', '2');
INSERT INTO `purchasebillitem` VALUES ('4', '1.00', '11.00', '11.00', '', '1', '2');
INSERT INTO `purchasebillitem` VALUES ('5', '2.00', '2.00', '4.00', '', '2', '3');

-- ----------------------------
-- Table structure for `resource`
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `method` varchar(255) DEFAULT NULL,
  `descs` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource
-- ----------------------------
INSERT INTO `resource` VALUES ('1', '资源管理', 'me.qinchao.pss.web.resourceAction.ALL', '资源管理,me.qinchao.pss.web.resourceAction.ALL');
INSERT INTO `resource` VALUES ('2', '角色管理', 'me.qinchao.pss.web.roleAction.ALL', '角色管理,me.qinchao.pss.web.roleAction.ALL');
INSERT INTO `resource` VALUES ('3', '角色列表', 'me.qinchao.pss.web.roleAction.execute', '角色列表,me.qinchao.pss.web.roleAction.execute');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员');
INSERT INTO `role` VALUES ('2', '角色管理员');

-- ----------------------------
-- Table structure for `role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `role_id` bigint(20) NOT NULL,
  `menu_id` bigint(20) NOT NULL,
  PRIMARY KEY (`role_id`,`menu_id`),
  KEY `FK1404278833B84B6F` (`menu_id`),
  KEY `FK140427884D26E00F` (`role_id`),
  CONSTRAINT `FK140427884D26E00F` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `FK1404278833B84B6F` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES ('1', '1');
INSERT INTO `role_menu` VALUES ('2', '1');
INSERT INTO `role_menu` VALUES ('1', '2');
INSERT INTO `role_menu` VALUES ('2', '2');
INSERT INTO `role_menu` VALUES ('1', '3');
INSERT INTO `role_menu` VALUES ('1', '4');
INSERT INTO `role_menu` VALUES ('1', '5');
INSERT INTO `role_menu` VALUES ('1', '6');
INSERT INTO `role_menu` VALUES ('1', '7');
INSERT INTO `role_menu` VALUES ('1', '8');
INSERT INTO `role_menu` VALUES ('1', '9');
INSERT INTO `role_menu` VALUES ('1', '10');
INSERT INTO `role_menu` VALUES ('1', '11');
INSERT INTO `role_menu` VALUES ('1', '12');
INSERT INTO `role_menu` VALUES ('1', '13');
INSERT INTO `role_menu` VALUES ('1', '14');
INSERT INTO `role_menu` VALUES ('1', '15');
INSERT INTO `role_menu` VALUES ('1', '16');

-- ----------------------------
-- Table structure for `role_resource`
-- ----------------------------
DROP TABLE IF EXISTS `role_resource`;
CREATE TABLE `role_resource` (
  `role_id` bigint(20) NOT NULL,
  `resource_id` bigint(20) NOT NULL,
  PRIMARY KEY (`role_id`,`resource_id`),
  KEY `FKAEE599B74D26E00F` (`role_id`),
  KEY `FKAEE599B7C854068F` (`resource_id`),
  CONSTRAINT `FKAEE599B7C854068F` FOREIGN KEY (`resource_id`) REFERENCES `resource` (`id`),
  CONSTRAINT `FKAEE599B74D26E00F` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_resource
-- ----------------------------
INSERT INTO `role_resource` VALUES ('1', '1');
INSERT INTO `role_resource` VALUES ('1', '2');
INSERT INTO `role_resource` VALUES ('1', '3');
INSERT INTO `role_resource` VALUES ('2', '2');

-- ----------------------------
-- Table structure for `stockincomebill`
-- ----------------------------
DROP TABLE IF EXISTS `stockincomebill`;
CREATE TABLE `stockincomebill` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `vdate` datetime DEFAULT NULL,
  `totalAmount` decimal(19,2) DEFAULT NULL,
  `totalNum` decimal(19,2) DEFAULT NULL,
  `inputTime` datetime DEFAULT NULL,
  `auditorTime` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `supplier_id` bigint(20) NOT NULL,
  `auditor_id` bigint(20) DEFAULT NULL,
  `inputUser_id` bigint(20) NOT NULL,
  `keeper_id` bigint(20) NOT NULL,
  `depot_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK54AC64E69F064DC5` (`depot_id`),
  KEY `FK54AC64E63FF7A83F` (`auditor_id`),
  KEY `FK54AC64E6A902BD48` (`inputUser_id`),
  KEY `FK54AC64E6725F67CB` (`keeper_id`),
  KEY `FK54AC64E612C245CF` (`supplier_id`),
  CONSTRAINT `FK54AC64E612C245CF` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`id`),
  CONSTRAINT `FK54AC64E63FF7A83F` FOREIGN KEY (`auditor_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `FK54AC64E6725F67CB` FOREIGN KEY (`keeper_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `FK54AC64E69F064DC5` FOREIGN KEY (`depot_id`) REFERENCES `depot` (`id`),
  CONSTRAINT `FK54AC64E6A902BD48` FOREIGN KEY (`inputUser_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stockincomebill
-- ----------------------------

-- ----------------------------
-- Table structure for `stockincomebillitem`
-- ----------------------------
DROP TABLE IF EXISTS `stockincomebillitem`;
CREATE TABLE `stockincomebillitem` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `price` decimal(19,2) DEFAULT NULL,
  `num` decimal(19,2) DEFAULT NULL,
  `amount` decimal(19,2) DEFAULT NULL,
  `descs` varchar(255) DEFAULT NULL,
  `product_id` bigint(20) NOT NULL,
  `bill_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKACA67119D6A81925` (`product_id`),
  KEY `FKACA671192B5E3024` (`bill_id`),
  CONSTRAINT `FKACA671192B5E3024` FOREIGN KEY (`bill_id`) REFERENCES `stockincomebill` (`id`),
  CONSTRAINT `FKACA67119D6A81925` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stockincomebillitem
-- ----------------------------

-- ----------------------------
-- Table structure for `supplier`
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('1', '北京供应商');
INSERT INTO `supplier` VALUES ('2', '成都供应商');

-- ----------------------------
-- Table structure for `systemdictionarydetail`
-- ----------------------------
DROP TABLE IF EXISTS `systemdictionarydetail`;
CREATE TABLE `systemdictionarydetail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `types_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK81BC50F6718C93B5` (`types_id`),
  CONSTRAINT `FK81BC50F6718C93B5` FOREIGN KEY (`types_id`) REFERENCES `systemdictionarytype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of systemdictionarydetail
-- ----------------------------
INSERT INTO `systemdictionarydetail` VALUES ('1', '七匹狼', '1');
INSERT INTO `systemdictionarydetail` VALUES ('2', '耐克', '1');
INSERT INTO `systemdictionarydetail` VALUES ('3', '条', '2');
INSERT INTO `systemdictionarydetail` VALUES ('4', '斤', '2');

-- ----------------------------
-- Table structure for `systemdictionarytype`
-- ----------------------------
DROP TABLE IF EXISTS `systemdictionarytype`;
CREATE TABLE `systemdictionarytype` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sn` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sn` (`sn`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of systemdictionarytype
-- ----------------------------
INSERT INTO `systemdictionarytype` VALUES ('1', 'productBrand', '产品品牌');
INSERT INTO `systemdictionarytype` VALUES ('2', 'productUnit', '产品单位');
