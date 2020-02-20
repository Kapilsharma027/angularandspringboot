-- Generation time: Tue, 18 Feb 2020 14:19:48 +0000
-- Host: mysql.hostinger.ro
-- DB name: u574849695_23
/*!40030 SET NAMES UTF8 */;
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

DROP TABLE IF EXISTS `authors`;
CREATE TABLE `authors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `last_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `birthdate` date NOT NULL,
  `added` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `authors` VALUES ('1','Andres','Mante','alexzander52@example.com','1986-07-30','1981-12-16 14:39:07'),
('2','Rosella','Langworth','abrekke@example.net','2007-10-24','2015-12-31 12:08:53'),
('3','Katarina','Durgan','laverne06@example.com','1995-07-22','1982-05-18 09:16:45'),
('4','Trisha','Lemke','toney01@example.org','2011-09-06','1980-06-29 04:55:46'),
('5','Camille','Krajcik','reva89@example.org','1974-03-14','1994-07-11 20:55:37'),
('6','Kay','Reynolds','jazmin.leffler@example.net','1971-01-07','1996-05-27 03:13:42'),
('7','Aniyah','Nicolas','minnie07@example.com','1982-10-01','1985-10-24 04:21:19'),
('8','Ottis','Flatley','little.abby@example.com','1972-02-27','2019-04-18 23:31:03'),
('9','Danny','Spinka','gladys23@example.net','2017-06-02','1980-08-14 14:58:17'),
('10','Gianni','Feil','afton.hyatt@example.org','1971-03-13','2006-12-04 02:56:35'),
('11','Tyson','Hoppe','arnold61@example.net','1979-09-21','2011-08-11 21:47:06'),
('12','Eriberto','Armstrong','leatha.larson@example.org','1993-11-12','1970-09-16 07:19:52'),
('13','Darrion','Kutch','glen.emmerich@example.net','1997-02-15','1984-08-25 22:30:54'),
('14','Monserrate','Pacocha','monique06@example.net','1976-02-07','2003-12-28 10:48:08'),
('15','Ardith','Hintz','ohuels@example.org','2017-12-27','2018-11-05 11:16:10'),
('16','Ismael','Strosin','purdy.bert@example.com','1986-06-02','2004-08-31 16:19:26'),
('17','Katlynn','Considine','lionel.waters@example.com','1972-01-10','2005-04-15 12:54:54'),
('18','Kurt','Feest','fluettgen@example.net','1990-11-08','1988-04-13 23:55:39'),
('19','Forrest','Eichmann','enrico.king@example.com','2001-09-26','1993-01-18 20:19:32'),
('20','Horace','Russel','lharber@example.org','1997-09-23','2003-03-09 10:48:51'),
('21','Lindsay','Hauck','hbahringer@example.org','1974-09-07','2019-05-21 08:53:37'),
('22','Judson','Parker','olga43@example.com','1984-09-10','1984-01-02 04:50:08'),
('23','Oceane','Beahan','wallace.haley@example.net','1970-08-17','1974-03-23 03:38:14'),
('24','Wilbert','Zulauf','ashlynn.bauch@example.com','1999-03-10','2006-05-23 02:35:27'),
('25','Gust','Bosco','max17@example.org','1978-11-07','2006-08-23 23:43:55'),
('26','Erica','Schuster','ekulas@example.org','2005-08-23','2000-06-26 10:40:39'),
('27','Diego','Reinger','dhuels@example.net','2014-08-28','1975-01-06 21:57:54'),
('28','Arne','Flatley','mayert.damion@example.org','2011-02-09','1997-10-03 22:25:09'),
('29','Deontae','Weber','art82@example.org','1986-08-30','2016-03-12 03:31:50'),
('30','Alfonso','Smitham','amely79@example.com','1989-03-01','1973-12-17 16:42:58'),
('31','Emiliano','McCullough','ymarks@example.com','1991-10-20','2012-02-18 07:47:32'),
('32','Chris','Lubowitz','german20@example.org','2014-12-09','1971-02-20 09:46:28'),
('33','Pasquale','Ziemann','jaren.sanford@example.com','1995-04-26','2004-04-07 09:21:28'),
('34','Ross','Cormier','joy.leuschke@example.org','2011-04-20','1991-04-18 23:35:28'),
('35','Lois','Hoeger','emard.rick@example.com','2014-01-16','1996-09-10 18:28:26'),
('36','Stacy','Cruickshank','zachariah63@example.org','2013-05-14','2002-01-20 08:54:40'),
('37','Josefina','Lehner','davis.isabel@example.net','2000-09-01','1981-12-01 14:17:44'),
('38','Adelle','Gaylord','funk.narciso@example.com','2020-02-05','1994-09-15 12:01:53'),
('39','Lura','Hand','crawford.treutel@example.net','1990-01-23','1986-07-26 14:35:21'),
('40','Pearl','Walker','trey78@example.com','1990-02-22','2006-10-24 08:34:58'),
('41','Daryl','O\'Kon','gwendolyn.corwin@example.net','1981-05-18','1995-12-10 18:30:53'),
('42','Austyn','Ruecker','ymoen@example.com','1993-04-16','2009-02-02 21:48:13'),
('43','Ebony','Fisher','amir.fadel@example.org','1982-06-23','1997-07-02 22:00:57'),
('44','Ellis','Funk','reanna00@example.org','2000-06-07','2002-10-07 20:05:14'),
('45','Otto','Schultz','elmira56@example.org','1978-10-14','2019-01-01 06:03:58'),
('46','Zack','Kulas','lebsack.elise@example.net','2018-11-14','1999-08-24 00:23:01'),
('47','Bianka','Bogisich','coralie56@example.org','2007-08-29','2003-10-22 17:03:34'),
('48','Buck','Crist','jaylon.russel@example.com','2008-05-05','1992-11-10 23:10:10'),
('49','Laurine','Kling','tanya41@example.com','2016-06-08','2011-03-15 13:31:26'),
('50','Marilie','Carter','juston90@example.net','2004-07-22','1994-09-14 07:00:52'),
('51','Alexandrine','Walker','rempel.ed@example.org','1995-03-11','1977-08-02 06:10:38'),
('52','Zoey','Waters','mauricio34@example.net','1994-09-05','2014-03-13 09:45:02'),
('53','Gardner','Pouros','oolson@example.com','1992-11-30','2002-03-23 00:44:20'),
('54','Laurence','Kub','dorian.hirthe@example.org','2013-11-21','1976-10-20 04:16:24'),
('55','Dahlia','Jacobs','tkoelpin@example.org','1986-09-20','1977-06-13 07:19:33'),
('56','Magnolia','Cole','yklein@example.com','1995-10-23','2006-06-16 21:40:36'),
('57','Lelia','Russel','twhite@example.com','1971-03-19','2001-07-11 07:17:35'),
('58','Muriel','Hayes','kristy.grant@example.net','1995-03-12','1992-02-02 05:51:42'),
('59','Randi','Casper','varmstrong@example.org','2020-02-04','1989-09-20 23:15:37'),
('60','Beaulah','Lesch','xgleason@example.org','2004-08-13','1985-03-04 12:51:22'),
('61','Easter','Mitchell','oran70@example.net','1986-10-24','2019-05-12 08:53:59'),
('62','Jordyn','Grant','murazik.adolph@example.net','2017-05-25','2018-09-10 20:14:59'),
('63','Margaretta','Krajcik','wbode@example.com','2013-10-31','2011-09-24 13:52:38'),
('64','Cary','Abshire','jettie.casper@example.org','2012-02-28','2008-05-09 18:58:13'),
('65','Johathan','Reinger','walter.sydnie@example.net','1985-05-07','2001-10-15 07:44:48'),
('66','Waldo','McDermott','cole37@example.net','2000-05-10','1977-05-01 14:46:09'),
('67','Bartholome','Wisozk','rolando86@example.org','2002-03-06','1976-05-03 00:35:38'),
('68','Tevin','Thompson','ewindler@example.org','1978-03-09','1999-07-19 14:53:14'),
('69','Americo','Hyatt','kankunding@example.org','2016-10-20','2012-08-31 01:24:37'),
('70','Melisa','Osinski','bill.collins@example.com','1976-06-24','1987-06-30 05:59:41'),
('71','Friedrich','Hodkiewicz','joyce.aufderhar@example.com','1985-03-05','1999-05-04 15:12:33'),
('72','Audrey','Feest','finn86@example.com','2005-12-31','2015-10-15 13:56:57'),
('73','Garnet','Kuhic','terry14@example.net','1998-03-01','2007-01-24 00:24:12'),
('74','Norbert','Powlowski','mante.sarah@example.com','2006-03-03','2006-05-05 09:24:28'),
('75','Elvis','Homenick','audreanne.hermiston@example.com','2013-04-02','2007-08-17 16:04:43'),
('76','Sage','Bruen','una.gleichner@example.org','2018-02-12','2019-01-22 15:10:39'),
('77','Logan','Corwin','romaguera.tommie@example.com','1974-02-21','2003-09-29 12:03:31'),
('78','Stone','Doyle','kuhn.jacquelyn@example.net','1997-06-05','2010-12-26 13:15:32'),
('79','Preston','Nitzsche','jean06@example.com','2017-10-31','2009-10-28 01:03:53'),
('80','Leonie','Runte','jacques.haag@example.com','2017-11-09','1998-09-02 23:55:14'),
('81','Ashlynn','Ortiz','gilda.senger@example.org','1989-07-11','1970-06-04 11:58:59'),
('82','Mathew','Sanford','marcella.sanford@example.net','1975-02-14','2020-02-08 02:23:58'),
('83','Tracy','Mitchell','lowe.dessie@example.com','1991-12-05','1974-07-15 15:23:33'),
('84','Joel','Gerlach','blanda.horacio@example.org','2014-08-18','1984-08-08 03:35:18'),
('85','Josiah','Russel','liza.mohr@example.net','2012-02-27','1971-04-26 10:32:34'),
('86','Ayana','Kassulke','bella93@example.org','1972-01-31','1980-03-15 20:54:48'),
('87','Arno','Parisian','imogene76@example.net','1980-07-10','1986-02-24 02:11:56'),
('88','Rodrigo','Walter','orval83@example.org','2000-04-30','2001-08-18 08:50:56'),
('89','Raphaelle','Zboncak','yundt.lydia@example.com','2011-03-16','1977-11-30 00:12:45'),
('90','Cory','Koepp','florencio57@example.net','1977-05-27','2018-02-06 02:25:44'),
('91','Kaycee','Funk','dasia71@example.net','1991-08-14','2008-02-16 17:02:26'),
('92','Dave','Wiza','blick.domenic@example.org','1994-02-28','1979-08-17 10:29:33'),
('93','Stan','Mante','olang@example.org','2011-06-20','1974-04-20 03:40:17'),
('94','Sammie','Oberbrunner','stracke.keyshawn@example.com','1988-06-24','2016-10-22 19:32:01'),
('95','Karine','Stiedemann','may.hickle@example.com','2011-03-23','1979-03-29 01:09:33'),
('96','Lenny','O\'Connell','jacinthe.marvin@example.com','1980-10-18','1990-03-20 06:08:46'),
('97','Imani','Torp','madisyn38@example.org','1999-02-13','1978-12-07 19:33:25'),
('98','Herbert','Pollich','nettie03@example.com','1974-01-21','1996-03-10 00:10:37'),
('99','Clara','Wyman','jedidiah34@example.net','1989-02-10','1979-06-27 22:14:13'),
('100','Nestor','Smith','wiegand.luz@example.org','2009-08-14','1980-06-22 21:20:11'); 




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

