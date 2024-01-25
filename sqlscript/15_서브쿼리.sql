/*
 * 서브 쿼리(sub query) : select 조회 결과(여러 개의 행)가 다른 DML 명령어에 쓰일 수 있습니다.
 * 														ㄴ select,insert,update,delete
 * 						select,insert,update,delete에 포함되는 select 를 서브 쿼리라고 합니다.
 * 
 * select와 함께 쓰이는 서브쿼리
 * 						: select 컬럼 1, 컬럼 2 from (select...)
 * 											  where 컬럼명 1 = 값(select...)
 * select 서브쿼리는 join으로도 가능합니다.
 * */

-- 1) where에서 쓰는 서브쿼리 : twice 가 구매한 상품 정보
SELECT tp.*
FROM TBL_PRODUCT tp, TBL_BUY tb  
WHERE tp.PCODE  = tb.PCODE				-- 1) 크로스 연산
AND tb.CUSTOMID = 'twice';				-- 2) 조건식 연산

-- 서브쿼리
SELECT tp.*
FROM TBL_PRODUCT tp 
WHERE PCODE IN 		-- 2) 조건식 연산
--('CJBAb12g','APLE5kg','DOWON123a')
(SELECT PCODE FROM TBL_BUY tb WHERE CUSTOMID = 'twice');  -- 1) 조건식 연산

-- 2) from에서 사용되는 서브 쿼리 : 컬럼명 또는 테이블명 별칭을 줄 때 한글을 쓰려면 "" 안에 사용합니다.
SELECT 
	saleMoney.PCODE, sum(QUANTITY), sum("구매 금액")
FROM 
	(SELECT tp.PCODE, PNAME, QUANTITY, PRICE , QUANTITY * PRICE "구매 금액" 
	FROM TBL_PRODUCT tp, TBL_BUY tb  
	WHERE tp.PCODE  = tb.PCODE) saleMoney
GROUP BY saleMoney.PCODE;

-- join
SELECT 
	tp.PCODE,
	SUM(tb.QUANTITY) AS TotalQuantity,
	SUM(tp.PRICE * tb.QUANTITY) AS TotalAmount
FROM 
	TBL_PRODUCT tp 
JOIN 
	TBL_BUY tb ON tp.PCODE = tb.PCODE
GROUP BY 
    tp.PCODE;