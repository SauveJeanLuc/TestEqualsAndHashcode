package overriden;

/**
 * PersonDetails is the class we'll be using to demonstrate comparable classes.
 *
 * @author SAUVE Jean-Luc
 *
 */

public class PersonDetails {

        private Integer age;
        private String firstName;
        private String lastName;
        private String nationality;

        public PersonDetails(Integer age, String firstName, String lastName, String nationality) {
            this.age = age;
            this.firstName = firstName;
            this.lastName = lastName;
            this.nationality = nationality;
        }

        //Overriding equals() to compare PersonDetails objects
        @Override
        public boolean equals(Object o){
                //If object is compared to itself then return
                if(o == this){
                    return true;
                }

                //Check if o is an instance of PersonDetails or not
                if(!(o instanceof  PersonDetails)){
                    return false;
                }

                // typecast o to PersonDetails so that we can compare data
                PersonDetails personDetails = (PersonDetails) o;

                // Compare the values inside the objects and return accordingly
                return Integer.compare(age,personDetails.age) == 0
                        && firstName.compareTo(personDetails.firstName) == 0
                        && lastName.compareTo(personDetails.lastName) ==0
                        && nationality.compareTo(personDetails.nationality) == 0;

        }
}

