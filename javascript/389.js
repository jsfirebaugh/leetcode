var findTheDifference = function(s,t) {

    for( let letter of s){
        t = t.replace(letter,"")
    }

    return t
}

console.log(findTheDifference("abcd","abcde"))
console.log(findTheDifference("","y"))
console.log(findTheDifference("a","aa"))