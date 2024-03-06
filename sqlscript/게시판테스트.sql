-- 게시판 페이지 처리
SELECT * FROM 
			(SELECT rownum r ,f.* FROM
								(SELECT * FROM community  ORDER BY idx DESC) f)
		WHERE r BETWEEN #{start} AND #{end};

-- step 1 : idx 내림차순 정렬
SELECT * FROM COMMUNITY ORDER BY idx DESC;

-- step 2: rownum 컬럼 값 사용
SELECT rownum r ,f.* FROM
							(SELECT * FROM community  ORDER BY idx DESC) f;

-- step 3 : 범위를 지정합니다 1페이지에 글이 10개, 20개 보이므로 start, end 값을 그 갯수에 따라 지정하기
-- 1페이지의 글목록이 10개 일때는 아래와 같이 실행되어야 합니다.
SELECT * FROM 
		(SELECT rownum r ,f.* FROM
							(SELECT * FROM community  ORDER BY idx DESC) f)
		WHERE r BETWEEN 1 AND 10;		-- 1페이지

SELECT * FROM 
		(SELECT rownum r ,f.* FROM
							(SELECT * FROM community  ORDER BY idx DESC) f)
		WHERE r BETWEEN 11 AND 20;		-- 1페이지

SELECT * FROM 
		(SELECT rownum r ,f.* FROM
							(SELECT * FROM community  ORDER BY idx DESC) f)
		WHERE r BETWEEN 101 AND 110;		-- 1페이지

-- 새글 저장
INSERT INTO community (idx,writer,title,content)
VALUES (community_idx_seq.nextval, 'wonder','자비를 베푸소서 (외전증보판) 1','재미있게 잘 읽었습니다. 다음 편이 궁금해지네요.');		
		
-- 현재 시퀀스 값 가져오기
SELECT community_idx_seq.currval FROM dual;

-- 글 수정
UPDATE community
SET title='자비를 베푸소서 (번역판)', content='좋은 글입니다.' ,ip='13.0.1.25'
WHERE idx=1302;

-- 글 1개 가져오기
SELECT * FROM community WHERE idx=1302; 
 	
-- 글 삭제
DELETE FROM community WHERE idx=1302;

-- 글 갯수
SELECT count(*) FROM community;
 	
-- 글 수정
UPDATE community 
SET READCOUNT = READCOUNT +1 
WHERE idx = #{idx}

-- 메인글의 댓글 갯수 조회 : 댓글 테이블 가서 메인들 번호 idx(댓글테이블 컬럼명 mref)를 확인 후 실행
SELECT count(*) 
WHERE 
FROM communityComments 
	mref=250;
 	
-- 메인글의 댓글 갯수 업데이트
UPDATE community 
SET COMMENTCOUNT = 
(SELECT count(*) 
 FROM communityComments 
	 WHERE mref=259)
	WHERE idx = 259;
 	
-- 
SELECT max(idx) FROM community ;
 	
--  mref 메인글의 댓글목록 가져오기
SELECT * 
FROM communityComments 
WHERE mref=#{mref};

-- 메인글 목록 가져오기 - 할일 : 한번에(즉 한페이지에) 글 10개씩 가져오도록 변경. feature.sql 참고   -->
SELECT * 
FROM community
SELECT * FROM 
	(SELECT rownum r ,f.* FROM
						(SELECT * FROM community  ORDER BY idx DESC) f)
WHERE r BETWEEN #{start} AND #{end};
