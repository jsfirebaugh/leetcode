/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    return s
        .split(" ")
        .filter(input => input != "")
        .reverse()
        .toString()
        .replaceAll(",", " ")
};

const input1 = "the sky is blue"
const input2 = "  hello world  "
const input3 = "a good   example"

console.log( reverseWords(input1) )
console.log( reverseWords(input2) )
console.log( reverseWords(input3) )