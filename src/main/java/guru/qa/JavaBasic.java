package guru.qa;

import java.util.Arrays;

public class JavaBasic {

    public static void primitiveDataTypes() {
        //byte type example (from -128 to 127)
        byte byteExample = 108;
        System.out.println("This is an example of Byte data type in Java: " + byteExample);

        //short type example (from -32,768 to 32,767)
        short shortExample = -22222;
        System.out.println("This is an example of Short data type in Java: " + shortExample);

        //int type example (-2,147,483,648 to 2,147,483,647)
        int intExample = 1234567899;
        System.out.println("This is an example of Int data type in Java: " + intExample);

        //long type example (from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        long longExample = -1333333222111888777L;
        System.out.println("This is an example of Long data type in Java: " + longExample);

        //float type example (up to 7 decimal digits)
        float floatExample = 22.53422f;
        System.out.println("This is an example of Float data type in Java: " + floatExample);

        //double type example (up to 15 decimal digits)
        double doubleExample = -111.1234543211;
        System.out.println("This is an example of Double data type in Java: " + doubleExample);
    }

    public static void arrays() {
        //array example with integer content
        int[] arrayExample = new int[] {11, 55, 2, 111, 8997};
        System.out.println("This is an example of array in Java: " + Arrays.toString(arrayExample));


    }

    public static void booleanAndComparison() {
        //boolean "and"
        boolean booleanAndExample = (1 < 2) && (3 > 4);
        System.out.println("This is an example of boolean \"and\" in Java (True and False): " + booleanAndExample);

        //boolean "or"
        boolean booleanOrExample = (2 <= 3) || (3 >= 4);
        System.out.println("This is an example of boolean \"or\" in Java (True and False): " + booleanOrExample);


    }

    public static void primitiveDataTypesInteraction() {
        //addition example
        int additionExample = 1 + 2;
        System.out.println("This is an example of addition in Java: 1 plus 2 equals " + additionExample);

        //subtraction example
        int subtractExample = 5 - 1;
        System.out.println("This is an example of subtraction in Java: 5 minus 1 equals " + subtractExample);

        //multiplication example
        int multiplicationExample = 2 * 3;
        System.out.println("This is an example of multiplication in Java: 2 times 3 equals " + multiplicationExample);

        //integer division example
        int intDivisionExample = 15 / 3;
        System.out.println("This is an example of integer division in Java: 15 divided by 3 equals " + intDivisionExample);

        //float division example
        float floatDivisionExample = 11.0f / 2;
        System.out.println("This is an example of float division in Java: 11 divided by 2 equals " + floatDivisionExample);

        //modulus division example
        int modDivisionExample = 5 % 2;
        System.out.println("This is an example of modulus division in Java: 5 divided by 2 equals " + modDivisionExample);

    }

    public static void overflow() {
        //integer maximum overflow example
        int varA = 1000000000;
        int varB = 2000000000;
        int overflowMaxResult = varA + varB;
        System.out.println("This is an example of overflow maximum value of type in Java: int 2000000000 plus int " +
                "1000000000 equals " + overflowMaxResult);

        //integer minimum overflow example
        int varC = -2000000000;
        int varD = -2;
        int overflowMinResult = varD * varC;
        System.out.println("This is an example of overflow minimum value of type in Java: int -2000000000 multiply int " +
                "-2 equals " + overflowMinResult);

    }

    public static void mixedTypesInteractionWithDouble() {
        //integer and double interaction example
        System.out.println("This is an example of overflow of type in Java: int 299 plus double 1.5 equals "
                + (299 + 1.5));
        System.out.println("All values in an mixed arithmetic operations (+, −, *, /, %) are converted to double type" +
                " before the arithmetic operation in performed.");

    }

    public static void mixedTypesInteractionWithLong() {
        //integer and long interaction example
        System.out.println("This is an example of overflow of type in Java: int 299 plus long 9000000000000000000" +
                " equals " + (299 + 9000000000000000000L));
        System.out.println("If either operand is of type double, the other is converted to double. _ Otherwise, " +
                "if either operand is of type float, the other is converted to float.\nOtherwise, if either operand" +
                " is of type long, the other is converted to long.\nOtherwise, both operands are converted to type int.");

    }

    public static void ifElse() {
        //logical operators example
        String varA = "Generic String";
        if (varA != null && varA.length() > 5) {
            System.out.println("The string is: " + varA + "\nThis is an example of \"if\" operator in Java");
        } else if (varA == null) {
            System.out.println("The variable contains nothing.\nThis is an example of \"else - if\" operator in Java");
        } else {
            System.out.println("The text is too short.\nThis is an example of \"else\" operator in Java");
        }


    }

    public static void main(String[] args) {
        primitiveDataTypes();
        arrays();
        booleanAndComparison();
        primitiveDataTypesInteraction();
        overflow();
        mixedTypesInteractionWithDouble();
        mixedTypesInteractionWithLong();
        ifElse();
    }
}