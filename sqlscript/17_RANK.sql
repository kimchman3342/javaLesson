/*
 *	오라클의 rank함수
 *	예제 : 고객-상품별 최대 구매금액을 구하고 해당 상품코드 조회하기
 *			ㄴ 고객ID로 1차 그룹화, 고객 내에서 상품코드로 2차 그룹화
 *
 */
-- mina012에게 구매이력이 있는 상품 한번 더 구매시키기
INSERT INTO TBL_BUY tb  VALUES(buy_pk_seq.nextval,'mina012','JINRMn5',13,'2024-01-26');

SELECT *
FROM TBL_BUY tb , TBL_PRODUCT tp 
WHERE tb.PCODE = tp.PCODE;

-- 1) group by
SELECT tb.CUSTOMID , tb.PCODE , SUM(tp.PRICE*tb.QUANTITY)
FROM TBL_BUY tb , TBL_PRODUCT tp 
WHERE tb.PCODE = tp.PCODE 
GROUP BY tb.CUSTOMID , tb.PCODE ;

-- 2) 1)결과에 정렬
SELECT tb.CUSTOMID , tb.PCODE , SUM(tp.PRICE*tb.QUANTITY) MONEY
FROM TBL_BUY tb , TBL_PRODUCT tp 
WHERE tb.PCODE = tp.PCODE 
GROUP BY tb.CUSTOMID , tb.PCODE 
ORDER BY tb.CUSTOMID , MONEY DESC  ;

-- 3) 1)번 결과에 RANK함수를 적용해보기
SELECT tb.CUSTOMID , tb.PCODE , SUM(tp.PRICE*tb.QUANTITY) MONEY
		,RANK() OVER(PARTITION BY tb.customid
		ORDER BY SUM(tp.PRICE*tb.QUANTITY)DESC)"RANK"	--OVER()안에는 어떤 컬럼으로 정렬해서 순위를 매기는지에 대한 내용.
FROM TBL_BUY tb , TBL_PRODUCT tp 
WHERE tb.PCODE = tp.PCODE 
GROUP BY tb.CUSTOMID , tb.PCODE ;

-- 4) 3)번을 서브쿼리로 하여 RANK = 1 인 조건 적용하기
WITH customSale
AS (
	SELECT tb.CUSTOMID , tb.PCODE , SUM(tp.PRICE*tb.QUANTITY) MONEY
		,RANK() OVER(PARTITION BY tb.customid
		ORDER BY SUM(tp.PRICE*tb.QUANTITY)DESC)	rank
	FROM TBL_BUY tb , TBL_PRODUCT tp 
	WHERE tb.PCODE = tp.PCODE  
	GROUP BY tb.CUSTOMID , tb.PCODE 
)
SELECT *
FROM customsale
WHERE rank=1;

















