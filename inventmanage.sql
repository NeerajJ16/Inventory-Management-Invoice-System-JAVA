-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 17, 2022 at 07:50 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventmanage`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `CartId` int(11) NOT NULL,
  `INID` int(11) NOT NULL,
  `c_id` int(11) NOT NULL,
  `customer_name` varchar(50) NOT NULL,
  `total_bill` int(11) NOT NULL,
  `order_date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`CartId`, `INID`, `c_id`, `customer_name`, `total_bill`, `order_date`) VALUES
(1, 102, 3, 'Cash', 500, '2020-11-07'),
(2, 103, 0, 'Cash', 2280, '2020-11-07'),
(3, 104, 0, 'Cash', 581, '2020-11-07'),
(4, 105, 10, 'Cash', 500, '2020-11-07'),
(5, 107, 0, 'Cash', 750, '2020-11-08'),
(6, 108, 0, 'Cash', 1010, '2020-11-08'),
(7, 111, 0, 'Cash', 165, '2020-12-07'),
(8, 112, 0, 'Cash', 140, '2020-12-07'),
(9, 114, 0, 'Cash', 4739, '2020-12-14'),
(10, 118, 5, 'Cash', 568, '2021-03-25'),
(11, 121, 3, 'Cash', 28, '2021-05-02'),
(12, 122, 3, 'Cash', 120, '2021-05-02'),
(13, 124, 1, 'Cash', 915, '2021-05-03');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `c_id` int(11) NOT NULL,
  `c_name` varchar(50) NOT NULL,
  `c_mobile` varchar(10) NOT NULL,
  `c_address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`c_id`, `c_name`, `c_mobile`, `c_address`) VALUES
(1, 'Cash', '1', 'Cash'),
(2, 'Neeraj Jawahirani', '9734127645', 'Laxmi Bhavan,Shivaji Chowk,pune'),
(3, 'Lakhan Gurbani', '8408562341', 'Divine Society,Flat 6, MG Road,Pune'),
(4, 'Dhruv Khushalani', '7985453210', 'Kripa Heights,Flat 402,FR Road,Pune'),
(5, 'Aditi K', '8745320876', 'Ganesha Bhavan,KP road,Pune'),
(6, 'Satyam Singh', '9854347856', 'Geeta Apartmennt,Flat 505,Pune'),
(7, 'Antil Rajaram', '7656987865', 'Majestic Apartment,Flat 803,Pune'),
(8, 'Rajkumar Sharma', '9956435465', 'Gautam Arcade,Flat 7,KPRoad, Pune'),
(9, 'Rameshwaram Kapoor', '8756435678', 'Bunglow 8, Sindhu Park,  Saudagar, Pune'),
(10, 'Aarushi Khaanna', '7856434312', 'Majestic Apartments, Flat 405, KP,Pune'),
(11, 'Megha Singh', '7866549878', 'Rupali Apartments, FLat 3,MG Road,Pune'),
(12, 'Komal Sharma', '985416578', 'Geeta Heights, MG Road,Pune'),
(13, 'Kamlesh Sharma', '8712903421', 'Divine Majestic Apartments, MG Road,Pune'),
(15, 'Shilpha Shetty', '7432851255', 'Galaxy Apartment, Chembur');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `e_id` int(11) NOT NULL,
  `e_name` varchar(50) NOT NULL,
  `e_mobile` varchar(11) NOT NULL,
  `e_address` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`e_id`, `e_name`, `e_mobile`, `e_address`) VALUES
(1, 'Sameer Deshpande', '7934001645', 'KP Road,Pune'),
(2, 'Prajakta Yerawar', '9812438534', 'MG Road,Pune'),
(3, 'Mayank Patil', '8745230987', 'KP Road,Pune');

-- --------------------------------------------------------

--
-- Table structure for table `innvoiceid`
--

CREATE TABLE `innvoiceid` (
  `exid` int(11) NOT NULL,
  `val` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `innvoiceid`
--

INSERT INTO `innvoiceid` (`exid`, `val`) VALUES
(1, '125');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `p_id` int(11) NOT NULL,
  `p_name` varchar(50) NOT NULL,
  `p_barcode` varchar(50) NOT NULL,
  `p_mrp` int(11) NOT NULL,
  `p_qty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`p_id`, `p_name`, `p_barcode`, `p_mrp`, `p_qty`) VALUES
