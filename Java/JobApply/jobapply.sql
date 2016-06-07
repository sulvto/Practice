/*
Navicat MariaDB Data Transfer

Source Server         : localhost_3306
Source Server Version : 50547
Source Host           : localhost:3306
Source Database       : jobapply

Target Server Type    : MariaDB
Target Server Version : 50547
File Encoding         : 65001

Date: 2016-06-07 02:09:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for City
-- ----------------------------
DROP TABLE IF EXISTS `City`;
CREATE TABLE `City` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of City
-- ----------------------------
INSERT INTO `City` VALUES ('2', '成都');
INSERT INTO `City` VALUES ('3', '北京');
INSERT INTO `City` VALUES ('4', '上海');

-- ----------------------------
-- Table structure for Company
-- ----------------------------
DROP TABLE IF EXISTS `Company`;
CREATE TABLE `Company` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `companyType_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9BDFD45DB3FC72AB` (`companyType_id`),
  CONSTRAINT `FK9BDFD45DB3FC72AB` FOREIGN KEY (`companyType_id`) REFERENCES `CompanyType` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Company
-- ----------------------------
INSERT INTO `Company` VALUES ('1', '易维帮助台', '1');
INSERT INTO `Company` VALUES ('2', '文轩在线', '3');
INSERT INTO `Company` VALUES ('3', '融泰', '4');
INSERT INTO `Company` VALUES ('4', '耕牛科技', '6');
INSERT INTO `Company` VALUES ('5', '圣仁康', '1');

-- ----------------------------
-- Table structure for CompanyType
-- ----------------------------
DROP TABLE IF EXISTS `CompanyType`;
CREATE TABLE `CompanyType` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of CompanyType
-- ----------------------------
INSERT INTO `CompanyType` VALUES ('1', '移动互联网');
INSERT INTO `CompanyType` VALUES ('2', '移动互联网,企业服务');
INSERT INTO `CompanyType` VALUES ('3', '电子商务');
INSERT INTO `CompanyType` VALUES ('4', '其他');
INSERT INTO `CompanyType` VALUES ('6', '企业服务');

-- ----------------------------
-- Table structure for JobApply
-- ----------------------------
DROP TABLE IF EXISTS `JobApply`;
CREATE TABLE `JobApply` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` longtext,
  `city_id` bigint(20) DEFAULT NULL,
  `trade_id` bigint(20) DEFAULT NULL,
  `company_id` bigint(20) DEFAULT NULL,
  `salaryLevel_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKA1EE29D1604D2C2B` (`trade_id`),
  KEY `FKA1EE29D157AB314B` (`company_id`),
  KEY `FKA1EE29D13FF6AEC9` (`city_id`),
  KEY `FKA1EE29D11332738B` (`salaryLevel_id`),
  CONSTRAINT `FKA1EE29D11332738B` FOREIGN KEY (`salaryLevel_id`) REFERENCES `SalaryLevel` (`id`),
  CONSTRAINT `FKA1EE29D13FF6AEC9` FOREIGN KEY (`city_id`) REFERENCES `City` (`id`),
  CONSTRAINT `FKA1EE29D157AB314B` FOREIGN KEY (`company_id`) REFERENCES `Company` (`id`),
  CONSTRAINT `FKA1EE29D1604D2C2B` FOREIGN KEY (`trade_id`) REFERENCES `Trade` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of JobApply
-- ----------------------------
INSERT INTO `JobApply` VALUES ('1', 'Java', '职责：\r\n\r\n1，移动互联网服务端开发\r\n\r\n2，企业级应用软件产品开发和项目开发\r\n\r\n \r\n\r\n要求：\r\n\r\n1. JAVA基础扎实，理解io、多线程、集合等基础框架，对JVM原理有一定的了解； \r\n\r\n2. 3年及以上使用JAVA开发的经验；\r\n\r\n3. 熟悉分布式系统的设计和应用，熟悉分布式、缓存、消息等机制；能对分布式常用技术进行合理应用，解决问题； \r\n\r\n4. 掌握多线程及高性能的设计与编码及性能调优；有高并发应用开发经验； \r\n\r\n5. 掌握Linux 操作系统和大型数据库（Oracle、MySql）；对sql优化有丰富的经验； \r\n\r\n6. 学习能力强，适应能力好；具备耐心/细心的品质； \r\n\r\n7. 喜欢去看及尝试最新的技术，追求编写优雅的代码，从技术趋势和思路上能影响技术团队;\r\n\r\n8.有知名互联网公司经验优先。\r\n\r\n \r\n\r\n \r\n\r\n午餐补贴，零食水果随便吃，季度旅游一年四次~！\r\n弹性工作制，周末双休，交通方便，就在地铁口~！\r\n管理人性化，团队氛围好~!', '2', '1', '1', '1');
INSERT INTO `JobApply` VALUES ('2', 'PHP工程师', '职位描述\r\n\r\n1.深入参与SAAS产品的设计、开发、测试等工作。\r\n\r\n2.完善、优化现有SAAS产品。\r\n\r\n\r\n\r\n任职要求:\r\n\r\n精通ThinkPHP框架，熟悉ajax、html5及css，有4年以上开发经验。\r\n\r\n有企业信息化、ERP、电商等行业研发经验者优先。', '2', '4', '4', '2');
INSERT INTO `JobApply` VALUES ('3', 'Android', '岗位职责：\r\n\r\n1、从事Android平台软件的研发工作；\r\n\r\n2、能够独立完成Android软件的模块设计、编码、联调、维护等各阶段的开发任务；\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n岗位要求：\r\n\r\n1、基础扎实，熟悉常用数据结构与算法，精通java；\r\n2、1年以上的手机客户端开发经验；\r\n3、责任心强，并乐于学习新技术；熟悉移动终端特性和开发特点；熟悉移动终端网络编程相关知识者优先；\r\n4、备良好的职业素养和团队协作精神，以及较强的学习能力，承担独立规划、开发的任务；\r\n5、有架构设计经验者和产品适配优先。', '2', '3', '5', '4');
INSERT INTO `JobApply` VALUES ('4', 'Java', '岗位职责：\r\n\r\n1、承担软件项目的分析、设计工作； \r\n2、负责核心模块、接口实现； \r\n3、解决开发和运维中遇到的关键技术问题\r\n4、利用新技术优化业务流程 \r\n5、负责SOA实施、公共基础服务开发\r\n6、基础框架开发、中间件引入\r\n\r\n岗位要求：\r\n\r\n1、三年及以上Java开发经验，热爱开发工作；\r\n2、JAVA基础扎实，熟悉io、多线程、集合等基础框架，熟悉分布式、缓存、消息等机制； \r\n3、熟悉常用的开源框架及中间件，如Spring生态圈、Apache生态圈、dubbo等工作原理；\r\n4、熟练使用MySQL、Oracle等数据库，了解常用的数据库优化；熟练使用Tomcat、Apache、Resin等容器；\r\n5、具有良好的编码规范，对自己的编码质量有严格的要求；\r\n6、热衷于技术，良好的沟通表达能力，懂得如何为团队做出自己的贡献，并能承担一定的工作压力\r\n\r\n7、热爱学习，会主动思考，能主动去技术论坛学习东西\r\n\r\n \r\n\r\n福利待遇 \r\n双休+朝九晚五+五险一金+有竞争力的薪资+完善的培训体系+宽广的晋升空间+其他（工作餐、节日福利、生日福利、年度体检等等）\r\n\r\n文轩网技术团队博客：http://developers.winxuan.com/\r\n\r\n公司目前使用技术：\r\n\r\njava;j2ee;soa;restfull;dubbo;dubbox;seajs;cmd;amd;docker;spring;springboot;springcloud;springcache;hibernate;zookper;spider;cms;rmi;html5;javascript;angularjs;springmvc;netfilx;quartzcss;bootstrap', '2', '1', '2', '3');

-- ----------------------------
-- Table structure for SalaryLevel
-- ----------------------------
DROP TABLE IF EXISTS `SalaryLevel`;
CREATE TABLE `SalaryLevel` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of SalaryLevel
-- ----------------------------
INSERT INTO `SalaryLevel` VALUES ('1', '9k-18k');
INSERT INTO `SalaryLevel` VALUES ('2', '8k-15k');
INSERT INTO `SalaryLevel` VALUES ('3', '8k-12k');
INSERT INTO `SalaryLevel` VALUES ('4', '8k-16k');
INSERT INTO `SalaryLevel` VALUES ('5', '9k-12k');

-- ----------------------------
-- Table structure for Trade
-- ----------------------------
DROP TABLE IF EXISTS `Trade`;
CREATE TABLE `Trade` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Trade
-- ----------------------------
INSERT INTO `Trade` VALUES ('1', 'Java');
INSERT INTO `Trade` VALUES ('3', 'Android');
INSERT INTO `Trade` VALUES ('4', 'PHP');
INSERT INTO `Trade` VALUES ('5', '教育');
INSERT INTO `Trade` VALUES ('6', '计算机');