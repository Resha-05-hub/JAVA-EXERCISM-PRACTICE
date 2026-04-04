class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean makeUpper = false;

        for (char ch : identifier.toCharArray()) {

            // Rule 1: spaces to underscore
            if (ch == ' ') {
                result.append('_');
                continue;
            }

            // Rule 2: kebab-case handling
            if (ch == '-') {
                makeUpper = true;
                continue;
            }

            // Rule 3: leetspeak conversion
            switch (ch) {
                case '4': ch = 'a'; break;
                case '3': ch = 'e'; break;
                case '0': ch = 'o'; break;
                case '1': ch = 'l'; break;
                case '7': ch = 't'; break;
            }

            // Apply uppercase if needed
            if (makeUpper) {
                ch = Character.toUpperCase(ch);
                makeUpper = false;
            }

            // Rule 4: keep only letters and underscore
            if (Character.isLetter(ch) || ch == '_') {
                result.append(ch);
            }
        }

        return result.toString();
    }
}