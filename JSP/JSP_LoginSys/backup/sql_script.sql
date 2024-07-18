create database dbLoginSys;
use dbLoginSys;

drop table users;

create table users(
	uid int not null primary key AUTO_INCREMENT,
    full_name varchar(50) not null,
    email varchar(50) not null,
    phone varchar(50) not null,
    login_name varchar(50) not null unique,
    login_password varchar(50) not null,
    user_type varchar(50) not null
);

select * from users;

        
