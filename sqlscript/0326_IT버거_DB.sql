/**
 * 테이블 생성 		   03.13
 * BG_BUY 타이틀 컬럼 추가 03.15
 * BG_NOTICE 테이블 반영  03.15
 * BG_ERVENT 테이블 반영  03.18
 * BG_EVENT 좋아요 컬럼 추가 03.19
 * BG_CATEGORY 테이블 추가  03.22
 */


-- 테이블 삭제
DROP TABLE BG_CATEGORY;
DROP TABLE BG_BUYS;
DROP TABLE BG_MENU_OPTION;
DROP TABLE BG_MENU;
DROP TABLE BG_EVENT;
DROP TABLE BG_USER;


-- 시퀀스 삭제
DROP SEQUENCE BG_BUYS_SEQ;
DROP SEQUENCE BG_EVENT_SEQ;
DROP SEQUENCE BG_MENU_OPTION_SEQ;
DROP SEQUENCE BG_MENU;

-- 데이터 삭제
TRUNCATE TABLE BG_CATEGORY;
TRUNCATE TABLE BG_BUYS;
TRUNCATE TABLE BG_EVENT;
TRUNCATE TABLE BG_MENU_OPTION;
TRUNCATE TABLE BG_MENU;
TRUNCATE TABLE BG_USER;

-- 햄버거 메인 테이블
CREATE TABLE BG_MENU(
   menu_code VARCHAR2(100) PRIMARY KEY,	-- 메뉴코드 
   menu_name VARCHAR2(100) NOT NULL,
   menu_desc VARCHAR2(500) ,	-- 메뉴 설명
   price NUMBER(7) NOT NULL,
   create_dttm TIMESTAMP,		-- 생성일시
   img_name VARCHAR2(100)		-- 이미지파일명
);



ALTER SESSION SET nls_timestamp_format='YYYY-MM-DD HH24:MI:SS';


SELECT  * FROM BG_MENU WHERE menu_code IN('BGS1234','BGS0001');

DELETE FROM BG_MENU_OPTION bmo WHERE menu_code IN('BGS1234','BGS0001');
DELETE FROM BG_MENU bm WHERE menu_code = 'BGS1234';
DELETE FROM BG_MENU bm WHERE menu_code = 'BGS0001';

-- 햄버거 옵션 테이블
CREATE TABLE BG_MENU_OPTION(
   option_seq NUMBER(8) PRIMARY KEY,
   option_name VARCHAR2(100) NOT NULL,
   option_price NUMBER(7) NOT NULL,
   option_desc VARCHAR2(500),		-- 메뉴 옵션 설명
   create_dttm TIMESTAMP NOT NULL,	-- 생성일시
   menu_code VARCHAR2(100) NOT NULL,
   FOREIGN KEY (menu_code)				
			REFERENCES BG_MENU(menu_code)
);
-- 시퀀스 생성
CREATE SEQUENCE BG_MENU_OPTION_SEQ;

SELECT  * FROM BG_MENU_OPTION WHERE menu_code IN('BGS1234','BGS0001');

-- DELETE FROM BG_MENU_OPTION WHERE OPTION_seq = 9;

-- 유저 테이블
CREATE TABLE BG_USER(
   user_id VARCHAR2(50) PRIMARY KEY,
   user_password VARCHAR2(500) NOT NULL,
   user_name VARCHAR2(100),
   create_dttm TIMESTAMP
);

SELECT  * FROM BG_USER;


INSERT INTO BG_USER 
VALUES ('test03', '이벤트 리뷰 테스트', '테스트테스트테스트테스트', '2024-03-12 10:41:49', 'eventreview.png','admin');



