package DemoJSON;

import Data.Person;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class DemoJSON1 {

    public static void main(String[] args) throws IOException {
        final Person person1 = new Person("Abid", 29, "Graduate");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("src/main/resources/person1.json"), person1);
        objectMapper.writeValue(new File("src/main/resources/abid.json"), person1);

        String person1AsString = objectMapper.writeValueAsString(person1);
        System.out.printf("%s%n", person1AsString);

        //String to Java Obj
        String jsonString = """
                 {
                 "name" : "Raisul",
                 "age"  : 35,
                 "role" : "Phd Student"
               
                 }
                """;
        Person person2 = objectMapper.readValue(jsonString, Person.class);
        System.out.println(person2.toString());


        //JSON to Java Obj
        Person person3 = objectMapper.readValue(new File("src/main/resources/person1.json"), Person.class);
        Person person4 = objectMapper.readValue(new URL("file:src/main/resources/person1.json"), Person.class);
        List<Person> personList = objectMapper.readValue(new URL("file:src/main/resources/persons.json"), new TypeReference<> () {});
        //System.out.println(person3.toString());
       // System.out.println(person4.toString());
        personList.forEach(System.out::println);
    }
}
