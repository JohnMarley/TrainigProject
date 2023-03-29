package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
@Getter
public enum CalculatorOperationsWithDataEnum {

    PLUS("+") { public int apply(int x, int y) { return x + y; }},
    MINUS("-") { public int apply(int x, int y) { return x - y; }};

    private final String operation;
    public abstract int apply(int x, int y);

    // fro fromString overriding
    private static final Map<String, CalculatorOperationsWithDataEnum> stringToEnum = Stream.of(values())
            .collect(Collectors.toMap(Object::toString, v -> v));

    public static Optional<CalculatorOperationsWithDataEnum> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}
