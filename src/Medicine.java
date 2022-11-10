public class Medicine{
        public void displayLabel()
        {
            System.out.println("Company : abcd pharma");
            System.out.println("Address : india");
        }
    }

class Tablet extends Medicine
{
    public void displayLabel()
    {
        System.out.println("store in a cool dry place");
    }
}
class Syrup extends Medicine
{
    public void displayLabel()
    {
        System.out.println("5ml at a time");
    }
}

class Ointment extends Medicine
{
    public void displayLabel()
    {
        System.out.println("For external use only");

    }
}
