package collection.day11;

import java.util.ArrayList;
import java.util.List;

import collection.myapp.JavaWord;

public class JavaWordAPP_V1 {
    // private : 현재 클래스에서만 사용할 목적으로 접근 제한합니다.
    private List<JavaWord> words = new ArrayList<>();
    
    // 프로그램 실행을 시작하는 메소드
    private void start(){
            initialize();       // words 리스트 요소를 몇 개만 저장해서 초기화 (테스트용)
            // 단어 등록, 목록, 검색, 삭제 기능을 메뉴로 구현합니다.
            System.out.println("단어장 프로그램 시작합니다.~~" + "~".repeat(30));
    while (true) {
        System.out.println("\t <메뉴를 선택하세요.>");
        System.out.println("\t 1. 단어 등록");
        System.out.println("\t 2. 단어 목록 출력");
        System.out.println("\t 3. 단어 검색");
        System.out.println("\t 4. 단어 삭제");
        System.out.println("\t 5. 프로그램 종료");
        System.out.println("선택 > ");      // 메소드에 입력 기능이 있을 때는 Scanner 관리가 불편
        int select = Integer.parseInt(System.console().readLine());     // 키보드 입력 문자열 -> 정수
        // System.console() : 시스템의 콘솔(표준입력장치) 객체를 리턴. readLine 입력 메소드 실행
        switch (select) {
            case 1: addWord();  break;      // 단어 등록 메소드 실행

            case 2: listWord(); break;      // 단어 목록 출력 메소드 실행
            
            case 3: searchWord();  break;   // 단어 검색 메소드 실행
            
            case 4: removeWord();  break;   // 단어 삭제 메소드 실행
            
            case 5: 
                System.out.println("프로그램을 종료합니다");
                System.exit(0);     // main 실행을 종료
                break;
            default:
                System.out.println("잘못된 선택 값 입니다.");
                break;
        
        } // switch end
        // while end
    }
}   // start end
    private void initialize() {
        // words 리스트 요소를 몇개만 저장해서 초기화(테스트용)
        words.add(new JavaWord("public", "공용의", 1));
        words.add(new JavaWord("private", "개인적인", 1));
        words.add(new JavaWord("iterate", "반복하다", 3));
        words.add(new JavaWord("application", "응용프로그램", 2));
        
    }
    private void removeWord() {
       
    }
    private void searchWord() {
        System.out.println("\t::단어 검색합니다.::");
        System.out.println("검색할 단어를 영문으로 입력하세요._");
        String find = System.console().readLine();
        boolean isFind = false;
        for(JavaWord word : words){
            if(word.getEnglish().equals(find)){          // 문자열 비교 equals 
                System.out.println("검색 결과 : " + word.getEnglish() + " = " + word.getKorean() + " 레벨 " + word.getLevel());
                 return;         // 단어를 한 개 찾으면 searchWord 메소드 종료.  같은 단어를 1번만 저장하게 할 때.
                // isFind = true;   // 같은 단어가 2번 이상 저장될 때

            }
        }
            // if(isFind == false)     // if문 조건 검사는 같은 단어가 2번 이상 단어장에 있을 때 사용.
                System.out.println("찾는 단어가 단어장에 없습니다.");   // 1), 2)
    }     
            // 리스트에 없는 단어를 조회한다면 ? 같은 단어 중복 저장하게 할 때는 위와 같이 할 수 있습니다.

    private void listWord() {   
        // TO DO : 리스트 words에 저장된 요소(항목)들을 모두 출력해보세요.-예쁘게~~
        System.out.println("\t::단어 목록 출력합니다.::");
        System.out.println(String.format("%-20s %-30s -%20s", "ENGLISH", "KOREAN", "LEVEL"));
        System.out.println("\n== for 반복자로 출력하기 ==");
        for(JavaWord word : words) {
            System.out.println(String.format("%-20s %-30s -%20s", word.getEnglish(), word.getKorean(), word.getLevel() ));

        }
      

    
    }

    
    

    private void addWord() {
       System.out.println("\t::단어 등록합니다.::");
       System.out.println("영어 단어 입력하세요._");
       String english = System.console().readLine();
       System.out.println("한글 의미 입력하세요._");
       String korean = System.console().readLine();
       System.out.println("단어 레벨 입력하세요.(1.초급 2.중급 3.고급)_");
       int level = Integer.parseInt(System.console().readLine());

       words.add(new JavaWord(english, korean, level));
    //    테스트 하면서 코드 분석 해보세요.
    }
    public static void main(String[] args) {
        // 프로그램 실행하는 객체 생성하고 (메소드로 기능을 분리할 때 main이 호출하는 static을 없애기 위함.)
        //          start 메소드 프로그램 실행 내용을 코딩

        JavaWordAPP_V1 app = new JavaWordAPP_V1();
        app.start();
    }


    
}
