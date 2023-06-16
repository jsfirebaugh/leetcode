
var plusOne = function(digits){
    let newDigit = ''
    digits.forEach(x => newDigit += x)
    return (BigInt(newDigit) + BigInt(1))
        .toString()
        .split("")
    /*
    console.log(BigInt(newDigit))
    console.log( BigInt(1) + BigInt(newDigit))
    console.log((BigInt(1) + BigInt(newDigit)).toString())
    */

    /*
    console.log(newDigit)
    console.log(BigInt(newDigit))
    console.log(9007199254740991)
    return ''
    return (1 + parseInt(newDigit,10))
        .toString()
        .split("");
    */
}

const inputs = [
    [1,2,3],
    [4,3,2,1],
    [9],
    [6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3]
]

const inputs2 = [
    [6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3]
]

inputs.forEach(input => {
    console.log(
        plusOne(input)
    )
})