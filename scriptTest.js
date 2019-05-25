
//Ricardo Alfredo Macias Olvera

var arr =[1,23, [1, [ 2, [1] , 2]], [1]];
console.log("Input -> "+arr);
var res = [];
res.push(recu(arr));
console.log("Output -> "+ res);

function recu(arr){ 
    var myData = [];
    for(let i =0; i<arr.length; i++){
        if (Array.isArray(arr[i])){
             myData.push(recu(arr[i]));
        }else{
           myData.push(arr[i]); 
        }
        
    }
return myData;
}

