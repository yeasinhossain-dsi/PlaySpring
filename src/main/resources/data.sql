-- 
-- Inserting Data into Publication Table
-- 
LOCK TABLES `publication` WRITE;
INSERT INTO `publication` VALUES (1,'Mokbul Publication'),(2,'Packt Publication');
UNLOCK TABLES;

-- 
-- Inserting Data into Books Table
-- 
LOCK TABLES `books` WRITE;
INSERT INTO `books` VALUES (1,'Alient At Attik','Marqus',1),(2,'Stuart Little','Mr. Doe',1),(3,'Dope','Mr. Boss',2);
UNLOCK TABLES;
