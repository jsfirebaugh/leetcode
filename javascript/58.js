var lengthOfLastWord = function(s) {
    return s.split(" ")
        .filter((word) => {
            return word != ""
        })
        .pop()
        .length;
};

console.log(lengthOfLastWord("Hello world"))
console.log(lengthOfLastWord("luffy is still joyboy"))
console.log(lengthOfLastWord("   fly me   to   the moon  "))