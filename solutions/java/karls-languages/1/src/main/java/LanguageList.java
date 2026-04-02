import java.util.ArrayList;
import java.util.List;

public class LanguageList {

    private List<String> languages;

    public LanguageList() {
        languages = new ArrayList<>();
    }

    // 1) Check if list is empty
    public boolean isEmpty() {
        return languages.isEmpty();
    }

    // 2) Add a language
    public void addLanguage(String language) {
        languages.add(language);
    }

    // 3) Remove a language
    public void removeLanguage(String language) {
        languages.remove(language);
    }

    // 4) Return first language
    public String firstLanguage() {
        return languages.get(0);
    }

    // 5) Count languages
    public int count() {
        return languages.size();
    }

    // 6) Check if list contains a language
    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    // 7) Check if exciting (Java or Kotlin)
    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}