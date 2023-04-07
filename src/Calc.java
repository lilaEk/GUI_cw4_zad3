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
            int numberA;
            int numberB;
            char artChar;

            arth = arth.trim();
            String[] elements = arth.split(" ");
            numberA = Integer.parseInt(elements[0]);
            numberB = Integer.parseInt(elements[elements.length - 1]);
            artChar = elements[1].charAt(0);
            return String.valueOf(commands.get(artChar).apply(numberA, numberB));
        } catch (NumberFormatException e) {
            System.out.println("Podaj prawidłowe działanie arytmetyczne do wykonania");
            return "";
        }
    }

}
