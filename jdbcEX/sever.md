동적 웹애플리케이션 서버를 구축합니다.
웹서버 : 정적인 html 페이지만 요청에 대해 응답
웹애플리케이션 서버 : db서버와 연동에서 사용자 조회,저장 동적인 데이터 처리

1.  웹애플리케이션 서버(was) 소프트웨어는 여러 종류가 있습니다.
    ☞ apache tomcat 으로 사용합니다. 버전 9.0
    다운로드 링크 : https://tomcat.apache.org/download-90.cgi

2.  개발환경은 `이클립스` 사용해 보겠습니다.
    ☞ eclipse.org 버전 2023-03 (4.7) Java And Web Developers
    다운로드 링크 : https://www.eclipse.org/downloads/packages/release/2023-03/r

3.  이클립스는 workspace 라는 작업공간을 설정해야 합니다.
    ☞ 워크스페이스에 프로젝트 폴더를 만들어서 관리를 합니다.
    폴더명 eclipse-workspace 으로 합니다.

4.  준비 끝. 이클립스 실행은 eclipse.exe

5.  이클립스 편집기의 encoding 이 `UTF-8`인지 확인합니다.
    설정 메뉴 window - preferences
    ㄴ general 항목 - workscpace -> encoding
    ㄴ web 항목 - css,html,jsp -> encoding
    변경사항이 있을 때 Apply 버튼 클릭하기

6.  웹애플리케이션 서버 tomcat 은 웹서버 역할 동시에 합니다.
    ☞ 서버 추가 Servers 탭(하단) -> No servers ~~~ 클릭

7.  서버 설정 순서를 정리해 보세요.

8.  이클립스는 lombok.jar 로 설치하는 과정이 필요합니다.
    ㄴ 이클립스 폴더 부모 폴더 중에 한글 폴더명 있으면 동작을 안합니다.
    ㄴ 이클립스 종료하세요.
    ㄴ lombok.jar 실행 후 eclipse.exe 경로 지정 후 -> install -> quit
    ㄴ 설치 후 확인 1) eclipse 폴더에 lombok.jar  
     2) eclipse.ini 파일 맨 아랫줄에 lombok.jar 경로가 있어야 합니다.
    ㄴ eclipse.exe 실행하기

9.  `이클립스`에서는 중요한 `라이브러리 관리` 메뉴가 있습니다.
    프로젝트 우클릭 - Build Path - Configure Build Path ....

        			      ㄴ 필요한 외부 라이브러리 jar 추가
        				 lombok.jar 와 ojdbc11.jar

10. 자바에서 했던 jdbcEx 는 dao, vo 위주로 복습하면 사용할 예정입니다.

11. 서버를 사용하는 동적 웹프로젝트를 만들어 봅시다.
    \*\*\*(주의) 현재 perspective 가 java EE 상태일 때만 메뉴가 보입니다. 1) File - New - Dynamic Web Project

12. 동적웹프로젝트 폴더 구조
    src - main - java : .java 소스파일 - webapp : html,css,js, jsp
    ㄴ 정적 리소스 : html,css,js, 이미지 => assets 폴더에 저장하기.
    ㄴ 동적 " : jsp => 필요한 기능별로 폴더 만들기
    주요 개념 : jsp는 서버측에서 컴파일 되고 실행이 됩니다.
    -> 컴파일 전에는 .java 파일로 변경되고
    -> .java 를 컴파일 해서 .class 를 생성합니다.
    -> 웹페이지를 요청한 클라이언트에게는 .class 파일로 html 문서를 작성하여 응답합니다.

1)  이클립스(개발환경)는 jsp 에 대한 java 소스파일이 여기에 있습니다.
    ㄴ D:\Class231228\eclipse-workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\jsp1\org\apache\jsp
    실제 실행 환경에서는 tomcat 폴더 안에서 바로 찾을 수 있습니다.
2)  이클립스는 webapp 폴더에 저장된 파일들은 jsp 제외하고 여기에 있습니다.
    ㄴ D:\Class231228\eclipse-workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps
    실제 실행 환경에는 tomcat 폴더 안에서 바로 찾을 수 있습니다.

13. 실행하기 : Ctrl + F11

14. Database Development 사용하기 :
    java EE 아이콘 옆에 + 아이콘 클릭 -> Database Development 선택

\*(주의) 이클립스는 perspective 라는 실행 모드가 있습니다. 어떤 퍼스펙티브인지에 따라
실행할 수 있는 메뉴(동작)이 다릅니다. db와 자바코드 작성을 할때 퍼스펙티브 전환을
주의해서 하세요.

15. Database Development 에서 Database Connections 추가 하기
    1.  Database Connections 우클릭 - New... 2) Oracle 선택 - Name (websecurity - 임의로 작성가능합니다.) - Next 3) 처음에는 드라이버 리스트에 목록이 없습니다. 옆에 + 아이콘 클릭 4) Name/Type 탭에서 Oracle 11 버전 선택. 4) JAR List 탭에서 Add JAR/Zip 클릭 - ojdbc11.jar 파일 찾아서 선택하세요.
    2.  기존의 ojdbc14.jar 삭제하세요. - OK
    3.  연결정보 Properties 설정하기 - 아래 항목 변경하기
        ㄴ Service Name : xe
        ㄴ Host : localhost
        ㄴ User name 과 Password 작성
    4.  Test Connection 클릭 - 연결 성공하면 Finish