(1, 'Sugar 250 grams', '2500', 28, 19),
(2, 'Sugar 500 grams', '2501', 55, 24),
(3, 'Sugar 1 kg', '2502', 100, 5),
(4, 'Moong Dal 250 grams', '2503', 24, 11),
(5, 'Moong Dal 500 grams', '2504', 45, 9),
(6, 'Tur Dal 250 grams', '2505', 20, 20),
(7, 'Tur Dal 500 grams', '2506', 38, 10),
(8, 'Urad Dal 250 grams', '2507', 40, 30),
(9, 'Urad Dal 500 grams', '2508', 80, 15),
(10, 'Chana Dal 250 grams', '2509', 30, 23),
(11, 'Chana Dal 500 grams', '2510', 50, 11),
(12, 'Basmati Rice 1kg(Full)', '2511', 85, 41),
(13, 'Basmati Rice 5kg(Full)', '2512', 415, 21),
(14, 'Basmati Rice 1kg(Barik)', '2513', 75, 25),
(15, 'Basmati Rice 5kg(Barik)', '2514', 350, 24),
(16, 'Sweekar Oil 10kg', '2515', 1440, 12),
(17, 'Sweekar Oil 5kg', '2516', 750, 20),
(18, 'Bournvita 1kg Pouch', '2517', 350, 20),
(20, 'Bournvita 1kg Bottle', '2518', 375, 13),
(21, 'Bournvita 500 grams pouch', '2519', 180, 34),
(22, 'Bournvita 500 grams bottle', '2520', 200, 20),
(23, 'Arshirwad Aata 5kg', '2521', 450, 41),
(24, 'Arshirwad Aata 10kg', '2522', 870, 24),
(25, 'Chaana Barik 500 grams', '2523', 30, 20),
(26, 'Chaana Barik 250 grams', '2524', 15, 24),
(27, 'Chaana Barik 1kg', '2525', 58, 20),
(28, 'Amul Cheese 1 cube', '2526', 18, 55),
(29, 'Amul Cheese(Set of 10 cubes)', '2527', 98, 14),
(30, 'Dettol Soap Pack of 4', '2528', 55, 27),
(31, 'Head and Shoulder Shampoo', '2529', 375, 16),
(32, 'Besan 250 grams', '2530', 25, 23),
(33, 'Besan 500 grams', '2531', 48, 30),
(34, 'Colgate Toothpaste Small', '2532', 55, 10),
(35, 'Colgate Toothpaste Big', '2533', 100, 14),
(36, 'Maggie 4 in 1', '2534', 45, 24),
(37, 'Maggie 6 in 1', '2535', 60, 12),
(38, 'Maggie 8 in 1', '2536', 80, 12),
(39, 'Moogfali 250 grams', '2537', 28, 14),
(40, 'Moogfali 500 grams', '2538', 53, 17),
(41, 'Glucond', '2539', 55, 15),
(42, 'Papad', '2540', 85, 35),
(44, 'Kurmura 250 grams', '2541', 20, 15);

-- --------------------------------------------------------

--
-- Table structure for table `productupdate`
--

