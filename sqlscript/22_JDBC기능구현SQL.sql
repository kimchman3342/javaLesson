-- JDBC 프로젝트 위한 SQL 테스트
-- SQL 테스트하고 자바 프로그래밍 합시다.

-- 회원 정보 수정 : email, age
UPDATE TBL_CUSTOM 
	SET EMAIL = 'test@gmail.com', age = 22
	WHERE CUSTOM_ID = 'nayeon33';

-- 회원 탈퇴 :
DELETE FROM TBL_CUSTOM tc 
		WHERE CUSTOM_ID = 'sana77';

-- 상품 검색하기 SQL : ProductVo, TblProductDao 만들기
--								ㄴ selectByCategory, selectByPname 메소드 만듭시다.	
-- 카테고리로 검색하기
-- 1) 어떤 카테고리가 있는지 보여주기
SELECT DISTINCT CATEGORY FROM TBL_PRODUCT tp;	-- 중복제거

-- 2) 특정 카테고리에 대해 상품 목록 보여주기 - 조회 결과는 1 or N개
SELECT * FROM TBL_PRODUCT tp 
WHERE CATEGORY = 'B1';

-- 데이터 추가
INSERT INTO TBL_PRODUCT tp 
			VALUES ('BUSA211','B2','부사 사과 3kg 박스',25000);
			
-- 3) 상품명 유사(like) 검색
SELECT * FROM TBL_PRODUCT tp 
WHERE PNAME LIKE '%' || '사과' || '%'
ORDER BY CATEGORY ;	-- 프로그램에서 매개변수 처리를 위해 연결연산으로 합니다.