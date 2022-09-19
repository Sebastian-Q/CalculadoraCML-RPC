-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-09-2022 a las 01:36:11
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `base_datos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bdcalculadora`
--

CREATE TABLE `bdcalculadora` (
  `id` int(11) NOT NULL,
  `operacion` varchar(15) NOT NULL,
  `numero1` double NOT NULL,
  `numero2` double NOT NULL,
  `total` double NOT NULL,
  `fecha` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `bdcalculadora`
--

INSERT INTO `bdcalculadora` (`id`, `operacion`, `numero1`, `numero2`, `total`, `fecha`) VALUES
(1, 'Suma', 5.5, 4, 9.5, '2022-09-15 18:30:37'),
(2, 'Resta', 5, 2.5, 2.5, '2022-09-15 18:31:55'),
(3, 'Multiplicacion', 5, 2.1, 10.5, '2022-09-15 18:31:55'),
(4, 'Division', 7, 3, 2.3333333333333335, '2022-09-15 18:31:55'),
(5, 'Exponente', 2, 3, 8, '2022-09-15 18:31:55'),
(6, 'Raiz', 10, 0, 3.1622776601683795, '2022-09-15 18:31:55');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bdcalculadora`
--
ALTER TABLE `bdcalculadora`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bdcalculadora`
--
ALTER TABLE `bdcalculadora`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
