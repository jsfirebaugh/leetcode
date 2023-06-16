
const reverse = function(x) {

    x = x.toString().split("");

    if(x[0] == "-" ){
        x.shift();
        x = x.reverse().join("");
        x = parseInt(x);
        x = x * -1
    } else {
        x = x.reverse().join("")
        x = parseInt(x)
    }

    maxPos = Math.pow(2,31) - 1;
    maxNeg = -1 *  Math.pow(2,31);

    if( x > maxPos || x < maxNeg) 
        return 0 
    else 
        return x

    r//eturn x
}

const inputs = [123,-123,120]

inputs.forEach( input => reverse(input) )