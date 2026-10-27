public class GameMaster {
    public String describe(Character character) {
        String template = "You're a level %d %s with %d hit points.";

        return template.formatted(character.getLevel(), character.getCharacterClass(), character.getHitPoints());
    }

    public String describe(Destination destination) {
        String template = "You've arrived at %s, which has %d inhabitants.";

        return template.formatted(destination.getName(), destination.getInhabitants());
    }

    // TODO: Find a more efficient / elegant way to do this
    public String describe(TravelMethod travelMethod) {
        String template = "You're traveling to your destination %s %s.";
        String formattedTravelMethod = travelMethod.toString().toLowerCase();

        return switch (travelMethod) {
            case WALKING -> template.formatted("by", formattedTravelMethod);
            case HORSEBACK -> template.formatted("on", formattedTravelMethod);
        };
    }

    // TODO: Find a more efficient / elegant way to do this
    public String describe(Character character, Destination destionation, TravelMethod travelMethod) {
        StringBuilder builder = new StringBuilder();

        builder.append(describe(character)).append(" ");
        builder.append(describe(travelMethod)).append(" ");
        builder.append(describe(destionation));

        return builder.toString();
    }

    // TODO: Find a better way to do this which is still efficient but more readable
    public String describe(Character character, Destination destination) {
        String template = "%s %s %s";

        return template.formatted(describe(character), describe(TravelMethod.WALKING), describe(destination));
    }
}
