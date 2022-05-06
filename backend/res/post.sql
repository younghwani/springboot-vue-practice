CREATE TABLE `post` (
  `no` int NOT NULL AUTO_INCREMENT,
  `userId` varchar(45) COLLATE utf8mb4_cs_0900_as_cs NOT NULL,
  `title` varchar(50) COLLATE utf8mb4_cs_0900_as_cs NOT NULL,
  `context` mediumtext COLLATE utf8mb4_cs_0900_as_cs,
  `date` varchar(45) COLLATE utf8mb4_cs_0900_as_cs NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_cs_0900_as_cs;
