/*### 데이터베이스 구축 시나리오

(1월 19일)

식료품을 판매하는 매장의 판매 관리를 위한 시스템을 구축합니다. 이 쇼핑몰에서 `고객` 은  필요한 `상품`을
`구매`할 수 있습니다. 고객은 회원가입 후 상품을 구매할 수 있습니다. 
+ `회원` 은  고유ID , 이름, 이메일, 나이 , 가압날짜로 관리하며
  + PK


+ `상품` 은  상품코드, 카테고리, 상품명, 가격이 필요합니다.
  + PK
 
 
+ `구매` 는  상품을 구매한 회원의 고유ID, 상품코드 , 구매수량, 구매날짜를 저장하여 관리합니다. 
  + FK

    
+ 회원 예시 데이터

    
      'mina012', '김미나', 'kimm@gmail.com', 20, '2022-03-10 14:23:25'  
      'hongGD', '홍길동', 'gil@korea.com', 32, '2021-10-21 11:12:23'
      'twice', '박모모', 'momo@daum.net', 29, '2021-12-25 19:23:45'
      'wonder', '이나나', 'lee@naver.com', 40, 현재날짜와 시간

  + 상품 예시 데이터

  
        'DOWON123a', 'B2', '동원참치선물세트', 54000
        'CJBAb12g', 'B1', '햇반 12개입', 14500
        'JINRMn5', 'B1', '진라면 5개입', 6350
        'APLE5kg', 'A1', '청송사과 5kg', 66000
        'MANGOTK4r', 'A2', '애플망고 1kg', 32000


  + 구매

        'mina012' , 'CJBAb12g' , 5 , '2022-03-10 14:33:15'
        'mina012' , 'APLE5kg' , 2 , '2022-03-10 14:33:15'
        'mina012' , 'JINRMn5' , 2 , '2022-03-16 10:13:15'
        'twice' , 'JINRMn5' , 3 , '2021-12-25 19:32:15'
        'twice' , 'MANGOTK4r' , 2 , '2021-12-25 19:32:15'
        'hongGD' , 'DOWON123a' , 1 , '2021-10-21 11:13:25'
        'hongGD' , 'APLE5kg' , 1 , '2021-10-21 11:13:25'
    
 + 테이블 이름은  excustomer,exproduct, exbuy 로 각각하고 
 컬럼은 적합한 이름과 형식,제약조건을 정해서 하세요.
 
   - 고객 : excustomer
   - 상품 : exproduct
   - 구매 : exbuy 
 
 + 컬럼
   - 이름과 형식 : 적합하게 정의합니다.
   - NOT NULL , UNIQUE(필요시), PK 제약조건 각 테이블에 정하세요.
   - FK : 참조 관계 테이블에 정하세요.
 + 팀원들 각각 select 가 필요한 시나리오로
조회 문제를 하나씩 만들어 공유하세요.*/


CREATE TABLE excustomer (cus_id varchar2(10)  ,
						cus_name varchar2(50) ,
						cus_email varchar2(100),
						cus_age number(5),
						cus_signintime DATE default sysdate	);	

