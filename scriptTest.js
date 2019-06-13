
//Ricardo Alfredo Macias Olvera

arrTypes =["1",23, ["1", [ 2, [1] , 2]], [1.3]];
console.log("Input ",arrTypes);
var vecTypes = [];
function testType ( arr, vecTypes ){

    for (var i=0; i < arr.length; i++){
      
            if (typeof arr[i] == 'object' || Array.isArray(arr[i]))
                testType(arr[i], vecTypes);
            if (typeof arr[i] == 'string'){
                var n = parseInt(arr[i],10);              
                vecTypes.push(n);            
            }
            if (typeof arr[i] == 'number'){             
                vecTypes.push(arr[i]);             
            }
    
    }
return vecTypes;
}

vecTypes = testType(arrTypes, vecTypes);
console.log("Output ",vecTypes);