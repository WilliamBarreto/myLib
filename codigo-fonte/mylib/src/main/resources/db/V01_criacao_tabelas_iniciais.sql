-- CRIAÇÃO DO DATABASE MYLIB
CREATE DATABASE mylib;

use mylib;

-- AUTHOR'S CREATION TABLE
create table author(
	id BIGINT(4) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    author VARCHAR(30)
) CHAR SET=UTF8 ENGINE=INNODB;

create table profile(
	id bigint(2) primary key not null AUTO_INCREMENT,
    profile VARCHAR(30)
) CHAR SET=UTF8 ENGINE=INNODB;

-- CREATE TABLE USER
CREATE TABLE user (
    id BIGINT(4) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    user VARCHAR(30) NOT NULL,
    email VARCHAR(30) NOT NULL,
    login VARCHAR(20),
    password VARCHAR(30) NOT NULL,
    fk_profileId BIGINT(2)
) CHAR SET=UTF8; -- ENGINE=INNODB

-- BOOK'S TABLE CREATION
CREATE TABLE book (
    id BIGINT(4) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    book VARCHAR(60) NOT NULL,
    publisher VARCHAR(30) NOT NULL,
    pages int(4) NOT NULL,
    fk_authorId BIGINT(4)
)  CHAR SET=UTF8;

-- ASSOCIATION USER BOOK TABLE
create table user_book(
	id BIGINT(4) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    fk_userId BIGINT(4) not null,
    fk_bookId BIGINT(4) not null
) CHAR SET=UTF8; -- ENGINE=INNODB

-- STYLE'S TABLE CREATION
create table style(
	id BIGINT(4) PRIMARY key not null AUTO_INCREMENT,
    style varchar(30) not null
) CHAR SET=UTF8 ENGINE=INNODB;

-- BOOK STYLE REFERENCES TABLE CREATION
create table book_style(
	id BIGINT(4) primary key not null AUTO_INCREMENT,
    fk_bookId BIGINT(4) not null,
    fk_styleId BIGINT(4) not null
) CHAR SET=UTF8;

-- ADD FOREING KEYS
ALTER TABLE user ADD CONSTRAINT FOREIGN KEY(fk_profileId) REFERENCES profile(id);
ALTER TABLE book ADD CONSTRAINT FOREIGN KEY(fk_authorId) REFERENCES author(id);
alter table user_book ADD CONSTRAINT FOREIGN KEY(fk_userId) REFERENCES user(id); 
alter table user_book ADD CONSTRAINT FOREIGN KEY(fk_bookId) REFERENCES book(id);
ALTER TABLE book_style ADD CONSTRAINT FOREIGN KEY(fk_bookId) REFERENCES book(id);
ALTER TABLE book_style ADD CONSTRAINT FOREIGN KEY(fk_styleId) REFERENCES style(id);

-- INSERT PROFILES
INSERT INTO profile (profile) VALUES('Administrator');
INSERT INTO profile (profile) VALUES('Common');
