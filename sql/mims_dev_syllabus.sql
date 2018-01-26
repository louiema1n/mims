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
-- Table structure for table `syllabus`
--

DROP TABLE IF EXISTS `syllabus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `syllabus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '知识点名称',
  `content` varchar(15000) DEFAULT NULL COMMENT '知识点内容',
  `creator` varchar(255) DEFAULT NULL COMMENT '创建人',
  `creatdate` date DEFAULT NULL COMMENT '创建时间',
  `req` int(11) DEFAULT NULL COMMENT '要求',
  `subject` varchar(255) DEFAULT NULL COMMENT '科目',
  `chapter` varchar(255) DEFAULT NULL COMMENT '章节',
  `unit` varchar(255) DEFAULT NULL COMMENT '单元',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='大纲';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `syllabus`
--

LOCK TABLES `syllabus` WRITE;
/*!40000 ALTER TABLE `syllabus` DISABLE KEYS */;
INSERT INTO `syllabus` VALUES (1,'解剖基本术语：矢状面','222走走走走“你好”','系统管理员','2018-01-13',2,'基础知识','人体解剖学','人体解剖学的基本术语2'),(2,'测试一下','<p><img src=\"https://gss3.bdstatic.com/-Po3dSag_xI4khGkpoWK1HF6hhy/baike/crop%3D12%2C118%2C1021%2C674%3Bc0%3Dbaike116%2C5%2C5%2C116%2C38/sign=1125846cae0f4bfb989fc4143e7e4adc/a2cc7cd98d1001e9aa26fffcb20e7bec54e7972f.jpg\"></p>','系统管理员','2018-01-13',2,'基础知识','人体解剖学','人体解剖学的基本术语1'),(3,'细胞病理','<p><b>2343</b></p><p><img src=\"https://gss0.bdstatic.com/-4o3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=7aedf5fa4aed2e73e8e48e7ee668caee/a2cc7cd98d1001e975960e71b80e7bec54e79721.jpg\"></p>','系统管理员','2018-01-13',1,'基础知识','组织学','细胞'),(4,'234','<p><img src=\"https://gss0.bdstatic.com/-4o3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=7aedf5fa4aed2e73e8e48e7ee668caee/a2cc7cd98d1001e975960e71b80e7bec54e79721.jpg\"></p>','系统管理员','2018-01-13',0,'相关专业知识','病原生物学','细菌的形态与结构2'),(5,'34','5','系统管理员','2018-01-13',0,'基础知识','人体解剖学','人体解剖学的基本术语2');
/*!40000 ALTER TABLE `syllabus` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-26 17:33:44
