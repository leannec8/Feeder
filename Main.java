public class Main
{
    public static void main(String[] args)
    {
        Feeder a = new Feeder(500);
        a.simulateOneDay(12);
        System.out.println(a.getCurrentFood());
        Feeder b = new Feeder(1000);
        b.simulateOneDay(22);
        System.out.println(b.getCurrentFood());
        Feeder c = new Feeder(100);
        c.simulateOneDay(5);
        System.out.println(c.getCurrentFood());

        System.out.println(" ");

        Feeder x = new Feeder(2400);
        System.out.println(x.simulateManyDays(10,4));
        Feeder y = new Feeder(250);
        System.out.println(y.simulateManyDays(10,5));
        Feeder z = new Feeder(0);
        System.out.println(z.simulateManyDays(5,10));
    }
}