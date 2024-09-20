//조건문

// const num = Number(prompt("숫자 입력"));

// if(num > 0){
//     console.log(`입력한 값은 양수입니다`);
// }
// else if(num < 0){
//     console.log(`입력한 값은 음수입니다`);
// }
// else{
//     console.log(`입력한 값은 0이거나 error입니다`);
// }
// console.log(`프로그램 종료`);

// 수학 시험 점수
// const math = Number(prompt("수학 점수 입력"));
// if(math >= 95){
//     console.log('A+');
// }
// else if(math >= 90){
//     console.log('A');
// }
// else if(math >= 85){
//     console.log('B+');
// }
// else if(math >= 80){
//     console.log('B');
// }
// else if(math >= 75){
//     console.log('C+');
// }
// else if(math >= 70){
//     console.log('C');
// }
// else if(math >= 65){
//     console.log('D+');
// }
// else if(math >= 60){
//     console.log('D');
// }
// else if(60 > math){
//     console.log('낙제');
// }
// else{
//     console.log("시스템 에러");
// }

// 짝수 홀수 음수 양수 구분
const num = Number(prompt("수를 입력하시오"));
var result = "";
if(num < 0){
    result += "음의"
}
else if(num > 0){
    result += "양의"
}
else{
    result = 0;
}

if(num % 2 == 0){
    result += "짝수"
}
else if(num % 2 != 0){
    result += "홀수"
}
console.log(result);