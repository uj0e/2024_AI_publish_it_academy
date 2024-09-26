// // spread 연산자

// // 문자열
// const spreadArray = [..."coffee"];
// // rest
// const fruits = ["apple", "orange", "kiwi", "grape"];
// const [first, second] = fruits; // apple, orange
// const [a, ...b] = fruits; // apple, [orange, kiwi, grape]

// //
// const [ice, coffee] = "ice_coffee".split("_");
// const [i] = [...ice];
// const [c] = [...coffee];

// // 오브젝트
// const person = {name : "stive", age : 28, agency : "판타지오"};
// const { name, ...other } = person; // name : "stive" other : {age : 28, agency : "판타지오"}

// const son = {name : "손흥민", position : "윙"};
// const tottham = {club : "토트넘", number : 7};
// const Korea = {nation : "대한민국", number : 10};
// const a0 = {son, tottham}; // {{name : "손흥민", position : "윙"}, {club : "토트넘", number : 7}}
// const a1 = { ...son, ...tottham}; // {name: '손흥민', position: '윙', club: '토트넘', number: 7}
// const a2 = { ...son, ...Korea}; // {name: '손흥민', position: '윙', nation: '대한민국', number: 10}

// const coffeeName = "아메리카노";
// const coffeeShots = 2;

// // key값 v값이 같으면 생략가능
// const coffee1 = {
//     coffeeName, // coffeeName : coffeeName;
//     coffeeShots // coffeeShots : coffeeShots;
// };