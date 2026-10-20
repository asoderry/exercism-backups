class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();

        // Setup
        sb.append(operand1);
        sb.append(" %s ".formatted(operation));
        sb.append(operand2);
        sb.append(" = ");

        try {
            switch (operation) {
                case "+" -> sb.append(operand1 + operand2);
                case "*" -> sb.append(operand1 * operand2);
                case "/" -> sb.append(operand1 / operand2);
                case null -> throw new IllegalArgumentException("Operation cannot be null");
                case "" -> throw new IllegalArgumentException("Operation cannot be empty");
                default -> throw new IllegalOperationException("Operation '%s' does not exist".formatted(operation));
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }

        return sb.toString();
    }
}
