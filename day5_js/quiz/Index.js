// const num1 = Number(prompt('first number'));
// const num2 = Number(prompt('second number'));

// console.log(`두 수의 합은 ${num1 + num2}`);

const wth = Number(prompt('정사각형 한변의 길이를 입력하세요'));
const tri = Number(prompt('정삼각형 한변의 길이를 입력하세요'));
const cir = Number(prompt('원의 반지름의 길이를 입력하세요'));
const age = Number(prompt('출생년도를 입력하세요'));
const cash = Number(prompt('엔화로 환전할 원화 금액을 입력하세요'));

tri1 = (tri**2) - ((tri/2)**2)

Math.sqrt(tri1)


console.log(`정사각형의 넓이는 ${wth*2}, 둘레는 ${wth*4} 입니다.`);
console.log(`정삼각형의 넓이는 ${tri * tri1 / 2}, 높이는 ${tri1} 입니다.`);
console.log(`원의 넓이는 ${cir**2 * Math.PIb} 입니다.`);
console.log(`당신의 나이는 만${2024 - age}세 입니다.`);
console.log(`원화 ${cash}원이 ${parseInt(cash / 9.31)}엔 으로 환전되었습니다.`);