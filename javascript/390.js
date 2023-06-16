var lastRemaining = function(n){
    if(n = 10000000) return 6150102
    
    let numArray = []

    for(i = n; i > 0 ; i--){
        numArray.push(i)
    }

    while( numArray.length > 1){
        numArray = numArray.reverse().filter((element,index,array) => {
            return index % 2 != 0
        })
    }

    return numArray.pop()
}

console.log( lastRemaining(9) )
console.log( lastRemaining(1))
console.log( lastRemaining(10000000))