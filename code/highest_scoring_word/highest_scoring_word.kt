fun high(str: String) : String {
    var result = 0
    var result_index = 0
    var words = str.split(" ")
    for (i in words.indices) {
        var r = 0
        for (token in words[i]) {
            r += (token.toInt() - 96)
            if (result < r){
                result = r
                result_index = i
            }
        }
    }

    return words[result_index]
}