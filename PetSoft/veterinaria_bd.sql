-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.5.8-log - MySQL Community Server (GPL)
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para veterinaria_bd
CREATE DATABASE IF NOT EXISTS `veterinaria_bd` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `veterinaria_bd`;

-- Volcando estructura para tabla veterinaria_bd.atenciones
CREATE TABLE IF NOT EXISTS `atenciones` (
  `ID_atenciones` int(11) NOT NULL AUTO_INCREMENT,
  `ID_mascota` int(11) NOT NULL,
  `Fecha_atencion` date NOT NULL,
  `Hora_atencion` time NOT NULL,
  `Diagnostico` varchar(100) NOT NULL,
  `Observaciones` longtext NOT NULL,
  PRIMARY KEY (`ID_atenciones`),
  KEY `ID_mascota` (`ID_mascota`),
  CONSTRAINT `ID_mascota` FOREIGN KEY (`ID_mascota`) REFERENCES `mascotas` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='guarda todas la atenciones de una mascota';

-- Volcando datos para la tabla veterinaria_bd.atenciones: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `atenciones` DISABLE KEYS */;
INSERT INTO `atenciones` (`ID_atenciones`, `ID_mascota`, `Fecha_atencion`, `Hora_atencion`, `Diagnostico`, `Observaciones`) VALUES
	(1, 4, '2018-05-18', '19:00:00', 'Lesion en la pierna', 'Lesion en la pierna con  3 dias pasado el accidente');
/*!40000 ALTER TABLE `atenciones` ENABLE KEYS */;

-- Volcando estructura para tabla veterinaria_bd.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `Dni` int(8) NOT NULL,
  `NomyApe` varchar(50) NOT NULL,
  `Fecha_nac` varchar(50) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `Domicilio` varchar(50) NOT NULL,
  `Telefono` varchar(50) NOT NULL,
  PRIMARY KEY (`Dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla veterinaria_bd.clientes: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` (`Dni`, `NomyApe`, `Fecha_nac`, `Ciudad`, `Domicilio`, `Telefono`) VALUES
	(40714396, 'mariano flores', '24/10/1997', 'la plata', '120 y 65', '4253165');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;

-- Volcando estructura para tabla veterinaria_bd.cuentas
CREATE TABLE IF NOT EXISTS `cuentas` (
  `Usuario` varchar(50) NOT NULL,
  `Contraseña` varchar(50) NOT NULL,
  `Pregunta_sec` longtext NOT NULL,
  `Resp_sec` varchar(50) NOT NULL,
  PRIMARY KEY (`Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla veterinaria_bd.cuentas: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `cuentas` DISABLE KEYS */;
INSERT INTO `cuentas` (`Usuario`, `Contraseña`, `Pregunta_sec`, `Resp_sec`) VALUES
	('mariano', '1234ya', '¿Segundo Nombre?', 'leandro');
/*!40000 ALTER TABLE `cuentas` ENABLE KEYS */;

-- Volcando estructura para tabla veterinaria_bd.mascotas
CREATE TABLE IF NOT EXISTS `mascotas` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Dni` int(8) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Especie` varchar(50) NOT NULL,
  `Raza` varchar(50) DEFAULT NULL,
  `Sexo` varchar(50) NOT NULL,
  `Edad` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla veterinaria_bd.mascotas: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `mascotas` DISABLE KEYS */;
INSERT INTO `mascotas` (`ID`, `Dni`, `Nombre`, `Especie`, `Raza`, `Sexo`, `Edad`) VALUES
	(3, 40714396, 'Java', 'Gato', 'Siames', 'Macho', 1),
	(4, 40714396, 'Pepe', 'Perro', 'Bulldog', 'Macho', 10);
/*!40000 ALTER TABLE `mascotas` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
