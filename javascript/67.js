
const addBinary = ((a,b) => {

    a = BigInt(`0b${a}`)
    b = BigInt(`0b${b}`)
    c = a + b;

    return c.toString(2)

    //a = parseInt(a,2);
    //b = parseInt(b,2);
    //console.log( BigInt(a) )
    //console.log( BigInt(b) )
    //console.log( BigInt(a) + BigInt(b) )
    //console.log("-----------------")
    //return (BigInt(parseInt(a,2)) + BigInt(parseInt(b,2))).toString(2)
});

//console.log(addBinary("11","1"))
//console.log(addBinary("1010","1011"))

addBinary(
    "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
    "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
)