* 환경

create table movie(
    code number(4) primary key,
    Title varchar2(50) not null,
    price number(10),
    director varchar2(20),
    actor varchar2(20),
    poster varchar2(100),
    synopsis varchar2(3000)
);

create SEQUENCE movie_seq start with 1 INCREMENT by 1;

insert into movie values(MOVIE_SEQ.NEXTVAL, '베를린', 10000, '류승환', '하정우', '1',
'2012년 제작, 2013년에 개봉한 한국 영화. 베를린에서 남, 북간 첩보전을 소재로 했다.');
insert into movie values(MOVIE_SEQ.NEXTVAL, '마녀', 11000, '박훈정', '김다미', '1',
'10년 전 의문의 사고가 일어난 시설에서 홀로 기억을 잃은 자윤');

select * from movie;

commit;
