-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-03-2018 a las 22:54:10
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cargdc`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acompañante`
--

CREATE TABLE `acompañante` (
  `idAcompañante` int(11) NOT NULL,
  `nombre` varchar(11) NOT NULL,
  `Activo` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `acompañante`
--

INSERT INTO `acompañante` (`idAcompañante`, `nombre`, `Activo`) VALUES
(1, 'Papa', 'Activo'),
(2, 'Mama', 'Activo'),
(3, 'Hermanos', 'Activo'),
(4, 'Tio(a)', 'Activo'),
(5, 'Abuelo(a)', 'Activo'),
(6, 'Otro', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acudiente`
--

CREATE TABLE `acudiente` (
  `idAcudiente` int(6) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `sexo` varchar(15) NOT NULL,
  `edad` int(3) DEFAULT NULL,
  `tipoIdentidad` varchar(45) NOT NULL,
  `cedulaAcudiente` varchar(45) NOT NULL,
  `ciudad` varchar(45) DEFAULT NULL,
  `municipio` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `acudiente`
--

INSERT INTO `acudiente` (`idAcudiente`, `nombre`, `apellido`, `sexo`, `edad`, `tipoIdentidad`, `cedulaAcudiente`, `ciudad`, `municipio`, `direccion`, `telefono`) VALUES
(1, 'LUZ MARY', 'ORDOÃ?EZ', 'Femenino', 48, 'Cedula', '45506755', 'CARTAGENA', 'BOLIVARA', 'OLAYA', '3126182022'),
(2, '', '', '--Seleccione--', 18, '--Seleccione--', '', '', '', '', ''),
(3, 'hjfffff', 'ffffreg', 'Masculino', 54, 'Cedula', '4555244', 'cartagena', 'bolivar', 'edff', '25858554');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `animales`
--

CREATE TABLE `animales` (
  `idAnimal` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `animales`
--

INSERT INTO `animales` (`idAnimal`, `Nombre`, `Estado`) VALUES
(1, 'Perro', 'Activo'),
(2, 'Gato', 'Activo'),
(3, 'Aves', 'Activo'),
(4, 'Otro', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aspectosvivienda`
--

CREATE TABLE `aspectosvivienda` (
  `idAspectoVivienda` int(6) NOT NULL,
  `NumeroDormitorios` int(11) NOT NULL,
  `NumeroBaños` int(11) NOT NULL,
  `Cocina` int(11) NOT NULL,
  `Sala` int(11) NOT NULL,
  `Comedor` int(11) NOT NULL,
  `idCaracterizacion` int(6) NOT NULL,
  `idTecho` int(6) NOT NULL,
  `idServiciosSanitario` int(6) NOT NULL,
  `idTenencia` int(6) NOT NULL,
  `idTipoVivienda` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `aspectosvivienda`
--

INSERT INTO `aspectosvivienda` (`idAspectoVivienda`, `NumeroDormitorios`, `NumeroBaños`, `Cocina`, `Sala`, `Comedor`, `idCaracterizacion`, `idTecho`, `idServiciosSanitario`, `idTenencia`, `idTipoVivienda`) VALUES
(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(2, 2, 2, 1, 1, 1, 18, 1, 2, 1, 1),
(3, 2, 1, 1, 1, 1, 21, 1, 2, 1, 1),
(4, 2, 1, 1, 1, 1, 21, 1, 2, 1, 1),
(5, 2, 1, 1, 1, 1, 22, 1, 2, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `condicionsocial`
--

CREATE TABLE `condicionsocial` (
  `idCondicionSocial` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalla_animales`
--

CREATE TABLE `detalla_animales` (
  `iddetalla_Animales` int(11) NOT NULL,
  `idCaracterizacion` int(6) NOT NULL,
  `idAnimal` int(6) NOT NULL,
  `observacion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalla_animales`
--

INSERT INTO `detalla_animales` (`iddetalla_Animales`, `idCaracterizacion`, `idAnimal`, `observacion`) VALUES
(1, 1, 1, 'Conejo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalla_paredes`
--

CREATE TABLE `detalla_paredes` (
  `iddetalla_Paredes` int(6) NOT NULL,
  `idCaracterizacion` int(6) NOT NULL,
  `idParedes` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalla_paredes`
--

INSERT INTO `detalla_paredes` (`iddetalla_Paredes`, `idCaracterizacion`, `idParedes`) VALUES
(1, 1, 1),
(2, 22, 1),
(3, 22, 2),
(4, 22, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalla_pisos`
--

CREATE TABLE `detalla_pisos` (
  `iddetalla_Pisos` int(6) NOT NULL,
  `idCaracterizacion` int(6) NOT NULL,
  `idPiso` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalla_pisos`
--

INSERT INTO `detalla_pisos` (`iddetalla_Pisos`, `idCaracterizacion`, `idPiso`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalla_relacafectivas`
--

CREATE TABLE `detalla_relacafectivas` (
  `iddetalla_RelacAfectivas` int(11) NOT NULL,
  `idRelacionesAfectivas` int(6) NOT NULL,
  `idCaracterizacion` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalla_servpublic`
--

CREATE TABLE `detalla_servpublic` (
  `iddetalla_ServPublic` int(6) NOT NULL,
  `GDCAR_Caracterizacion_idCaracterizacion` int(6) NOT NULL,
  `ServiciosPublicos_idServiciosPublicos` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalla_socafectiva`
--

CREATE TABLE `detalla_socafectiva` (
  `iddetalla_SocAfectiva` int(11) NOT NULL,
  `idCaracterizacion` int(6) NOT NULL,
  `idSocioAfectiva` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalla_socafectiva`
--

INSERT INTO `detalla_socafectiva` (`iddetalla_SocAfectiva`, `idCaracterizacion`, `idSocioAfectiva`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalla_tipotransporte`
--

CREATE TABLE `detalla_tipotransporte` (
  `iddetalla_tipoTran` int(6) NOT NULL,
  `idCaracterizacion` int(6) NOT NULL,
  `idTransporte` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalla_tipotransporte`
--

INSERT INTO `detalla_tipotransporte` (`iddetalla_tipoTran`, `idCaracterizacion`, `idTransporte`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalletiempolibre`
--

CREATE TABLE `detalletiempolibre` (
  `iddetalleTiempoLibre` int(11) NOT NULL,
  `idTiempoLibre` int(6) NOT NULL,
  `idCaracterizacion` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalletiempolibre`
--

INSERT INTO `detalletiempolibre` (`iddetalleTiempoLibre`, `idTiempoLibre`, `idCaracterizacion`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `idEmpleado` int(6) NOT NULL,
  `codEmpleado` varchar(45) NOT NULL,
  `cargo` varchar(45) NOT NULL,
  `fechaIngreso` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `tipoContrato` varchar(45) NOT NULL,
  `observacion` varchar(45) NOT NULL,
  `IdPersona` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`idEmpleado`, `codEmpleado`, `cargo`, `fechaIngreso`, `estado`, `tipoContrato`, `observacion`, `IdPersona`) VALUES
(1, '123', 'Coordinador', '22/11/2016', 'Activo', 'Fijo', 'ninguna', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gdcar_caracterizacion`
--

CREATE TABLE `gdcar_caracterizacion` (
  `idCaracterizacion` int(6) NOT NULL,
  `deportes` varchar(45) NOT NULL,
  `fechaAsistencia` date DEFAULT NULL,
  `valorIngreso` decimal(10,2) DEFAULT NULL,
  `varlorGastos` decimal(10,2) DEFAULT NULL,
  `armoniaFamiliar` varchar(10) DEFAULT NULL,
  `observación` varchar(45) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `idCondicionSocial` int(6) NOT NULL,
  `idTipoFamiliar` int(6) NOT NULL,
  `idEmpleado` int(6) NOT NULL,
  `IdPersona` int(6) NOT NULL,
  `cedulaAcudiente` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `gdcar_caracterizacion`
--

INSERT INTO `gdcar_caracterizacion` (`idCaracterizacion`, `deportes`, `fechaAsistencia`, `valorIngreso`, `varlorGastos`, `armoniaFamiliar`, `observación`, `estado`, `idCondicionSocial`, `idTipoFamiliar`, `idEmpleado`, `IdPersona`, `cedulaAcudiente`) VALUES
(1, 'Futbol', '2017-12-11', '12000.00', '55000.00', 'armonia', 'Estamos probando', 1, 1, 1, 1, 1441485, '145411'),
(2, 'Futbol', '2017-03-31', '12000.00', '55000.00', NULL, 'Estamos probado', 1, 1, 1, 1, 4426533, '0'),
(3, 'Futbol', '2017-01-02', '12000.00', '55000.00', NULL, 'Estamos probado', 1, 1, 1, 1, 454454454, '0'),
(4, 'Futbol', '2222-04-04', '12000.00', '55000.00', NULL, 'Estamos probado', 1, 1, 1, 1, 0, '4222'),
(5, 'Futbol', '2222-02-22', '12000.00', '55000.00', NULL, 'Estamos probado', 1, 1, 1, 1, 0, '1425'),
(6, 'Futbol', '2017-01-01', '12000.00', '55000.00', NULL, 'Estamos probado', 1, 1, 1, 1, 19, '415522'),
(7, 'Futbol', '5555-05-05', '12000.00', '55000.00', NULL, 'Estamos probado', 1, 1, 1, 1, 20, '45555'),
(8, 'Futbol', '2017-12-19', '12000.00', '55000.00', 'regular', 'Estamos probado', 1, 1, 1, 1, 21, '1143255'),
(9, 'Futbol', '2017-12-19', '12000.00', '55000.00', 'regular', 'Estamos probado', 1, 1, 1, 1, 22, '1143255'),
(10, 'Futbol', '2017-12-19', '12000.00', '55000.00', 'regular', 'Estamos probado', 1, 1, 1, 1, 23, '1143255'),
(11, 'Futbol', '2017-11-14', '12000.00', '55000.00', 'buena', 'Estamos probado', 1, 1, 1, 1, 24, '45520654'),
(12, 'Futbol', '2017-09-11', '12000.00', '55000.00', 'buena', 'Estamos probado', 1, 1, 1, 1, 25, '1143362588'),
(13, 'Futbol', '2017-09-11', '12000.00', '55000.00', 'buena', 'Estamos probado', 1, 1, 1, 1, 26, '1143362588'),
(14, 'Futbol', '2017-09-11', '12000.00', '55000.00', 'buena', 'Estamos probado', 1, 1, 1, 1, 27, '1143362588'),
(15, 'Futbol', '2017-09-11', '12000.00', '55000.00', 'buena', 'Estamos probado', 1, 1, 1, 1, 28, '1143362588'),
(16, 'Futbol', '2017-09-11', '12000.00', '55000.00', 'buena', 'Estamos probado', 1, 1, 1, 1, 29, '1143362588'),
(17, 'Futbol', '2017-11-08', '12000.00', '55000.00', 'mala', 'Estamos probado', 1, 1, 1, 1, 30, '5645844'),
(18, 'Futbol', '2017-07-05', '12000.00', '55000.00', 'mala', 'Estamos probado', 1, 1, 1, 1, 31, '14545451'),
(19, 'Futbol', '2017-05-01', '12000.00', '55000.00', NULL, 'Estamos probado', 1, 1, 1, 1, 32, '1143362588'),
(20, 'Futbol', '2017-05-01', '12000.00', '55000.00', 'buena', 'Estamos probado', 1, 1, 1, 1, 33, '1143362588'),
(21, 'Futbol', '2017-05-01', '12000.00', '55000.00', 'buena', 'Estamos probado', 1, 1, 1, 1, 34, '1143362588'),
(22, 'Futbol', '2017-05-01', '12000.00', '55000.00', 'buena', 'Estamos probado', 1, 1, 1, 1, 35, '1143362588');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `integrantes`
--

CREATE TABLE `integrantes` (
  `idIntegrantes` int(6) NOT NULL,
  `Nombres` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Edad` int(11) NOT NULL,
  `Parentesco` varchar(45) NOT NULL,
  `idCaracterizacion` int(6) NOT NULL,
  `idNivelFormacion` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nivelformacion`
--

CREATE TABLE `nivelformacion` (
  `idNivelFormacion` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paredes`
--

CREATE TABLE `paredes` (
  `idParedes` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `paredes`
--

INSERT INTO `paredes` (`idParedes`, `Nombre`, `Estado`) VALUES
(1, 'PaÃ±ete', 'Activo'),
(2, 'Ladrillo', 'Activo'),
(3, 'Madera', 'Activo'),
(4, 'Desecho', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `IdPersona` int(6) NOT NULL,
  `DocIdentidad` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `sexo` varchar(11) DEFAULT NULL,
  `edad` int(3) DEFAULT NULL,
  `fechaNacimiento` datetime NOT NULL,
  `idTipoDocumento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`IdPersona`, `DocIdentidad`, `nombre`, `sexo`, `edad`, `fechaNacimiento`, `idTipoDocumento`) VALUES
(1, '1143362588', 'Guerrero Wilmer', 'Masculino', 25, '1992-11-22 00:00:00', 3),
(2, '1441485', 'gdfh', 'Masculino', 9, '2010-05-01 00:00:00', 2),
(3, '14245', 'fgretteg', 'Masculino', 7, '2010-05-01 00:00:00', 2),
(4, '12586658', 'wde', 'Masculino', 6, '2010-05-01 00:00:00', 2),
(5, '247587', 'rerew', 'Masculino', 7, '2010-05-01 00:00:00', 2),
(6, '247587', 'rerew', 'Masculino', 7, '2010-05-01 00:00:00', 2),
(7, '525858555', 'jfghfhh', 'Masculino', 10, '2010-05-01 00:00:00', 2),
(8, '44756578', 'ghhfdd', 'Masculino', 10, '2000-01-01 00:00:00', 2),
(9, '45654655', 'gdioduiofee', 'Masculino', 10, '2010-11-20 00:00:00', 2),
(10, '44555', 'eeewtt', 'Masculino', 7, '2010-02-02 00:00:00', 2),
(11, '14225385', 'ijekejfe', 'Masculino', 7, '2010-01-06 00:00:00', 2),
(12, '1426222', 'wjkjwjkew', 'Masculino', 7, '2010-02-02 00:00:00', 2),
(13, '15533663', 'whhd', 'Masculino', 7, '2012-04-23 00:00:00', 2),
(14, '4252422', 'rhtrhr', 'Masculino', 7, '2010-10-10 00:00:00', 2),
(15, '1114225', 'wfgr', 'Masculino', 7, '2010-02-02 00:00:00', 2),
(16, '14228327', 'gfhfghhg', 'Masculino', 6, '2352-02-14 00:00:00', 2),
(17, '123', 'kkkkhv', 'Masculino', 10, '2222-12-14 00:00:00', 2),
(18, '123', '2,jk,mjh', 'Masculino', 10, '1011-01-01 00:00:00', 2),
(19, '142', 'ghjjj', 'Masculino', 7, '2010-01-01 00:00:00', 2),
(20, '455', '55222', 'Masculino', 7, '5457-05-05 00:00:00', 2),
(21, '114362588', 'jesus maria esmelin', 'Masculino', 6, '2014-02-27 00:00:00', 1),
(22, '114362588', 'jesus maria esmelin', 'Masculino', 6, '2014-02-27 00:00:00', 1),
(23, '114362588', 'jesus maria esmelin', 'Masculino', 6, '2014-02-27 00:00:00', 1),
(24, '75768668', 'dfgtytuj ttuuuu', 'Masculino', 6, '2013-10-22 00:00:00', 1),
(25, '455506745', 'efrrrtg rgrrt', 'Masculino', 6, '2012-12-10 00:00:00', 1),
(26, '455506745', 'efrrrtg rgrrt', 'Masculino', 6, '2012-12-10 00:00:00', 1),
(27, '455506745', 'efrrrtg rgrrt', 'Masculino', 6, '2012-12-10 00:00:00', 1),
(28, '455506745', 'efrrrtg rgrrt', 'Masculino', 6, '2012-12-10 00:00:00', 1),
(29, '455506745', 'efrrrtg rgrrt', 'Masculino', 6, '2012-12-10 00:00:00', 1),
(30, '1246464454', 'defedgfv fgrg', 'Masculino', 6, '2013-05-02 00:00:00', 1),
(31, '555545211', 'ieijejrj jjdjfjf', 'Masculino', 6, '2012-10-20 00:00:00', 1),
(32, '44444599', 'angel maria gutierrez', 'Masculino', 6, '2011-01-02 00:00:00', 1),
(33, '44444599', 'angel maria gutierrez', 'Masculino', 6, '2011-01-02 00:00:00', 1),
(34, '44444599', 'angel maria gutierrez', 'Masculino', 6, '2011-01-02 00:00:00', 1),
(35, '44444599', 'angel maria gutierrez', 'Masculino', 6, '2011-01-02 00:00:00', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pisos`
--

CREATE TABLE `pisos` (
  `idPiso` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pisos`
--

INSERT INTO `pisos` (`idPiso`, `Nombre`, `Estado`) VALUES
(1, 'Tierra', 'Activo'),
(2, 'Cemento', 'Activo'),
(3, 'Ceramica', 'Activo'),
(4, 'Baldosa', 'Activo'),
(5, 'Madera', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `regimensalud`
--

CREATE TABLE `regimensalud` (
  `idregimenSalud` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `regimensalud`
--

INSERT INTO `regimensalud` (`idregimenSalud`, `Nombre`, `Estado`) VALUES
(1, 'Subsidiado', 'Activo'),
(2, 'Contributivo', 'Activo'),
(3, 'Ninguno', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relacionesafectivas`
--

CREATE TABLE `relacionesafectivas` (
  `idRelacionesAfectivas` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salud`
--

CREATE TABLE `salud` (
  `idSalud` int(6) NOT NULL,
  `Discapacidad` varchar(45) DEFAULT NULL,
  `FrecuenciaMedico` varchar(45) DEFAULT NULL,
  `Alergia` varchar(45) DEFAULT NULL,
  `Peso` varchar(45) NOT NULL,
  `Medicamento` varchar(45) DEFAULT NULL,
  `Estatura` varchar(45) NOT NULL,
  `Enfermedad` varchar(45) DEFAULT NULL,
  `idCaracterizacion` int(6) NOT NULL,
  `idregimenSalud` int(6) NOT NULL,
  `cualRegimen` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `salud`
--

INSERT INTO `salud` (`idSalud`, `Discapacidad`, `FrecuenciaMedico`, `Alergia`, `Peso`, `Medicamento`, `Estatura`, `Enfermedad`, `idCaracterizacion`, `idregimenSalud`, `cualRegimen`) VALUES
(1, '', 'casi', '', '16', '', '105', '', 8, 1, 'mutual ser'),
(2, '', 'casi', '', '16', '', '105', '', 9, 1, 'mutual ser'),
(3, '', 'casi', '', '16', '', '105', '', 10, 1, 'mutual ser'),
(4, '', 'casi', '', '12', '', '101', '', 11, 1, 'mutuAL SER'),
(5, '', 'casi', '', '15', '', '102', '', 12, 1, 'coosalud'),
(6, '', 'casi', '', '15', '', '102', '', 13, 1, 'coosalud'),
(7, '', 'casi', '', '15', '', '102', '', 14, 1, 'coosalud'),
(8, '', 'casi', '', '15', '', '102', '', 15, 1, 'coosalud'),
(9, '', 'casi', '', '15', '', '102', '', 16, 1, 'coosalud'),
(10, '', 'casi', '', '15', '', '111', '', 17, 1, 'dddd'),
(11, '', 'siempre', '', '51', '', '101', '', 18, 1, 'dos'),
(12, '', NULL, '', '25', '', '4', '', 19, 1, 'comfacor'),
(13, '', 'nunca', '', '25', '', '110', '', 21, 1, 'comfacor'),
(14, '', 'nunca', '', '25', '', '110', '', 0, 1, 'comfacor'),
(15, '', 'nunca', '', '25', '', '110', '', 22, 1, 'comfacor');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `serviciospublicos`
--

CREATE TABLE `serviciospublicos` (
  `idServiciosPublicos` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `serviciospublicos`
--

INSERT INTO `serviciospublicos` (`idServiciosPublicos`, `Nombre`, `Estado`) VALUES
(1, 'Agua', 'Activo'),
(2, 'Alcantarillado', 'Activo'),
(3, 'Fluido Electrico', 'Activo'),
(4, 'Gas Natural', 'Activo'),
(5, 'Telefono', 'Activo'),
(6, 'Telecable', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `serviciossanitarios`
--

CREATE TABLE `serviciossanitarios` (
  `idServiciosSanitario` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `serviciossanitarios`
--

INSERT INTO `serviciossanitarios` (`idServiciosSanitario`, `Nombre`, `Estado`) VALUES
(1, 'No Tiene', 'Activo'),
(2, 'Letrina', 'Activo'),
(3, 'Inodoro', 'Activo'),
(4, 'Pozo', 'Activo'),
(5, 'Otro', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socioafectiva`
--

CREATE TABLE `socioafectiva` (
  `idSocioAfectiva` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `techo`
--

CREATE TABLE `techo` (
  `idTecho` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `techo`
--

INSERT INTO `techo` (`idTecho`, `Nombre`, `Estado`) VALUES
(1, 'Zinc', 'Activo'),
(2, 'Eternit', 'Activo'),
(3, 'Teja', 'Activo'),
(4, 'Desechos', 'Activo'),
(5, 'Cielo Raso', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tenenciavivienda`
--

CREATE TABLE `tenenciavivienda` (
  `idTenencia` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tenenciavivienda`
--

INSERT INTO `tenenciavivienda` (`idTenencia`, `Nombre`, `Estado`) VALUES
(1, 'Propia', 'Activo'),
(2, 'Alquilada', 'Activo'),
(3, 'Invasion', 'Activo'),
(4, 'Familiar', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiempolibre`
--

CREATE TABLE `tiempolibre` (
  `idTiempoLibre` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tiempolibre`
--

INSERT INTO `tiempolibre` (`idTiempoLibre`, `Nombre`, `Estado`) VALUES
(1, 'Ver TV', 'Activo'),
(2, 'Leer', 'Activo'),
(3, 'Hacer Deporte', 'Activo'),
(4, 'Ir Al Parque', 'Activo'),
(5, 'Otro', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodocumento`
--

CREATE TABLE `tipodocumento` (
  `idTipoDocumento` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipodocumento`
--

INSERT INTO `tipodocumento` (`idTipoDocumento`, `Nombre`, `Estado`) VALUES
(1, 'Registro Civil', 'Activo'),
(2, 'Tarjeta Identidad', 'Activo'),
(3, 'Cedula', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipofamiliar`
--

CREATE TABLE `tipofamiliar` (
  `idTipoFamiliar` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipofamiliar`
--

INSERT INTO `tipofamiliar` (`idTipoFamiliar`, `Nombre`, `Estado`) VALUES
(1, 'Nuclear', 'Activo'),
(2, 'Mono Parental', 'Activo'),
(3, 'Reconstituida', 'Activo'),
(4, 'Extensa', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipotransporte`
--

CREATE TABLE `tipotransporte` (
  `idTransporte` int(6) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `estado` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipotransporte`
--

INSERT INTO `tipotransporte` (`idTransporte`, `nombre`, `estado`) VALUES
(1, 'Ruta', 'Activo'),
(2, 'Bus', 'Activo'),
(3, 'Bicicleta', 'Activo'),
(4, 'Caminando', 'Activo'),
(5, 'Otro', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipovivienda`
--

CREATE TABLE `tipovivienda` (
  `idTipo` int(6) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipovivienda`
--

INSERT INTO `tipovivienda` (`idTipo`, `Nombre`, `Estado`) VALUES
(1, 'Casa', 'Activo'),
(2, 'Apartamento ', 'Activo'),
(3, 'Obra Negra', 'Activo'),
(4, 'Tugurlo', 'Activo'),
(5, 'Otros', 'Activo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `acompañante`
--
ALTER TABLE `acompañante`
  ADD PRIMARY KEY (`idAcompañante`);

--
-- Indices de la tabla `acudiente`
--
ALTER TABLE `acudiente`
  ADD PRIMARY KEY (`idAcudiente`);

--
-- Indices de la tabla `animales`
--
ALTER TABLE `animales`
  ADD PRIMARY KEY (`idAnimal`);

--
-- Indices de la tabla `aspectosvivienda`
--
ALTER TABLE `aspectosvivienda`
  ADD PRIMARY KEY (`idAspectoVivienda`),
  ADD KEY `fk_AspectosVivienda_GDCAR_Caracterizacion1_idx` (`idCaracterizacion`),
  ADD KEY `fk_AspectosVivienda_Techo1_idx` (`idTecho`),
  ADD KEY `fk_AspectosVivienda_ServiciosSanitarios1_idx` (`idServiciosSanitario`),
  ADD KEY `fk_AspectosVivienda_TenenciaVivienda1_idx` (`idTenencia`),
  ADD KEY `fk_AspectosVivienda_TipoVivienda1_idx` (`idTipoVivienda`);

--
-- Indices de la tabla `condicionsocial`
--
ALTER TABLE `condicionsocial`
  ADD PRIMARY KEY (`idCondicionSocial`);

--
-- Indices de la tabla `detalla_animales`
--
ALTER TABLE `detalla_animales`
  ADD PRIMARY KEY (`iddetalla_Animales`),
  ADD KEY `fk_detalla_Animales_GDCAR_Caracterizacion1_idx` (`idCaracterizacion`),
  ADD KEY `fk_detalla_Animales_Animales1_idx` (`idAnimal`);

--
-- Indices de la tabla `detalla_paredes`
--
ALTER TABLE `detalla_paredes`
  ADD PRIMARY KEY (`iddetalla_Paredes`),
  ADD KEY `fk_detalla_paredes_GDCAR_Caracterizacion1_idx` (`idCaracterizacion`),
  ADD KEY `fk_detalla_paredes_Paredes1_idx` (`idParedes`);

--
-- Indices de la tabla `detalla_pisos`
--
ALTER TABLE `detalla_pisos`
  ADD PRIMARY KEY (`iddetalla_Pisos`),
  ADD KEY `fk_detalla_pisos_GDCAR_Caracterizacion1_idx` (`idCaracterizacion`),
  ADD KEY `fk_detalla_pisos_Pisos1_idx` (`idPiso`);

--
-- Indices de la tabla `detalla_relacafectivas`
--
ALTER TABLE `detalla_relacafectivas`
  ADD PRIMARY KEY (`iddetalla_RelacAfectivas`),
  ADD KEY `fk_detalla_RelacAfectivas_RelacionesAfectivas1_idx` (`idRelacionesAfectivas`),
  ADD KEY `fk_detalla_RelacAfectivas_GDCAR_Caracterizacion1_idx` (`idCaracterizacion`);

--
-- Indices de la tabla `detalla_servpublic`
--
ALTER TABLE `detalla_servpublic`
  ADD PRIMARY KEY (`iddetalla_ServPublic`),
  ADD KEY `fk_detalla_ServPublic_GDCAR_Caracterizacion1_idx` (`GDCAR_Caracterizacion_idCaracterizacion`),
  ADD KEY `fk_detalla_ServPublic_ServiciosPublicos1_idx` (`ServiciosPublicos_idServiciosPublicos`);

--
-- Indices de la tabla `detalla_socafectiva`
--
ALTER TABLE `detalla_socafectiva`
  ADD PRIMARY KEY (`iddetalla_SocAfectiva`),
  ADD KEY `fk_detalla_SocAfectiva_GDCAR_Caracterizacion1_idx` (`idCaracterizacion`),
  ADD KEY `fk_detalla_SocAfectiva_SocioAfectiva1_idx` (`idSocioAfectiva`);

--
-- Indices de la tabla `detalla_tipotransporte`
--
ALTER TABLE `detalla_tipotransporte`
  ADD PRIMARY KEY (`iddetalla_tipoTran`),
  ADD KEY `fk_detalla_tipoTransporte_GDCAR_Caracterizacion1_idx` (`idCaracterizacion`),
  ADD KEY `fk_detalla_tipoTransporte_tipoTransporte1_idx` (`idTransporte`);

--
-- Indices de la tabla `detalletiempolibre`
--
ALTER TABLE `detalletiempolibre`
  ADD PRIMARY KEY (`iddetalleTiempoLibre`),
  ADD KEY `fk_detalleTiempoLibre_TiempoLibre1_idx` (`idTiempoLibre`),
  ADD KEY `fk_detalleTiempoLibre_GDCAR_Caracterizacion1_idx` (`idCaracterizacion`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`idEmpleado`),
  ADD KEY `fk_Empleado_Persona1_idx` (`IdPersona`);

--
-- Indices de la tabla `gdcar_caracterizacion`
--
ALTER TABLE `gdcar_caracterizacion`
  ADD PRIMARY KEY (`idCaracterizacion`),
  ADD KEY `fk_GDCAR_Caracterizacion_CondicionSocial1_idx` (`idCondicionSocial`),
  ADD KEY `fk_GDCAR_Caracterizacion_TipoFamiliar1_idx` (`idTipoFamiliar`),
  ADD KEY `fk_GDCAR_Caracterizacion_Empleado1_idx` (`idEmpleado`),
  ADD KEY `fk_GDCAR_Caracterizacion_Persona1_idx` (`IdPersona`);

--
-- Indices de la tabla `integrantes`
--
ALTER TABLE `integrantes`
  ADD PRIMARY KEY (`idIntegrantes`),
  ADD KEY `fk_Integrantes_GDCAR_Caracterizacion1_idx` (`idCaracterizacion`),
  ADD KEY `fk_Integrantes_NivelFormacion1_idx` (`idNivelFormacion`);

--
-- Indices de la tabla `nivelformacion`
--
ALTER TABLE `nivelformacion`
  ADD PRIMARY KEY (`idNivelFormacion`);

--
-- Indices de la tabla `paredes`
--
ALTER TABLE `paredes`
  ADD PRIMARY KEY (`idParedes`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`IdPersona`),
  ADD KEY `fk_Persona_TipoDocumento1_idx` (`idTipoDocumento`);

--
-- Indices de la tabla `pisos`
--
ALTER TABLE `pisos`
  ADD PRIMARY KEY (`idPiso`);

--
-- Indices de la tabla `regimensalud`
--
ALTER TABLE `regimensalud`
  ADD PRIMARY KEY (`idregimenSalud`);

--
-- Indices de la tabla `relacionesafectivas`
--
ALTER TABLE `relacionesafectivas`
  ADD PRIMARY KEY (`idRelacionesAfectivas`);

--
-- Indices de la tabla `salud`
--
ALTER TABLE `salud`
  ADD PRIMARY KEY (`idSalud`),
  ADD KEY `fk_Salud_GDCAR_Caracterizacion1_idx` (`idCaracterizacion`),
  ADD KEY `fk_Salud_regimenSalud1_idx` (`idregimenSalud`);

--
-- Indices de la tabla `serviciospublicos`
--
ALTER TABLE `serviciospublicos`
  ADD PRIMARY KEY (`idServiciosPublicos`);

--
-- Indices de la tabla `serviciossanitarios`
--
ALTER TABLE `serviciossanitarios`
  ADD PRIMARY KEY (`idServiciosSanitario`);

--
-- Indices de la tabla `socioafectiva`
--
ALTER TABLE `socioafectiva`
  ADD PRIMARY KEY (`idSocioAfectiva`);

--
-- Indices de la tabla `techo`
--
ALTER TABLE `techo`
  ADD PRIMARY KEY (`idTecho`);

--
-- Indices de la tabla `tenenciavivienda`
--
ALTER TABLE `tenenciavivienda`
  ADD PRIMARY KEY (`idTenencia`);

--
-- Indices de la tabla `tiempolibre`
--
ALTER TABLE `tiempolibre`
  ADD PRIMARY KEY (`idTiempoLibre`);

--
-- Indices de la tabla `tipodocumento`
--
ALTER TABLE `tipodocumento`
  ADD PRIMARY KEY (`idTipoDocumento`);

--
-- Indices de la tabla `tipofamiliar`
--
ALTER TABLE `tipofamiliar`
  ADD PRIMARY KEY (`idTipoFamiliar`);

--
-- Indices de la tabla `tipotransporte`
--
ALTER TABLE `tipotransporte`
  ADD PRIMARY KEY (`idTransporte`);

--
-- Indices de la tabla `tipovivienda`
--
ALTER TABLE `tipovivienda`
  ADD PRIMARY KEY (`idTipo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `acompañante`
--
ALTER TABLE `acompañante`
  MODIFY `idAcompañante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `acudiente`
--
ALTER TABLE `acudiente`
  MODIFY `idAcudiente` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `animales`
--
ALTER TABLE `animales`
  MODIFY `idAnimal` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `aspectosvivienda`
--
ALTER TABLE `aspectosvivienda`
  MODIFY `idAspectoVivienda` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `condicionsocial`
--
ALTER TABLE `condicionsocial`
  MODIFY `idCondicionSocial` int(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `detalla_animales`
--
ALTER TABLE `detalla_animales`
  MODIFY `iddetalla_Animales` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `detalla_paredes`
--
ALTER TABLE `detalla_paredes`
  MODIFY `iddetalla_Paredes` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `detalla_pisos`
--
ALTER TABLE `detalla_pisos`
  MODIFY `iddetalla_Pisos` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `detalla_relacafectivas`
--
ALTER TABLE `detalla_relacafectivas`
  MODIFY `iddetalla_RelacAfectivas` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `detalla_servpublic`
--
ALTER TABLE `detalla_servpublic`
  MODIFY `iddetalla_ServPublic` int(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `detalla_socafectiva`
--
ALTER TABLE `detalla_socafectiva`
  MODIFY `iddetalla_SocAfectiva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `detalla_tipotransporte`
--
ALTER TABLE `detalla_tipotransporte`
  MODIFY `iddetalla_tipoTran` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `detalletiempolibre`
--
ALTER TABLE `detalletiempolibre`
  MODIFY `iddetalleTiempoLibre` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `idEmpleado` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `gdcar_caracterizacion`
--
ALTER TABLE `gdcar_caracterizacion`
  MODIFY `idCaracterizacion` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT de la tabla `integrantes`
--
ALTER TABLE `integrantes`
  MODIFY `idIntegrantes` int(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `nivelformacion`
--
ALTER TABLE `nivelformacion`
  MODIFY `idNivelFormacion` int(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `paredes`
--
ALTER TABLE `paredes`
  MODIFY `idParedes` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `IdPersona` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;
--
-- AUTO_INCREMENT de la tabla `pisos`
--
ALTER TABLE `pisos`
  MODIFY `idPiso` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `regimensalud`
--
ALTER TABLE `regimensalud`
  MODIFY `idregimenSalud` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `relacionesafectivas`
--
ALTER TABLE `relacionesafectivas`
  MODIFY `idRelacionesAfectivas` int(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `salud`
--
ALTER TABLE `salud`
  MODIFY `idSalud` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT de la tabla `serviciospublicos`
--
ALTER TABLE `serviciospublicos`
  MODIFY `idServiciosPublicos` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `serviciossanitarios`
--
ALTER TABLE `serviciossanitarios`
  MODIFY `idServiciosSanitario` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `socioafectiva`
--
ALTER TABLE `socioafectiva`
  MODIFY `idSocioAfectiva` int(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `techo`
--
ALTER TABLE `techo`
  MODIFY `idTecho` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `tenenciavivienda`
--
ALTER TABLE `tenenciavivienda`
  MODIFY `idTenencia` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `tiempolibre`
--
ALTER TABLE `tiempolibre`
  MODIFY `idTiempoLibre` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `tipodocumento`
--
ALTER TABLE `tipodocumento`
  MODIFY `idTipoDocumento` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `tipofamiliar`
--
ALTER TABLE `tipofamiliar`
  MODIFY `idTipoFamiliar` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `tipotransporte`
--
ALTER TABLE `tipotransporte`
  MODIFY `idTransporte` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `tipovivienda`
--
ALTER TABLE `tipovivienda`
  MODIFY `idTipo` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
