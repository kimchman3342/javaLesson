-   동적 웹애플리케이션 서버를 구축합니다.

-   웹서버 : 정적인 html 페이지만 요청에 대해 응답

-   웹애플리케이션 서버 : db서버와 연동에서 사용자 조회, 저장 동적인 데이터 처리

1.  웹애플리케이션 서버(was) 소프트웨어는 여러 종류가 있습니다.

         ☞ apache tomcat으로 사용합니다.

2.  개발환경은 '이클립스' 사용해 보겠습니다.

         eclipse.org 버전 2023-03 (4.7) Java And Web Developers

    다운로드 링크 : https://www.eclipse.org/downloads/packages/release/2023-03/r

3.  이클립스는 workspace라는 작업 공간을 설정해야 합니다.

         ☞ 워크스페이스에 프로젝트 폴더를 만들어서 관리를 합니다.
            폴더명 eclipse-workspaced으로 합니다

4.  준비 끝!!!!

         ☞ 이클립스 실행은 eclipse.exe로 합니다.

5.  이클립스 편집기의 encoding이 UTF-8인지 확인합니다.

         ☞ 설정메뉴 window -> preferences -> general 항목 -> workspace -> encoding
                     web 항목 -> CSS,HTML,JSP -> encoding
            변경사항이 있을 때 Apply 버튼 클릭.

6.  웹애플리케이션 서버 tomacat은 웹서버 역할 동시에 합니다.

         ☞ 서버 추가 Servers 탭(하단) -> No servers ~~~ 클릭

7.  서버 설정 순서를 정리해 보세요.

         ☞ 설정 순서 :

8.  이클립스는 lombok.jar로 설치하는 과정이 필요합니다.

         ☞ 이클립스 폴더 부모 폴더 중에 한글 폴더명 있으면 동작을 안합니다.
         ㄴ 이클립스 종료하세요.
         ㄴ lombok.jar 실행 후 eclipse.exe 경로 지정 후 -> install -> quit
         ㄴ 설치 후 확인 1) eclipse 폴더에 lombok.jar
                        2) eclipse.ini 파일 맨 아랫줄에 lombok.jar 경로가 있어야 합니다.
         ㄴ eclipse.exe 실행하기
9.  이클립스에서는 중요한 라이브러리 관리 메뉴가 있습니다.
         
         ☞ 프로젝트 우클릭 -> Build Path -> Configure Build Path ....
                                                ㄴ 필요한 외부 라이브러리 jar 추가
                                                   
