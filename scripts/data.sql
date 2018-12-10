DROP DATABASE IF EXISTS `engine`;
CREATE DATABASE `engine`
  DEFAULT CHARACTER SET utf8
  COLLATE utf8_general_ci;

USE `engine`;
# IP资产表
DROP TABLE IF EXISTS `ip_source`;
CREATE TABLE `ip_source` (
  `id`                  INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `type_id`             INT(8)             NOT NULL,
  `name`                VARCHAR(64)        NOT NULL,
  `pic_urls`            VARCHAR(255),
  `create_person_id`    INT(8)             NOT NULL,
  `create_time`         DATETIME           NOT NULL,
  `laste_update_time`   DATETIME           NOT NULL,
  `history_update_time` VARCHAR(255),
  `description`         VARCHAR(255),
  `others`              TEXT
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
# 资产类型表
DROP TABLE IF EXISTS `ip_type`;
CREATE TABLE `ip_type` (
  `id`                  INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `type_name`           VARCHAR(64)        NOT NULL,
  `create_person_id`    INT(8)             NOT NULL,
  `create_time`         DATETIME           NOT NULL,
  `laste_update_time`   DATETIME           NOT NULL,
  `history_update_time` VARCHAR(255),
  `description`         VARCHAR(255),
  `others`              TEXT
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
# 评论表
DROP TABLE IF EXISTS `discuss`;
CREATE TABLE `discuss` (
  `id`           INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `ip_source_id` INT(8)             NOT NULL,
  `discuss_id`   INT(8),
  `create_time`  DATETIME           NOT NULL
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
# 博物馆表
DROP TABLE IF EXISTS `museum`;
CREATE TABLE `museum` (
  `id`               INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `address`          VARCHAR(64)        NOT NULL,
  `name`             VARCHAR(32)        NOT NULL,
  `administrator_id` INT(8)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


DROP TABLE IF EXISTS `identification`;
CREATE TABLE `identification` (
  `id`             INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `name`           VARCHAR(64)        NOT NULL,
  `age`            VARCHAR(32)        NOT NULL,
  `gender`         INT(8),
  `email`          VARCHAR(32),
  `phone_number`   VARCHAR(16),
  `native_place`   VARCHAR(64),
  `family_address` VARCHAR(64)
);

#
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id`             INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `name`           VARCHAR(64)        NOT NULL,
  `age`            VARCHAR(32)        NOT NULL,
  `gender`         INT(8),
  `email`          VARCHAR(32),
  `phone_number`   VARCHAR(16),
  `native_place`   VARCHAR(64),
  `family_address` VARCHAR(64),
  `photo_url`      VARCHAR(64),
  `id_card_url1`   VARCHAR(64),
  `id_card_url2`   VARCHAR(64)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id`              INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `username`        VARCHAR(64)        NOT NULL,
  `password`        VARCHAR(64)        NOT NULL,
  `user_type`       INT(2),
  `role_id`         INT(8),
  `status`          CHAR(1),
  `register_ip`     VARCHAR(16),
  `last_login_ip`   VARCHAR(16),
  `last_login_time` DATETIME,
  `register_time`   DATETIME
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id`      INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `user_id` INT(8),
  `role_id` INT(8)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id`        INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `role_name` VARCHAR(64)        NOT NULL
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id`            INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `role_id`       INT(8),
  `permission_id` INT(8)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id`              INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `permission_name` VARCHAR(32)        NOT NULL,
  `description`     VARCHAR(255)       NOT NULL,
  `url`             VARCHAR(128)       NOT NULL
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
