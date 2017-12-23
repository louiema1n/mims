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
-- Table structure for table `selfexam`
--

DROP TABLE IF EXISTS `selfexam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `selfexam` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(255) NOT NULL COMMENT '自查名称',
  `sdate` date DEFAULT NULL COMMENT '自查日期',
  `pid` int(11) DEFAULT NULL COMMENT '项目id',
  `sarid` int(11) DEFAULT NULL COMMENT '二甲评审id',
  `lv` varchar(1) DEFAULT NULL COMMENT '评审等级',
  `remark` varchar(20000) DEFAULT NULL COMMENT '自查说明',
  PRIMARY KEY (`sid`),
  KEY `selfexam_project_prjid_fk` (`pid`),
  KEY `selfexam_secareview_rid_fk` (`sarid`),
  CONSTRAINT `selfexam_project_prjid_fk` FOREIGN KEY (`pid`) REFERENCES `project` (`prjid`),
  CONSTRAINT `selfexam_secareview_rid_fk` FOREIGN KEY (`sarid`) REFERENCES `secareview` (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='自查';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `selfexam`
--

LOCK TABLES `selfexam` WRITE;
/*!40000 ALTER TABLE `selfexam` DISABLE KEYS */;
INSERT INTO `selfexam` VALUES (1,'省级质量督导','2017-12-15',1,1,'A','C');
/*!40000 ALTER TABLE `selfexam` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-22 17:24:41