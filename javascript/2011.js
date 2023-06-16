
var finalValue = function(operations) {
    return operations.map((input) => {
        switch(input){
            case "--X":
                return -1;
                break;

            case "X--":
                return -1;
                break;

            case "X++":
                return 1;
                break;

            case "++X":
                return 1
                break;
        }
    }).reduce((previous,current) => {
        return previous + current
    }, 0);

    console.log( operations )
}

finalValue(["--X","X++","X++"])