import java.util.Locale;

class Badge {
    public String print(Integer id, String name, String department) {
        String prefix = (id == null) ? "" : "[" + id + "] - ";
        String suffix = (department == null) ? "OWNER" : department.toUpperCase();

        return prefix + name + " - " + suffix;
    }
}

