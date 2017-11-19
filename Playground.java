
/**
 * Write a description of class Playground here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Playground
{
    public void run ()
    {
        Person p = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        
        int age = p.getAge();
        String firstName = p.getFirstName();
        String lastName = p.getLastName();
        double height = p.getHeight();
        
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(height);
        System.out.println(age);
        
        //sign in / signed up
        
        p.setAge(90);
        p.setFirstName("Gary");
        p.setLastName("Tong");
        p.setHeight(181.0);
        
        System.out.println(p.getAge());
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(p.getHeight());
        
        if (p.isTall() == true) 
        {
          System.out.println("Person is tall");  
        }

        if (p.isOld() == true)
        {
            System.out.println("Person is old");
        }
    }
}
