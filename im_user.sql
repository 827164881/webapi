/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.25 : Database - improgram
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `im_user` */

DROP TABLE IF EXISTS `im_user`;

CREATE TABLE `im_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `status` int(11) DEFAULT NULL COMMENT '1未激活 2激活',
  `nickname` varchar(20) DEFAULT NULL COMMENT '昵称',
  `head_img` varchar(500) DEFAULT NULL COMMENT '头像',
  `openid` varchar(100) DEFAULT NULL COMMENT '微信openid',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `mail` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `sex` int(11) DEFAULT NULL COMMENT '性别0:未知 1:男 2:女',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `province_id` int(11) DEFAULT NULL COMMENT '省id',
  `city_id` int(11) DEFAULT NULL COMMENT '市id',
  `county_id` int(11) DEFAULT NULL COMMENT '区id',
  `wechat` varchar(20) DEFAULT NULL COMMENT '微信号',
  `login_time` datetime DEFAULT NULL COMMENT '登陆时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `os` int(11) DEFAULT NULL COMMENT '手机系统 0：安卓 1：ios',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `im_user` */

insert  into `im_user`(`id`,`status`,`nickname`,`head_img`,`openid`,`phone`,`mail`,`sex`,`birthday`,`province_id`,`city_id`,`county_id`,`wechat`,`login_time`,`update_time`,`create_time`,`os`) values (1,0,'Monkey.G','/js/userfiles/fileupload/202004/1247715298052247554.jpg','12dadadadas','18888131359','',NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL),(4,0,'Monkey.G','/users/headers/202004081220434101247720642605563906.jpg','fsdfs465481','18888131359','',NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL),(5,0,'Monkey.G','/js/userfiles/fileupload/202004/1247719641039048706.jpg','fsdfs465481','18888131359','',NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL),(6,0,'Monkey.G','/js/userfiles/fileupload/202004/1247720642605563906.jpg','fsdfs465481','18888131359','',NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL),(7,0,'Monkey.G','/js/userfiles/fileupload/202004/1247722634286874626.jpg','fsdfs465481','18888131359','',NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL),(11,0,'Monkey.G','/js/userfiles/fileupload/202004/1247727104727633921.jpg','fsdfs465481','18888131359','',NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL),(12,0,'Monkey.G','/js/userfiles/fileupload/202004/1247727414439235586.jpg','fsdfs465481','18888131359','',NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL),(13,0,'Monkey.G','/js/userfiles/fileupload/202004/1247727809932742658.jpg','fsdfs465481','18888131359','',NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL),(14,0,'Monkey.G','\\users\\headers/202004081133129611247729130190589954.jpg','fsdfs465481','18888131359','',NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL),(15,0,'Monkey.G','/users/headers/202004081143113551247731679840231426.jpg','fsdfs465481','18888131359','',NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
