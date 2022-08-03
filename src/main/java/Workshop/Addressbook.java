package Workshop;

import java.util.*;

public class Addressbook {
    public static List<String> addressBookList;
    public static void main(String[] args) {
        addressBookList = new ArrayList<>();
        System.out.println("Welcome to addressbook");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book1: ");
        String name1 = scanner.next();
        System.out.println("Enter Book2: ");
        String name2 = scanner.next();
        System.out.println("Enter Book3: ");
        String name3 = scanner.next();
        System.out.println("Enter Book4: ");
        String name4 = scanner.next();
        addressBookList.add(name1);
        addressBookList.add(name2);
        addressBookList.add(name3);
        addressBookList.add(name4);

        Set<String> s = new HashSet<String>();
        for(String name : addressBookList){
            if(s.add(name)==false)
                System.out.println(name+" is duplicate");
        }
    }
}
