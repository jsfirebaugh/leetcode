/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    for( const magazineChar of magazine ){
        ransomNote = ransomNote.replace( magazineChar, "" )
    }

    return !ransomNote
};

console.log( canConstruct("a", "b") )
console.log( canConstruct("aa", "ab") )
console.log( canConstruct("aa", "aab") )