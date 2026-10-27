public class GameMaster {
    public String describe(Character character) {
        String template = "You're a level %d %s with %d hit points.";

        return template.formatted(
                character.getLevel(),
                character.getCharacterClass(),
                character.getHitPoints()
        );
    }

    public String describe(Destination destination) {
        String template = "You've arrived at %s, which has %d inhabitants.";

        return template.formatted(
                destination.getName(),
                destination.getInhabitants()
        );
    }

    public String describe(TravelMethod travelMethod) {
        return switch (travelMethod) {
            case WALKING -> "You're traveling to your destination by walking.";
            case HORSEBACK -> "You're traveling to your destination on horseback.";
        };
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return "%s %s %s".formatted(
                describe(character),
                describe(travelMethod),
                describe(destination)
        );
    }

    public String describe(Character character, Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}
