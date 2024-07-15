create database dbLoginSys;
use dbLoginSys;

drop table users;

create table users(
	uid int not null,
    full_name varchar(50) not null
);

alter table users
	add constraint pk_uid
		primary key(uid);

describe users;

insert into users values(1);

select * from users;

        
