package src;

public class Convection {

    public String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal < 0) {
            return "-" + decimalToBinary(Math.abs(decimal));
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }

        return binary.toString();
    }

    public boolean validateDecimal(String decimal) {
        try {
            Integer.parseInt(decimal);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
