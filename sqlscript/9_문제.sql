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


CREATE TABLE excustomer (cus_id varchar2(10) UNIQUE ,
						cus_name varchar2(50) unique,
						cus_email varchar2(100)unique,
						cus_age number(5),
						cus_signintime DATE default sysdate	);	

INSERT INTO EXCUSTOMER  VALUES ('mina012', '김미나', 'kimm@gmail.com', 20, to_date('2022-03-10 14:23:25','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO EXCUSTOMER  VALUES ('hongGD', '홍길동', 'gil@korea.com', 32, to_date('2021-10-21 11:12:23','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO EXCUSTOMER  VALUES ('twice', '박모모', 'momo@daum.net', 29, to_date( '2021-12-25 19:23:45','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO EXCUSTOMER (cus_id,cus_name,cus_email,cus_age) VALUES ('wonder', '이나나', 'lee@naver.com', 40); 

SELECT * FROM EXCUSTOMER e ;
DROP TABLE EXBUY  ;

CREATE TABLE exproduct (
  pdt_code VARCHAR2(30)unique,
  pdt_cate VARCHAR2(30),
  pdt_name VARCHAR2(30)unique,
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
INSERT INTO exbuy  VALUES ( 'hongGD' , 'DOWON123a' , 1 , to_date('2021-10-21 11:13:25','yyyy-mm-dd hh24:mi:ss')); 
INSERT INTO exbuy  VALUES ( 'hongGD' , 'APLE5kg' , 1 , to_date('2021-10-21 11:13:25','yyyy-mm-dd hh24:mi:ss')); 

