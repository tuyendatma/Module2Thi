import java.util.List;
import java.util.Scanner;

public class PhoneBookManager {
    public static Scanner scanner = new Scanner(System.in);
    public void addPhoneBook(List<PhoneBook> phoneBookList){
        System.out.println("moi nhap ten");
        String name = scanner.nextLine();
        int phoneNumber;
        System.out.println("moi nhap so dien thoai");
        phoneNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("moi nhap dia chi");
        String address = scanner.nextLine();
        System.out.println("moi nhap email:");
        String email = scanner.nextLine();
        System.out.println("moi nhap gioi tinh:");
        String gender = scanner.nextLine();
        System.out.println("moi nhap nhom");
        String groups = scanner.nextLine();
        System.out.println("moi nhap ngay sinh:");
        String dateOfBirth = scanner.nextLine();
        phoneBookList.add(new PhoneBook(name,phoneNumber,address,email,gender,groups,dateOfBirth));
    }
    public void updatePhoneBook(List<PhoneBook> phoneBookList){
        int index;
        do {
            System.out.println("nhap vi tri index can cap nhat");
            index = scanner.nextInt();
        }while (index>= phoneBookList.size() );
        scanner.nextLine();
        System.out.println("nhap ten can sua:");
        String name = scanner.nextLine();
        System.out.println("moi nhap so dien thoai can sua");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("moi nhap dia chi can sua");
        String address = scanner.nextLine();
        System.out.println("moi nhap email can sua:");
        String email = scanner.nextLine();
        System.out.println("moi nhap gioi tinh can sua:");
        String gender = scanner.nextLine();
        System.out.println("moi nhap nhom can sua");
        String groups = scanner.nextLine();
        System.out.println("moi nhap ngay sinh can sua:");
        String dateOfBirth = scanner.nextLine();
        phoneBookList.get(index).setName(name);
        phoneBookList.get(index).setPhoneNumber(phoneNumber);
        phoneBookList.get(index).setAddress(address);
        phoneBookList.get(index).setEmail(email);
        phoneBookList.get(index).setGender(gender);
        phoneBookList.get(index).setGroups(groups);
        phoneBookList.get(index).setDateOfBirth(dateOfBirth);
    }
    public void deletePhoneBook(List<PhoneBook> phoneBookList){
        int index;
        do {
            System.out.println("nhap vi tri index can cap nhat");
            index = scanner.nextInt();
        }while (index>= phoneBookList.size() );
       phoneBookList.remove(index);
    }
    public void display(List<PhoneBook> phoneBookList){
        for (PhoneBook phoneBook:
             phoneBookList) {
            System.out.println(phoneBook.toString());
        }
    }
    public void searchPhoneBook(List<PhoneBook> phoneBookList){
        System.out.println("nhap ten ban can tim kiem trong danh ba:");
        boolean check = false;
        int index =0;
        String inputValue = scanner.nextLine();
        for (int i = 0; i <phoneBookList.size() ; i++) {
            if (phoneBookList.get(i).getName().toLowerCase().contains(inputValue.toLowerCase())){
                index =i;
                check= true;
                break;
            }else {
                check = false;
            }
            if (check){
                System.out.println(phoneBookList.get(index).toString());
            }else {
                System.out.println("khong co ten ban tim");
            }

        }
    }
}
