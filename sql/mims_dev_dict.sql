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
-- Table structure for table `dict`
--

DROP TABLE IF EXISTS `dict`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dict` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '字典名称',
  `content` varchar(255) DEFAULT NULL COMMENT '字典内容',
  `navid` int(11) DEFAULT NULL COMMENT '所属nav',
  PRIMARY KEY (`id`),
  KEY `dict_sysnav_id_fk` (`navid`),
  CONSTRAINT `dict_sysnav_id_fk` FOREIGN KEY (`navid`) REFERENCES `sysnav` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='基础字典管理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dict`
--

LOCK TABLES `dict` WRITE;
/*!40000 ALTER TABLE `dict` DISABLE KEYS */;
INSERT INTO `dict` VALUES (1,'事项类型','[{\"id\":0, \"key\":\"0\", \"value\":\"今日事项\"}, {\"id\":1, \"key\":\"1\", \"value\":\"持续事项\"}, {\"id\":2, \"key\":\"2\", \"value\":\"项目计划\"}]',4),(2,'经济类型','[{\"id\":0, \"key\":\"0\", \"value\":\"支出\"}, {\"id\":1, \"key\":\"1\", \"value\":\"收入\"}, {\"id\":2, \"key\":\"2\", \"value\":\"预支出\"}]',10),(3,'负责人','[{\"id\":0, \"key\":\"0\", \"value\":\"LM\"}, {\"id\":1, \"key\":\"1\", \"value\":\"庞敏\"}, {\"id\":2, \"key\":\"2\", \"value\":\"刘庆\"}, {\"id\":3, \"key\":\"3\", \"value\":\"李博\"}, {\"id\":4, \"key\":\"4\", \"value\":\"付正乾\"}]',4),(4,'协助人','[{\"id\":0, \"key\":\"0\", \"value\":\"刘庆\"}, {\"id\":1, \"key\":\"1\", \"value\":\"李博\"}, {\"id\":2, \"key\":\"2\", \"value\":\"庞敏\"}, {\"id\":3, \"key\":\"3\", \"value\":\"付正乾\"}, {\"id\":4, \"key\":\"4\", \"value\":\"杨忠喜\"}]',4),(6,'经济涉及人','[{\"id\":0, \"key\":\"0\", \"value\":\"LouieMain\"}, {\"id\":1, \"key\":\"1\", \"value\":\"Xtz\"}]',10),(7,'类别','[{\"id\":0, \"key\":\"0\", \"value\":\"工资\"}, {\"id\":1, \"key\":\"1\", \"value\":\"吃饭\"}]',10);
/*!40000 ALTER TABLE `dict` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-26 17:33:45
