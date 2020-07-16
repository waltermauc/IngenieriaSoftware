-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: proyecto_final
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `asignatura`
--

DROP TABLE IF EXISTS `asignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignatura` (
  `ASIGNATURA_ID` int NOT NULL,
  `ASIGNATURA_DESCRIPCION` varchar(100) NOT NULL,
  `ASIGNATURA_NIVELASIGNATURA` int NOT NULL,
  PRIMARY KEY (`ASIGNATURA_ID`),
  KEY `FK_NIVELASIGNATURA_ID_idx` (`ASIGNATURA_NIVELASIGNATURA`),
  CONSTRAINT `FK_NIVELASIGNATURA_ID` FOREIGN KEY (`ASIGNATURA_NIVELASIGNATURA`) REFERENCES `nivelasignatura` (`NIVELASIGNATURA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignatura`
--

LOCK TABLES `asignatura` WRITE;
/*!40000 ALTER TABLE `asignatura` DISABLE KEYS */;
/*!40000 ALTER TABLE `asignatura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `docente`
--

DROP TABLE IF EXISTS `docente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docente` (
  `DOCENTE_ID` int NOT NULL,
  `DOCENTE_TITULO` varchar(100) NOT NULL,
  `DOCENTES_PERSONA` varchar(10) NOT NULL,
  PRIMARY KEY (`DOCENTE_ID`),
  KEY `FK_ID_PERSONA_idx` (`DOCENTES_PERSONA`),
  CONSTRAINT `FK_ID_PERSONA` FOREIGN KEY (`DOCENTES_PERSONA`) REFERENCES `persona` (`PERSONA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docente`
--

LOCK TABLES `docente` WRITE;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `espaciofisico`
--

DROP TABLE IF EXISTS `espaciofisico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `espaciofisico` (
  `ESPACIOFISICO_ID` int NOT NULL,
  `ESPACIOFISICO_NUMEROAULA` int NOT NULL,
  `ESPACIOFISICO_EDIFICIO` varchar(100) NOT NULL,
  PRIMARY KEY (`ESPACIOFISICO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `espaciofisico`
--

LOCK TABLES `espaciofisico` WRITE;
/*!40000 ALTER TABLE `espaciofisico` DISABLE KEYS */;
/*!40000 ALTER TABLE `espaciofisico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialidad`
--

DROP TABLE IF EXISTS `especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `especialidad` (
  `ESPECIALIDAD_ID` int NOT NULL,
  `ESPECIALIDAD_DESCRIPCION` varchar(100) NOT NULL,
  PRIMARY KEY (`ESPECIALIDAD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidad`
--

LOCK TABLES `especialidad` WRITE;
/*!40000 ALTER TABLE `especialidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `ESTUDIANTE_ID` int NOT NULL,
  `ESTUDIANTE_INSCRIPCION` date NOT NULL,
  `ESTUDIANTE_PERSONA` varchar(10) NOT NULL,
  PRIMARY KEY (`ESTUDIANTE_ID`),
  KEY `FK_PERSONA_ID_idx` (`ESTUDIANTE_PERSONA`),
  CONSTRAINT `FK_PERSONA_ID` FOREIGN KEY (`ESTUDIANTE_PERSONA`) REFERENCES `persona` (`PERSONA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturacabecera`
--

DROP TABLE IF EXISTS `facturacabecera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facturacabecera` (
  `FACTURACABECERA_ID` int NOT NULL,
  `FACTURACABECERA_FECHA` date NOT NULL,
  `FACTURACABECERA_DETALLE` int NOT NULL,
  `FACTURACABECERA_ESTUDIANTE` int NOT NULL,
  PRIMARY KEY (`FACTURACABECERA_ID`),
  KEY `FK_ESTUDIANTE_idx` (`FACTURACABECERA_ESTUDIANTE`),
  KEY `FK_DETALLE_idx` (`FACTURACABECERA_DETALLE`),
  CONSTRAINT `FK_DETALLE` FOREIGN KEY (`FACTURACABECERA_DETALLE`) REFERENCES `facturadetalle` (`FACTURADETALLE_ID`),
  CONSTRAINT `FK_ESTUDIANTE` FOREIGN KEY (`FACTURACABECERA_ESTUDIANTE`) REFERENCES `estudiante` (`ESTUDIANTE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturacabecera`
--

LOCK TABLES `facturacabecera` WRITE;
/*!40000 ALTER TABLE `facturacabecera` DISABLE KEYS */;
/*!40000 ALTER TABLE `facturacabecera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturadetalle`
--

DROP TABLE IF EXISTS `facturadetalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facturadetalle` (
  `FACTURADETALLE_ID` int NOT NULL,
  `FACTURADETALLE_DESCRIPCION` varchar(100) DEFAULT NULL,
  `FACTURADETALLE_SUBTOTAL` double DEFAULT NULL,
  `FACTURADETALLE_TOTAL` double DEFAULT NULL,
  `FACTURADETALLE_IVA` double DEFAULT NULL,
  `FACTURADETALLE_MATRICUAL` int DEFAULT NULL,
  PRIMARY KEY (`FACTURADETALLE_ID`),
  KEY `FK_MATRICULA_ID_idx` (`FACTURADETALLE_MATRICUAL`),
  CONSTRAINT `FK_MATRICULA_ID` FOREIGN KEY (`FACTURADETALLE_MATRICUAL`) REFERENCES `matricula` (`MATRICULA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturadetalle`
--

LOCK TABLES `facturadetalle` WRITE;
/*!40000 ALTER TABLE `facturadetalle` DISABLE KEYS */;
/*!40000 ALTER TABLE `facturadetalle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupo`
--

DROP TABLE IF EXISTS `grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupo` (
  `GRUPO_ID` int NOT NULL,
  `GRUPO_ASIGNTURA` int NOT NULL,
  `GRUPO_ESPACIOFISICO` int NOT NULL,
  `GRUPO_DOCENTE` int NOT NULL,
  PRIMARY KEY (`GRUPO_ID`),
  KEY `FK_ASIGNATURA_ID_idx` (`GRUPO_ASIGNTURA`),
  KEY `FK_ESPACIOFISICO_ID_idx` (`GRUPO_ESPACIOFISICO`),
  KEY `FK_DOCENTE_ID_idx` (`GRUPO_DOCENTE`),
  CONSTRAINT `FK_ASIGNATURA_ID` FOREIGN KEY (`GRUPO_ASIGNTURA`) REFERENCES `asignatura` (`ASIGNATURA_ID`),
  CONSTRAINT `FK_DOCENTE_ID` FOREIGN KEY (`GRUPO_DOCENTE`) REFERENCES `docente` (`DOCENTE_ID`),
  CONSTRAINT `FK_ESPACIOFISICO_ID` FOREIGN KEY (`GRUPO_ESPACIOFISICO`) REFERENCES `espaciofisico` (`ESPACIOFISICO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupo`
--

LOCK TABLES `grupo` WRITE;
/*!40000 ALTER TABLE `grupo` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matricula`
--

DROP TABLE IF EXISTS `matricula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `matricula` (
  `MATRICULA_ID` int NOT NULL,
  `MATRICULA_PERIODO` int NOT NULL,
  `MATRICULA_MODALIDAD` int NOT NULL,
  `MATRICULA_ESPECIALIDAD` int NOT NULL,
  `MATRICULA_GRUPO` int NOT NULL,
  `MATRICULA_ESTUDIANTE` int NOT NULL,
  PRIMARY KEY (`MATRICULA_ID`),
  KEY `FK_ESTUDIANTE_ID_idx` (`MATRICULA_ESTUDIANTE`),
  KEY `FK_PERIODO_ID_idx` (`MATRICULA_PERIODO`),
  KEY `FK_MODALIDAD_ID_idx` (`MATRICULA_MODALIDAD`),
  KEY `FK_ESPECIALIDAD_ID_idx` (`MATRICULA_ESPECIALIDAD`),
  KEY `FK_GRUPO_ID_idx` (`MATRICULA_GRUPO`),
  CONSTRAINT `FK_ESPECIALIDAD_ID` FOREIGN KEY (`MATRICULA_ESPECIALIDAD`) REFERENCES `especialidad` (`ESPECIALIDAD_ID`),
  CONSTRAINT `FK_ESTUDIANTE_ID` FOREIGN KEY (`MATRICULA_ESTUDIANTE`) REFERENCES `estudiante` (`ESTUDIANTE_ID`),
  CONSTRAINT `FK_GRUPO_ID` FOREIGN KEY (`MATRICULA_GRUPO`) REFERENCES `grupo` (`GRUPO_ID`),
  CONSTRAINT `FK_MODALIDAD_ID` FOREIGN KEY (`MATRICULA_MODALIDAD`) REFERENCES `modalidad` (`MODALIDAD_ID`),
  CONSTRAINT `FK_PERIODO_ID` FOREIGN KEY (`MATRICULA_PERIODO`) REFERENCES `periodolectivo` (`PERIODOLECTIVO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matricula`
--

LOCK TABLES `matricula` WRITE;
/*!40000 ALTER TABLE `matricula` DISABLE KEYS */;
/*!40000 ALTER TABLE `matricula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modalidad`
--

DROP TABLE IF EXISTS `modalidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modalidad` (
  `MODALIDAD_ID` int NOT NULL,
  `MODALIDAD_DESCRIPCION` varchar(100) NOT NULL,
  PRIMARY KEY (`MODALIDAD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modalidad`
--

LOCK TABLES `modalidad` WRITE;
/*!40000 ALTER TABLE `modalidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `modalidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nivelasignatura`
--

DROP TABLE IF EXISTS `nivelasignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nivelasignatura` (
  `NIVELASIGNATURA_ID` int NOT NULL,
  `NIVELASIGNATURA_DESCRIPCION` varchar(100) NOT NULL,
  PRIMARY KEY (`NIVELASIGNATURA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nivelasignatura`
--

LOCK TABLES `nivelasignatura` WRITE;
/*!40000 ALTER TABLE `nivelasignatura` DISABLE KEYS */;
/*!40000 ALTER TABLE `nivelasignatura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `periodolectivo`
--

DROP TABLE IF EXISTS `periodolectivo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `periodolectivo` (
  `PERIODOLECTIVO_ID` int NOT NULL,
  `PERIODOLECTIVO_DESCRIPCION` varchar(100) NOT NULL,
  PRIMARY KEY (`PERIODOLECTIVO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `periodolectivo`
--

LOCK TABLES `periodolectivo` WRITE;
/*!40000 ALTER TABLE `periodolectivo` DISABLE KEYS */;
/*!40000 ALTER TABLE `periodolectivo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `PERSONA_ID` varchar(10) NOT NULL,
  `PERSONA_NOMBRE` varchar(100) NOT NULL,
  `PERSONA_APELLIDO` varchar(100) NOT NULL,
  `PERSONA_DIRECCION` varchar(100) NOT NULL,
  `PERSONA_CORREO` varchar(100) DEFAULT NULL,
  `PERSONA_CELULAR` int DEFAULT NULL,
  `PERSONA_SEXO` varchar(2) NOT NULL,
  `PERSONA_FECHANACIMIENTO` date NOT NULL,
  PRIMARY KEY (`PERSONA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-05 17:44:42
