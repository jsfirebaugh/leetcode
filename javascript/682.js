
var calPoints = function(operations){

    let outcome = []

    operations.forEach((input) => {
        switch(input){
            case "+":
                outcome.push(outcome[outcome.length-1] + outcome[outcome.length-2]);
                break;
            case "D":
                outcome.push(outcome[outcome.length-1] * 2)
                break;
            case "C":
                outcome.pop()
                break;
            default:
                outcome.push(parseInt(input,10))
                break;
        }
    })

    outcome = outcome.reduce((previous,current) => {
        return previous + current 
    }, 0)

    return outcome
}

calPoints(["5","2","C","D","+"])
calPoints(["5","-2","4","C","D","9","+","+"])
calPoints(["1","C"])