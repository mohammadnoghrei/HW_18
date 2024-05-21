package q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {



        String path = "C:\\Users\\Surena\\IdeaProjects\\W_18\\src\\main\\java\\q1\\person.txt";
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//                String text = "This is a sample text";
//                List<String> wordsList = new ArrayList<>();
//// Split the text into words using the space delimiter
//                String[] words = line.split(" ");
//// Add each word to the list
//                for (String word : words) {
//                    wordsList.add(word);
//                }
//// Print out the list of words
//                System.out.println(wordsList);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        String text = "This is a sample text";
//        List<String> wordsList = new ArrayList<>();
//
//// Split the text into words using the space delimiter
//        String[] words = text.split(" ");
//
//// Add each word to the list
//        for (String word : words) {
//            wordsList.add(word);
//        }
//
//// Print out the list of words
//        System.out.println(wordsList);
        makeListOfObject(path).forEach(Person::toString);
        PersonService personService=new PersonService();
        personService.saveList(makeListOfObject(path));

    }
    public  static List<Person> makeListOfObject(String path){
        List<Person> personList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] words = line.split(" ");
                Person person =new Person(words[0],words[1],words[2],Integer.parseInt(words[3]));
                personList.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }return personList;
    }
}