-- 햄버거 구매관리 테이블
CREATE TABLE BG_BUYS(
   buy_seq NUMBER(8) PRIMARY KEY,
   menu_code VARCHAR2(100) NOT NULL,			-- 메뉴코드 ex) BGS1234
   order_id VARCHAR2(500) NOT NULL,		-- 매뉴코드7자리_주문일시 ex) BGS1234_20240312111321 
   detail_option_seq VARCHAR2(1000), 	-- 구매한 메뉴옵션 pk , 콤마로 연결 ex)7,8
   detail_option_desc VARCHAR2(1000), 	-- 구매한 메뉴옵션 설명 ex)한라봉패션후르츠에이드 `수량`개,콜라 `수량`개
   amount 	NUMBER(8) NOT NULL,			-- 총 결제금액 = 메뉴가격 + 메뉴옵션가격합계 ex ) 5000+ (2500*1 + 2000*2)
   user_id	VARCHAR2(50)  NOT NULL,		-- 구매자 아이디
   pay_type VARCHAR2(100) NOT NULL, 	-- 결제수단	
   payment_key VARCHAR2(500) NOT NULL, 	
   create_dttm  TIMESTAMP NOT NULL,
   buy_title VARCHAR(100) DEFAULT '테스트' NOT NULL,
   FOREIGN KEY (menu_code)				
			REFERENCES BG_MENU(menu_code),
   FOREIGN KEY (user_id)				
			REFERENCES BG_USER(user_id)				
);
-- 시퀀스 생성
CREATE SEQUENCE BG_BUYS_SEQ;



-------------------------------------------------------------------

-- 공지사항
CREATE TABLE BG_NOTICE(
   notice_seq NUMBER(8) PRIMARY KEY,
   notice_title varchar2(100) NOT NULL,
   notice_content varchar2(3000) NOT NULL,
   notice_readcount number(10) DEFAULT 0,
   notice_date TIMESTAMP NOT NULL,
   notice_image varchar2(200)
);

CREATE SEQUENCE BG_NOTICE_SEQ;

UPDATE BG_NOTICE
SET notice_date = CURRENT_TIMESTAMP
WHERE notice_date IS NULL;


INSERT INTO BG_NOTICE (notice_seq,notice_title,notice_content,notice_date,notice_image) 
VALUES (BG_NOTICE_SEQ.nextval,
'\“이렇게 탱글한 새우패티 봤새우?\”새우버거 2종 출시',
'신세계푸드의 노브랜드 버거가 새우버거 매니아층 공략에 나선다.노브랜드 버거의 ‘오리지널 새우버거’는 바삭하게 튀겨낸 새우패티와 조화를 이루는 자체개발 특제 소스를 듬뿍 뿌리고, 채 썬 적양배추를 풍성하게 토핑해 아삭하고 탱글한 새우의 식감을 동시에 느낄 수 있는 것이 특징이다. ‘비스크 치즈 새우버거’는 갑각류를 오랫동안 끓여 곱게 갈아 만든 프랑스 정통 방식의 비스크 소스를 더해 새우의 풍미를 더욱 높였으며, 고소한 아메리칸 체다 치즈를 넣어 새우패티와 조화롭게 어우러지도록 했다. '
,'2024-03-11 15:40:49','3.png');

INSERT INTO BG_NOTICE (notice_seq,notice_title,notice_content,notice_date,notice_image) 
VALUES (BG_NOTICE_SEQ.nextval,
'노브랜드 버거, 판매가격 조정',
'신세계푸드가 29일부터 노브랜드 버거에서 판매하는 버거, 사이드 메뉴 등 30여 종의 판매가격을 평균 3.1% 상향 조정한다. 
신세계푸드는 원재료비, 부자재비, 물류비, 인건비, 공공요금 등 노브랜드 버거 매장 운영을 위한 비용 부담이 커져가고 있는 상황에서 가맹점주들의 수익 보전을 위해 불가피하게 판매가를 100~400원 상향 조정하기로 했다고 밝혔다. 이번 조정으로 대표 메뉴인 NBB 시그니처(단품) 가격은 4400원에서 4800원으로 조정된다. '
,'2023-12-21 14:37:47','2.png');

INSERT INTO BG_NOTICE (notice_seq,notice_title,notice_content,notice_date,notice_image) 
VALUES (BG_NOTICE_SEQ.nextval,
'노브랜드 버거, 맛도 크기도 폼나는 ‘최강버거’ 출시',
'노브랜드 버거의 최강버거는 오는 22일부터 28일까지 1주일간 매장당 30개씩 한정판매 되며 가격은 단품 8500원, 세트 10000원 이다. 신세계푸드는 최강버거를 통해 노브랜드 버거의 인기 비결 중 하나로 손꼽히는 가성비 뿐만 아니라 가격대비 압도적인 품질과 최고의 맛을 자랑하는 가심비 브랜드로 자리매김 한다는 계획이다.'
,'2023-11-27 20:38:54','1.png');


