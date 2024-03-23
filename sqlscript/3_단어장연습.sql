/*
 * `단어장` 프로그램을 위한 테이블
 * 
 * 0. 테이블명 : tbl_javaword
 * 
 * 1. 테이블 구조
 * 								3.To do : 컬럼 값들의 규칙 	=> 요구사항에 대한 '제약조건'
 * 		idx			number(8)  		같은 값을 가질 수 없다. 반드시 값이 있어야한다.
 *		english		varchar2(100)	같은 값을 가질 수 없다. 반드시 값이 있어야한다.
 *		korean		nvarchar2(100)	반드시 값이 있어야한다.
 *		step 		number(1)		반드시 값이 없는 null도 가능하다. 1~4 범위로만 한다.
 *									
 *		4. to do : 검색 속도 향상시키기 위한 컬럼을 정해라. `데이터 행`을 식별할 수 있는 컬럼을 정해라(기본키 설정)
 *
 * 2. 테이블에 행 추가 - 데이터 입력하기
 * 
 * **** 오라클의 키워드는 테이블명, 컬럼명으로 사용 못합니다.
 * */

CREATE TABLE tbl_javaword(
	idx NUMBER(8),
	english varchar(100),
	korean	nvarchar2(100),
	step		number(1)
	
);


INSERT INTO TBL_JAVAWORD(idx,english,korean,step) VALUES (1,'public', '공용의', 1);
INSERT INTO TBL_JAVAWORD(idx,english,korean,step) VALUES (2,'private', '사적인' ,1);
INSERT INTO TBL_JAVAWORD(idx,english,korean,step) VALUES (3,'iterator','반복자', 3);
INSERT INTO TBL_JAVAWORD(idx,english,korean,step) VALUES (4,'application','응용프로그램', 2);
INSERT INTO TBL_JAVAWORD(idx,english,korean,step) VALUES (5,'practice', '연습', 3);
INSERT INTO TBL_JAVAWORD(idx,english,korean,step) VALUES (6,'apple', '사과', 1);
INSERT INTO TBL_JAVAWORD(idx,english,korean,step) VALUES (7, 'airplane', '비행기', 2);
INSERT INTO TBL_JAVAWORD(idx,english,korean,step) VALUES (8, 'mirror', '거울', 1);

SELECT * FROM TBL_JAVAWORD tj ;

SELECT 
	ENGLISH , KOREAN 	-- 영어와 한국어 항목 만을 불러옴 
FROM
	TBL_JAVAWORD;

-- SELECT 컬럼명 1, 컬럼명 2,... FROM 테이블명 
--							WHERE 컬럼명 = 값 			=> 특정 컬럼을 조건식으로 조회	
SELECT * FROM TBL_JAVAWORD tj WHERE STEP IS NOT NULL; -- step 컬럼이 NULL 값이 아닌 정보들만 추출 ''
SELECT * FROM TBL_JAVAWORD tj WHERE STEP  IS NULL; -- step이 NULL 값인 것들만 추출 ;
SELECT * FROM TBL_JAVAWORD tj WHERE IDX = 2;	-- INDEX 번호가 2인 것을 추출;
SELECT * FROM TBL_JAVAWORD tj WHERE ENGLISH = 'public';	
SELECT * FROM TBL_JAVAWORD tj WHERE ENGLISH = 'public' AND STEP  = 2;	-- AND : 논리연산 english 컬럼의 값이 public이면서 스텝 2인 것 추출;
SELECT * FROM TBL_JAVAWORD tj WHERE ENGLISH LIKE '%ic';		-- sh로 끝나는, %기호는 don't care
SELECT * FROM TBL_JAVAWORD tj WHERE ENGLISH LIKE '%ic%';		-- sh로 끝나는, %기호는 don't care
SELECT * FROM TBL_JAVAWORD tj WHERE IDX BETWEEN  10 AND 20;	-- 10~20
SELECT * FROM TBL_JAVAWORD tj WHERE IDX NOT BETWEEN  10 AND 20;	-- 10~20 범위 값이 아닌 것.
SELECT * FROM TBL_JAVAWORD tj WHERE ENGLISH <'public';	-- pulic보다 IDX가 높은 것 



TRUNCATE TABLE TBL_JAVAWORD ;

-- 새로운 연산자
INSERT INTO TBL_JAVAWORD(idx,english,korean,step) VALUES (5,'constraint', '제약사항',3);
INSERT INTO TBL_JAVAWORD(idx,english,korean,step) VALUES (9,'order', '순서',1);

-- idx 값이 2,5,9 인  것만 조회
SELECT * FROM TBL_JAVAWORD WHERE IDX = 2 OR IDX = 5 OR IDX = 9; -- OR 쓸 때 컬럼명을 각각 입력해줘야 됨;
SELECT * FROM TBL_JAVAWORD WHERE IDX IN (2,5,9);	-- OR 연산을 간단하게 (in 안에 한꺼번에 집어 넣음;)

-- idx 값이 2~5 조회
SELECT * FROM TBL_JAVAWORD WHERE IDX  >= 2 AND IDX <= 5; 	
SELECT * FROM TBL_JAVAWORD WHERE IDX BETWEEN 2 AND 5; -- AND 연산은 between으로 간단하게;

-- select 컬럼명 1, 컬럼명 2... from 테이블명
--							[Where 컬럼명 = 값]	=> 특정 컬럼을 조건식으로 조회
--							[order by 컬럼명 1, 컬럼명 2 [DESC]]
--							 = > 지정된 컬럼명으로 정렬. DESC 는 내림차순. ASC 오름차순(생략). 컬럼명 1이 같은 값이면 컬럼명 2로 정렬

SELECT * FROM TBL_JAVAWORD
		 WHERE IDX IN (2, 5, 9)
		 ORDER BY IDX , KOREAN;		-- idx 1차 정렬 컬럼, KOREAN 2차 정렬 컬럼
		 
INSERT INTO TBL_JAVAWORD VALUES (2,'prvate','사적인',1);
