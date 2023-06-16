
var addToArrayForm = function(num,k){
    num = num.toString().replaceAll(",", "")
    num = BigInt(num) + BigInt(k)
    num = num.toString().split("")
    return num
}

addToArrayForm(
    [1,2,0,0], 34
)

addToArrayForm(
    [1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3], 516
)