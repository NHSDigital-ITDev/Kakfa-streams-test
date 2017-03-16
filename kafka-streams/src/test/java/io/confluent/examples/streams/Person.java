package io.confluent.examples.streams;


  public class Person{
      public Person(String nhsNumber, Integer age, String address){
        this.NhsNumber = nhsNumber != null ? nhsNumber : "";
        this.Age = age;
        this.Address = address = address != null ? address : "";
      }

      public String NhsNumber;
      public Integer Age;
      public String Address;

      @Override
      public String toString(){
        return "USER: " + NhsNumber + "," + Age + "," + Address;
      }

      @Override
      public boolean equals(Object o) {
 
        // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Person)) {
            return false;
        }
         
        Person person = (Person) o;
         
        return Age.equals(person.Age) && NhsNumber.equals(person.NhsNumber)
                                      && Address.equals(person.Address);
    }
  }