INSERT INTO EXCUSTOMER  VALUES ('mina012', '김미나', 'kimm@gmail.com', 20, to_date('2022-03-10 14:23:25','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO EXCUSTOMER  VALUES ('hongGD', '홍길동', 'gil@korea.com', 32, to_date('2021-10-21 11:12:23','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO EXCUSTOMER  VALUES ('twice', '박모모', 'momo@daum.net', 29, to_date( '2021-12-25 19:23:45','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO EXCUSTOMER (cus_id,cus_name,cus_email,cus_age) VALUES ('wonder', '이나나', 'lee@naver.com', 40); 

SELECT * FROM EXCUSTOMER e ;
DROP TABLE EXBUY  ;

CREATE TABLE exproduct (
  pdt_code VARCHAR2(30),
  pdt_cate VARCHAR2(30),
  pdt_name VARCHAR2(30),
  pdt_price NUMBER(30)
);

INSERT INTO exproduct VALUES ('DOWON123a', 'B2', '동원참치선물세트', 54000); 
INSERT INTO exproduct VALUES ('CJBAb12g', 'B1', '햇반 12개입', 14500); 
INSERT INTO exproduct VALUES ('JINRMn5', 'B1', '진라면 5개입', 6350); 
INSERT INTO exproduct VALUES ('APLE5kg', 'A1', '청송사과 5kg', 66000); 
INSERT INTO exproduct VALUES ('MANGOTK4r', 'A2', '애플망고 1kg', 32000); 

SELECT * FROM EXPRODUCT e  ;

CREATE TABLE exbuy (
	cus_id varchar2(30),  
	pdt_code varchar2(30),  
	buy_count number(30),	
	buy_signintime DATE default sysdate		
);


INSERT INTO exbuy  VALUES ( 'mina012' , 'CJBAb12g' , 5 , to_date('2022-03-10 14:33:15','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO exbuy  VALUES ( 'mina012' , 'APLE5kg' , 2 , to_date('2022-03-10 14:33:15','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO exbuy  VALUES ( 'mina012' , 'JINRMn5' , 2 , to_date('2022-03-16 10:13:15','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO exbuy  VALUES ( 'twice' , 'MANGOTK4r' , 3 , to_date('2021-12-25 19:32:15','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO exbuy  VALUES ( 'twice' , 'JINRMn5' , 3 , to_date('2021-12-25 19:32:15','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO exbuy  VALUES ( 'hongGD' , 'DOWON123a' , 1 , to_date('2021-10-21 11:13:25','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO exbuy  VALUES ( 'hongGD' , 'APLE5kg' , 1 , to_date('2021-10-21 11:13:25','yyyy-mm-dd hh24:mi:ss')); 

-- 구매 테이블에 기본키 만들기.

-- 0) 기본키가 필요한 이유.

-- 1) 기본키에 들어갈 값은 시퀀스로 만듭니다.  exbuy_pk_seq 시작 값은 1001로 합시다.
CREATE SEQUENCE exbuy_pk_seq START WITH 1001;



-- 2) 기본키 컬럼을 buy_idx로 하여 컬럼추가. number(8)
ALTER TABLE EXBUY ADD buy_idx NUMBER(8);

-- 3) 기본 행에 적용할 buy_idx 컬럼 값을 저장하기. (디비버의 GUI 메뉴에서 합니다.)
		

-- 4) buy_idx 컬럼에 대해 primary 키 설정하기
ALTER TABLE EXBUY ADD CONSTRAINT tbl_exbuy_pk PRIMARY KEY (buy_idx);

-- 5) 이제부터 새로운 행을 추가할 때에는 시퀀스 함수로 pk 값을 insert 합니다.
INSERT INTO exbuy (buy_idx,cus_id,pdt_code,buy_count)
			VALUES ( exbuy_pk_seq.nextval, 'mina012' , 'CJBAb12g' , 5 ); 
		
SELECT * FROM EXBUY e ;




-- 문제
-- 1) 카테고리 별로 상품 갯수 구하기(카테고리 번호랑 같이 나와야 됨.)	- 황병훈
SELECT PDT_CATE ,COUNT(*) FROM EXPRODUCT e GROUP BY PDT_CATE ; 

-- 2) 고객이 가장 많이 구매한 상품을 구하시오(판매 갯수로 내림차순) - 한주영
SELECT max(buy_count) FROM EXBUY e GROUP BY PDT_CODE  ;

-- 3) ID가 'mina012' 인 회원의 가입날짜부터 현재까지 며칠(day)이 지났는지 출력하시오. - 조하연
SELECT (TO_DATE(SYSDATE,'YYYY-MM-DD') - TO_DATE(CUS_SIGNINTIME ,'YYYY-MM-DD')) AS "회원 기간" FROM EXCUSTOMER e WHERE CUS_ID ='mina012'; 

-- 4) 이름 내림차순 정렬하기		- 조지수
SELECT * FROM EXCUSTOMER e ORDER BY CUS_NAME DESC;

-- 5) twice ID를 사용하는 고객이 구매한 상품을 모두 구하시오 - 한진만
SELECT CUS_ID ,PDT_CODE  FROM EXBUY e WHERE CUS_ID = 'twice';

-- 6)구글 이메일 유저를 구하세요 - 차정호
SELECT CUS_EMAIL FROM EXCUSTOMER e WHERE CUS_EMAIL LIKE '%gmail%';
