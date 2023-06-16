var canByTypedWords = function(text, brokenLetters){
    return text.split(" ").map((input) => {
        inputCopy = input;

        brokenLetters.split("").forEach((letter) => {
            inputCopy = inputCopy.replaceAll(letter, "")
        })

        return {
            "orig" : input.length,
            "new" : inputCopy.length
        }
    }).filter((input) => {
        return input.orig == input.new
    }).length

}

console.log(canByTypedWords("leet code", "lt"))
console.log(canByTypedWords("hello world", "ad"))
console.log(canByTypedWords("leet code", "e"))