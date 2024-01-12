package collection.day11;

import java.security.cert.Extension;
import java.util.ArrayList;
import java.util.List;

import collection.day11.Customer;
import collection.myapp.JavaWord;

// 1월 14일 저녁 9시까지 제출 - 구글 드라이브 폴더
public class CustomerManageApp {
    // JavaCustomerApp V2 형식으로 하세요.
    private List<Customer> customers = new ArrayList<>();

    private void initialize() {
        customers.add(new Customer("황병훈", "010 123 123", 1));
        customers.add(new Customer("이광원", "010 456 456", 1));
        customers.add(new Customer("김태완", "010 789 789", 3));
        customers.add(new Customer("한진만", "010 777 777", 2));
        
    }


    private void start(){
        initialize();       
        System.out.println("고객의 개인정보를 침해합니다." + "~".repeat(30));
        while (true) {
            System.out.println("\t <메뉴를 선택하세요.>");
            System.out.println("\t 1. 고객 등록");
            System.out.println("\t 2. 고객 조회");
            System.out.println("\t 3. 고객 삭제");
            System.out.println("\t 4. 고객 수정");
            System.out.println("\t 5. 고객 개인정보 전체 출력");
            System.out.println("\t 6. 프로그램 종료");
            System.out.println("선택 > ");      
            int select = Integer.parseInt(System.console().readLine());     
           
            switch (select) {
                case 1: addCustomer();  break;      

                case 2: searchCustomer(); break;      
                
                case 3: removeCustomerBy();  break;  
                
                case 4: editCustomer();  break;   
                
                case 5: listCustomer();  break;   
                
                case 6: 
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);     
                    break;
                default:
                    System.out.println("잘못된 선택 값 입니다.");
                    break;
        
                } 
            }  
        // 메뉴 선택 : 등록, 검색(이름/그룹), 삭제, 수정, 전체출력
        }

    private void addCustomer() {
        System.out.println("\t::신규 고객을 등록합니다.::");
        System.out.println("고객 이름을 입력해주세요._");
        String name = System.console().readLine();
        System.out.println("고객 전화 번호를 입력해주세요._");
        String phone = System.console().readLine();
        System.out.println("고객 등급을 입력해주세요.(1.일반 2.VIP 3.일회용)_");
        int group = Integer.parseInt(System.console().readLine());
    }
    private void searchCustomer() {
        System.out.println("\t::고객 개인정보를 검색합니다.::");
        System.out.println("궁금한 고객의 이름을 입력하세요._");
        String find = System.console().readLine();
    }

    private Customer searchFirstCustomer(String name){
        for(Customer customer : customers) {
            if(customer.getName().equals(name)) {
                return customer;        // 인자로 전달된 english와 같은 word 리턴
            }
        }
        return null;          // 찾는 english 단어 없으면 for문이 리스트 모두 반복하고 종료. null 리턴
    }

    
    
    private void removeCustomerBy() {

    }
   
   
    private void editCustomer() {
        
    }
   
    
    
    private void listCustomer() {
        System.out.println("\t::단어 목록 출력합니다.::");
        System.out.println(String.format("%-20s %-30s -%20s", "ENGLISH", "KOREAN", "LEVEL"));
        
        printCustomerList(customers); // 출력할 리스트 words로 메소드에 전달

    }
    private void printCustomerList(List<Customer> list) {
        for(Customer customer : list) {
            System.out.println(String.format("%-20s %-30s -%20s", customer.getName(), customer.getPhone(), customer.getGroup() ));
        }
    }
   
   
    public static void main(String[] args) {
        CustomerManageApp app = new CustomerManageApp();
        app.start();
    }
}

