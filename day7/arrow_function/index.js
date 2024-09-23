// function add (x, y){ //덧셈
//     return x + y;
// }
// function mul (x, y){ //뻴셈
//     return x - y;
// }
// function sub(x, y){ //곱셈
//     return x * y;
// }
// function div(x, y){ //나눗셈
//     return x / y;
// }
// function rem(x, y){ //나머지
//     return x % y;
// }
// function squ(x, y){ //제곱
//     return x ** y;
// }

// arrow function
// () -> {}
const add = (x, y) => {return x + y;};
const sub = (x,y ) => {return x - y;};
const cook = x => {
    console.log("요리 시작");
    x();
    console.log("요리 끝");
}
const taco = () =>{
    console.log('타코요리 레시피');
}

cook(taco);

