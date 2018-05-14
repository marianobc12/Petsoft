-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.24-log - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for veterinaria_bd
CREATE DATABASE IF NOT EXISTS `veterinaria_bd` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `veterinaria_bd`;

-- Dumping structure for table veterinaria_bd.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `Dni` int(8) NOT NULL,
  `NomyApe` varchar(50) NOT NULL,
  `Fecha_nac` varchar(50) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `Domicilio` varchar(50) NOT NULL,
  `Telefono` varchar(50) NOT NULL,
  PRIMARY KEY (`Dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table veterinaria_bd.clientes: ~2 rows (approximately)
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` (`Dni`, `NomyApe`, `Fecha_nac`, `Ciudad`, `Domicilio`, `Telefono`) VALUES
	(40714396, 'mariano flores', '24/10/1997', 'la plata ', '120 y 65', '4253165');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;

-- Dumping structure for table veterinaria_bd.cuentas
CREATE TABLE IF NOT EXISTS `cuentas` (
  `Usuario` varchar(50) NOT NULL,
  `Contraseña` varchar(50) NOT NULL,
  `Pregunta_sec` longtext NOT NULL,
  `Resp_sec` varchar(50) NOT NULL,
  PRIMARY KEY (`Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table veterinaria_bd.cuentas: ~1 rows (approximately)
/*!40000 ALTER TABLE `cuentas` DISABLE KEYS */;
INSERT INTO `cuentas` (`Usuario`, `Contraseña`, `Pregunta_sec`, `Resp_sec`) VALUES
	('mariano', '1234ya', '¿Segundo Nombre?', 'leandro');
	('martin', '1234', '¿Calle?', '515');
/*!40000 ALTER TABLE `cuentas` ENABLE KEYS */;

-- Dumping structure for table veterinaria_bd.historias
CREATE TABLE IF NOT EXISTS `historias` (
  `ID_historia` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_historia`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- Dumping data for table veterinaria_bd.historias: ~14 rows (approximately)
/*!40000 ALTER TABLE `historias` DISABLE KEYS */;
/*!40000 ALTER TABLE `historias` ENABLE KEYS */;

-- Dumping structure for table veterinaria_bd.mascotas
CREATE TABLE IF NOT EXISTS `mascotas` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Dni` int(8) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Especie` varchar(50) NOT NULL,
  `Raza` varchar(50) DEFAULT NULL,
  `Sexo` varchar(50) NOT NULL,
  `Edad` int(11) NOT NULL,
  `ID_historia` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_historia` (`ID_historia`),
  CONSTRAINT `ID_historia` FOREIGN KEY (`ID_historia`) REFERENCES `historias` (`ID_historia`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table veterinaria_bd.mascotas: ~0 rows (approximately)
/*!40000 ALTER TABLE `mascotas` DISABLE KEYS */;
/*!40000 ALTER TABLE `mascotas` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
cuentas