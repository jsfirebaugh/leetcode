/**
 * @return {number}
 */
var argumentsLength = function(...args) {
    console.log(args)
    return args.length
};

/**
 * argumentsLength(1, 2, 3); // 3
 */

console.log( argumentsLength(5) )
console.log( argumentsLength({}, null, "3") )