CREATE TABLE `productupdate` (
  `Id` int(11) NOT NULL,
  `INID` int(11) NOT NULL,
  `Product_name` varchar(50) NOT NULL,
  `Bar_code` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `Unit_price` int(11) NOT NULL,
  `Total_price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `productupdate`
--

INSERT INTO `productupdate` (`Id`, `INID`, `Product_name`, `Bar_code`, `qty`, `Unit_price`, `Total_price`) VALUES
(1, 1, 'Bournvita 1kg Bottle', 2518, 2, 375, 750),
(2, 1, 'Basmati Rice 5kg(Full)', 2512, 2, 420, 840),
(3, 1, 'Sweekar Oil 10kg', 2515, 1, 1440, 1440),
(4, 1, 'Tur Dal 500 grams', 2506, 2, 38, 76),
(5, 1, 'Chana Dal 500 grams', 2510, 2, 50, 100),
(6, 2, 'Sugar 1 kg', 2502, 10, 100, 1000),
(7, 3, 'Moong Dal 250 grams', 2503, 5, 24, 120),
(8, 5, 'Moong Dal 500 grams', 2504, 10, 45, 450),
(9, 6, 'Tur Dal 250 grams', 2505, 1, 20, 20),
(10, 7, 'Moong Dal 250 grams', 2503, 10, 24, 240),
(11, 8, 'Urad Dal 250 grams', 2507, 1, 40, 40),
(12, 8, 'Chana Dal 500 grams', 2510, 1, 50, 50),
(13, 1, 'Sugar 1 kg', 2502, 5, 100, 500),
(14, 1, 'Basmati Rice 5kg(Full)', 2512, 2, 420, 840),
(15, 1, 'Sweekar Oil 10kg', 2515, 1, 1440, 1440),
(16, 1, 'Bournvita 1kg Pouch', 2517, 2, 350, 700),
(17, 1, 'Tur Dal 500 grams', 2506, 2, 38, 76),
(18, 1, 'Chana Dal 500 grams', 2510, 1, 50, 50),
(19, 1, 'Urad Dal 500 grams', 2508, 1, 80, 80),
(20, 2, 'Sugar 1 kg', 2502, 10, 100, 1000),
(21, 2, 'Sweekar Oil 10kg', 2515, 2, 1440, 2880),
(22, 3, 'Tur Dal 500 grams', 2506, 1, 38, 38),
(23, 4, 'Sweekar Oil 10kg', 2515, 1, 1440, 1440),
(24, 4, 'Basmati Rice 5kg(Full)', 2512, 3, 420, 1260),
(25, 5, 'Moong Dal 250 grams', 2503, 2, 24, 48),
(26, 5, 'Tur Dal 500 grams', 2506, 2, 38, 76),
(27, 6, 'Basmati Rice 5kg(Full)', 2512, 2, 420, 840),
(28, 6, 'Sweekar Oil 10kg', 2515, 1, 1440, 1440),
(29, 6, 'Bournvita 1kg Bottle', 2518, 1, 375, 375),
(30, 7, 'Basmati Rice 5kg(Barik)', 2514, 2, 350, 700),
(31, 7, 'Bournvita 500 grams bottle', 2520, 1, 200, 200),
(32, 9, 'Sugar 1 kg', 2502, 5, 100, 500),
(33, 9, 'Tur Dal 500 grams', 2506, 2, 38, 76),
(34, 11, 'Sugar 500 grams', 2501, 2, 55, 110),
(35, 13, 'Sugar 1 kg', 2502, 5, 100, 500),
(36, 14, 'Urad Dal 250 grams', 2507, 2, 40, 80),
(37, 3, 'Sugar 1 kg', 2502, 2, 100, 200),
(38, 3, 'Moong Dal 500 grams', 2504, 2, 45, 90),
(39, 1, 'Moong Dal 500 grams', 2504, 2, 45, 90),
(40, 1, 'Tur Dal 500 grams', 2506, 2, 38, 76),
(41, 1, 'Sugar 1 kg', 2502, 5, 100, 500),
(42, 2, 'Basmati Rice 5kg(Barik)', 2514, 2, 350, 700),
(43, 2, 'Sweekar Oil 10kg', 2515, 1, 1440, 1440),
(44, 6, 'Sugar 500 grams', 2501, 2, 55, 110),
(45, 7, 'Tur Dal 250 grams', 2505, 2, 20, 40),
(46, 9, 'Moong Dal 500 grams', 2504, 2, 45, 90),
(47, 9, 'Urad Dal 250 grams', 2507, 3, 40, 120),
(48, 11, 'Moong Dal 250 grams', 2503, 5, 24, 120),
(49, 11, 'Tur Dal 500 grams', 2506, 6, 38, 228),
(50, 13, 'Sugar 500 grams', 2501, 2, 55, 110),
(51, 101, 'Arshirwad Aata 10kg', 2522, 1, 870, 870),
(52, 101, 'Sweekar Oil 10kg', 2515, 1, 1440, 1440),
(53, 101, 'Bournvita 1kg Pouch', 2517, 2, 350, 700),
(54, 101, 'Dettol Soap Pack of 4', 2528, 1, 55, 55),
(55, 101, 'Colgate Toothpaste Big', 2533, 1, 100, 100),
(56, 101, 'Chana Dal 500 grams', 2510, 1, 50, 50),
(57, 101, 'Basmati Rice 5kg(Full)', 2512, 2, 420, 840),
(58, 101, 'Tur Dal 500 grams', 2506, 1, 38, 38),
(59, 101, 'Sugar 1 kg', 2502, 5, 100, 500),
(60, 102, 'Chaana Barik 500 grams', 2523, 1, 30, 30),
(61, 102, 'Chaana Barik 500 grams', 2523, 1, 30, 30),
(62, 102, 'Bournvita 500 grams pouch', 2519, 1, 180, 180),
(63, 102, 'Colgate Toothpaste Big', 2533, 2, 100, 200),
(64, 102, 'Maggie 6 in 1', 2535, 1, 60, 60),
(65, 103, 'Basmati Rice 5kg(Full)', 2512, 2, 420, 840),
(66, 103, 'Sweekar Oil 10kg', 2515, 1, 1440, 1440),
(67, 104, 'Besan 500 grams', 2531, 2, 48, 96),
(68, 104, 'Head and Shoulder Shampoo', 2529, 1, 375, 375),
(69, 104, 'Dettol Soap Pack of 4', 2528, 2, 55, 110),
(70, 105, 'Sugar 1 kg', 2502, 5, 100, 500),
(71, 106, 'Sugar 1 kg', 2502, 5, 100, 500),
(72, 106, 'Moong Dal 500 grams', 2504, 1, 45, 45),
(73, 106, 'Tur Dal 500 grams', 2506, 1, 38, 38),
(74, 106, 'Urad Dal 500 grams', 2508, 1, 80, 80),
(75, 106, 'Chana Dal 500 grams', 2510, 1, 50, 50),
(76, 106, 'Basmati Rice 5kg(Full)', 2512, 2, 420, 840),
(77, 106, 'Sweekar Oil 10kg', 2515, 1, 1440, 1440),
(78, 106, 'Bournvita 1kg Pouch', 2517, 2, 350, 700),
(79, 106, 'Arshirwad Aata 10kg', 2522, 1, 870, 870),
(80, 106, 'Chaana Barik 500 grams', 2523, 1, 30, 30),
(81, 106, 'Amul Cheese(Set of 10 cubes)', 2527, 1, 98, 98),
(82, 106, 'Dettol Soap Pack of 4', 2528, 2, 55, 110),
(83, 106, 'Besan 250 grams', 2530, 1, 25, 25),
(84, 106, 'Colgate Toothpaste Big', 2533, 1, 100, 100),
(85, 106, 'Colgate Toothpaste Big', 2533, 1, 100, 100),
(86, 106, 'Maggie 6 in 1', 2535, 1, 60, 60),
(87, 106, 'Sugar 1 kg', 2502, 5, 100, 500),
(88, 106, 'Moong Dal 500 grams', 2504, 1, 45, 45),
(89, 106, 'Tur Dal 500 grams', 2506, 1, 38, 38),
(90, 106, 'Urad Dal 500 grams', 2508, 1, 80, 80),
(91, 106, 'Chana Dal 500 grams', 2510, 1, 50, 50),
(92, 106, 'Basmati Rice 5kg(Full)', 2512, 2, 420, 840),
(93, 106, 'Sweekar Oil 10kg', 2515, 1, 1440, 1440),
(94, 106, 'Bournvita 1kg Pouch', 2517, 2, 350, 700),
(95, 106, 'Arshirwad Aata 10kg', 2522, 1, 870, 870),
(96, 106, 'Chaana Barik 500 grams', 2523, 1, 30, 30),
(97, 106, 'Amul Cheese(Set of 10 cubes)', 2527, 1, 98, 98),
(98, 106, 'Dettol Soap Pack of 4', 2528, 2, 55, 110),
(99, 106, 'Besan 250 grams', 2530, 1, 25, 25),
(100, 106, 'Colgate Toothpaste Big', 2533, 1, 100, 100),
(101, 106, 'Colgate Toothpaste Big', 2533, 1, 100, 100),
(102, 106, 'Maggie 6 in 1', 2535, 1, 60, 60),
(103, 107, 'Basmati Rice 1kg(Barik)', 2513, 10, 75, 750),
(104, 108, 'Basmati Rice 5kg(Full)', 2512, 2, 415, 830),
(105, 108, 'Maggie 8 in 1', 2536, 1, 80, 80),
(106, 108, 'Colgate Toothpaste Big', 2533, 1, 100, 100),
(107, 109, 'Sugar 1 kg', 2502, 10, 100, 1000),
(108, 109, 'Chana Dal 500 grams', 2510, 2, 50, 100),
(109, 110, 'Dettol Soap Pack of 4', 2528, 3, 55, 165),
(110, 111, 'Basmati Rice 1kg(Full)', 2511, 1, 85, 85),
(111, 111, 'Urad Dal 500 grams', 2508, 1, 80, 80),
(112, 112, 'Tur Dal 250 grams', 2505, 7, 20, 140),
(113, 113, 'Chana Dal 250 grams', 2509, 2, 30, 60),
(114, 114, 'Moong Dal 250 grams', 2503, 2, 24, 48),
(115, 114, 'Basmati Rice 5kg(Full)', 2512, 2, 415, 830),
(116, 114, 'Sweekar Oil 10kg', 2515, 1, 1440, 1440),
(117, 114, 'Bournvita 1kg Bottle', 2518, 1, 375, 375),
(118, 114, 'Arshirwad Aata 10kg', 2522, 2, 870, 1740),
(119, 114, 'Amul Cheese(Set of 10 cubes)', 2527, 1, 98, 98),
(120, 114, 'Besan 500 grams', 2531, 1, 48, 48),
(121, 114, 'Colgate Toothpaste Big', 2533, 1, 100, 100),
(122, 114, 'Maggie 6 in 1', 2535, 1, 60, 60),
(123, 115, 'Sugar 1 kg', 2502, 5, 100, 500),
(124, 115, 'Moogfali 500 grams', 2538, 2, 53, 106),
(125, 115, 'Maggie 4 in 1', 2534, 1, 45, 45),
(126, 115, 'Besan 500 grams', 2531, 1, 48, 48),
(127, 116, 'Maggie 6 in 1', 2535, 2, 60, 120),
(128, 116, 'Head and Shoulder Shampoo', 2529, 1, 375, 375),
(129, 116, 'Chaana Barik 500 grams', 2523, 1, 30, 30),
(130, 117, 'Moong Dal 500 grams', 2504, 1, 45, 45),
(131, 117, 'Arshirwad Aata 10kg', 2522, 1, 870, 870),
(132, 117, 'Arshirwad Aata 5kg', 2521, 1, 450, 450),
(133, 117, 'Colgate Toothpaste Big', 2533, 2, 100, 200),
(134, 118, 'Bournvita 1kg Pouch', 2517, 1, 350, 350),
(135, 118, 'Maggie 8 in 1', 2536, 1, 80, 80),
(136, 118, 'Moogfali 250 grams', 2537, 1, 28, 28),
(137, 118, 'Dettol Soap Pack of 4', 2528, 2, 55, 110),
(138, 119, 'Basmati Rice 1kg(Full)', 2511, 2, 85, 170),
(139, 119, 'Bournvita 1kg Bottle', 2518, 1, 375, 375),
(140, 119, 'Moong Dal 500 grams', 2504, 1, 45, 45),
(141, 120, 'Moong Dal 500 grams', 2504, 1, 45, 45),
(142, 120, 'Basmati Rice 5kg(Barik)', 2514, 2, 350, 700),
(143, 120, 'Chaana Barik 250 grams', 2524, 1, 15, 15),
(144, 120, 'Maggie 8 in 1', 2536, 1, 80, 80),
(145, 120, 'Besan 500 grams', 2531, 1, 48, 48),
(146, 120, 'Dettol Soap Pack of 4', 2528, 1, 55, 55),
(147, 120, 'Amul Cheese(Set of 10 cubes)', 2527, 1, 98, 98),
(148, 120, 'Sweekar Oil 10kg', 2515, 1, 1440, 1440),
(149, 120, 'Sugar 1 kg', 2502, 5, 100, 500),
(150, 120, 'Moogfali 500 grams', 2538, 1, 53, 53),
(151, 121, 'Sugar 250 grams', 2500, 1, 28, 28),
(152, 122, 'Maggie 6 in 1', 2535, 2, 60, 120),
(153, 123, 'Basmati Rice 5kg(Full)', 2512, 2, 415, 830),
(154, 124, 'Basmati Rice 1kg(Full)', 2511, 1, 85, 85),
(155, 124, 'Urad Dal 500 grams', 2508, 1, 80, 80),
(156, 124, 'Bournvita 1kg Bottle', 2518, 2, 375, 750),
(157, 125, 'Sugar 1 kg', 2502, 5, 100, 500);

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `Saleid` int(11) NOT NULL,
  `INID` int(11) NOT NULL,
  `c_id` int(11) NOT NULL,
  `customer_name` varchar(50) NOT NULL,
  `total_bill` int(11) NOT NULL,
  `balance` int(11) NOT NULL,
  `Order_Date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`Saleid`, `INID`, `c_id`, `customer_name`, `total_bill`, `balance`, `Order_Date`) VALUES
