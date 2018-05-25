package jpaspring;

import java.util.List;

public interface PersonService {
	void add(Person person);
    List<Person> listPersons();
}
