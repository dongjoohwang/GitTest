package org.hospital.domain;

import java.util.Date;

import lombok.Data;

/*CREATE TABLE subject(
bno NUMBER(10,0) primary key,           -- primary key
hospitalsub varchar2(1000) not null,
symptom varchar2(1000) not null,
regdate date default sysdate,
updatedate date default sysdate
);*/

@Data
public class SubjectVO {
	private Long bno;
	private String hospitalsub, symptom;
	private Date regdate, updatedate;
}
