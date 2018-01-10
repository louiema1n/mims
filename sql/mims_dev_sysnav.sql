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
-- Table structure for table `sysnav`
--

DROP TABLE IF EXISTS `sysnav`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sysnav` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '导航名称',
  `icon` varchar(255) NOT NULL COMMENT '导航图标',
  `url` varchar(255) DEFAULT NULL COMMENT '导航url',
  `uplevel` int(11) NOT NULL COMMENT '上次导航id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='系统导航表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sysnav`
--

LOCK TABLES `sysnav` WRITE;
/*!40000 ALTER TABLE `sysnav` DISABLE KEYS */;
INSERT INTO `sysnav` VALUES (2,'工作管理','&#xe63c;','',0),(3,'今日事项处理','&#xe64e;','/itemHandle',2),(4,'事项管理','&#xe64e;','/itemList',2),(5,'项目','&#xe64e;','/prjList',2),(6,'评审细则管理','&#xe64e;','/rewList',2),(7,'自查','&#xe64e;','/sfeList',2),(9,'生活管理','&#xe65e;',NULL,0),(10,'经济管理','&#xe64e;','/ecoList',9),(11,'学习管理','&#xe65e;',NULL,0),(12,'文档管理','&#xe65e;','/docList',11),(13,'系统管理','&#xe65e;',NULL,0),(14,'更新日志','&#xe65e;','/updLog',13),(15,'基础字典管理','&#xe65e;','/dictList',13);
/*!40000 ALTER TABLE `sysnav` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-10 17:10:32
