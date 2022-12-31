-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 31, 2022 at 11:34 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cubicle`
--

-- --------------------------------------------------------

--
-- Table structure for table `cube`
--

CREATE TABLE `cube` (
  `kode_konsumen` int(5) NOT NULL,
  `nama_produk` varchar(25) NOT NULL,
  `harga_satuan` int(7) NOT NULL,
  `jumlah` int(10) NOT NULL,
  `diskon` varchar(1000) NOT NULL,
  `total_bayar` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cube`
--

INSERT INTO `cube` (`kode_konsumen`, `nama_produk`, `harga_satuan`, `jumlah`, `diskon`, `total_bayar`) VALUES
(44, 'Pocket Cube (2x2x2)', 20000, 2, '2%', 39200),
(222, 'Master Cube (4x4x4)', 90000, 2, '-', 180000),
(1111, 'Pocket Cube (2x2x2)', 20000, 2, '2%', 39200);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cube`
--
ALTER TABLE `cube`
  ADD PRIMARY KEY (`kode_konsumen`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
