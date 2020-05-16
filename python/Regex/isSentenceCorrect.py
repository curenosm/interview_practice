def isSentenceCorrect(sentence):
    """
    A sentence is considered correct if:

    it starts with a capital letter;
    it ends with a full stop, question mark or exclamation point ('.', '?' or '!');
    full stops, question marks and exclamation points don't appear anywhere else in the sentence.

    Given a sentence, return true if it is correct and false otherwise.
    """

    return re.match(sentence, r'^[A-Z][^.?!]*[.?!]$') is not None