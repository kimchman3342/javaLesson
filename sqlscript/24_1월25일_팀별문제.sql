/*
 *  
 * */


-- 1. 'mina012' 가 구매한 상품 금액 합계

SELECT CUSTOMID , SUM(price * QUANTITY) 
FROM TBL_PRODUCT tp 
JOIN TBL_BUY tb 
ON tb.PCODE = tp.PCODE 
AND CUSTOMID = 'mina012'
GROUP BY CUSTOMID; 


-- 2. 이름에 '길동'이 들어가는 회원 구매한 상품 구매현황
SELECT name, PCODE , QUANTITY 
FROM TBL_BUY tb 
JOIN TBL_CUSTOM tc 
ON tb.CUSTOMID = tc.CUSTOM_ID 
WHERE tc.NAME LIKE '%길동';

-- 3. '25'살 이상 고객님들의 '구매' 구매한 상품 구매현황 

-- 4. 상품명에 '사과' 단어가 포함된 상품을 구매한 고객에 대해 상품을 구매한 고객에 대해 상품별 구매금액의 합을 구하기

-- 5. 총 구매합산 금액이 100000~200000 값인 고객 ID를 조회하시오.

-- 6. 20대 나이 고객의 구매 상품 코드와 나이를 나이순으로 정렬 조회

-- 7. 나이가 가장 많은 고객이 상품을 구매한 횟수를 조회하세요.