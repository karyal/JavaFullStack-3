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


-- Update/chnage user password of mysql
-- root
-- pcps@123

alter user 'root'@'localhost' 
	identified by 'nepal@123';

use test;

drop table persons;
create table persons (
	pid int primary key auto_increment,
    full_name varchar(50) not null,
    phone varchar(50) not null,
    email varchar(50) not null,
    birth_date varchar(50) not null
);

select * from persons;

drop table dateTest;
create table dateTest(
	reg_date date
);

insert into dateTest values('2002-12-22');
select * from dateTest;

delete from dateTest;