// console.log([10, 20, 30, 40, 50].filter(x=>{
//     return 30 > x;
// }));
// console.log([10, 20, 30, 40, 50].filter(x=>{
//     return x == 20 || x == 40;
// }));

const num = [1,2,3,4,5,6,7,8,9,10];
const arr = [
    'watermelon',
    'cherry',
    'banana',
    'avocado',
    'apple',
    'orange',
    'pineapple',
    'strawberry'
];

console.log(num.filter(x=>{
    return x % 3 == 0;
}));
console.log(num.filter(x => {
    return 4 <= x && x <= 8;
}));
console.log(arr.filter(x => {
    return x.includes('o');
}));
console.log(arr.filter(x => {
    return 6 <= x.length;
}));
console.log(arr.filter(x =>{
    return x.length % 2 == 0;
}));

console.log(num.every(x=>{
    return x > 0;
})); // boolean 형 (모든 요소)
console.log(num.some(x=>{
    return x > 10;
})); // boolean 형 (한개 이상의 요소)

const ary = Array(100).fill(1).map(x=>{
    return x + 1;
});
console.log(ary);

const arry = Array(10).fill(0).map((x, i)=>{
    return i;
})

console.log(arry);