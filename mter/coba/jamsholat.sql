-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Feb 12, 2020 at 01:43 PM
-- Server version: 5.7.29-0ubuntu0.18.04.1
-- PHP Version: 7.2.24-0ubuntu0.18.04.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
(1, 'Amisdsdsdsdsdsdst', 'Shsdsdsdsdsdekhar');

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
(1, '09:32', '03:30', '11:32', '14:32', '17:32', '19:02', '1576633116122', '0', '1581490011193');

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
(1, '** Himbauan untuk seluruh Jamaah Masjid Ar Rohman agar berhati-hati dalam menempatkan kendaraan di tempat parkir. Pastikan kendaraan terkunci rapat. **');

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
(13, 'hwjwj', '    Hadirilah pengajian akbar tahun 2019 di Masjid Ar Rohman, Sabtu 8 Januari 2020 di Pelataran Masjid Ar Rohman Dengan Pembicara Ustadz Budi dari Jakarta.\r\n\r\n<hr>\r\n\r\nProgram khitanan massal akan dilaksanakan pada tanggal 2 Pebruari 2020. Mohon diinformasikan kepada kerabat dan tetangga sekitar.\r\n        \r\n    ', 'no');

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
(2, 'Kajian Rutin dilaksanakan setiap hari Ahad bada Sholat Maghrib');

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
-- Indexes for table `marquee`
--
ALTER TABLE `marquee`
  ADD PRIMARY KEY (`id_marquee`);

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
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
