CREATE DATABASE  IF NOT EXISTS `simpledemp`;
USE `simpledemp`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `student`
--

INSERT INTO `student` VALUES 
	(1,'Leslie','Andrews','leslie@gmail.com'),
	(2,'Emma','Baumgarten','emma@gmail.com'),
	(3,'Avani','Gupta','avani@gmail.com'),
	(4,'Yuri','Petrov','yuri@gmail.com'),
	(5,'Juan','Vega','juan@gmail.com');




CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `job_title` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `teacher`
--

INSERT INTO `teacher` VALUES 
	(1,'Billy','Andrews','billy@gmail.com','English Teacher'),
	(2,'Sophie ','Baumgarten','sophie@gmail.com','Math Teacher'),
	(3,'Eddy ','Thomas','eddy@gmail.com','PR Teacher'),
	(4,'Krista ','Robinson','kris@gmail.com','Headmistress'),
	(5,'Tom','Oliver','tom@gmail.com','Doctor');
