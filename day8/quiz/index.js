
// const arr = Array(100).fill(0).map((x,i)=>{
//     return i + 1;
// });

// const a = arr.map(x=>{
//     return x.toString().split('').map(x=>{
//         return x == '3' || x == '6' || x == '9' ? x = '👏' : x;
//     }).join('').includes('👏') == true ? x = '👏' : x;
// }).map(x=>{
//     return Number(x) == NaN ? x = '👏' : x;
// });

// const a = arr.map(x=>{
//     return x.toString().some(x=>{
//         return x == '3' || '6' || '9' ? x = '👏' : x;
//     });
// });

// const fruits = ['mellon', 'kiwi', 'apple', 'banana', 'orange'];

// const uf = fruits.map(x=>{
//     return x.split('').map(x=>{
//         return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ? x.toUpperCase() : x;
//     }).join('');
// });

// const arr = "xabcxdefxghi";

// console.log(arr.split('x').map(x=>{
//     return x.length;
// }));

// const todolist = ['점심', '학습', '취미', '연락'];
// const finished = [false, false, true, true];

// const newtodolist = (todolist, finished) =>{
//     return todolist.filter((x, i)=>{
//         return finished[i];
//     });
// };
// console.log(newtodolist(todolist,finished));

// function numc (){
//     const n = parseInt(prompt('정수 입력'));
//     const k = parseInt(prompt('정수 입력'));

//     const arr = Array(n).fill(0).map((x, i)=>{
//         return i+1;
//     }).filter(x=>{
//         return x % k == 0;
//     });
//     console.log(arr);
// };

// const numc = ()=>{
//     const n = parseInt(prompt('num'));
//     const k = parseInt(prompt('num'));
//     const arr = Array(n).fill(0).map((x, i)=>{
//         return i + 1;
//     }).filter(x=>{
//         return x %k == 0;
//     });
//     console.log(arr);
// }

// const num = [10, 20, 30, 40, 50];
// const arr = ['americano', 'latte', 'vanila', 'mocha', 'tea'];
// // const add_num_mil = x => {
// //     if(x <= 30){
// //         x = x + 100;
// //         return x;
// //     }
// //     else{
// //         x = x + 200;
// //         return x;
// //     }
// // };
// //console.log(num.map(add_num_mil));
// console.log(num.map(x =>{
//     return x <= 30 ? x + 100 : x + 200;
// }));

// const transup_arr = x => {
//     if(x.length <= 5){
//         x.toUpperCase();
//         return x;
//     }
//     else{
//         x.toLowerCase();
//         return '☕';
//     }
// };
// console.log(arr.map(transup_arr));