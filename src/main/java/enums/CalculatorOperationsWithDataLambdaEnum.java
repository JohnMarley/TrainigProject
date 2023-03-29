package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;
import java.util.Optional;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
@Getter
public enum CalculatorOperationsWithDataLambdaEnum {

    PLUS("+", Double::sum),
    MINUS("-", (x, y) -> x - y);

    private final String symbol;
    private final DoubleBinaryOperator operator;
    public double apply(double x, double y) {
        return operator.applyAsDouble(x, y);
    }

    // fro fromString overriding
    private static final Map<String, CalculatorOperationsWithDataLambdaEnum> stringToEnum = Stream.of(values())
            .collect(Collectors.toMap(Object::toString, v -> v));

    public static Optional<CalculatorOperationsWithDataLambdaEnum> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}
