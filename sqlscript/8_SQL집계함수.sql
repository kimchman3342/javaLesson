/*
 * SQL의 집계 함수(개수,최대값,최소값,합계,평균) 함수 - 그룹 함수
 *											 ㄴ 집계함수는 다른 컬럼과 함께 조회하려면 GROUP BY가 필요합니다.
 *
 * */				

SELECT count(*) "개수" , sum(JUMSU) "합계", AVG(JUMSU) "평균" FROM TBL_SCORE ts;

-- 1) '성적' 테이블의 전체 행 개수
SELECT count(*) FROM TBL_SCORE ts ;

-- 조회된 함수 결과에 컬럼명을 주려면 as "컬럼명"으로 합니다.


-- 2) '성적' 테이블의 과목 컬럼 '국어' 값을 갖는 전체 행 개수
SELECT count(*) FROM TBL_SCORE ts WHERE SUBJECT  = '국어';

-- 3) '성적' 테이블의 'jumsu' 컬럼의 합계
SELECT sum(JUMSU) FROM TBL_SCORE ts;

-- 4) '성적' 테이블의 'jumsu' 컬럼의 국어합계
SELECT sum(JUMSU) FROM TBL_SCORE ts WHERE SUBJECT = '국어';

-- 5) '성적' 테이블의 'jumsu' 컬럼의 평균
SELECT AVG(JUMSU) FROM TBL_SCORE ts ;

-- 6) '성적' 테이블의 'jumsu' 컬럼의 국어평균
SELECT AVG(JUMSU) FROM TBL_SCORE ts WHERE SUBJECT = '국어';

-- 7) '성적' 테이블의 'jumsu' 컬럼의 최대 값
SELECT MAX(JUMSU) FROM TBL_SCORE ts ;

-- 8) '성적' 테이블의 'jumsu' 컬럼의 영어 최대값 
SELECT MAX(JUMSU) FROM TBL_SCORE ts WHERE SUBJECT = '영어';

-- 오류 : 집계함수는 다른 컬럼과 함께 조회하려면 group by가 필요합니다.
-- SELECT subject, COUNT(*) FROM TBL_SCORE ts ;
-- SELECT subject, COUNT(*) FROM TBL_SCORE ts WHERE SUBJECT = '국어';

-- GROUP BY SUBJECT 구문이 있으므로 조회 컬럼에 subject를 추가할 수 있습니다.
SELECT SUBJECT, COUNT(*) FROM TBL_SCORE ts GROUP BY SUBJECT ; 

-- GROUP BY STUNO 구문이 있으므로 조회 컬럼에 STUNO를 추가할 수 있습니다.
SELECT STUNO , COUNT(*) FROM TBL_SCORE ts GROUP BY STUNO  ; 

-- GROUP BY는 그룹화컬럼명 1, 그룹화컬럼명 2 ,,....로 할 수 있습니다.