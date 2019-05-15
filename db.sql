-- --------------------------------------------------------
-- Сервер:                       127.0.0.1
-- Версія сервера:               5.5.46-log - MySQL Community Server (GPL)
-- ОС сервера:                   Win64
-- HeidiSQL Версія:              9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for catalog
CREATE DATABASE IF NOT EXISTS `catalog` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `catalog`;

-- Dumping structure for таблиця catalog.phones
CREATE TABLE IF NOT EXISTS `phones` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `user_id` int(5) DEFAULT NULL,
  `phone_number` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `phones_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- Dumping data for table catalog.phones: ~11 rows (приблизно)
/*!40000 ALTER TABLE `phones` DISABLE KEYS */;
INSERT INTO `phones` (`id`, `user_id`, `phone_number`) VALUES
	(1, 1, '748484959'),
	(2, 2, '86868'),
	(3, 3, '868686'),
	(4, 1, '0955449405'),
	(5, 4, '0954356879'),
	(6, 5, '0954356877'),
	(7, 1, '0955449405'),
	(8, 1, '0777777777'),
	(9, 1, '0777777777'),
	(10, 1, '0991111'),
	(11, 2, '0992222');
/*!40000 ALTER TABLE `phones` ENABLE KEYS */;

-- Dumping structure for таблиця catalog.rooms
CREATE TABLE IF NOT EXISTS `rooms` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `phone_id` int(5) DEFAULT NULL,
  `room_number` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table catalog.rooms: ~3 rows (приблизно)
/*!40000 ALTER TABLE `rooms` DISABLE KEYS */;
INSERT INTO `rooms` (`id`, `phone_id`, `room_number`) VALUES
	(1, 1, 7),
	(2, 2, 8),
	(3, NULL, 9);
/*!40000 ALTER TABLE `rooms` ENABLE KEYS */;

-- Dumping structure for таблиця catalog.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- Dumping data for table catalog.users: ~9 rows (приблизно)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `user_name`) VALUES
	(1, 'Yehor'),
	(2, 'Ihor'),
	(3, 'Dimas'),
	(4, 'Yehor'),
	(5, 'Ihor'),
	(6, 'Dimas'),
	(7, 'misha'),
	(8, 'grisha'),
	(9, 'Petrov');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
