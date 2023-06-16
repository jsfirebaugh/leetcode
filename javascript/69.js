
var mySqrt = function(x) {
    let startNum = 0;

    while( x > (startNum * startNum)){
        console.log(startNum + '|||' + startNum * startNum )
        startNum = startNum + 1
    }

    if( startNum * startNum > x ){
        startNum = startNum - 1
    }

    return startNum;
}

console.log(mySqrt(4))
console.log(mySqrt(8))