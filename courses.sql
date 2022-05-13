-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 11, 2022 at 10:13 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `courses`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `email` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`email`, `password`) VALUES
('olafawzi80@gmail.com', '0000');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `courseName` varchar(20) NOT NULL,
  `courseID` varchar(20) NOT NULL,
  `noHoures` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`courseName`, `courseID`, `noHoures`) VALUES
('CSS', 'cs200', 15),
('JavaScript', 'IS222', 20),
('Html', 'WE212', 10);

-- --------------------------------------------------------

--
-- Table structure for table `links`
--

CREATE TABLE `links` (
  `courseID` varchar(20) NOT NULL,
  `url` varchar(250) NOT NULL,
  `linkNo` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `links`
--

INSERT INTO `links` (`courseID`, `url`, `linkNo`) VALUES
('cs200', 'https://www.youtube.com/watch?v=X1ulCwyhCVM', 1),
('cs200', 'affffffffffffffffffffffffffff', 123);

-- --------------------------------------------------------

--
-- Table structure for table `registrationcourse`
--

CREATE TABLE `registrationcourse` (
  `email` varchar(20) NOT NULL,
  `courseID` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registrationcourse`
--

INSERT INTO `registrationcourse` (`email`, `courseID`) VALUES
('lena100@gmail.com', 'cs200'),
('lena100@gmail.com', 'IS222'),
('ola100@gmail.com', 'IS222'),
('ola100@gmail.com', 'WE212');

-- --------------------------------------------------------

--
-- Table structure for table `solutions`
--

CREATE TABLE `solutions` (
  `courseID` varchar(20) NOT NULL,
  `url` varchar(250) NOT NULL,
  `solutionNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `solutions`
--

INSERT INTO `solutions` (`courseID`, `url`, `solutionNo`) VALUES
('cs200', 'https://www.w3schools.com/css/exercise.asp', 1),
('cs200', 'https://codepen.io/mohamed-elsayed2210/pen/eEJWRb', 2);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `firstName` varchar(20) NOT NULL,
  `secondName` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`firstName`, `secondName`, `email`, `password`, `phone`, `gender`) VALUES
('ola', 'fawzi', 'ola100@gmail.com', '0000', '09090', 'Female');

-- --------------------------------------------------------

--
-- Table structure for table `tasks`
--

CREATE TABLE `tasks` (
  `courseID` varchar(20) NOT NULL,
  `url` varchar(250) NOT NULL,
  `taskNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tasks`
--

INSERT INTO `tasks` (`courseID`, `url`, `taskNo`) VALUES
('cs200', 'https://www.w3schools.com/css/css_exercises.asp', 1),
('cs200', 'https://codepen.io/mohamed-elsayed2210/pen/eEJWRb', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD UNIQUE KEY `courseID` (`courseID`);

--
-- Indexes for table `links`
--
ALTER TABLE `links`
  ADD KEY `courseID` (`courseID`);

--
-- Indexes for table `registrationcourse`
--
ALTER TABLE `registrationcourse`
  ADD KEY `courseID` (`courseID`);

--
-- Indexes for table `solutions`
--
ALTER TABLE `solutions`
  ADD KEY `courseID` (`courseID`);

--
-- Indexes for table `tasks`
--
ALTER TABLE `tasks`
  ADD KEY `courseID` (`courseID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `links`
--
ALTER TABLE `links`
  ADD CONSTRAINT `links_ibfk_1` FOREIGN KEY (`courseID`) REFERENCES `course` (`courseID`);

--
-- Constraints for table `registrationcourse`
--
ALTER TABLE `registrationcourse`
  ADD CONSTRAINT `registrationcourse_ibfk_1` FOREIGN KEY (`courseID`) REFERENCES `course` (`courseID`);

--
-- Constraints for table `solutions`
--
ALTER TABLE `solutions`
  ADD CONSTRAINT `solutions_ibfk_1` FOREIGN KEY (`courseID`) REFERENCES `tasks` (`courseID`);

--
-- Constraints for table `tasks`
--
ALTER TABLE `tasks`
  ADD CONSTRAINT `tasks_ibfk_1` FOREIGN KEY (`courseID`) REFERENCES `course` (`courseID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
