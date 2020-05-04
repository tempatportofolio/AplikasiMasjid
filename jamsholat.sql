-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 04, 2020 at 12:26 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jamsholat`
--

-- --------------------------------------------------------

--
-- Table structure for table `identitas_masjid`
--

CREATE TABLE `identitas_masjid` (
  `id_identitas` int(255) NOT NULL,
  `nama_masjid` varchar(255) NOT NULL,
  `alamat_masjid` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `identitas_masjid`
--

INSERT INTO `identitas_masjid` (`id_identitas`, `nama_masjid`, `alamat_masjid`) VALUES
(1, 'Masjid Islamic Center', 'Lombok');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_sholat`
--

CREATE TABLE `jadwal_sholat` (
  `id_jadwal` int(255) NOT NULL,
  `dhuha` varchar(255) NOT NULL,
  `shubuh` varchar(255) NOT NULL,
  `dhuhur` varchar(255) NOT NULL,
  `ashar` varchar(255) NOT NULL,
  `maghrib` varchar(255) NOT NULL,
  `isha` varchar(255) NOT NULL,
  `foto` varchar(255) NOT NULL,
  `video` varchar(255) NOT NULL,
  `transisi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jadwal_sholat`
--

INSERT INTO `jadwal_sholat` (`id_jadwal`, `dhuha`, `shubuh`, `dhuhur`, `ashar`, `maghrib`, `isha`, `foto`, `video`, `transisi`) VALUES
(1, '09:30', '03:30', '11:36', '14:30', '17:30', '19:00', '1576633116122', '0', '1581490011193');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nomor_mahasiswa` int(225) NOT NULL,
  `nama_mahasiswa` varchar(215) NOT NULL,
  `alamat_mahasiswa` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nomor_mahasiswa`, `nama_mahasiswa`, `alamat_mahasiswa`) VALUES
(123123123, 'Rohman', 'Bima');

-- --------------------------------------------------------

--
-- Table structure for table `marquee`
--

CREATE TABLE `marquee` (
  `id_marquee` int(255) NOT NULL,
  `isi_marquee` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marquee`
--

INSERT INTO `marquee` (`id_marquee`, `isi_marquee`) VALUES
(1, '\"Kebersihan Sebagian Dari Iman\"');

-- --------------------------------------------------------

--
-- Table structure for table `mhs`
--

CREATE TABLE `mhs` (
  `nim` int(33) NOT NULL,
  `name` text NOT NULL,
  `address` text NOT NULL,
  `gender` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mhs`
--

INSERT INTO `mhs` (`nim`, `name`, `address`, `gender`) VALUES
(1283129387, 'Irfan', 'Malang', 'Pria');

-- --------------------------------------------------------

--
-- Table structure for table `pengumuman_masjid`
--

CREATE TABLE `pengumuman_masjid` (
  `id_pengumuman` int(255) NOT NULL,
  `judul_pengumuman` varchar(255) NOT NULL,
  `isi_pengumuman` text NOT NULL,
  `aktif` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengumuman_masjid`
--

INSERT INTO `pengumuman_masjid` (`id_pengumuman`, `judul_pengumuman`, `isi_pengumuman`, `aktif`) VALUES
(13, '', '', 'no');

-- --------------------------------------------------------

--
-- Table structure for table `slideshow`
--

CREATE TABLE `slideshow` (
  `id_slideshow` int(255) NOT NULL,
  `judul_slideshow` varchar(255) NOT NULL,
  `url_slideshow` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `slideshow`
--

INSERT INTO `slideshow` (`id_slideshow`, `judul_slideshow`, `url_slideshow`) VALUES
(19, 'foto', '1300x1000.jpg'),
(20, 'foto', 'CIMG1043JPG.jpg'),
(21, 'foto', 'CIMG1902JPG.jpg'),
(22, 'foto', 'CIMG1927JPG.jpg'),
(23, 'foto', 'CIMG1968JPG.jpg'),
(24, 'foto', 'efef.jpg'),
(26, 'foto', 'P90811-063819.jpg'),
(27, 'video', 'Animasi_Tata_Cara_Wudhu_Rasulullah_-_Belajar_Bareng_Baim_(2).mp4');

-- --------------------------------------------------------

--
-- Table structure for table `tagline`
--

CREATE TABLE `tagline` (
  `id_tagline` int(255) NOT NULL,
  `isi_tagline` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tagline`
--

INSERT INTO `tagline` (`id_tagline`, `isi_tagline`) VALUES
(2, 'Pengajian Setelah Sholat Maghrib');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(222) NOT NULL,
  `username` varchar(215) NOT NULL,
  `password` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'admin123', '12345678');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_masjid`
--
ALTER TABLE `identitas_masjid`
  ADD PRIMARY KEY (`id_identitas`);

--
-- Indexes for table `jadwal_sholat`
--
ALTER TABLE `jadwal_sholat`
  ADD PRIMARY KEY (`id_jadwal`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nomor_mahasiswa`);

--
-- Indexes for table `marquee`
--
ALTER TABLE `marquee`
  ADD PRIMARY KEY (`id_marquee`);

--
-- Indexes for table `mhs`
--
ALTER TABLE `mhs`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `pengumuman_masjid`
--
ALTER TABLE `pengumuman_masjid`
  ADD PRIMARY KEY (`id_pengumuman`);

--
-- Indexes for table `slideshow`
--
ALTER TABLE `slideshow`
  ADD PRIMARY KEY (`id_slideshow`);

--
-- Indexes for table `tagline`
--
ALTER TABLE `tagline`
  ADD PRIMARY KEY (`id_tagline`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_masjid`
--
ALTER TABLE `identitas_masjid`
  MODIFY `id_identitas` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `jadwal_sholat`
--
ALTER TABLE `jadwal_sholat`
  MODIFY `id_jadwal` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `marquee`
--
ALTER TABLE `marquee`
  MODIFY `id_marquee` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pengumuman_masjid`
--
ALTER TABLE `pengumuman_masjid`
  MODIFY `id_pengumuman` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `slideshow`
--
ALTER TABLE `slideshow`
  MODIFY `id_slideshow` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `tagline`
--
ALTER TABLE `tagline`
  MODIFY `id_tagline` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(222) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
