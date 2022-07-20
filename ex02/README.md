*오라클 사용자 생성

create user book IDENTIFIED by book
default tablespace users
temporary tablespace temp;

grant connect, dba to book;
