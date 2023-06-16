
var isPalindrome = function(x) {
    return x.toString() == x.toString().split("").reverse().join("") 
        ? true 
        : false
}

console.log(isPalindrome("1221"))
console.log(isPalindrome("123"))
console.log(isPalindrome("10"))
console.log(isPalindrome(10))
console.log(isPalindrome(-10))
console.log(isPalindrome("101"))
