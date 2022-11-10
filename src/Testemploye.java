
public class Testemploye {
    public static void main(String[] args)
    {
        Employe obj = new Employe();
        obj.ass1 = 90;
        obj.ass2 = 80;
        obj.ass3 = 99;
        System.out.println(obj.calculate());
        System.out.println(obj.total(90, 80, 99));
        System.out.println(obj.percentage(obj.total(90, 80, 99)));
    }
}
