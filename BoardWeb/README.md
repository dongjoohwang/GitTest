# spring 환경설정

1.azul에서 jdk 설치(**책에는 11.0.12 버전으로 설치하라고 나와있으나,
현재 홈페이지에서 제공되는 버전은 11.0.15 버전이다.)

2. 압축 해제('D:\servlet' 폴더)

3. 압축 파일 이름 변경(jdk11.0.15)

4. JAVA_HOME 등록(내 PC=> 속성=> 고급 시스템 설정=> 환경 변수=> 시스템 변수 새로 만들기
(변수 이름: JAVA_HOMR, 변수 값: D:\servlet\jdk11.0.15\bin) => path 변수 선택 => 편집 => 새로 만들기(%JAVA_HOME%\bin)
=> 맨 위로 이동시키기 => 환경 변수 창에서 확인 누르기 => cmd 창 실행해서 javac 입력(책에는 java-version을 입력하라고 되어있으나, 오류 발생)

5. 이클립스(STS) 설치 => 생략

6. STS.ini 파일 메모장으로 열어서 -vm 옵션 추가
-vm
D:\servlet\jdk11.0.15\bin(파일 설치한 경로)

7. 톰캣 설치 => 생략

8. H2 데이터베이스 구축(**H2보다는 sql developer를 더 많이 사용할 것 같음)
* H2는 SYSDATE 기능을 지원하지 않음 => sql보다 사용하는데 제약이 많음

9. spring legacy 프로젝트 생성(6번을 하지 않을 경우 프로젝트 자체가 생성되지 않는다.)

10. 프로젝트 설정 변경(프로젝트 선택 => properties => project facets
* dynamic web module : 4.0, java : 1.8, apache tomcat 9.0 체크 => apply and close
(dynamic web ~ or newer 오류 방지 => 스프링이 요구하는 버전 맞추기)

11. src/main/resources 소스 폴더에서 log4j.xml 파일을 제외한 나머지 파일, 패키지 삭제 후 log4j.xml2로 이름 변경

12. log4j.xml2 파일 수정

13. src/main/webapp/web-inf의 spring, views 폴더 삭제

14. web.xml 파일 열어서 루트 엘리먼트를 제외한 나머지 설정 모두 삭제 후 저장

15. pom.xml에서 스프링 버전 설정 변경(3.1.1 => 5.0.7)
(**책에는 5.3.9로 변경하라고 나와있으나, 오류 발생 => sts에서는 제공하지 않는 버전인 것 같다.)
(1) <groupId>org.apache.maven.plugins</groupId>에서 source, target 부분 1.8로 변경

 <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>2.5.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                    
(2) <groupId>javax.servlet</groupId> / <artifactId>javax.servlet-api</artifactId>
    부분 버전을 4.0.1로 변경
    
    	<dependency>
		    <groupId>javax.servlet</groupId>
		    <artifactId>javax.servlet-api</artifactId>
		    <version>4.0.1</version>
		    <scope>provided</scope>
		</dependency>
    
(3) <groupId>log4j</groupId> 부분 주석 처리 후 log4j 의존성 설정을 주석 처리 후 log4j-core로 변경

<!--  
	 <groupId>log4j</groupId>
	 <artifactId>log4j</artifactId>
	 <version>1.2.15</version>
-->
     <groupId>org.apache.logging.log4j</groupId>
     <artifactId>log4j-core</artifactId>
     <version>2.17.2</version>





