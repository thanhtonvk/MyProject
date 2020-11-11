import com.company.object.Doctor;

import java.io.*;
import java.util.ArrayList;

public class demo {
    static class Person {
        private String name;
        private String ho;

        @Override
        public String toString() {
            return name+";"+ho;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHo() {
            return ho;
        }

        public void setHo(String ho) {
            this.ho = ho;
        }

        public Person(String name, String ho) {
            this.name = name;
            this.ho = ho;
        }

        public Person() {

        }
    }

    static class main {
        public static void mang(ArrayList<Person> people) {
            people.add(new Person("ton", "do"));
            people.add(new Person("Tran", "s"));
        }

        static File file = new File("hello.txt");


        public static void ghifile(ArrayList<Person> people) throws IOException {

            FileWriter fileWriter = new FileWriter(file);

            for (Person a : people) {
                fileWriter.write(a.toString()+"\n");
            }
            fileWriter.close();
        }
        public  static void docfile(ArrayList<Person>people) throws IOException {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                people.add(new Person(line.split(";")[0],line.split(";")[1]));
            }
            fileReader.close();
        }
        public static void Hien(ArrayList<Person> people) {
            for (Person a :
                    people) {
                System.out.println(a.toString());
            }
        }

        public static void main(String[] args) throws IOException {
            String a= "Do thanh ton";
            String b = "ton";
            if(a.endsWith(b)){
                System.out.println("hihi");
            }

        }
    }

}
