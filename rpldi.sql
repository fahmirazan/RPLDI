-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2022 at 10:35 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rpldi`
--

-- --------------------------------------------------------

--
-- Table structure for table `sqladmin`
--

CREATE TABLE `sqladmin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(12) NOT NULL,
  `foto` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sqladmin`
--

INSERT INTO `sqladmin` (`username`, `password`, `foto`) VALUES
('fahmi', '123456', '');

-- --------------------------------------------------------

--
-- Table structure for table `sqlcart`
--

CREATE TABLE `sqlcart` (
  `id` int(11) NOT NULL,
  `id_product` int(11) NOT NULL,
  `username_costumer` varchar(12) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sqlcheckout`
--

CREATE TABLE `sqlcheckout` (
  `id` int(11) NOT NULL,
  `id_cart` int(11) NOT NULL,
  `status_checkout` varchar(10) NOT NULL,
  `pembayaran` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sqlcostumer`
--

CREATE TABLE `sqlcostumer` (
  `username` varchar(12) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(12) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sqlcostumer`
--

INSERT INTO `sqlcostumer` (`username`, `nama`, `password`, `no_telp`, `alamat`) VALUES
('agus', 'salim', 'agus123', '08172564758', 'bandung'),
('asepasep', 'asep', '567890', '', ''),
('fahmir', 'fahmi', 'fahmi123', '08273648592', 'bandung');

-- --------------------------------------------------------

--
-- Table structure for table `sqlproduct`
--

CREATE TABLE `sqlproduct` (
  `id` int(11) NOT NULL,
  `username_seller` varchar(12) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `variasi` varchar(25) NOT NULL,
  `stok` int(11) NOT NULL,
  `deskripsi` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sqlseller`
--

CREATE TABLE `sqlseller` (
  `username` varchar(12) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(12) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `rekening` varchar(15) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `foto` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sqlseller`
--

INSERT INTO `sqlseller` (`username`, `nama`, `password`, `no_telp`, `rekening`, `tanggal_lahir`, `foto`) VALUES
('agus1', 'agus', 'qwerty', '', '', '0000-00-00', '');

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
  ADD KEY `id_product` (`id_product`),
  ADD KEY `username_costumer` (`username_costumer`);

--
-- Indexes for table `sqlcheckout`
--
ALTER TABLE `sqlcheckout`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_cart` (`id_cart`);

--
-- Indexes for table `sqlcostumer`
--
ALTER TABLE `sqlcostumer`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `sqlproduct`
--
ALTER TABLE `sqlproduct`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username_seller` (`username_seller`);

--
-- Indexes for table `sqlseller`
--
ALTER TABLE `sqlseller`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sqlcart`
--
ALTER TABLE `sqlcart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `sqlcheckout`
--
ALTER TABLE `sqlcheckout`
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
  ADD CONSTRAINT `sqlcart_ibfk_1` FOREIGN KEY (`id_product`) REFERENCES `sqlproduct` (`id`),
  ADD CONSTRAINT `sqlcart_ibfk_2` FOREIGN KEY (`username_costumer`) REFERENCES `sqlcostumer` (`username`);

--
-- Constraints for table `sqlcheckout`
--
ALTER TABLE `sqlcheckout`
  ADD CONSTRAINT `sqlcheckout_ibfk_2` FOREIGN KEY (`id_cart`) REFERENCES `sqlcart` (`id`);

--
-- Constraints for table `sqlproduct`
--
ALTER TABLE `sqlproduct`
  ADD CONSTRAINT `sqlproduct_ibfk_1` FOREIGN KEY (`username_seller`) REFERENCES `sqlseller` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