SELECT * FROM BG_NOTICE;

-------------------------------------------------------------

-- 이벤트
CREATE TABLE BG_EVENT(
   event_seq NUMBER(8) PRIMARY KEY,
   event_title varchar2(100) NOT NULL,
   event_content varchar2(3000) NOT NULL,
   event_regdate TIMESTAMP NOT NULL,
   event_image varchar2(200),
   user_id VARCHAR2(50),
   FOREIGN KEY (user_id)            
         REFERENCES BG_USER(user_id)
);

CREATE SEQUENCE BG_EVENT_SEQ;

INSERT INTO BG_EVENT 
VALUES (BG_EVENT_SEQ.nextval, '이벤트 리뷰 테스트', '테스트테스트테스트테스트', '2024-03-12 10:41:49', 'eventreview.png','admin');

-- 이벤트 좋아요 컬럼 추가
ALTER TABLE BG_EVENT ADD like_count number(8);


SELECT * FROM BG_EVENT;

-------------------------------------------------------------

-- 쿠폰 테이블
--CREATE TABLE BG_COUPON(
--   COUPON_CODE VARCHAR2(100) PRIMARY KEY,
--   COUPON_NAME VARCHAR2(100) NOT NULL,
--   COUPON_PRICE NUMBER(8)    NOT NULL,
--   IS_USE   CHAR(1)  DEFAULT 'Y' NOT NULL,
--   CREATE_DTTM TIMESTAMP NOT NULL,
--   USER_ID VARCHAR2(50) NULL,
--   FOREIGN KEY (USER_ID)
--         REFERENCES BG_USER(USER_ID)
--);
--
--
--
--INSERT INTO BG_COUPON (COUPON_CODE, COUPON_NAME, COUPON_PRICE, IS_USE, CREATE_DTTM) 
--VALUES ('couponcode0001', '[웰컴쿠폰]2000원할인',  2000, 'Y', '2024-03-11 10:41:49');
--

----------------------------------------------------

-- 메뉴 카테고리 테이블
CREATE TABLE BG_CATEGORY(
    CODE VARCHAR2(20) PRIMARY KEY ,
    NAME VARCHAR2(40) NOT NULL
);


INSERT INTO BG_CATEGORY (CODE, NAME) 
VALUES ('NEW', 'New');

INSERT INTO BG_CATEGORY (CODE, NAME) 
VALUES ('BURGER', 'Burger');

INSERT INTO BG_CATEGORY (CODE, NAME) 
VALUES ('DRINK', 'Beverage');

INSERT INTO BG_CATEGORY (CODE, NAME) 
VALUES ('SIDE', 'Side');


-- 메뉴 테이블 카테고리 컬럼 추가
ALTER TABLE BG_MENU ADD CATEGORY_CODE VARCHAR2(20);


SELECT * FROM BG_MENU ;



-- 테이블 확인
SELECT * FROM BG_CATEGORY ;


-- 메뉴 카테고리 업데이트


UPDATE BG_MENU A
SET   A.CATEGORY_CODE  = 'NEW'
WHERE A.MENU_NAME LIKE 'IT 오리지널 버거%';

UPDATE BG_MENU A
SET   A.CATEGORY_CODE  = 'NEW'
WHERE A.MENU_NAME LIKE '쓰리랑카치킨 버거%';

UPDATE BG_MENU A
SET	A.CATEGORY_CODE  = 'BURGER'
WHERE A.MENU_CODE LIKE 'BURGER%';

UPDATE BG_MENU A
SET	A.CATEGORY_CODE  = 'DRINK'
WHERE A.MENU_CODE LIKE 'DRINK%';

UPDATE BG_MENU A
SET	A.CATEGORY_CODE  = 'SIDE'
WHERE A.MENU_CODE LIKE 'SIDE%';


-- 업데이트 확인
SELECT * FROM BG_MENU;

COMMIT;





















