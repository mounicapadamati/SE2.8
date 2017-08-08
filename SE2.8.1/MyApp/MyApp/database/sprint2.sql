CREATE TABLE `eagles`.`events`(  
  `event_id` INT(128) NOT NULL AUTO_INCREMENT,
  `event_name` VARCHAR(128),
  `created_date` TIMESTAMP,
  `venue` VARCHAR(512),
  `event_organizer` VARCHAR(128),
  PRIMARY KEY (`event_id`)
);


ALTER TABLE `eagles`.`events`   
  ADD COLUMN `event_number` VARCHAR(24) NULL AFTER `event_organizer`,
  ADD COLUMN `cust_first_name` VARCHAR(128) NULL AFTER `event_number`,
  ADD COLUMN `cust_last_name` VARCHAR(128) NULL AFTER `cust_first_name`,
  ADD COLUMN `contact_number` VARCHAR(20) NULL AFTER `cust_last_name`,
  ADD COLUMN `email` VARCHAR(256) NULL AFTER `contact_number`,
  ADD COLUMN `expected_guests` INT(8) NULL AFTER `email`,
  ADD COLUMN `table_size` INT(2) NULL AFTER `expected_guests`,
  ADD COLUMN `event_planner1` VARCHAR(128) NULL AFTER `table_size`,
  ADD COLUMN `event_planner2` VARCHAR(128) NULL AFTER `event_planner1`;


CREATE TABLE `eagles`.`eagles_users`(  
  `user_id` INT(24) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(128),
  `contact_number` VARCHAR(24),
  `email` VARCHAR(256),
  `role` VARCHAR(128),
  PRIMARY KEY (`user_id`)
);


CREATE TABLE `eagles`.`guests`(  
  `guest_id` INT(10) NOT NULL AUTO_INCREMENT,
  `guest_number` INT(10),
  `first_name` VARCHAR(128),
  `last_name` VARCHAR(128),
  PRIMARY KEY (`guest_id`)
);