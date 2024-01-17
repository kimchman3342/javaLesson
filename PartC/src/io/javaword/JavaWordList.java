package io.javaword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import collection.myapp.*;
import collection.day13.Score;


/**
 * JavaWordApp_V3 : 아래의 JavaWordList 를 이용해서 똑같이 메뉴가 동작하도록 
 *                  변경해 봅시다.
 * 
 * 이 단어장 프로그램이 다른 환경(예로, 웹브라우저)에서 동작할 때
 * 단어 1개, 단어장은 여러개를 갖고 이를 대상으로 하는 메소드(기능)를 명시하고
 * 그리고 단어장도 대체로 생성될 수 있게 합니다.
 */
public class JavaWordList implements WordList{
    //private : 현재 클래스에서만 사용할 목적으로 접근 제한합니다.
    private List<JavaWord> words;
    private String filePath;


    public JavaWordList(String filePath) {
        System.out.println("단어장의 최대 갯수 : "+ WordList.MAX_LANGTH);
        words = new ArrayList<>();
        this.filePath = filePath;
    }

    //새로운 단어등록, 기존단어 삭제 등의 변경사항을 파일에 저장하기
    public void fileSave(){
        
        File file = new File("테스트.txt");
        try ( PrintWriter pw = new PrintWriter(file)){
            //words에 있는 리스트의 모든 데이터를 파일로 출력하기

            for(JavaWord word : words) {
                pw.println(word);
                    
            }

        } catch (IOException e) {
            System.out.println("파일 입력 오류 : "+e.getMessage());
        }
    }

    //단어장.txt에서 데이터 읽어와서 'words 리스트에 담기'
    public void fileLoad() {
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line=br.readLine())!=null) {
                if(line.trim().length()==0) continue;       //빈 줄은 스킵
                String[] temp = line.split(",");
                if(temp.length !=3) continue;       //배열 크기는 반드시 3
                JavaWord word = new JavaWord(temp[0].trim(), temp[1].trim(), Integer.parseInt(temp[2].trim()));
                System.out.println("생성된 객체 : "+word);
                words.add(word);
            }

        } catch (IOException e) {
            System.out.println("파일 입력 오류 : "+e.getMessage());
        }

    }


    // 지정된 인덱스 i 의 JavaWord 객체 리턴
    public JavaWord getWord(int i) {
       return words.get(i);
    }


    //단어장 전체 리스트 리턴
    @Override
    public List<JavaWord> list() {     //getWords 에서 이름 변경
        return words;
    }

    //단어 추가
    @Override
    public void add(JavaWord word) {
        if (words.size()==5) {
            throw new IllegalArgumentException("단어장이 꽉 찼습니다. 단어장을 새로 만드세요.");
        }
        words.add(word);
    }

    //전달받은 영어 단어의 인덱스를 배열로 리턴합니다.-조회 및 삭제 기능에 사용할 새로운 메소드
    //words 리스트의 인덱스 위치 position부터 단어 english를 찾기.
    @Override
    public int indexOfWord(String english,int position){
        for(int i=position;i<words.size();i++){
            if(words.get(i).getEnglish().equals(english))
                return i;       //찾으면 인덱스 리턴
        }   
        return -1;
    }

    //단어를 인덱스로 삭제
    @Override
    public JavaWord remove(int index) {
        if (index <0 || index > words.size()) {
            // throw new Exception("삭제할 인덱스 범위가 잘못된 값입니다");                 //체크드
            throw new IllegalArgumentException("삭제할 인덱스 범위가 잘못된 값입니다");    //언체크드
            //새로운 Exception객체를 생성하면 개발자가 만든 예외가 발생
            //발생시킬 익셉션 종류는 IllegalArgumentException와 같은 이름으로 많이 사용한다
            //예로 웹개발 시에는 모든 예외를 한번에 처리하기 위해 이런 방법을 사용
        }
        JavaWord word = words.remove(index);    //삭제한 데이터를 리턴합니다.
        return word;
    }

    //단어 1개 조회(여러개 일때는 처음 1개)
    @Override
    public JavaWord searchFirstByEnglish(String english) {
        for(JavaWord word : words) {
            if(word.getEnglish().equals(english)) {
                return word;        //인자로 전달된 english 와 같은 word 리턴(메소드 종료)
            }
        }
        return null;            
    }
    
    //단어 목록 조회
    
    public List<JavaWord> searchAllByEnglish(String english){
        List<JavaWord> list = new ArrayList<>();    //검색 결과 저장할 리스트
        for(JavaWord word : words) {
            if(word.getEnglish().equals(english)) {
               list.add(word);          //일치하는 하는 단어를 만날 때마다 저장
            }
        }
        return list;
    }

    
    public List<JavaWord> searchAllByLevel(int level){
        List<JavaWord> list = new ArrayList<>();    //검색 결과 저장할 리스트
        for(JavaWord word : words) {
            if(word.getLevel()==level ) {
               list.add(word);          //일치하는 하는 단어를 만날 때마다 저장
            }
        }
        return list;
    }
    //인스턴스 메소드 : 인스턴스 필드 words 를 사용하여 동작.
    @Override
    public void print(){
        for(JavaWord word : words) {
            System.out.println(String.format("%-20s %-30s %-20s",
                                    word.getEnglish(),word.getKorean(),word.getLevel()));
        }
    }
   
    // 출력 메소드 
    // static 메소드 : 인스턴스 필드를 사용하지 않고 메소드 인자를 받아 동작.
    
    public static void print(List<JavaWord> list){
        for(JavaWord word : list) {
            System.out.println(String.format("%-20s %-30s %-20s",
                                    word.getEnglish(),word.getKorean(),word.getLevel()));
        }
    }

   
   

}