public class Twofer {
    public String twofer(String name) {
        return switch (name) {
            case null -> "One for you, one for me.";
            default -> "One for %s, one for me.".formatted(name);
        };
    }
}
