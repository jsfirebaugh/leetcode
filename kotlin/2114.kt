
fun mostWordsFound(sentences: Array<String>): Int {
    
    var maxWords: Int = 0

    for(sentence in sentences) {
        var spaces = sentence.length - sentence.replace(" ", "").length

        if(spaces + 1 > maxWords){
            maxWords = spaces + 1
        }
    }

    return maxWords
}

fun main(){
    var wordArray = arrayOf<String>("alice and bob love leetcode", "i thinks so too", "this is great thanks very much")
    println(mostWordsFound(wordArray))

    wordArray = arrayOf<String>("please wait", "continue to fight", "continue to win")
    println(mostWordsFound(wordArray))
}