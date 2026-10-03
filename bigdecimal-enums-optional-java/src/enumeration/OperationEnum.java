package enumeration;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public enum OperationEnum {

    SSUM(1, "Soma", Integer::sum),
    SUBTRACTION(2, "Subtração", (a, b) -> a - b),
    MULTIPLY(3, "Multiplicação", (a, b) -> a * b),
    DIVISION(4, "Divisão", (a, b) -> a / b);

    private final int code;
    private final String label;
    private final IntBinaryOperator calculate;

    OperationEnum(int code, String label, IntBinaryOperator calculate) {
        this.code = code;
        this.label = label;
        this.calculate = calculate;
    }

    public int execute(int v1, int v2) {
        return calculate.applyAsInt(v1, v2);
    }

    public static Optional<OperationEnum> fromCode(int code) {
        for (OperationEnum op : values()) {
            if (op.code == code) {
                return Optional.of(op);
            }
        }
        return Optional.empty();
    }

    public String getLabel() {
        return label;
    }

    public int getCode() {
        return code;
    }
}
