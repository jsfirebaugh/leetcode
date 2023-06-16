
var mostWordsFound = function(sentences) {
    return sentences.map((sentence) => {
        return sentence.split(" ").length
    }).sort((a,b) => a - b).pop()
}

const inputs = [
    [
        "alice and bob love leetcode", 
        "i think so too", 
        "this is great thanks very much"
    ], [
        "please wait", 
        "continue to fight", 
        "continue to win"
    ],[
        "brjmzkatznpzhomilyyhaerytedrrwrkpuujbncfncgs",
        "u yn mwbuqymvtq z etdw p nx awixyietwg a jhsklavdagvhxdy",
        "v moahq bfhrdhxobkyccxbwduwbgsgdbngviidlaj"
    ]
]

inputs.forEach(input => console.log(mostWordsFound(input)))