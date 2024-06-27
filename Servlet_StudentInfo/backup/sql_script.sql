create database dbstudents;
use dbstudents;

create table students(
	sid int not null,
    fullname varchar(50) not null,
    course varchar(50) not null,
    section varchar(50) not null,
    sub1 int not null,
    sub2 int not null,
    total int not null,
    average int not null,
    result varchar(50) not null
);

alter table students
	add constraint pk_sid
		primary key(sid);

select * from students;
        