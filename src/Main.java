public class Main {
    public static void main(String[] args) {

        Calc c = new Calc();
        String wynik = c.doCalc("2 * 3");
        System.out.println(wynik);
        wynik = c.doCalc("2 + 3");
        System.out.println(wynik);
        wynik = c.doCalc("2 - 3");
        System.out.println(wynik);
        wynik = c.doCalc("2 / 3");
        System.out.println(wynik);
    }
}