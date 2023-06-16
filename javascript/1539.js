
var findKthPosition = function(arr,k){

    const newArray = []

    for(i = 1; i <= arr[arr.length-1]; i++){
        if( !arr.find(x => x == i)){
            newArray.push(i)
        }
    }

    if( newArray.length >= k ){
        return newArray[k-1]
    }

    return arr[arr.length-1] - newArray.length + k
}

//console.log(findKthPosition([2,3,4,7,11],5))
console.log( findKthPosition([1,2,3,4],2))