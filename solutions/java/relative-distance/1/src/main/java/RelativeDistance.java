import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RelativeDistance {
    private final Map<String, List<String>> familyTree;

    RelativeDistance(Map<String, List<String>> familyTree) {
        this.familyTree = familyTree;
    }

    int degreeOfSeparation(String personA, String personB) {
        int counter = 0;
        boolean notFoundLink = true;

        while (notFoundLink) {
            for (String person : familyTree.keySet()) {
                if (familyTree.get(person).contains(personA)) {
                    personA = person;
                    counter++;
                    break;
                }
            }

            for (String person : familyTree.keySet()) {
                if (familyTree.get(person).contains(personB)) {
                    personB = person;
                    counter++;
                    break;
                }
            }

            if (personA.equals(personB)) {
                notFoundLink = false;
            }

            if (counter == 0) {
                return -1;
            }
        }

        if (familyTree.get(personA).size() > 1) {
            counter--;
        }

        return counter;
    }
}
