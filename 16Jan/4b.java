import java.io.*;

class Library {
    private String bookName;
    private String authorName;

    public Library(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public void saveToFile() {
        try (FileOutputStream fos = new FileOutputStream("bookinfo.txt")) {
            String data = bookName + "," + authorName;
            byte[] dataBytes = data.getBytes();
            fos.write(dataBytes);
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        try (FileInputStream fis = new FileInputStream("bookinfo.txt")) {
            byte[] dataBytes = new byte[fis.available()];
            fis.read(dataBytes);
            String data = new String(dataBytes);
            String[] dataArray = data.split(",");
            bookName = dataArray[0];
            authorName = dataArray[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayBookInfo() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
    }
}

public class Main {
    public static void main(String[] args) {
        Library book = new Library("War and Peace", "Leo Tolstoy");
        book.saveToFile();
        book.readFromFile();
        book.displayBookInfo();
    }
}
