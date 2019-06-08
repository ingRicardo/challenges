
//Ricardo Alfredo Macias Olvera

arr =[1,23, [1, [ 2, [1] , 2]], [1]];
console.log("Input -> ", arr);

var vec =[];
vec = funcTest(arr,vec);
console.log("Output-> " , vec);
function funcTest(arr,vec){
    for(var i = 0 ; i < arr.length; i++){
        if (typeof arr[i] == 'number'){
            vec.push(arr[i]);
        }
        funcTest(arr[i],vec);
    }
return vec;
}