import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public void writeFile(String path, List<PhoneBook> phoneBookList){
        File fileWriter = new File(path);
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        try {
            fileOutputStream = new FileOutputStream(fileWriter);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (PhoneBook phoneBook: phoneBookList){
                objectOutputStream.writeObject(phoneBook);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException a){
            a.printStackTrace();
        }

    }
    public List<PhoneBook> readFile(String path){
        List<PhoneBook> list = new ArrayList<>();
        File fileReader = new File(path);
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;

        try{
            fileInputStream = new FileInputStream(fileReader);
            objectInputStream = new ObjectInputStream(fileInputStream);

            PhoneBook phoneBook = null;
            while ((phoneBook = (PhoneBook) objectInputStream.readObject()) != null) {
                list.add(phoneBook);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (EOFException e){
            System.out.println("da doc het file");
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return list;
    }
}
