import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<PhoneBook> phoneBookList;
    static {
        phoneBookList = new ArrayList<>();
        phoneBookList.add(new PhoneBook
                ("Tuyen",942389487,"HaTinh","thanhtuyen021292@gmail.com","Nam","Main","02-12-1992"));
        phoneBookList.add(new PhoneBook
                ("Dat",789456123,"HaTinh","datvannguyen@gmail.com","Nam","Support","01-10-1993"));
    }
    static void menuPhoneBook(){
        System.out.println("\n----------MENU CHỨC NĂNG: -----------");
        System.out.println("1: Xem danh sách");
        System.out.println("2: Thêm mới");
        System.out.println("3: Cập nhật");
        System.out.println("4: Xóa");
        System.out.println("5: Tìm kiếm");
        System.out.println("6: Ghi vào file");
        System.out.println("7: Đọc từ file");
        System.out.println("8: Thoát");
        System.out.println("\nCHỌN CHỨC NĂNG ĐỂ TIẾP TỤC: ");
    }

    public static void main(String[] args) {
        PhoneBookManager phoneBookManager = new PhoneBookManager();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        Scanner scanner = new Scanner(System.in);
        String path ="contacts.csv";
        menuPhoneBook();

        int num =0;
        switch (num){
            case 1:
                System.out.println("HIEN THI DANH BẠ: \n");
                phoneBookManager.display(phoneBookList);
                break;
            case 2:
                System.out.println("THÊM MỚI DANH BẠ\n");
                phoneBookManager.addPhoneBook(phoneBookList);
                break;
            case 3:
                System.out.println("CẬP NHẬT DANH BẠ \n");
                phoneBookManager.updatePhoneBook(phoneBookList);
                break;
            case 4:
                System.out.println("XÓA TRONG DANH BẠ \n");
                phoneBookManager.deletePhoneBook(phoneBookList);
                break;
            case 5:
                System.out.println("TÌM KIẾM TRONG DANH BẠ:\n");
                phoneBookManager.searchPhoneBook(phoneBookList);
                break;
            case 6:
                System.out.println("GHI VÀO FILE CSV \n");
                readAndWriteFile.writeFile(path,phoneBookList);
                break;
            case 7:
                System.out.println("DOC FILE CSV \n");
                List<PhoneBook> list = new ArrayList<>();
                list =readAndWriteFile.readFile(path);
                for (PhoneBook phoneBook : list) {
                    System.out.println(phoneBook);
                }
                break;
            case 8:
                System.out.println("chào tạm biệt và hẹn gặp lại");
                break;
        }
    }
}
