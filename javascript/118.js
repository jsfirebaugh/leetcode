
var generate = function(numRows) {
    let pascal = [];

    if(numRows >= 1) pascal.push([1]);
    if(numRows >= 2) pascal.push([1,1]);

    for(i = 2; i < numRows; i++){
        let newLine = []

        newLine.push(1)
    
        if( pascal.length % 2 == 0){
            for( x = 0; x < pascal.length / 2; x++ ){
                newLine.push( pascal[i-1][x] + pascal[i-1][x+1]  )
            }

            reverseSection = [...newLine]
            reverseSection.reverse()
            reverseSection.shift()

            newLine.push(...reverseSection)
        } else {
            for( x = 0; x < (pascal.length - 1) / 2; x++ ){
                newLine.push( pascal[i-1][x] + pascal[i-1][x+1]  )
            }

            reverseSection = [...newLine]
            reverseSection.reverse()
            newLine.push(...reverseSection)
        }

        pascal.push(newLine)

    }

    return pascal;
    
}

const inputs = [6]

inputs.forEach((input) => {
    console.log(generate(input))
    console.log("--------------------")
})