-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: mims_dev
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `itemid` int(11) NOT NULL AUTO_INCREMENT,
  `itemname` varchar(255) NOT NULL COMMENT '事项名称',
  `leader` varchar(255) DEFAULT NULL COMMENT '负责人',
  `assistant` varchar(255) DEFAULT NULL COMMENT '协助人',
  `str` date DEFAULT NULL COMMENT '开始时间',
  `ed` date DEFAULT NULL COMMENT '完成时间',
  `pre` date DEFAULT NULL COMMENT '预计结束时间',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `remark` varchar(20000) DEFAULT NULL COMMENT '完成情况说明',
  `prjid` int(11) DEFAULT NULL COMMENT '项目id',
  PRIMARY KEY (`itemid`),
  KEY `item_project_prjid_fk` (`prjid`),
  CONSTRAINT `item_project_prjid_fk` FOREIGN KEY (`prjid`) REFERENCES `project` (`prjid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='事项';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (11,'测试2下2','刘庆','刘庆 李博 ','2018-01-01',NULL,'2018-01-05',2,'12',NULL),(12,'今日事项测试','庞敏','刘庆 ','2018-01-02',NULL,'2018-01-02',1,'赛',NULL),(13,'现场沟通仪器设备','LM','刘庆 李博 庞敏 付正乾 杨忠喜 ','2018-01-01','2018-01-02','2018-02-01',0,'完成测试222',1),(14,'32','LM','刘庆 李博 ','2018-01-02',NULL,'2018-01-02',0,NULL,NULL),(15,'34','LM','刘庆 ','2018-01-13',NULL,'2018-01-13',0,'',NULL);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-26 17:33:43
