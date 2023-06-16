
var letterCombinations = function(digits) {

    const mappings = {
        "2" : "abc",
        "3" : "def",
        "4" : "ghi",
        "5" : "jkl",
        "6" : "mno",
        "7" : "pqrs",
        "8" : "tuv",
        "9" : "wxyz"
    }

    Object.keys(mappings).forEach(key => {
        mappings[key] = mappings[key].split("")
    })

    let combinations = []

    digits.split("").forEach((input) => {
        combinations.push(mappings[input])
    })

    combinations = combinations.reduce((a,b) => {
        /*
        console.log(a.flatMap(x => {

        }))
        */

        return a.flatMap(x => {
            return b.map(y => {
                return x + y
            })
        })
    },[''])

    return combinations

    //return combinations.reduce((a,b) => a.flatMap(x => b.map(y => x+y)),[''])

}

console.log(letterCombinations("234"))