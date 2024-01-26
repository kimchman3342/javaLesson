/*
 *  프로시저 직접 만들어 보기 : money_of_day
 *  매개변수 IN : 고객ID, 날짜(패턴은 'yyyy-mm-dd')
 *  매개변수 OUT : IN으로 받은 값들을 tbl_buy에서 상품코드를 조회하여 '총 구매 금액'을 구합니다.
 * 	※주의 : 매개 변수 선언에는 varchar2 또는 number만 씁니다.				
 * 	※ 단, 고객은 1일 1품목만 구매 가능합니다. ※
 * 
 * 	1) 고객ID, 날짜 값으로 구매 테이블에서 수량과 pcode 조회하고 변수에 저장하기
 * 	2) 1)에서 구한 pcode의 가격을 조회하여 저장하기
 *  3) 2)번 가격과 1)번 수량을 곱하기 하여 결과값을 변수에 저장 => 출력변수
 * 		곱셈 수식만 계산할 때에는 dual 임시 테이블로 합니다. 
 * 
 */
 
CREATE TABLE money_of_day
AS 
SELECT * FROM TBL_BUY tb ;

CREATE OR REPLACE PROCEDURE "C##IDEV".proc_set_money_of_day(     
   bcustom_id IN p_buy.CUSTOMID %TYPE, --  회원ID      -- 입력 매개변수 IN
   bpcode IN p_buy.PCODE %TYPE,    -- 상품코드
   bcnt IN p_buy.QUANTITY %TYPE , -- 수량
   bdate IN p_date.SYSDATE %TYPE,
   isSuccess OUT varchar2  -- 출력 매개변수 OUT. 트랜잭션 처리 성공여부 저장.
)
IS 
   vseq NUMBER;   --변수선언
   vprice NUMBER;
   

--	프로시저 실행
  
  	DECLARE
  		vmoney number(8);	-- 일반변수 선언할 때에는 ()에 크기 필요
  		vid varchar2(20);
  		vdate varchar2(20);
 	BEGIN
	 	vid :='mina012';
	 	vdate := '2023-11-10';
 		money_of_day(vid,vdate,vmoney);
 		dbms_output.put_line(CHR(10) || '고객ID : '|| vid ||' 날짜 :');
 		dbms_output.put_line('고객님의 구매금액은 ' || vmonet || ' 입니다.');
  END;
  
 -- 1) 
 SELECT PCODE, QUANTITY
 INTO ??
 FROM TBL_BUY tb 
 WHERE CUSTOMID = 입력변수 IN AND to_char(BUY_DATE,'yyyy-mm-dd') = 입력변수IN;
 
-- 2)
SELECT PRICE 
INTO 
FROM TBL_PRODUCT tp 
WHERE PCODE = 1)번에서 구한 값 변수

-- 3) 출력 매개변수에 저장하기
SELECT 1)번에서 구한 수량 값 변수 * 2) 번에서 구한 가격 값 변수
INTO ?
FROM dual;