class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {
        String number = String.valueOf(numberToCheck);
        int numberOfDigits = number.length();
        int total = 0;

        for (char digit : number.toCharArray()) {
            int value = Character.getNumericValue(digit);
            total = (int) (total + Math.pow(value, numberOfDigits));
        }

        return total == numberToCheck;

    }
}
