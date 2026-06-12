public class SqueakyClean {
    public static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);

            // 1. Convert leetspeak characters to normal text
            switch (ch) {
                case '4' -> ch = 'a';
                case '3' -> ch = 'e';
                case '0' -> ch = 'o';
                case '1' -> ch = 'l';
                case '7' -> ch = 't';
            }

            // 2. Process spaces and kebab-case flags
            if (ch == ' ') {
                result.append('_');
            } else if (ch == '-') {
                capitalizeNext = true;
            } else {
                // 3. Filter for letters only
                if (Character.isLetter(ch)) {
                    if (capitalizeNext) {
                        result.append(Character.toUpperCase(ch));
                        capitalizeNext = false;
                    } else {
                        result.append(ch);
                    }
                }
                // Any non-letter character (like $, #, .) is completely ignored here
            }
        }

        return result.toString();
    }
}