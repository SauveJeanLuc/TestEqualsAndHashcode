package unoverriden;

/**
 * Main class to compare instances of PersonDetails without overriding .
 *
 * @author SAUVE Jean-Luc
 *
 */
public class Main {
    public static void main(String[] args){
        PersonDetails first = new PersonDetails(18,"John","Doe","American");
        PersonDetails second = new PersonDetails(18,"John","Doe","American");

        if(first.equals(second)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
