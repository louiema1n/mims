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
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `review` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rname` varchar(255) NOT NULL COMMENT '评审名称',
  `reviewstd` varchar(2000) DEFAULT NULL COMMENT '评审标准',
  `requiredA` varchar(2000) DEFAULT NULL COMMENT '评审要求A',
  `requiredB` varchar(2000) DEFAULT NULL COMMENT '评审要求B',
  `requiredC` varchar(2000) DEFAULT NULL COMMENT '评审要求C',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  `eg` varchar(2000) DEFAULT NULL COMMENT '参考资料',
  `stdid` int(11) DEFAULT NULL COMMENT '自查标准',
  PRIMARY KEY (`rid`),
  KEY `secareview_standard_stdid_fk` (`stdid`),
  CONSTRAINT `secareview_standard_stdid_fk` FOREIGN KEY (`stdid`) REFERENCES `standard` (`stdid`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COMMENT='评审细则';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES (1,'病理科设置、布局、设备设施符合《病理科建设与管理指南（试行）》的要求，服务项目满足临床诊疗需要。开展肿瘤手术的医院应具备恶性肿瘤快速病理诊断保障能力。','病理科/室应具有与其功能和任务相适应的服务项目。凡开展肿瘤手术的医院应具备恶性肿瘤快速病理诊断保障能力。（“特殊染色、免疫组化”可选）','符合“B”，并<br>\n病理科/室集中设置，统一管理。','符合“C”，并<br>对医院尚不能提供的部分病理学诊断服务项目可与有资质的三甲医院签订委托服务协议，有明确的委托服务形式与质量保障条款。','1.病理科/室设置满足医院功能任务需要。<br>\n2.服务项目满足临床工作需求，至少开展石蜡切片、术中快速冰冻切片、细胞学诊断、特殊染色（可选）、免疫组织化学染色（可选）。<br> \n3.所有病理收费服务项目符合现行的国家法律法规及卫生行政部门规章、标准的要求。',1,'<a href=\"2018/01/12/aa9d0695-fafe-4d5e-9f27-7e77fd11d3ff.pdf\" target=\"_blank\"><i class=\"layui-icon\"> </i>病理科的功能及任务.pdf</a>&nbsp;<a href=\"2018/01/12/aa9d0695-fafe-4d5e-9f27-7e77fd11d3ff.pdf\"><i class=\"layui-icon\" style=\"font-weight: bold; color: #1E9FFF;\"> </i></a><br>',1),(2,'病理科设置、布局、设备设施符合《病理科建设与管理指南（试行）》的要求，服务项目满足临床诊疗需要。开展肿瘤手术的医院应具备恶性肿瘤快速病理诊断保障能力。','病理科/室应具有与其功能和任务相适应的工作场所。','符合“B”，并<br>\n环境达到安全防护标准。','符合“C”，并<br>病理科用房面积满足工作需要。','1.病理科/室布局合理，符合生物安全的要求，污染区、半污染区和清洁区划分明确，有缓冲区，有严格的消毒及核查制度。<br>\n2.标本接收室、取材室，有紫外线灯等消毒设备。',1,'',1),(3,'病理科设置、布局、设备设施符合《病理科建设与管理指南（试行）》的要求，服务项目满足临床诊疗需要。开展肿瘤手术的医院应具备恶性肿瘤快速病理诊断保障能力。','病理科有必需的专业技术设备。','符合“B”，并 <br>\r\n全部符合要求。','符合“C”，并 <br>\r\n以上设备缺少 1 项。','病理技术室专业技术设备配置：<br> \r\n（1）石蜡切片机、冰冻切片机或快速石蜡设备、自动脱水机、组织包埋机、通风橱、染色设备、冰箱、一次性刀片或磨刀机、涂片机、恒温箱、烘烤箱或烤片设备、空调和排风设备等。 <br> \r\n（2）病理科医师每人配备双目光学显微镜1台。 <br> \r\n（3）标本存放室：专用标本存放柜。<br> \r\n',1,'111',1);
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
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
