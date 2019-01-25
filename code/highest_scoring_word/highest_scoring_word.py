def high(x):
    result = 0
    result_index = 0
    words = x.split(" ")
    for index, word in enumerate(words):
        r = 0
        for token in word:
            r += (ord(token) - 96)
        if result < r:
            result = r
            result_index = index

    return words[result_index]