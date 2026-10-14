import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DialingCodes {
    private final Map<Integer, String> dialingCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        boolean alreadyExists = dialingCodes.containsKey(code) || dialingCodes.containsValue(country);

        if (!alreadyExists) {
            dialingCodes.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : dialingCodes.entrySet()) {
            if (Objects.equals(entry.getValue(), country)) {
                return entry.getKey();
            }
        }

        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        for (Map.Entry<Integer, String> entry : dialingCodes.entrySet()) {
            if (Objects.equals(entry.getValue(), country)) {
                dialingCodes.put(code, entry.getValue());
                dialingCodes.remove(entry.getKey());
            }
        }
    }
}
