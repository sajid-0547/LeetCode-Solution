class Solution {
    public boolean isValid(String word) {

        if (word.length() < 3) {
            return false;
        }

        boolean vowel = false;
        boolean consonant = false;

        for (int i = 0; i < word.length(); i++) {

            char ch = Character.toLowerCase(word.charAt(i));

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowel = true;
            }
            else if (Character.isLetter(ch)) {
                consonant = true;
            }
        }

        return vowel && consonant;
    }
}