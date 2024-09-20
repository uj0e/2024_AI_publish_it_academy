// operator

// 산술 연산자
const a = 1 + 1; //덧셈 연산자
const a1 = 10 - 1; // 뺄셈 연산자
const a2 = 2 * 2; // 곱셈 연산자
const a3 = 2 ** 3; // 제곱 연산자
const a4 = 6 / 2; // 나눗셈 연산자
const a5 = 8 % 3; // 나머지 연산자

// 단항 산술 연산자
var x = 0;

console.log(++x); // 전위 연산자 x + 1 연산 후 출력
console.log(x++); // 후위 연산자 x 출력 후 x + 1 연산
console.log(+x); // x값 출력
console.log(-x); // x값이 양수면 음수로, 음수면 양수로 전환 후 출력


// 문자열 연결 연산자
const a6 = "Hello " + "World!"; // Hello World! (String)
const a7 = "Hello " + 3; // Hello 3 (String)

//할당 연산자
var x;

x = 10; // 10
x += 10; // x = x + 10 -> 20
x -= 10; // x = x - 10 -> 10
x *= 10; // x = x * 10 -> 100
x /= 10; // x = x / 10 -> 10
x %= 10; // x = x % 10 -> 0

var str = "Hello";
str += " World!"; // str = Hello World!

// 비교 연산자
var x, y;

x = 0;
y = 1;

x == y; // x와 y의 값이 같음 / 결과 : false
x === y; // x와 y의 타입이 같음 / 결과 : true (Number)(int)
x != y; // x와 y의 값이 다름  / 결과 : true
x !== y; // x와 y의 타입이 다름 / 결과 : false

NaN == Nan // NaN은 자신과 일치하지 않는 유일한 값 / 결과 : false
0 == -0 // 사용에 주의 / true

// 대소 관계 비교 연산자

var x, y;

x = 0;
y = 1;

x > y; // x가 y보다 크다 / 결과 : false
x < y; // x가 y보다 작다 / 결과 : true
// =<, => 사용 불가
x >= y; // x가 y보다 크거나 같다 / 결과 : false
x <= y; // x가 y보다 작거나 같다 / 결과 : true

// 삼항 조건 연산자
// 조건식 ? ture일때 반환할 값 : 조건식이 false일때 반환할 값
var x = 2;
var result = x % 2 ? '홀수' : '짝수';

// 논리 연산자
// ||, && 연산자는 일반적으로 Boolean 값을 반환하지만 반드시 Boolean 값을 반환해야 하는 것은 아님

// || 논리합(OR)
true || true; // true
false || true; // true
true || false; // true
false || false; // false

// && 논리곱(AND)
true && true; // true
true && false; // false
false && true; // false
false && false; // false

// 단축평가

"Hello" || "World!" // "World!" || 연산자의 결과를 결정하는 요소가 "World"의 true값임
"World!" || "Hello" // "Hello" || 연산자의 결과를 결정하는 요소가 "Hello"의 true값임
"Hello" && "World!" // "Hello" && 연산자의 결과를 결정하는 요소가 "Hello"의 true값임
"World!" && "Hello" // "World!" && 연산자의 결과를 결정하는 요소가 "World!"의 true값임


// ! 연산자는 반드시 Boolean형으로 반환됨
// 단, 피연산자는 반드시 Boolean 값일 필요는 없음
// ! 논리부정(NOT)
!true; // false
!false; // true

// 암묵적 타입 변환
!0 // true
!1 // false

// 쉼표 연산자
//왼쪽 피연산자부터 차례대로 피연산자를 평가, 마지막 피연산자의 평가후 마지막 피연산자의 평가 결과를 반환
var x, y, z;
x = 1, y = 2, z = 3; // 마지막 값인 z의 3 출력

// 그룹 연산자
10 * 2 + 3 // 23
10 * (2 + 3) // 50

// typeof 연산자
//자신의 뒤에 위치한 피연산자의 데이터 타입을 문자열로 반환
typeof ''              // "string"
typeof 1               // "number"
typeof NaN             // "number"
typeof true            // "boolean"
typeof undefined       // "undefined" //ReferenceError가 발생하지 않고 “undefined”를 반환
typeof Symbol()        // "symbol"
typeof null            // "object" //null 타입을 확인할 때는 typeof 연산자 사용 대신 일치 연산자(===)를 사용
typeof []              // "object"
typeof {}              // "object"
typeof new Date()      // "object"
typeof /test/gi        // "object"
typeof function () {}  // "function"

//배열(Array) / 객체(object)
var x = [1, 2, 3, 4,]; // 배열
var y = {
    num : [1, 2, 3, 4],
    str : ['Hello', 'World','!']
}; // 객체 / num, str은 key값 객체에서는 반드시 key값이 있어야함