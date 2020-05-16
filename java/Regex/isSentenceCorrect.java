/*
    A sentence is considered correct if:

    it starts with a capital letter;
    it ends with a full stop, question mark or exclamation point ('.', '?' or '!');
    full stops, question marks and exclamation points don't appear anywhere else in the sentence.

    Given a sentence, return true if it is correct and false otherwise.
*/

boolean isSentenceCorrect(String sentence) {
    String regex = "^[A-Z][^.?!]*[.?!]$";
    return sentence.matches(regex);
}