CREATE TABLE `eagles`.`users`(  
  `first_name` VARCHAR(100),
  `password` VARCHAR(100),
  `username` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`username`)
);

ALTER TABLE `eagles`.`users`   
  ADD COLUMN `last_name` VARCHAR(100) NULL AFTER `username`;

  
  
  ALTER TABLE `eagles`.`users`   
  ADD COLUMN `phone_numer` VARCHAR(24) NULL AFTER `last_name`,
  ADD COLUMN `gender` VARCHAR(4) NULL AFTER `phone_numer`;
