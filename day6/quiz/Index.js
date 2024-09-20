// 출생년도 입력 후 2005년생 이하일 경우 성인 이하 미성년자 콘솔 출력
// 신장 입력 후 105cm 이하 탑승불가 이하 탑승 가능 콘솔 출력
// 10,000 ~ 99,999 사이의 정수 입력후 자리수 표기 ex) 9만9천9백9십9
// 양의 정수 입력 후 분,초 구분 ex) 61 -> 1분 1초, 125 -> 2분 5초

// //
// const age = Number(prompt("출생년도를 입력하세요"));
// console.log(age <= 2005 ? "성인" : "미성년자");

// //
// const bh = Number(prompt("신장을 입력하세요"));
// console.log(bh <= 150 ? "탑승불가" : "탑승가능");

// //
// const num = Number(prompt("10,000~99,999사이의 정수 입력"));

// var count = 10000 <= num <= 99999 ? num : 0;

// var a = count / 10000;
// var b = (count % 10000) / 1000;
// var c = (count % 10000) %1000 / 100;
// var d = (count % 10000) %100 / 10;
// var e = count % 10;

// console.log(`${parseInt(a)}만${parseInt(b)}천${parseInt(c)}백${parseInt(d)}십${parseInt(e)}`);

// //
// const tm = Number(prompt("양의 정수를 입력"));

// min = tm >= 60 ? (tm / 60) : 0;
// sec = tm % 60;
// console.log(`${parseInt(min)}분 ${sec}초`);

// 서브웨이
// 빵 고르기 [플랫, 화이트, 위트]
// 치즈 고르기 [슈레드, 모짜렐라, 아메리칸치즈]
// 소스 고르기 [머스타드, 핫칠리, 소금, 후추, 스언, 홀레]
// 쿠키 고르기 [화이트, 초콜릿, 아몬드]
// 음료 고르기 [콜라, 제로콜라, 스프라이트, 커피]
// 결과값 : -로 구분한 후 콘솔 출력

// const bread = ['플랫', '화이트', '위트'];
// const cheese = ['슈레드', '모짜렐라', '아메리칸치즈'];
// const sause = ['머스타드', '핫칠리', '소금', '후추', '스언', '홀레'];
// const cookie = ['화이트', '초콜릿', '아몬드'];
// const drink = ['콜라', '제로콜라', '스프라이트', '커피'];

// const choose = [];

// choose[0] = bread[Number(prompt('빵 고르기 [플랫, 화이트, 위트]')) - 1];
// choose[1] = cheese[Number(prompt('치즈 고르기 [슈레드, 모짜렐라, 아메리칸치즈]')) - 1];
// choose[2] = sause[Number(prompt('소스 고르기 [머스타드, 핫칠리, 소금, 후추, 스언, 홀레]')) - 1];
// choose[3] = cookie[Number(prompt('쿠키 고르기 [화이트, 초콜릿, 아몬드]')) - 1];
// choose[4] = drink[Number(prompt('음료 고르기 [콜라, 제로콜라, 스프라이트, 커피]')) - 1];

// console.log(`${choose[0]} - ${choose[1]} - ${choose[2]} - ${choose[3]} - ${choose[4]}`);

// 문제 1 운동 prompt 사용 3회 입력 a-b-c순으로 콘솔에 출력
// 커피 가격과 수량을 각각 prompt로 입력받은 후 총액 계산 후 콘솔에 출력
// 출생년도를 prompt로 입력받은 후 나이를 콘솔에 출력

// // 1번
// const heal1 = prompt("오늘 할 운동 루틴1");
// const heal2 = prompt("오늘 할 운동 루틴2");
// const heal3 = prompt("오늘 할 운동 루틴3");

// console.log(`${heal1} -> ${heal2} -> ${heal3}`);

// // 2번
// const coffee1 = Number(prompt('커피 한잔의 가격을 입력하세요'));
// const coffee2 = Number(prompt('구매할 커피 수량을 입력하세요'));

// console.log(`총 금액은 ${coffee1 * coffee2}원 입니다`);

// // 3번
// const age = Number(prompt('출생년도를 입력하세요!'));

// console.log(`당신은 만${2024 - age}세 입니다`);