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
-- Table structure for table `ansrecord`
--

DROP TABLE IF EXISTS `ansrecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ansrecord` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `examid` int(11) NOT NULL COMMENT '题目id',
  `selectans` varchar(255) NOT NULL COMMENT '选择的答案',
  `sign` int(11) DEFAULT NULL COMMENT '标识0-错误；1-正确',
  `anstime` datetime DEFAULT NULL COMMENT '答题时间',
  `anser` varchar(255) NOT NULL COMMENT '答题人',
  `ansid` varchar(255) DEFAULT NULL COMMENT '本次答题guid',
  `remark` varchar(20000) DEFAULT NULL COMMENT '本次答题笔记',
  PRIMARY KEY (`id`),
  KEY `ansrecord_blcjexam_id_fk` (`examid`),
  CONSTRAINT `ansrecord_blcjexam_id_fk` FOREIGN KEY (`examid`) REFERENCES `blcjexam` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8 COMMENT='答题记录表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ansrecord`
--

LOCK TABLES `ansrecord` WRITE;
/*!40000 ALTER TABLE `ansrecord` DISABLE KEYS */;
INSERT INTO `ansrecord` VALUES (1,866,'B',1,'2018-01-26 16:31:20','0:0:0:0:0:0:0:1','98890831-b4f7-4356-9395-c47e14a31126',''),(2,1144,'A',0,'2018-01-26 16:32:27','0:0:0:0:0:0:0:1','98890831-b4f7-4356-9395-c47e14a31126',''),(3,2080,'C',0,'2018-01-26 16:36:19','10.5.4.165','c7dadb7c-9b4c-4e86-8ff0-fd411031e922',''),(4,1206,'C',1,'2018-01-26 16:36:25','10.5.4.165','c7dadb7c-9b4c-4e86-8ff0-fd411031e922',''),(5,1206,'C',1,'2018-01-26 16:36:28','10.5.4.165','c7dadb7c-9b4c-4e86-8ff0-fd411031e922',''),(6,1206,'C',1,'2018-01-26 16:36:28','10.5.4.165','c7dadb7c-9b4c-4e86-8ff0-fd411031e922',''),(7,643,'D',0,'2018-01-26 16:36:32','10.5.4.165','c7dadb7c-9b4c-4e86-8ff0-fd411031e922',''),(8,1165,'C',0,'2018-01-26 16:48:56','0:0:0:0:0:0:0:1','3b28e443-fcf4-4fd9-ba50-5402ce814359',''),(9,537,'B',1,'2018-01-26 16:51:11','0:0:0:0:0:0:0:1','d2a2920d-ed37-45df-be78-95d7c9a77805',''),(10,302,'C',0,'2018-01-26 16:51:33','0:0:0:0:0:0:0:1','d2a2920d-ed37-45df-be78-95d7c9a77805',''),(11,39,'B',1,'2018-01-26 16:52:20','0:0:0:0:0:0:0:1','9c7fc211-e5d1-4245-8d76-8f84d0f617ba',''),(12,168,'C',0,'2018-01-26 16:52:25','0:0:0:0:0:0:0:1','379546f8-8abb-4934-ba4a-335466cda042',''),(13,1837,'A',0,'2018-01-26 16:52:41','0:0:0:0:0:0:0:1','897f8cd1-a873-4d7e-88ab-38520461ef95',''),(14,870,'D',0,'2018-01-26 16:52:56','0:0:0:0:0:0:0:1','c7636b1b-393f-45b2-8f49-56c2b9936238',''),(15,1182,'B',0,'2018-01-26 16:53:11','0:0:0:0:0:0:0:1','c54936bf-7675-486f-b5b8-b6bd222448b8',''),(16,589,'C',1,'2018-01-26 16:53:24','0:0:0:0:0:0:0:1','05e0f10d-685e-4919-9a08-d8e7d3050705',''),(17,1231,'D',0,'2018-01-26 16:55:57','0:0:0:0:0:0:0:1','de3815ef-59d0-4110-85da-b33fb3e5df55',''),(18,202,'A',0,'2018-01-26 16:57:45','0:0:0:0:0:0:0:1','9cbb56f4-a90f-44d1-b402-6e07f7a5915d',''),(19,1939,'B',0,'2018-01-26 16:58:34','0:0:0:0:0:0:0:1','8f700e36-f082-4d46-a58c-6d1a46c9e60c',''),(20,660,'B',1,'2018-01-26 17:00:01','0:0:0:0:0:0:0:1','2dd45588-d27c-4338-9918-93146d742c7f',''),(21,703,'C',0,'2018-01-26 17:01:46','0:0:0:0:0:0:0:1','9a427ffe-535b-401d-9be0-a871349b6475',''),(22,1173,'C',0,'2018-01-26 17:01:56','0:0:0:0:0:0:0:1','9a427ffe-535b-401d-9be0-a871349b6475',''),(23,966,'B',1,'2018-01-26 17:02:21','0:0:0:0:0:0:0:1','0a572dac-2874-4d7a-8ef1-c9f7df97b71b',''),(24,451,'B',0,'2018-01-26 17:02:53','0:0:0:0:0:0:0:1','cc4f7cdf-8142-4bf8-b253-850532e04df4',''),(25,350,'D',1,'2018-01-26 17:03:06','0:0:0:0:0:0:0:1','cc4f7cdf-8142-4bf8-b253-850532e04df4',''),(26,1258,'B',0,'2018-01-26 17:04:00','0:0:0:0:0:0:0:1','95c21981-e407-435b-b8f0-147d18d66541',''),(27,225,'B',0,'2018-01-26 17:04:30','0:0:0:0:0:0:0:1','e26a2ae9-7aa7-4e09-8446-e7b7faa64f1f',''),(28,225,'B',0,'2018-01-26 17:04:38','0:0:0:0:0:0:0:1','e26a2ae9-7aa7-4e09-8446-e7b7faa64f1f',''),(29,225,'B',0,'2018-01-26 17:04:39','0:0:0:0:0:0:0:1','e26a2ae9-7aa7-4e09-8446-e7b7faa64f1f',''),(30,225,'B',0,'2018-01-26 17:04:41','0:0:0:0:0:0:0:1','e26a2ae9-7aa7-4e09-8446-e7b7faa64f1f',''),(31,225,'B',0,'2018-01-26 17:04:48','0:0:0:0:0:0:0:1','e26a2ae9-7aa7-4e09-8446-e7b7faa64f1f',''),(32,1934,'B',0,'2018-01-26 17:05:06','0:0:0:0:0:0:0:1','f7395d16-36ac-4058-83d4-8609d2aba9c1',''),(33,2004,'B',0,'2018-01-26 17:05:36','0:0:0:0:0:0:0:1','301df9da-3e6f-4e01-86c6-78fbac48a484',''),(34,1348,'B',0,'2018-01-26 17:05:48','0:0:0:0:0:0:0:1','301df9da-3e6f-4e01-86c6-78fbac48a484',''),(35,2070,'B',0,'2018-01-26 17:06:16','0:0:0:0:0:0:0:1','192238bf-cd61-4b2a-a22c-3515c517b545',''),(36,1705,'C',1,'2018-01-26 17:06:19','0:0:0:0:0:0:0:1','192238bf-cd61-4b2a-a22c-3515c517b545',''),(37,1627,'B',0,'2018-01-26 17:06:22','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(38,2056,'C',0,'2018-01-26 17:06:25','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(39,841,'D',0,'2018-01-26 17:06:33','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(40,1587,'C',0,'2018-01-26 17:06:50','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(41,876,'D',0,'2018-01-26 17:06:58','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(42,270,'C',1,'2018-01-26 17:07:00','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(43,1020,'D',0,'2018-01-26 17:07:11','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(44,1694,'C',0,'2018-01-26 17:07:15','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(45,757,'C',0,'2018-01-26 17:07:17','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(46,1870,'C',0,'2018-01-26 17:07:19','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(47,1587,'B',1,'2018-01-26 17:07:20','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(48,885,'C',0,'2018-01-26 17:07:30','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(49,2071,'B',1,'2018-01-26 17:07:33','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(50,1811,'D',0,'2018-01-26 17:08:39','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(51,1728,'B',0,'2018-01-26 17:08:42','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(52,822,'B',0,'2018-01-26 17:08:45','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(53,189,'C',0,'2018-01-26 17:08:54','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(54,856,'B',1,'2018-01-26 17:08:58','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(55,1906,'C',0,'2018-01-26 17:09:13','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(56,1787,'C',0,'2018-01-26 17:10:17','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(57,64,'B',0,'2018-01-26 17:10:19','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(58,1471,'C',0,'2018-01-26 17:10:21','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(59,197,'D',1,'2018-01-26 17:10:23','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(60,1181,'C',0,'2018-01-26 17:10:26','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(61,1955,'C',0,'2018-01-26 17:10:28','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(62,469,'D',0,'2018-01-26 17:10:30','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(63,1738,'D',0,'2018-01-26 17:10:32','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(64,1626,'E',0,'2018-01-26 17:10:34','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(65,1584,'A',0,'2018-01-26 17:10:36','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(66,91,'D',0,'2018-01-26 17:10:38','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(67,1387,'C',0,'2018-01-26 17:10:41','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(68,738,'C',0,'2018-01-26 17:10:43','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(69,418,'D',0,'2018-01-26 17:10:45','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(70,1853,'A',0,'2018-01-26 17:10:48','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(71,124,'B',0,'2018-01-26 17:10:50','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(72,760,'D',1,'2018-01-26 17:10:53','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(73,2107,'C',0,'2018-01-26 17:10:58','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(74,2094,'B',1,'2018-01-26 17:11:33','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(75,247,'D',0,'2018-01-26 17:11:38','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(76,960,'C',0,'2018-01-26 17:11:40','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(77,1395,'D',0,'2018-01-26 17:11:42','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(78,1491,'C',0,'2018-01-26 17:11:44','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(79,1291,'D',0,'2018-01-26 17:11:47','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(80,755,'C',0,'2018-01-26 17:11:49','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76',''),(81,442,'C',1,'2018-01-26 17:12:57','0:0:0:0:0:0:0:1','ec4ea5f5-99f7-4e99-8879-aa85961e4c76','');
/*!40000 ALTER TABLE `ansrecord` ENABLE KEYS */;
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