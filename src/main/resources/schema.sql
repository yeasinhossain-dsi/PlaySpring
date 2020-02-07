--
-- Creating Users Table
--
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(250) NOT NULL,
  `firt_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(250) NOT NULL,
  `isActive` bit(1) DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Creating Publication Table
--
CREATE TABLE `publication` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Creating Publication Books
--
CREATE TABLE `books` (
  `id` int NOT NULL AUTO_INCREMENT,
  `book_name` varchar(250) NOT NULL,
  `author_name` varchar(250) NOT NULL,
  `publication_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 
-- Adding Foreign keys
-- 

ALTER TABLE `publication` 
ADD CONSTRAINT `fk_publications_book`
  FOREIGN KEY (`id`)
  REFERENCES `play_spring`.`books` (`publication_id`)
  ON DELETE RESTRICT
  ON UPDATE CASCADE;

ALTER TABLE `books` 
ADD CONSTRAINT `fk_book_publications`
  FOREIGN KEY (`publication_id`)
  REFERENCES `play_spring`.`publication` (`id`)  
  ON UPDATE CASCADE;