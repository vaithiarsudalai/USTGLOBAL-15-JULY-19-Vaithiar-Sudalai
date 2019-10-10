let employeeData=new Promise((resolve,reject)=>{
    const employee=[{
        name:'Robert Downey Jr',
        age: 52
    },
    {
        name: 'Emma Stone',
        age: '32'
    },
{
    name:'Tom',
    age:25
}];
    if(10<10){
     reject('Failed');
    }else{
        resolve(employee);
    }
});
employeeData.then((data)=>{
    // console.log('Employee Data = ',data);
    return data;
}).catch((error)=>{
    console.log('Catch block = '+error)
}).then((data1)=>{
    console.log('This is then block 2',data1);
});


// let resultData=new Promise((resolve,reject)=>{
//     if(10===10){
//      reject('Failed');
//     }else{
//         resolve('Success')
//     }
// });
// resultData.then((data)=>{
//     console.log('Then block = '+data);
// }).catch((error)=>{
//     console.log('Catch block = '+error)
// });
