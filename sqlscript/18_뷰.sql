/*
 * 	스키마 : 데이터베이스에서 자료의 구조, 자료의 표현 방법, 자료 간의 관계를 '형식 언어로 정의한 구조'이다.
 * 			ㄴ 풀이 : 사용자가 계정을 받아서 여러가지 방법으로 데이터(자료)를 저장하고 관리하는 공간
 *					오라클 등 dbms는 스키마에 여러 객체를 생성하여 사용합니다. 
 *
 *	실제 비즈니스 로직을 처리하는 SQL이 많이 복잡해질 수 있습니다.(조인 및 서브쿼리 횟수 많아짐)
 * 	= > 자주 사용하면서 일회용으로 처리가 되면 성능에 문제가 생깁니다. 매우 비효율적.
 * 	= > 가상 테이블(뷰) 또는 프로시저(트랜잭션 단위로 구성)를 사용합니다.
 *
 * 	View (뷰) : 가상 테이블
 * 			   ㄴ select 조회 결과를 미리 컴파일하여 오라클 객체로 저장.
 * 			   ㄴ select 조회 할 때 테이블 처럼 사용. 
 * 			   ㄴ 그러나 insert, update, delete는 제약이 많고 잘 사용되지 않음.
 * 	creat view :  권한이 별도로 필요합니다.		=> 관리자 계정 sys 또는 system이 합니다.
 * 	SQL Plus 에서 grant create view to c##idev; 명령 실행하고 디비버에서 접속 재연결
 * 
 * */

CREATE OR REPLACE VIEW v_customsale
AS 
SELECT tb.CUSTOMID, tb.pcode , 
	 SUM(tp.PRICE * tb.QUANTITY) money 	-- 가격 * 수량에 대한 그룹화 함수 sum 실행
	-- , RANK() OVER (ORDER BY SUM(tp.PRICE * tb.QUANTITY) DESC) "RANK"		-- 전체 MONEY 순위	
	 , RANK()
	 OVER (PARTITION BY tb.CUSTOMID 
	 ORDER BY SUM(tp.PRICE * tb.QUANTITY) DESC) "RANK"			-- 그룹화 MONEY 순위
	 -- OVER() 안에는 어떤 컬럼으로 정렬해서 순위를 매기는지에 대한 내용.
FROM TBL_BUY tb , TBL_PRODUCT tp 
WHERE tb.PCODE  = tp.PCODE
GROUP BY tb.CUSTOMID, tb.pcode ;

-- 일반 테이블의 select 처럼 조회 형식 모두 사용 가능합니다.
SELECT *
FROM V_CUSTOMSALE vc 
WHERE CUSTOMID = 'mina012';

SELECT *
FROM V_CUSTOMSALE vc 
WHERE "RANK"  = 1;