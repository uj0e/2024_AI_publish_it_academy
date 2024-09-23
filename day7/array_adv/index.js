const coffee = [
    {name : 'americano', price : 4500, shots : 2, ingredients : ["water", "beens"]},
    {name : 'latte', price : 6000, shots : 2, ingredients : ["milk", "beens"]},
    {name : 'javachip', price : 6500, shots : 2, ingredients : ["milk", "water", "beens"]},
    {name : 'honny black tea', price : 5700, shots : 1, ingredients : ["grapefruit", "water", "source"]}
];
// 1. 모든 price 10% 인하
// 2. 우유가 없는 ingredients에 우유 추가
// 3. 이름이 americano면 2000원 할인가 적용 / 샷 1 추가
// 4. 모든 price 20% 인상

const discount = coffee.map(x=>{
    x.price = x.price * 0.9;
    return x;
});

console.log(discount);


const add_been = coffee.map(x =>{
    x.ingredients.push('soybeen');
    return x;
});
console.log(add_been);

const dis_americano = coffee.map(x =>{
    if(x.name == 'americano'){
        x.price = x.price * 0.8;
        x.shots += 1;
        return x;
    }
    else{
        return x;
    }
})
console.log(dis_americano);

const inplatuon = coffee.map(x =>{
    x.price = x.price * 1.2;
    return x;
})
console.log(inplatuon);

// // 1. 문자 길이 >= 7 대문자 or 소문자
// // 2. 알파벳 a 들어가면 대문자 or 소문자
// // 3. 알파벳 a 를 '🍒'로 변환

// const fruitArray = ['watermelon', 'cherry', 'banana', 'apple', 'avocado', 'orange'];


// const long = (x) => {
//     if(x.length >= 7){
//         return x.toUpperCase();
//     }
//     else{
//         return x.toLowerCase();
//     }
// };

// const a_find = (x) =>{
//     if(x.indexOf('a') == -1){
//         return x.toLowerCase();
//     }
//     else{
//         return x.toUpperCase();
//     }
// };

// const a_find2 = x =>{
//     return x.replace('a', '🍒');
// };

// console.log(fruitArray.map(long));
// console.log(fruitArray.map(a_find));
// console.log(fruitArray.map(a_find2));


// // 1. [1,2,3,4,5] -> 배열 요소 2배
// // 2. [1,2,3,4,5] -> 홀수 2배 짝수 3배
// // 3. [1,2,3,4,5] -> 3이하 '🍒' 나머지 '🍉'

// const d_num = x => {
//     return x * 2;
// };
// const x_num = x =>{
//     if(x % 2 == 0){
//         return x * 3;
//     }
//     else{
//         return x *2;
//     }
// }
// const y_num = x => {
//     if(x <= 3){
//         return x = '🍒';
//     }
//     else{
//         return x = '🍉';
//     }
// }

// const num_arr = [1,2,3,4,5];

// console.log(num_arr.map(d_num));
// console.log(num_arr.map(x_num));
// console.log(num_arr.map(y_num));


// const addTen = x =>{
//     return x + 10;
// };
// const squ = x => {
//     return x ** 2;
// }

// const num = [1,2,3,4,5].map(addTen);
// const num1 = [1,2,3,4,5].map(squ);
// const num2 = [1,2,3,4,5].map((x)=>{return x + 100;});
// console.log(num);
// console.log(num1);
// console.log(num2);
