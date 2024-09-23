// // 1번
// function num(x){
//     return x % 2 == 0 ? "짝수" : "홀수";
// }

// // 2번
// function num5(x){
//     return x % 5 == 0 ? "5의 배수" : "5의 배수 아님";
// }

// // 3번 단일책임 원칙
// function order(x){
//     if(x == 1){
//         return "일반 팝콘";
//     }
//     else if(x == 2){
//         return "캬라멜 팝콘";
//     }
//     else if(x == 3){
//         return "치즈 팝콘";
//     }
//     else{
//         return "메뉴가 없습니다";
//     }
// }

// // 4번
// function arr(x, y, z){
//     return [x, y, z];
// }

// let a = prompt('입력');
// let b = prompt('입력');
// let c = prompt('입력');

// console.log(arr(a,b,c));

// // 5번 좋아하는 음식 입력받은 후 *5 출력
// const food = prompt('음식 입력');

// alert(food.repeat(5));
// // 6번 좋아하는 음식과 반복횟수 입력후 *n 출력
// const foodn = prompt('음식 입력');

// const nums = Number(prompt('숫자 입력'));

// alert(foodn.repeat(nums));

// // 7번 영어 입력받은 후 6글자 미만 소문자화 6글자 이상 대문자화
// const word = prompt('영어 입력');

// const wordn = word.length < 6 ? word.toLowerCase() : word.toUpperCase();

// alert(wordn);

// // 8번 단어 입력 후 소문자 <-> 대문자 치환
// const arr = prompt('enter word!');

// const t_arr = arr == arr.toUpperCase();

// alert(t_arr || t_arr ? arr.toLowerCase() : arr.toUpperCase());


// // 9번 비밀번호 입력 후 조건 1. 길이 8~20 사이 아니면 오류, 2. it, IT로 시작안하면 오류, 3. 특수문자 &#!@ 최소 하나 반드시 포함
// const PassWord = prompt('enter password');

// const len_pw = 8 <= PassWord.length && PassWord.length <= 20;
// const start_pw = PassWord.startsWith('it') || PassWord.startsWith('IT');
// const sp_in_pw = PassWord.includes('&') || PassWord.includes('#') || PassWord.includes('!') || PassWord.includes('@');

// if(!len_pw){
//     alert('비밀번호 길이 오류');
// }
// else if(! start_pw){
//     alert('it IT로 시작해야합니다');
// }
// else if(!sp_in_pw){
//     alert('!@#&중 최소 1개 이상 포함되야 합니다');
// }
// else{
//     alert('설정 완료');
// }

// // 10번
// const news = prompt('뉴스 기사를 입력하세요');
// const find = prompt('스크랩 단어를 입력하세요');

// news.indexOf(find) == true || news.indexOf(find) == false ? alert('단어가 있습니다') : alert('단어가 없습니다');

// // 11번
// const ice = (fruit) => {return `${fruit}맛 아이스크림`;};

// alert(ice(prompt('과일 입력')));

// // 12번
// const arr = (a,b,c) => {return [a,b,c];};

// const a = prompt('문자 입력');
// const b = prompt('문자 입력');
// const c = prompt('문자 입력');
// alert(arr(a,b,c));

// 13번

const coffee = x => {
    console.log('커피 준비');
    x();
    console.log('커피 완료');
}

const americano = () =>{
    console.log('아메리카노');
}

const latte = () =>{
    console.log('라떼');
}

const vanilla = () =>{
    console.log('바닐라');
}
console.log(coffee(americano));
console.log(coffee(latte));
console.log(coffee(vanilla));
console.log(coffee(()=>{
    console.log('a');
    console.log('b');
}));