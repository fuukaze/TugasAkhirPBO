-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 23, 2021 at 03:26 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tugasakhir`
--

-- --------------------------------------------------------

--
-- Table structure for table `antrian`
--

CREATE TABLE `antrian` (
  `id_antri` int(11) NOT NULL,
  `nomor` int(11) NOT NULL,
  `status_antri` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `baru`
--

CREATE TABLE `baru` (
  `no_ktp` int(30) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `no_hp` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `baru`
--

INSERT INTO `baru` (`no_ktp`, `nama`, `no_hp`) VALUES
(1232343321, 'paijo', 878514236),
(1232343322, 'aziz', 8439753),
(1232343323, 'asdasd', 213123123),
(1232343324, 'asdasd', 21312312),
(1232343325, 'asssaaa', 12345555),
(1232343326, 'asdasd', 123123);

-- --------------------------------------------------------

--
-- Table structure for table `biodata`
--

CREATE TABLE `biodata` (
  `id_data` int(30) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` varchar(20) NOT NULL,
  `tipe_mobil` varchar(15) NOT NULL,
  `nopol` varchar(9) NOT NULL,
  `status_sewa` varchar(6) NOT NULL,
  `km` int(11) NOT NULL,
  `keluhan` text NOT NULL,
  `id_montir` int(11) NOT NULL,
  `id_paket` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `biodata`
--

INSERT INTO `biodata` (`id_data`, `nama`, `alamat`, `no_hp`, `tipe_mobil`, `nopol`, `status_sewa`, `km`, `keluhan`, `id_montir`, `id_paket`) VALUES
(2, 'Lintang', 'Jakarta & Bandung', '08283390410', 'Suzuki Carry Pi', 'N 9087 T', 'ya', 5833, 'ban bocor', 1, ''),
(4, 'Rizky', 'Purwodadi', '087367422', 'mini chooper', 'H 8997 J', 'Ya', 17000, '', 2, ''),
(5, 'ARIE D SHINING HIRO', 'Depok', '083897161667', 'Mitsibishi Xpan', 'K 0927 YT', 'Ya', 8093, '', 3, '');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id_login` int(11) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id_login`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `montir`
--

CREATE TABLE `montir` (
  `id_montir` int(11) NOT NULL,
  `nama_montir` varchar(30) NOT NULL,
  `skill` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `montir`
--

INSERT INTO `montir` (`id_montir`, `nama_montir`, `skill`) VALUES
(1, 'Muhammad Abdul Aziz', 'unlimited repair between 7AM - 12PM'),
(2, 'Tekad Agung Nugroho', 'Rebahan'),
(3, 'Fathan Cahya Dar', 'Push genshin impact');

-- --------------------------------------------------------

--
-- Table structure for table `nota`
--

CREATE TABLE `nota` (
  `id_nota` int(11) NOT NULL,
  `id_antri` int(11) NOT NULL,
  `id_data` int(11) NOT NULL,
  `id_login` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `paket`
--

CREATE TABLE `paket` (
  `id_paket` varchar(11) NOT NULL,
  `keterangan` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `paket`
--

INSERT INTO `paket` (`id_paket`, `keterangan`) VALUES
('Paket 1', 'GANTI OLI\r\nPENGECEKAN TOTAL(TERMASUK CEK MESIN)');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `antrian`
--
ALTER TABLE `antrian`
  ADD PRIMARY KEY (`id_antri`);

--
-- Indexes for table `baru`
--
ALTER TABLE `baru`
  ADD PRIMARY KEY (`no_ktp`);

--
-- Indexes for table `biodata`
--
ALTER TABLE `biodata`
  ADD PRIMARY KEY (`id_data`),
  ADD KEY `id_montir` (`id_montir`),
  ADD KEY `id_paket` (`id_paket`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id_login`);

--
-- Indexes for table `montir`
--
ALTER TABLE `montir`
  ADD PRIMARY KEY (`id_montir`);

--
-- Indexes for table `nota`
--
ALTER TABLE `nota`
  ADD PRIMARY KEY (`id_nota`),
  ADD KEY `id_antrian` (`id_antri`),
  ADD KEY `id_biodata` (`id_data`),
  ADD KEY `id_login` (`id_login`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `baru`
--
ALTER TABLE `baru`
  MODIFY `no_ktp` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1232343327;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
