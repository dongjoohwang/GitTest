* 환경
1. windows 10
2. sts(version: 3.9.17.release)
3. tomcat 9.0
4. oracle 11g
5. lombok-1.18.24.jar
6. jstl.jar
7. standard.jar
8. ojdbc6.jar
9. cos.jar
10. 

*****DB

create table board(
    num number(5) primary key,
    pass varchar2(30),
    name varchar2(30),
    email varchar(30),
    title varchar2(50),
    content varchar2(1000),
    readcount number(4) default 0,
    writedate date default sysdate
);

create SEQUENCE board_seq start with 1
increment by 1;

insert into board(num, name, email, pass, title, content)
values(BOARD_SEQ.NEXTVAL, '성윤정', 'pinksung@nate.com',
'1234', '첫방문', '반갑습니다.');

insert into board(num, name, email, pass, title, content)
values(BOARD_SEQ.NEXTVAL, '성윤정', 'pinksung@nate.com',
'1234', '김밥', '맛있어요.');

insert into board(num, name, email, pass, title, content)
values(BOARD_SEQ.NEXTVAL, '전수빈', 'raccon@nate.com',
'3333', '고등애', '일식입니다.');

insert into board(num, name, email, pass, title, content)
values(BOARD_SEQ.NEXTVAL, '전원지', 'one@nate.com',
'1111', '갯골마을', '돼지삼겹살이 맛있습니다.');

commit;

select * from board;

***특징
dbcp : <Resource auth="Container" driverClassName="oracle.jdbc.OracleDriver" 
		maxIdle="10" maxTotal="20" maxWaitMillis="-1" name="jdbc/myoracle"
		password="tiger" type="javax.sql.DataSource"
		url="jdbc:oracle:thin:@127.0.0.1:1521:xe" username="scott" />





<!-- https://mvnrepository.com/artifact/javax.servlet/jstl -->
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
    <version>1.2</version>
</dependency>

<!-- https://mvnrepository.com/artifact/taglibs/standard -->
<dependency>
    <groupId>taglibs</groupId>
    <artifactId>standard</artifactId>
    <version>1.1.2</version>
</dependency>



