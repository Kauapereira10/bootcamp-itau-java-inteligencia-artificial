package exercicios.exercicio1;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public enum Operation {

    SUM(n -> LongStream.of(n).reduce(0, Long::sum)),

    SUBTRACTION(n -> LongStream.of(n).reduce(0, (n1, n2) -> n1 - n2));

    private Calc operationCallBack;

    Operation(Calc operationCallBack) {
        this.operationCallBack = operationCallBack;
    }

    public Calc getOperationCallBack() {
        return operationCallBack;
    }
}
