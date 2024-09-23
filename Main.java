public class Main
{
    public static void main(String[] args)
    {
        Feeder i = new Feeder(500);
        System.out.println(i);
        i.simulateOneDay(12);
        System.out.println(i);
    }
}