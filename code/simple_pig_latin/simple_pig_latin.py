def pig_it(text):
    result = []
    words = text.split(" ")
    for word in words:
        result_word = ""
        first_chr = word[0]

        if len(word) == 1 and isSpecialChr(first_chr):
            result_word += first_chr
        else:
            for w in word[1:]:
                result_word += w
            result_word += first_chr
            result_word += "ay"

        result.append(result_word)
    return " ".join(result)


def isSpecialChr(c):
    c_num = ord(c)
    if c_num in range(33, 47) or c_num in range(58, 64) or c_num in range(91, 96) or c_num in range(123, 126):
        return True
    return False