-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2022 at 04:12 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbrpldi`
--

-- --------------------------------------------------------

--
-- Table structure for table `sqladmin`
--

CREATE TABLE `sqladmin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sqlcart`
--

CREATE TABLE `sqlcart` (
  `id` int(11) NOT NULL,
  `total_harga` int(11) NOT NULL,
  `pembayaran` varchar(15) NOT NULL,
  `status_checkout` varchar(10) NOT NULL,
  `username_customer` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sqlcartitem`
--

CREATE TABLE `sqlcartitem` (
  `id` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `id_cart` int(11) NOT NULL,
  `id_product` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sqlcustomer`
--

CREATE TABLE `sqlcustomer` (
  `username` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(12) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sqlproduct`
--

CREATE TABLE `sqlproduct` (
  `id` int(11) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `harga` int(11) NOT NULL,
  `variasi` varchar(25) NOT NULL,
  `stok` int(11) NOT NULL,
  `deskripsi` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sqladmin`
--
ALTER TABLE `sqladmin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `sqlcart`
--
ALTER TABLE `sqlcart`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username_customer` (`username_customer`);

--
-- Indexes for table `sqlcartitem`
--
ALTER TABLE `sqlcartitem`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_cart` (`id_cart`),
  ADD KEY `id_product` (`id_product`);

--
-- Indexes for table `sqlcustomer`
--
ALTER TABLE `sqlcustomer`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `sqlproduct`
--
ALTER TABLE `sqlproduct`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sqlcart`
--
ALTER TABLE `sqlcart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `sqlcartitem`
--
ALTER TABLE `sqlcartitem`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `sqlproduct`
--
ALTER TABLE `sqlproduct`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `sqlcart`
--
ALTER TABLE `sqlcart`
  ADD CONSTRAINT `sqlcart_ibfk_1` FOREIGN KEY (`username_customer`) REFERENCES `sqlcustomer` (`username`);

--
-- Constraints for table `sqlcartitem`
--
ALTER TABLE `sqlcartitem`
  ADD CONSTRAINT `sqlcartitem_ibfk_1` FOREIGN KEY (`id_cart`) REFERENCES `sqlcart` (`id`),
  ADD CONSTRAINT `sqlcartitem_ibfk_2` FOREIGN KEY (`id_product`) REFERENCES `sqlproduct` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