(10, 116, 7, 'Antil Rajaram', 525, -525, '2020-12-29'),
(13, 120, 3, 'Lakhan Gurbani', 3034, -3034, '2021-05-02'),
(15, 125, 12, 'Komal Sharma', 500, -500, '2021-05-03');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `s_id` int(11) NOT NULL,
  `s_name` varchar(50) NOT NULL,
  `s_mobile` varchar(11) NOT NULL,
  `s_address` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`s_id`, `s_name`, `s_mobile`, `s_address`) VALUES
(1, 'Parle Company Ltd', '222741229', 'MIDC Road,Kalyan'),
(3, 'Shyam Mart Suppliers', '9854123212', 'Kalpa Devi, Mumbai'),
(4, 'Joshun Sugar Suppliers', '7609124289', 'Dadar,Mumbai'),
(5, 'Ok Tested Privated LTd', '8506125432', 'Faridabad'),
(6, 'Deepti Suppliers Private Ltd', '78651245097', 'MIDC,Nagpur'),
(7, 'Datta Private Ltd', '7845129045', 'Kapla Devi,Mumbai');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`CartId`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`c_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`e_id`);

--
-- Indexes for table `innvoiceid`
--
ALTER TABLE `innvoiceid`
  ADD PRIMARY KEY (`exid`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`p_id`),
  ADD UNIQUE KEY `p_barcode` (`p_barcode`);

--
-- Indexes for table `productupdate`
--
ALTER TABLE `productupdate`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`Saleid`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`s_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `CartId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `c_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `e_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `innvoiceid`
--
ALTER TABLE `innvoiceid`
  MODIFY `exid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `p_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT for table `productupdate`
--
ALTER TABLE `productupdate`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=158;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `Saleid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `s_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
