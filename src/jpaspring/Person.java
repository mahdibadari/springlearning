package jpaspring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONS")
public class Person {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "FIRST_NAME")
   private String firstName;

   @Column(name = "LAST_NAME")
   private String lastName;

   @Column(name = "EMAIL")
   private String email;

   public Person() {}
   
   public Person(String firstName, String lastName, String email) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
   }

		public String getId() {
			// TODO Auto-generated method stub
			return String.valueOf(id);
		}
		
		public String getFirstName() {
			// TODO Auto-generated method stub
			return firstName;
		}
		
		public String getLastName() {
			// TODO Auto-generated method stub
			return lastName;
		}
		
		public String getEmail() {
			// TODO Auto-generated method stub
			return email;
		}

   // Getter and Setter methods
}
