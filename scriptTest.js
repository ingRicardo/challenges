
//Ricardo Alfredo Macias Olvera

var arrStart =["1",23, ["1", [ 2, [1] , 2]], [1.3]];
console.log("input -> ", arrStart);
var VecRes = arrayTest(arrStart)
console.log("output -> ",  VecRes);

function arrayTest(arrStart){
   var res = [];
   var vecTypes = [];
   for (var i=0; i < arrStart.length; i++){
    
    if ( Array.isArray(arrStart[i])){
               
        vecTypes=   testType(arrStart[i], vecTypes);

    }else if (typeof arrStart[i] == 'string'){
        var n = parseInt(arrStart[i],10);              
        res.push(n);            
    } else if (typeof arrStart[i] == 'number'){             
        res.push(arrStart[i]);             
    } 

   }
   for (var i=0; i < vecTypes.length; i++){
 
    res.push(vecTypes[i]);
    } 
   
   return res;
}


function testType ( arr, vecTypes ){

    for (var i=0; i < arr.length; i++){
      
            if ( Array.isArray(arr[i])){
                testType(arr[i], vecTypes);
            }
                
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

