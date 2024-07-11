-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-07-2024 a las 20:00:30
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `peliculas_cac`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas`
--

CREATE TABLE `peliculas` (
  `id_pelicula` int(11) NOT NULL,
  `titulo` varchar(256) NOT NULL,
  `director` varchar(256) NOT NULL,
  `elenco` varchar(256) NOT NULL,
  `genero` varchar(40) NOT NULL,
  `duracion` varchar(16) NOT NULL,
  `sinopsis` varchar(512) NOT NULL,
  `fechaDeEstreno` varchar(40) NOT NULL,
  `clasificacion` varchar(16) NOT NULL,
  `imagen` varchar(512) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `peliculas`
--

INSERT INTO `peliculas` (`id_pelicula`, `titulo`, `director`, `elenco`, `genero`, `duracion`, `sinopsis`, `fechaDeEstreno`, `clasificacion`, `imagen`) VALUES
(1, 'Todos lo saben', 'Asghar Farhadi', 'Penelope Cruz, Javier Bardem, Ricardo Darin, Barbara Lennie', 'Drama', '2h 12 m', 'Laura viaja con su familia desde Buenos Aires a su pueblo natal, en Europa, para asistir a la boda de su hermana. Lo que iba a ser una breve visita familiar se vera trastocada por unos acontecimientos imprevistos, que sacudiran las vidas.', '2018', '+16', 'imagenes1.jpg'),
(2, 'Desearas al hombre', 'Diego Kaplan', 'Carolina \"Pampita\" Ardohain, Monica Antonopulos, Juan Sorini, Andrea Frigerio', 'Comedia, romance', '1h 33m', 'Lucia y Ofelia, dos hermanas distanciadas, vuelven a encontrarse con motivo de la boda de la primera con Juan. Ofelia y Juan se desean desde la primera mirada y asi las hermanas se enfrentan a la naturaleza que las separo.', '2017', '+16', 'imagenes2.jpg'),
(3, 'el amor menos pensado', 'Juan Vera', 'Ricardo Darin, Mercedes Moran,Claudia Fontan, Andrea Pietra', 'Comedia, romance', '2h 9m', 'Tras mucho tiempo de matrimonio, Marcos y Ana se interrogan a fondo sobre el amor, la naturaleza del deseo, la fidelidad, y toman una decision que modificara sus vidas para siempre.\r\n', '2018', '+13', 'imagenes3.jpg'),
(4, 'El sacrilegio', 'Brendan Muldowney', 'Tom Holland, Richard Armitage, Jon Bernthal, Stanley Weber', 'Accion', '1h 36m', 'Una minuscula banda de monjes catolicos mantiene una rutina solemne en una remota costa irlandesa. Entonces llega alguien. Viene vestido con las ropas blancas de la orden cisterciense, con papeles y exigiendo lo impensable.', '2017', '+16', 'imagenes4.jpg'),
(5, 'Esperando la carroza', 'Alejandro Doria', 'Antonio Gasalla, China Zorrilla, Luis Brandoni, Betiana Blum', 'Comedia, romance', '1h 34m', 'Mama Cora tiene tres hijos y una hija. Vive con uno de ellos, que tiene problemas economicos. En una reunion familiar se plantea el gran dilema: Quien se hara cargo de ella? Todo se complica cuando reciben la noticia de que la anciana ha muerto.', '1985', '+13', 'imagenes5.jpg'),
(6, 'El futbol o yo', 'Marcos Carnevale', 'Adrian Suar, Julieta Diaz, Rafael Spregelburd, Federico D\'elia', 'Comedia, romance', '1h 44m', 'La pasion de Pedro por el futbol sobrepasa la de la mayoria de los mortales y esta arruinando su vida matrimonial. Veronica da un ultimatum a su marido: si Pedro quiere volver con ella, debera dejar el futbol... y rehabilitarse de su adiccion.', '2017', 'ATP', 'imagenes6.jpg'),
(7, 'Patos', 'Benjamin Renner', 'Kumail Nanjiani, Danny de Vito, Elizabeth Banks', 'Infantil, animac', '1h 22m', 'El papa Mack esta contento y quiere quedarse a salvo con su familia en su estanque en Nueva Inglaterra para siempre, pero la mama Pam quiere cambiar las cosas y mostrarles el mundo a sus hijos.', '2023', 'ATP', 'imagenes7.jpg'),
(8, 'La fuerza de la naturaleza', 'Robert Connolly', 'Eric Bana, Deborra-Lee Furness, Anna Torv', 'Drama, suspenso', '1h 52m', 'Cinco mujeres participan en un retiro de senderismo, pero solo cuatro de ellas consiguen volver. Los agentes federales Aaron Falk y Carmen Cooper se movilizan con la esperanza de encontrar a su informante aun con vida.', '2023', '+16', 'imagenes8.jpg'),
(9, 'Imaginario juguete diabolico', 'Jeff Wadlow', 'DeWanda Wise, Taegen Burns, Pyper Braun, Betty Buckley', 'Terror, suspenso', '1h 44m', 'Una mujer regresa a la casa de su infancia para descubrir que el amigo imaginario que dejo atras es muy real y esta descontento por haberlo abandonado.', '2024', '+16', 'imagenes9.jpg'),
(10, 'Madame Web', 'S.J. Clarkson', 'Dakota Johnson, Mike Epps, Sydney Sweeney, Isabela Merced', 'Accion, aventura', '1h 56m', 'Cassandra Webb es una paramedica que comienza a dar signos de clarividencia. Obligada a desafiar las revelaciones sobre su pasado, necesita proteger a tres mujeres jovenes de un adversario mortal que quiere destruirlas.', '2024', '+13', 'imagenes10.jpg'),
(11, 'Los que se quedan', 'Alexander Payne', 'Paul Giamatti, Dominic Sessa, Da\'Vine Joy Randolph, Carrie Preston', 'Comedia, drama', '2h 12 m', 'En la Navidad de 1970, el solitario profesor Paul Hunham se queda en la escuela con su estudiante, Angus, y la conmovedora cocinera Mary. Juntos, forjaran un vinculo inesperado durante unas nevadas semanas en Nueva Inglaterra.', '2023', '+13', 'imagenes11.jpg'),
(12, 'John Wick 4', 'Chad Stahelski', 'Keanu Reeves, Hiroyuki Sanada, Donnie Yen, Bill Skarsgard', 'Accion, crimen', '2h 49m', 'John Wick vuelve de su retiro impulsado por una incontrolable busqueda de venganza. Al tener que luchar contra los asesinos sedientos de sangre que lo persiguen, John debera llevar sus habilidades al limite si quiere seguir con vida.', '2023', '+16', 'imagenes12.jpg'),
(13, 'Aguas siniestras', 'Bryce McGuire', 'Wyatt Russell, Kerry Condon, Amelie Hoeferie', 'Terror, suspenso', '1h 38m', 'Ray se muda a una nueva casa con su esposa Eve, su hija adolescente y su hijo. Pronto, un oscuro secreto sobre la historia de la casa liberara a un espiritu que aterrorizara a la familia.', '2024', '+13', 'imagenes13.jpg'),
(14, 'La ultima sesion de Freud', 'Matt Brown', 'Anthony Hopkins, Matthew Goode, Liv Lisa Fries', 'Drama', '1h 48m', 'Freud invita al iconico autor C.S. Lewis a un debate sobre la existencia de Dios explorando la relacion de Freud con su hija lesbiana Anna y el romance poco convencional de Lewis con la madre de su mejor amigo.', '2023', '+13', 'imagenes14.jpg'),
(15, 'Float', 'Sherren Lee', 'Robbie Amell, Andrea Bang, Sarah Desjardins', 'Drama, romance', '1h 40m', 'Una chica rechazada por sus padres toma la decision de pasar el verano en un pueblo de playa con su tia, de la que esta distanciada. Casi se ahoga y es rescatada por el socorrista de al lado, que se ofrece a entrenarla.', '2023', '+13', 'imagenes15.jpg'),
(16, 'Venganza silenciosa', 'John Woo', 'Joel Kinnaman, Catalina Sandino Moreno, Kid Cudi', 'Accion, suspenso', '1h 44m', 'Un padre es testigo de la fortuita muerte de su hijo. Roto de dolor y sin voz debido a una herida profunda, decidira someterse a un estricto entrenamiento para vengar el crimen que lo marco de por vida.', '2023', '+16', 'imagenes16.jpg'),
(33, 'Duna 2', 'Denis Villeneuve', 'Zendaya, Timothee Chalamet, Austin Butler, Rebecca Ferguson, Javier Bardem', 'Ciencia Ficcion, Aventura', '1h 35m', 'Paul Atreides se embarca en un epico viaje junto a Chani y los Fremen en una guerra de venganza contra los conspiradores que arruinaron su familia.', '2024', '+16', 'imagenes17.jpg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`id_pelicula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  MODIFY `id_pelicula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
