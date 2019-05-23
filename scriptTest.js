
//Ricardo Alfredo Macias Olvera

var arr =[1,23, [1, [ 2, [1] , 2]], [1]];
console.log("Input -> "+arr);
var myData = [];
recu(arr);
console.log("Output -> "+ myData);
function recu(arr){
   
    for(let i =0; i<arr.length; i++){
        if (typeof arr[i] == 'object'){
            recu(arr[i]);
        }else{
           myData.push(arr[i]); 
        }
        
    }

}

