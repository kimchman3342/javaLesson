package collection.day11;

import java.security.cert.Extension;
import java.util.ArrayList;
import java.util.List;

import collection.day11.Customer;
import collection.day11.Customer;

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

     // 메뉴 선택 : 등록, 검색(이름/그룹), 삭제, 수정, 전체출력
    
     // 선택 메뉴 설정
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
        }

    // 고객 정보 추가    
    private void addCustomer() {
    System.out.println("\t::신규 고객을 등록합니다.::");
    System.out.println("고객 이름을 입력해주세요._");
    String name = System.console().readLine();
    System.out.println("고객 전화 번호를 입력해주세요._");
    String phone = System.console().readLine();
    System.out.println("고객 등급을 입력해주세요.(1.일반 2.VIP 3.일회용)_");
    int group = Integer.parseInt(System.console().readLine());
}
    
    
    private void searchCustomer(){
        System.out.println("\t::고객 정보를 검색합니다.( 이름으로 조회 1, 등급으로 조회 2)::");
        String find = null;
        List<Customer> list = null;
        switch (System.console().readLine()) {
            case "1": 
            System.out.println("검색할 고객정보를 이름으로 입력하세요_");
            find = System.console().readLine();
            list = searchAllCustomer(find);
            break;
            case "2": System.out.println("검색하실 등급을 입력하세요. (1.일반 2.VIP 3.일회용) _");  
            int group = Integer.parseInt(System.console().readLine()); 
            list = searchAllCustomer(group);          
            break;      
            default:
                System.out.println("1,2 만 입력하세요.");
                return;
    }
            System.out.println("\t 검색 결과 입니다.::");
            if(list.size()==0)
                System.out.println("해당 고객의 고객정보가 없습니다.");
            else
                printCustomerList(list);      

}

    private List<Customer> searchAllCustomer(String name){
        List<Customer> list = new ArrayList<>();        
        for(Customer customer : customers) {
            if(customer.getName().equals(name)) {
                list.add(customer);    
            }
        }
        return list;
    
    }

    private List<Customer> searchAllCustomer(int group){
        List<Customer> list = new ArrayList<>();        
        for(Customer customer : customers) {
            if(customer.getGroup() == group) {
                list.add(customer);     
            }
        }
        return list;
    
    }

    
    
    private void removeCustomerBy() {
        boolean isFind = false;
        System.out.println("\t::고객 정보를 삭제합니다.::");
        System.out.println("삭제할 고객 정보를 이름으로 입력하세요._");
        String remove = System.console().readLine();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(remove)) {          
                System.out.println("인덱스 " + i + "에서 고객 정보를 찾았습니다.");
                System.out.println("삭제하려면 엔터, 취소는 n을 입력하세요");
                if (System.console().readLine().equals("n")) {
                    continue;
                } else {
                    customers.remove(i);
                    System.out.println("고객 정보 삭제 완료");
                }
                isFind = true;
                break;
            }
        }
    
        if (!isFind) {
            System.out.println("해당 고객정보는 존재하지 않습니다.");
        }

    }
   
   
    private void editCustomer() {
        boolean isFind = false;
        System.out.println("\t::고객 정보를 수정합니다.::");
        System.out.println("수정할 고객 정보를 이름으로 입력하세요._");
        String edit = System.console().readLine();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(edit)) {
                System.out.println(edit + "님의 수정된 번호를 입력하세요." );          
                String newphone = System.console().readLine();
                System.out.println(edit + "님의 수정된 번호를 입력하세요." );          
                int newgroup = Integer.parseInt(System.console().readLine());
                customers.get(i).modify_phone(newphone, newgroup);
        }
    
        if (!isFind) {
            System.out.println("해당 고객정보는 존재하지 않습니다.");
        }
        
    }
}
    
    
    private void listCustomer() {
        System.out.println("\t::고객 정보를 출력합니다.::");
        System.out.println(String.format("%-20s \t%-30s %-20s", "NAME", "PHONE", "GROUP"));
        
        printCustomerList(customers); 

    }
    private void printCustomerList(List<Customer> list) {
        for(Customer customer : list) {
            System.out.println(String.format("%-20s %-30s %-20s", customer.getName(), customer.getPhone(), customer.getGroup() ));
        }
    }
   
   
    public static void main(String[] args) {
        CustomerManageApp app = new CustomerManageApp();
        app.start();
    }
}

