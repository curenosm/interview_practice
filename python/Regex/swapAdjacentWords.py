def swapAdjacentWords(s):
    """
    You are given a string consisting of words separated by whitespace
    characters, where the words consist only of English letters. Your
    task is to swap pairs of consecutive words and return the result.
    """
    return re.sub(r'(\w+) (\w+)', r'\2 \1', s)