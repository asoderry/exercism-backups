import java.util.Map;

class SqueakyClean {
    private static final Map<Character, Character> REPLACEMENTS = Map.of(
            '4', 'a',
            '3', 'e',
            '0', 'o',
            '1', 'l',
            '7', 't',
            ' ', '_'
    );

    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();

        boolean toUpper = false;

        // Perform removals and replacements
        for (char character : identifier.toCharArray()) {
            character = REPLACEMENTS.getOrDefault(character, character);

            if (character == '-') {
                toUpper = true;
                continue; // Skip dashes
            }

            // Skip any special characters
            if (!Character.isLetterOrDigit(character) && character != '_') continue;

            if (toUpper) {
                character = Character.toUpperCase(character);
                toUpper = false;
            }

            builder.append(character);
        }

        return builder.toString();
    }
}
