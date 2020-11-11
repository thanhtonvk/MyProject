import java.io.*;
import java.util.Scanner;

public class docghifile {
    static File file = new File("Hospital/hello.txt");

    public static void ghifile() throws IOException {

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("1;xin chào;69\n2;helloworld;60");
        fileWriter.close();
    }

    public static void docfile() throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String a;

        while ((a = bufferedReader.readLine()) != null) {
            System.out.println(a.split(";")[0]);
        }

    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            //  Handle any exceptions.
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%25s|%25s|%25s|%25s|%25s|\n", "Tên bác sĩ", "Giới tính", "Tuổi", "Năm kinh nghiệm", "Khoa");
        while (true) {

            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    clearConsole();
                    break;
                case 2:
                    System.out.println("hehe");
                    scanner.nextLine();
                    clearConsole();
            }
        }


    }
}
