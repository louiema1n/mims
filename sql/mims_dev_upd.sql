-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: mims_dev
-- ------------------------------------------------------
-- Server version	5.7.20-log

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
-- Table structure for table `upd`
--

DROP TABLE IF EXISTS `upd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `upd` (
  `updid` int(11) NOT NULL AUTO_INCREMENT,
  `updname` varchar(255) NOT NULL COMMENT '更新名称',
  `upddate` date DEFAULT NULL COMMENT '更新时间',
  `solution` varchar(10000) DEFAULT NULL COMMENT '解决办法',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `ver` varchar(255) DEFAULT NULL COMMENT '版本号',
  PRIMARY KEY (`updid`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COMMENT='更新日志';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `upd`
--

LOCK TABLES `upd` WRITE;
/*!40000 ALTER TABLE `upd` DISABLE KEYS */;
INSERT INTO `upd` VALUES (1,'初始化版本号','2017-12-26','',3,'1.0.0'),(2,'更新日志记录','2017-12-26','',1,'1.0.0'),(3,'解决tab中引入iframe双滚动条问题','2017-12-26','引入css:       \nlayui-body{overflow:hidden; }\n.layui-tab-item{ position: absolute; top: 41px; bottom:0; left: 0; right: 0; padding: 0; margin: 0; -webkit-overflow-scrolling:touch; overflow:auto;}\n.clildFrame.layui-tab-content{ padding-right: 0; }\n.clildFrame.layui-tab-content iframe{ width: 100%; height:100%; border:none; min-width: 320px; position:absolute; }',0,'1.0.0'),(4,'tab中ifram不满屏问题','2017-12-26','.clildFrame.layui-tab-content iframe{ width: 100%; height:100%; border:none; min-width: 320px; position:absolute; }',0,'1.0.0'),(5,'版本号','2017-12-27','',3,'1.0.1'),(6,'文件上传功能','2017-12-27','见utils-FileUtil',1,'1.0.1'),(7,'review参考资料上传文件功能','2017-12-27','addRew',1,'1.0.1'),(8,'更新日志中有“解决办法才显示”','2017-12-27','',0,'1.0.1'),(9,'参考资料多文件上传','2017-12-27','',1,'1.0.1'),(10,'open宽高自适应问题','2017-12-27','设置area : [100%, 100%]；<br>取消layui.layer.full(index);',0,'1.0.1'),(11,'版本号','2017-12-27','',3,'1.0.2'),(12,'首页-待办事项部分功能','2017-12-27','',1,'1.0.2'),(13,'版本号','2017-12-28','',3,'1.0.3'),(14,'事项处理功能','2017-12-28','工作管理-事项处理',1,'1.0.3'),(15,'js代码attr()无效问题','2017-12-29','使用prop()',0,'1.0.3'),(16,'版本号','2017-12-29','',3,'1.0.4'),(17,'事项管理新增功能','2017-12-29','',1,'1.0.4'),(18,'事项管理的修改功能','2017-12-29','',1,'1.0.4'),(19,'事项管理的删除功能','2017-12-29','',0,'1.0.4'),(20,'springboot支持delete/put请求，但接收不了参数','2017-12-29','在url上附带id进行删除等操作',0,'1.0.4'),(21,'版本号','2018-01-01','',3,'1.0.5'),(22,'windows 10 安装MySQL server失败','2018-01-01','vc++ 2013版本错误，见https://support.microsoft.com/en-us/help/3179560/update-for-visual-c-2013-and-visual-c-redistributable-package',0,'1.0.5'),(23,'完成【事项处理】界面数据展示','2018-01-02','',1,'1.0.5'),(24,'index界面版本号联动显示','2018-01-02','',1,'1.0.5'),(25,'在js动态添加的html代码中方法未定义错误','2018-01-02','window.done = function () {}（done为方法名）',0,'1.0.5'),(26,'【今日事项处理】界面的【完成功能】','2018-01-02','',1,'1.0.5'),(27,'在iframe页面弹出层关闭后刷新iframe问题','2018-01-02','location.reload();',0,'1.0.5'),(28,'parent.layer.open获取不到所打开的iframe页面对象','2018-01-02','使用parent.layer.getChildFrame',0,'1.0.5'),(29,'【今日事项处理】界面【延期】功能实现','2018-01-02','',1,'1.0.5'),(30,'全局弹出层中无法仅刷新当前iframe页面问题','2018-01-02','仅在弹出层中关闭自身，在原iframe中使用end:function(){location.reload();}',0,'1.0.5'),(31,'【今日事项处理】界面【关闭】功能实现','2018-01-02','',1,'1.0.5');
/*!40000 ALTER TABLE `upd` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-02 19:52:59
