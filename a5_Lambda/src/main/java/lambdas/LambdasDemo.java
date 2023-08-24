package lambdas;

import java.util.List;
import java.util.function.*;

public class LambdasDemo {
    public static String prefix = "-";

    public static void show() {
        greet(message -> System.out.println(prefix + message));

        greet(System.out::println);

        //greet(new ConsolePrinter());

        //////////////////////////////////////

        List<Integer> list = List.of(1, 2, 3);
        for (var item : list) {
            System.out.println(item);
        }

        list.forEach(item -> System.out.print(item));

        /////////////////////////////////////////
        // CONSUMER
        List<String> listStr = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
        listStr.forEach(print.andThen(printUpperCase));

        /////////////////////////////////////////
        // SUPPLIER
        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);

        /////////////////////////////////////////
        // FUNCTION
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("LuisFer");
        System.out.println(length);

        // "key:value"
        // first: "key=value"
        // second: "{key=value}"
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        String result = replaceColon
                .andThen(addBraces)
                .apply("key:value");
        System.out.println(result);

        String result1 = addBraces
                .compose(replaceColon)
                .apply("key:value");
        System.out.println(result1);

        /////////////////////////////////////////
        // PREDICATE
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        boolean result2 = isLongerThan5.test("LuisFer");
        System.out.println(result2);

        /////////////////////////////////////////
        // COMBINE PREDICATE
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        boolean result3 = hasLeftBrace.and(hasRightBrace).test("{poll}");
        System.out.println(result3);

        /////////////////////////////////////////
        // BINARY OPERATOR
        // a,b -> a + b -> square
        BinaryOperator<Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> square = a -> a * a;
        var result4 = add.andThen(square).apply(1, 2);
        System.out.println(result4);

        /////////////////////////////////////////
        // UNARY OPERATOR
        UnaryOperator<Integer> square1 = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;
        var result5 = increment.andThen(square1).apply(1);
        System.out.println(result5);


    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
