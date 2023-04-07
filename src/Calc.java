import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Calc {
    static final Map<Character, BiFunction<Number, Number, Number>> commands = new HashMap<>();

    public Calc() {
        commands.put('*', (Number a, Number b) -> a.doubleValue() * b.doubleValue());
        commands.put('/', (Number a, Number b) -> a.doubleValue() / b.doubleValue());
        commands.put('-', (Number a, Number b) -> a.doubleValue() - b.doubleValue());
        commands.put('+', (Number a, Number b) -> a.doubleValue() + b.doubleValue());
    }

    public static String doCalc(String arth) {
        try {
            Number numberA;
            Number numberB;
            char artChar;

            arth = arth.trim(); // usuwa spacje na poczatku i koncu
            String[] elements = arth.split(" ");
            numberA = Double.valueOf(elements[0]);
            numberB = Double.valueOf(elements[elements.length - 1]);
            artChar = elements[1].charAt(0);
            return String.valueOf(commands.get(artChar).apply(numberA, numberB));
        } catch (NumberFormatException e) {
            System.out.println("Podaj prawidłowe działanie arytmetyczne do wykonania");
            return "";
        }
    }

}
