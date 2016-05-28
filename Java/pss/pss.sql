SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `Department`
-- ----------------------------
DROP TABLE IF EXISTS `Department`;
CREATE TABLE `Department` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Department
-- ----------------------------
INSERT INTO `Department` VALUES ('1', 'IT部');
INSERT INTO `Department` VALUES ('2', '采购部');
INSERT INTO `Department` VALUES ('3', '销售部');

-- ----------------------------
-- Table structure for `Depot`
-- ----------------------------
DROP TABLE IF EXISTS `Depot`;
CREATE TABLE `Depot` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `maxCapacity` decimal(19,2) DEFAULT NULL,
  `capacity` decimal(19,2) DEFAULT NULL,
  `totlaAmount` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Depot
-- ----------------------------

-- ----------------------------
-- Table structure for `Employee`
-- ----------------------------
DROP TABLE IF EXISTS `Employee`;
CREATE TABLE `Employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `Department_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4AFD4ACE851EFECF` (`Department_id`),
  CONSTRAINT `FK4AFD4ACE851EFECF` FOREIGN KEY (`Department_id`) REFERENCES `Department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `Employee` VALUES ('1', 'admin', 'admin', 'amdin@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('2', 'roleAdmin', 'roleAdmin', 'roleAdmin@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('3', 'admin1', 'admin1', 'amdin1@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('4', 'admin2', 'admin2', 'amdin2@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('5', 'admin3', 'admin3', 'amdin3@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('6', 'admin4', 'admin4', 'amdin4@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('7', 'admin5', 'admin5', 'amdin5@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('8', 'admin6', 'admin6', 'amdin6@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('9', 'admin7', 'admin7', 'amdin7@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('10', 'admin8', 'admin8', 'amdin8@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('11', 'admin9', 'admin9', 'amdin9@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('12', 'admin10', 'admin10', 'amdin10@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('13', 'admin11', 'admin11', 'amdin11@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('14', 'admin12', 'admin12', 'amdin12@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('15', 'admin13', 'admin13', 'amdin13@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('16', 'admin14', 'admin14', 'amdin14@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('17', 'admin15', 'admin15', 'amdin15@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('18', 'admin16', 'admin16', 'amdin16@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('19', 'admin17', 'admin17', 'amdin17@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('20', 'admin18', 'admin18', 'amdin18@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('21', 'admin19', 'admin19', 'amdin19@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('22', 'admin20', 'admin20', 'amdin20@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('23', 'admin21', 'admin21', 'amdin21@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('24', 'admin22', 'admin22', 'amdin22@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('25', 'admin23', 'admin23', 'amdin23@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('26', 'admin24', 'admin24', 'amdin24@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('27', 'admin25', 'admin25', 'amdin25@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('28', 'admin26', 'admin26', 'amdin26@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('29', 'admin27', 'admin27', 'amdin27@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('30', 'admin28', 'admin28', 'amdin28@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('31', 'admin29', 'admin29', 'amdin29@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('32', 'admin30', 'admin30', 'amdin30@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('33', 'admin31', 'admin31', 'amdin31@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('34', 'admin32', 'admin32', 'amdin32@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('35', 'admin33', 'admin33', 'amdin33@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('36', 'admin34', 'admin34', 'amdin34@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('37', 'admin35', 'admin35', 'amdin35@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('38', 'admin36', 'admin36', 'amdin36@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('39', 'admin37', 'admin37', 'amdin37@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('40', 'admin38', 'admin38', 'amdin38@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('41', 'admin39', 'admin39', 'amdin39@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('42', 'admin40', 'admin40', 'amdin40@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('43', 'admin41', 'admin41', 'amdin41@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('44', 'admin42', 'admin42', 'amdin42@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('45', 'admin43', 'admin43', 'amdin43@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('46', 'admin44', 'admin44', 'amdin44@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('47', 'admin45', 'admin45', 'amdin45@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('48', 'admin46', 'admin46', 'amdin46@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('49', 'admin47', 'admin47', 'amdin47@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('50', 'admin48', 'admin48', 'amdin48@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('51', 'admin49', 'admin49', 'amdin49@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('52', 'admin50', 'admin50', 'amdin50@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('53', 'admin51', 'admin51', 'amdin51@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('54', 'admin52', 'admin52', 'amdin52@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('55', 'admin53', 'admin53', 'amdin53@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('56', 'admin54', 'admin54', 'amdin54@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('57', 'admin55', 'admin55', 'amdin55@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('58', 'admin56', 'admin56', 'amdin56@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('59', 'admin57', 'admin57', 'amdin57@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('60', 'admin58', 'admin58', 'amdin58@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('61', 'admin59', 'admin59', 'amdin59@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('62', 'admin60', 'admin60', 'amdin60@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('63', 'admin61', 'admin61', 'amdin61@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('64', 'admin62', 'admin62', 'amdin62@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('65', 'admin63', 'admin63', 'amdin63@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('66', 'admin64', 'admin64', 'amdin64@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('67', 'admin65', 'admin65', 'amdin65@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('68', 'admin66', 'admin66', 'amdin66@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('69', 'admin67', 'admin67', 'amdin67@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('70', 'admin68', 'admin68', 'amdin68@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('71', 'admin69', 'admin69', 'amdin69@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('72', 'admin70', 'admin70', 'amdin70@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('73', 'admin71', 'admin71', 'amdin71@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('74', 'admin72', 'admin72', 'amdin72@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('75', 'admin73', 'admin73', 'amdin73@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('76', 'admin74', 'admin74', 'amdin74@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('77', 'admin75', 'admin75', 'amdin75@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('78', 'admin76', 'admin76', 'amdin76@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('79', 'admin77', 'admin77', 'amdin77@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('80', 'admin78', 'admin78', 'amdin78@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('81', 'admin79', 'admin79', 'amdin79@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('82', 'admin80', 'admin80', 'amdin80@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('83', 'admin81', 'admin81', 'amdin81@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('84', 'admin82', 'admin82', 'amdin82@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('85', 'admin83', 'admin83', 'amdin83@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('86', 'admin84', 'admin84', 'amdin84@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('87', 'admin85', 'admin85', 'amdin85@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('88', 'admin86', 'admin86', 'amdin86@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('89', 'admin87', 'admin87', 'amdin87@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('90', 'admin88', 'admin88', 'amdin88@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('91', 'admin89', 'admin89', 'amdin89@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('92', 'admin90', 'admin90', 'amdin90@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('93', 'admin91', 'admin91', 'amdin91@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('94', 'admin92', 'admin92', 'amdin92@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('95', 'admin93', 'admin93', 'amdin93@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('96', 'admin94', 'admin94', 'amdin94@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('97', 'admin95', 'admin95', 'amdin95@gmail.com', '25', '1');
INSERT INTO `Employee` VALUES ('98', 'admin96', 'admin96', 'amdin96@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('99', 'admin97', 'admin97', 'amdin97@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('100', 'admin98', 'admin98', 'amdin98@gmail.com', '25', '3');
INSERT INTO `Employee` VALUES ('101', 'admin99', 'admin99', 'amdin99@gmail.com', '25', '2');
INSERT INTO `Employee` VALUES ('102', 'admin100', 'admin100', 'amdin100@gmail.com', '25', '2');

-- ----------------------------
-- Table structure for `EmployeeRole`
-- ----------------------------
DROP TABLE IF EXISTS `EmployeeRole`;
CREATE TABLE `EmployeeRole` (
  `employee_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`employee_id`,`role_id`),
  KEY `FK87184F674D26E00F` (`role_id`),
  KEY `FK87184F6710B1828F` (`employee_id`),
  CONSTRAINT `FK87184F6710B1828F` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `FK87184F674D26E00F` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of EmployeeRole
-- ----------------------------
INSERT INTO `EmployeeRole` VALUES ('1', '1');
INSERT INTO `EmployeeRole` VALUES ('2', '2');

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `Menu`;
CREATE TABLE `Menu` (
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
INSERT INTO `Menu` VALUES ('1', '系统管理', null, 'js/zTree/css/zTreeStyle/img/diy/1_close.png', null);
INSERT INTO `Menu` VALUES ('2', '角色管理', 'role.action', 'js/zTree/css/zTreeStyle/img/diy/2.png', '1');
INSERT INTO `Menu` VALUES ('3', '菜单管理', 'menu.action', 'js/zTree/css/zTreeStyle/img/diy/3.png', '1');
INSERT INTO `Menu` VALUES ('4', '资源管理', 'resource.action', 'js/zTree/css/zTreeStyle/img/diy/4.png', '1');
INSERT INTO `Menu` VALUES ('5', '组织机构', null, 'js/zTree/css/zTreeStyle/img/diy/1_open.png', null);
INSERT INTO `Menu` VALUES ('6', '部门管理', 'department.action', 'js/zTree/css/zTreeStyle/img/diy/5.png', '5');
INSERT INTO `Menu` VALUES ('7', '员工管理', 'employee.action', 'js/zTree/css/zTreeStyle/img/diy/6.png', '5');
INSERT INTO `Menu` VALUES ('8', '基础数据', null, 'js/zTree/css/zTreeStyle/img/diy/1_close.png', null);
INSERT INTO `Menu` VALUES ('9', '数据字典类型', 'systemDictionaryType.action', 'js/zTree/css/zTreeStyle/img/diy/7.png', '8');
INSERT INTO `Menu` VALUES ('10', '数据字典明细', 'systemDictionaryDetail.action', 'js/zTree/css/zTreeStyle/img/diy/8.png', '8');
INSERT INTO `Menu` VALUES ('11', '产品类型', 'productType.action', 'js/zTree/css/zTreeStyle/img/diy/9.png', '8');
INSERT INTO `Menu` VALUES ('12', '产品管理', 'product.action', 'js/zTree/css/zTreeStyle/img/diy/2.png', '8');
INSERT INTO `Menu` VALUES ('13', '供应商管理', 'supplier.action', 'js/zTree/css/zTreeStyle/img/diy/3.png', '8');
INSERT INTO `Menu` VALUES ('14', '采购模块', null, 'js/zTree/css/zTreeStyle/img/diy/1_open.png', null);
INSERT INTO `Menu` VALUES ('15', '采购管理', 'purchaseBill.action', 'js/zTree/css/zTreeStyle/img/diy/4.png', '14');
INSERT INTO `Menu` VALUES ('16', '采购报表', 'purchaseBillItem.action', 'js/zTree/css/zTreeStyle/img/diy/5.png', '14');

-- ----------------------------
-- Table structure for `Product`
-- ----------------------------
DROP TABLE IF EXISTS `Product`;
CREATE TABLE `Product` (
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
  CONSTRAINT `FK50C664CF329AED61` FOREIGN KEY (`unit_id`) REFERENCES `SystemDictionaryDetail` (`id`),
  CONSTRAINT `FK50C664CF422B987E` FOREIGN KEY (`brand_id`) REFERENCES `SystemDictionaryDetail` (`id`),
  CONSTRAINT `FK50C664CF8DF77FB5` FOREIGN KEY (`types_id`) REFERENCES `producttype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Product
-- ----------------------------
INSERT INTO `Product` VALUES ('1', '产品1', 'red', null, '1.00', '1.00', '2', '3', '1');
INSERT INTO `Product` VALUES ('2', '产品2', 'green', null, '2.00', '2.00', '7', '4', '2');

-- ----------------------------
-- Table structure for `ProductStock`
-- ----------------------------
DROP TABLE IF EXISTS `ProductStock`;
CREATE TABLE `ProductStock` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `num` decimal(19,2) DEFAULT NULL,
  `amount` decimal(19,2) DEFAULT NULL,
  `price` decimal(19,2) DEFAULT NULL,
  `incomeDate` datetime DEFAULT NULL,
  `warning` bit(1) DEFAULT NULL,
  `topNum` decimal(19,2) DEFAULT NULL,
  `bottomNum` decimal(19,2) DEFAULT NULL,
  `product_id` bigint(20) NOT NULL,
  `Depot_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK459B4B879F064DC5` (`Depot_id`),
  KEY `FK459B4B87D6A81925` (`product_id`),
  CONSTRAINT `FK459B4B87D6A81925` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
  CONSTRAINT `FK459B4B879F064DC5` FOREIGN KEY (`Depot_id`) REFERENCES `Depot` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ProductStock
-- ----------------------------

-- ----------------------------
-- Table structure for `ProductType`
-- ----------------------------
DROP TABLE IF EXISTS `ProductType`;
CREATE TABLE `ProductType` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `descs` varchar(255) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKA8168A931A015E4` (`parent_id`),
  CONSTRAINT `FKA8168A931A015E4` FOREIGN KEY (`parent_id`) REFERENCES `producttype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ProductType
-- ----------------------------
INSERT INTO `ProductType` VALUES ('1', '汽车', '汽车', null);
INSERT INTO `ProductType` VALUES ('2', '奥迪', '奥迪', '1');
INSERT INTO `ProductType` VALUES ('3', '奔驰', '奔驰', '1');
INSERT INTO `ProductType` VALUES ('4', '大众', '大众', '1');
INSERT INTO `ProductType` VALUES ('5', '电视', '电视', null);
INSERT INTO `ProductType` VALUES ('6', '3D电视', '3D电视', '5');
INSERT INTO `ProductType` VALUES ('7', '液晶电视', '液晶电视', '5');

-- ----------------------------
-- Table structure for `PurchaseBill`
-- ----------------------------
DROP TABLE IF EXISTS `PurchaseBill`;
CREATE TABLE `PurchaseBill` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `vdate` datetime DEFAULT NULL,
  `totalAmount` decimal(19,2) DEFAULT NULL,
  `totalNum` decimal(19,2) DEFAULT NULL,
  `inputTime` datetime DEFAULT NULL,
  `auditorTime` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `Supplier_id` bigint(20) NOT NULL,
  `auditor_id` bigint(20) DEFAULT NULL,
  `inputUser_id` bigint(20) NOT NULL,
  `buyer_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9BD788C89FE0CD6A` (`buyer_id`),
  KEY `FK9BD788C83FF7A83F` (`auditor_id`),
  KEY `FK9BD788C8A902BD48` (`inputUser_id`),
  KEY `FK9BD788C812C245CF` (`Supplier_id`),
  CONSTRAINT `FK9BD788C812C245CF` FOREIGN KEY (`Supplier_id`) REFERENCES `Supplier` (`id`),
  CONSTRAINT `FK9BD788C83FF7A83F` FOREIGN KEY (`auditor_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `FK9BD788C89FE0CD6A` FOREIGN KEY (`buyer_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `FK9BD788C8A902BD48` FOREIGN KEY (`inputUser_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchasebill
-- ----------------------------
INSERT INTO `PurchaseBill` VALUES ('1', '2014-10-21 00:00:00', '5.00', '3.00', '2014-10-21 23:01:12', null, '0', '1', null, '1', '4');
INSERT INTO `PurchaseBill` VALUES ('2', '2014-10-21 00:00:00', '22.00', '22.00', '2014-10-21 23:01:27', null, '0', '1', null, '1', '4');
INSERT INTO `PurchaseBill` VALUES ('3', '2014-10-21 00:00:00', '4.00', '2.00', '2014-10-21 23:01:39', null, '0', '2', null, '1', '4');

-- ----------------------------
-- Table structure for `PurchaseBillItem`
-- ----------------------------
DROP TABLE IF EXISTS `PurchaseBillItem`;
CREATE TABLE `PurchaseBillItem` (
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
-- Records of PurchaseBillItem
-- ----------------------------
INSERT INTO `PurchaseBillItem` VALUES ('1', '1.00', '1.00', '1.00', '1', '1', '1');
INSERT INTO `PurchaseBillItem` VALUES ('2', '2.00', '2.00', '4.00', '', '2', '1');
INSERT INTO `PurchaseBillItem` VALUES ('3', '1.00', '11.00', '11.00', '', '1', '2');
INSERT INTO `PurchaseBillItem` VALUES ('4', '1.00', '11.00', '11.00', '', '1', '2');
INSERT INTO `PurchaseBillItem` VALUES ('5', '2.00', '2.00', '4.00', '', '2', '3');

-- ----------------------------
-- Table structure for `Resource`
-- ----------------------------
DROP TABLE IF EXISTS `Resource`;
CREATE TABLE `Resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `method` varchar(255) DEFAULT NULL,
  `descs` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Resource
-- ----------------------------
INSERT INTO `Resource` VALUES ('1', '资源管理', 'cd.itcast.pss.web.ResourceAction.ALL', '资源管理,cd.itcast.pss.web.ResourceAction.ALL');
INSERT INTO `Resource` VALUES ('2', '角色管理', 'cd.itcast.pss.web.RoleAction.ALL', '角色管理,cd.itcast.pss.web.RoleAction.ALL');
INSERT INTO `Resource` VALUES ('3', '角色列表', 'cd.itcast.pss.web.RoleAction.execute', '角色列表,cd.itcast.pss.web.RoleAction.execute');

-- ----------------------------
-- Table structure for `Role`
-- ----------------------------
DROP TABLE IF EXISTS `Role`;
CREATE TABLE `Role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Role
-- ----------------------------
INSERT INTO `Role` VALUES ('1', '超级管理员');
INSERT INTO `Role` VALUES ('2', '角色管理员');

-- ----------------------------
-- Table structure for `RoleMenu`
-- ----------------------------
DROP TABLE IF EXISTS `RoleMenu`;
CREATE TABLE `RoleMenu` (
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
INSERT INTO `RoleMenu` VALUES ('1', '1');
INSERT INTO `RoleMenu` VALUES ('2', '1');
INSERT INTO `RoleMenu` VALUES ('1', '2');
INSERT INTO `RoleMenu` VALUES ('2', '2');
INSERT INTO `RoleMenu` VALUES ('1', '3');
INSERT INTO `RoleMenu` VALUES ('1', '4');
INSERT INTO `RoleMenu` VALUES ('1', '5');
INSERT INTO `RoleMenu` VALUES ('1', '6');
INSERT INTO `RoleMenu` VALUES ('1', '7');
INSERT INTO `RoleMenu` VALUES ('1', '8');
INSERT INTO `RoleMenu` VALUES ('1', '9');
INSERT INTO `RoleMenu` VALUES ('1', '10');
INSERT INTO `RoleMenu` VALUES ('1', '11');
INSERT INTO `RoleMenu` VALUES ('1', '12');
INSERT INTO `RoleMenu` VALUES ('1', '13');
INSERT INTO `RoleMenu` VALUES ('1', '14');
INSERT INTO `RoleMenu` VALUES ('1', '15');
INSERT INTO `RoleMenu` VALUES ('1', '16');

-- ----------------------------
-- Table structure for `RoleResource`
-- ----------------------------
DROP TABLE IF EXISTS `RoleResource`;
CREATE TABLE `RoleResource` (
  `role_id` bigint(20) NOT NULL,
  `resource_id` bigint(20) NOT NULL,
  PRIMARY KEY (`role_id`,`resource_id`),
  KEY `FKAEE599B74D26E00F` (`role_id`),
  KEY `FKAEE599B7C854068F` (`resource_id`),
  CONSTRAINT `FKAEE599B7C854068F` FOREIGN KEY (`resource_id`) REFERENCES `resource` (`id`),
  CONSTRAINT `FKAEE599B74D26E00F` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of RoleResource
-- ----------------------------
INSERT INTO `RoleResource` VALUES ('1', '1');
INSERT INTO `RoleResource` VALUES ('1', '2');
INSERT INTO `RoleResource` VALUES ('1', '3');
INSERT INTO `RoleResource` VALUES ('2', '2');

-- ----------------------------
-- Table structure for `StockIncomeBill`
-- ----------------------------
DROP TABLE IF EXISTS `StockIncomeBill`;
CREATE TABLE `StockIncomeBill` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `vdate` datetime DEFAULT NULL,
  `totalAmount` decimal(19,2) DEFAULT NULL,
  `totalNum` decimal(19,2) DEFAULT NULL,
  `inputTime` datetime DEFAULT NULL,
  `auditorTime` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `Supplier_id` bigint(20) NOT NULL,
  `auditor_id` bigint(20) DEFAULT NULL,
  `inputUser_id` bigint(20) NOT NULL,
  `keeper_id` bigint(20) NOT NULL,
  `Depot_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK54AC64E69F064DC5` (`Depot_id`),
  KEY `FK54AC64E63FF7A83F` (`auditor_id`),
  KEY `FK54AC64E6A902BD48` (`inputUser_id`),
  KEY `FK54AC64E6725F67CB` (`keeper_id`),
  KEY `FK54AC64E612C245CF` (`Supplier_id`),
  CONSTRAINT `FK54AC64E612C245CF` FOREIGN KEY (`Supplier_id`) REFERENCES `Supplier` (`id`),
  CONSTRAINT `FK54AC64E63FF7A83F` FOREIGN KEY (`auditor_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `FK54AC64E6725F67CB` FOREIGN KEY (`keeper_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `FK54AC64E69F064DC5` FOREIGN KEY (`Depot_id`) REFERENCES `Depot` (`id`),
  CONSTRAINT `FK54AC64E6A902BD48` FOREIGN KEY (`inputUser_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of StockIncomeBill
-- ----------------------------

-- ----------------------------
-- Table structure for `StockIncomeBillItem`
-- ----------------------------
DROP TABLE IF EXISTS `StockIncomeBillItem`;
CREATE TABLE `StockIncomeBillItem` (
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
  CONSTRAINT `FKACA671192B5E3024` FOREIGN KEY (`bill_id`) REFERENCES `StockIncomeBill` (`id`),
  CONSTRAINT `FKACA67119D6A81925` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of StockIncomeBillItem
-- ----------------------------

-- ----------------------------
-- Table structure for `Supplier`
-- ----------------------------
DROP TABLE IF EXISTS `Supplier`;
CREATE TABLE `Supplier` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Supplier
-- ----------------------------
INSERT INTO `Supplier` VALUES ('1', '北京供应商');
INSERT INTO `Supplier` VALUES ('2', '成都供应商');

-- ----------------------------
-- Table structure for `SystemDictionaryDetail`
-- ----------------------------
DROP TABLE IF EXISTS `SystemDictionaryDetail`;
CREATE TABLE `SystemDictionaryDetail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `types_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK81BC50F6718C93B5` (`types_id`),
  CONSTRAINT `FK81BC50F6718C93B5` FOREIGN KEY (`types_id`) REFERENCES `SystemDictionaryType` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of SystemDictionaryDetail
-- ----------------------------
INSERT INTO `SystemDictionaryDetail` VALUES ('1', '七匹狼', '1');
INSERT INTO `SystemDictionaryDetail` VALUES ('2', '耐克', '1');
INSERT INTO `SystemDictionaryDetail` VALUES ('3', '条', '2');
INSERT INTO `SystemDictionaryDetail` VALUES ('4', '斤', '2');

-- ----------------------------
-- Table structure for `SystemDictionaryType`
-- ----------------------------
DROP TABLE IF EXISTS `SystemDictionaryType`;
CREATE TABLE `SystemDictionaryType` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sn` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sn` (`sn`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of SystemDictionaryType
-- ----------------------------
INSERT INTO `SystemDictionaryType` VALUES ('1', 'productBrand', '产品品牌');
INSERT INTO `SystemDictionaryType` VALUES ('2', 'productUnit', '产品单位');
