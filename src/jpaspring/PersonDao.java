package jpaspring;

import java.util.List;

public interface PersonDao {
   void add(Person person);
   List<Person> listPersons();
}