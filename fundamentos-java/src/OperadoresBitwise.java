public class OperadoresBitwise {

    public static void main(String[] args) {
        var value1 = -33;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operação %s (representação binária %s)\n", value1, binary1);

        var value2 = 6;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Primeiro numero da operação %s (representação binária %s)\n", value2, binary2);

        var result = value1 >> value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s >> %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);

//        var result2 = ~value1;
//        var binaryResult2 = Integer.toBinaryString(result2);
//        System.out.printf(" ~%s = %s (representação binária %s)\n", value1, result2, binaryResult2);



    }

    /*
    0 = false
    1 = true
    110
    101
    100
    */

}
