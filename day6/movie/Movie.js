//13세 미만 30% 할인, 60세 이상 20% 할인 [영화만]

// const movies = {
//     name : ['베테랑2 (1번) ', '에일리언 (2번) ', '아이언 맨 (3번)'],
//     seat : {
//         name : ['coulpe (1번)', 'premium (2번)', 'standard (3번)', 'economy (4번)'],
//         price : [20000, 15000, 10000, 8000]
//     }
// }
// const shop = {
//     popcorn : [
//         {name : "일반 팝콘 (1번)", price : 6000},
//         {name : "캬라멜 팝콘 (2번)", price : 6500},
//         {name : "치즈 팝콘 (3번)", price : 6500},
//         {name : "믹스 팝콘 (4번)", price : 7000}
//     ],
//     drink : [
//         {name : "탄산 (1번)", price : 2000},
//         {name : "에이드 (2번)", price : 3000},
//         {name : "커피 (3번)", price : 3000}
//     ]
// }

// const Movie_Choice = Number(prompt(`${movies.name}\n중 하나를 고르시오`) -1);
// const Movie_Seat = Number(prompt(`${movies.seat.name[0]}, ${movies.seat.name[1]}, ${movies.seat.name[2]}, ${movies.seat.name[3]}\n중 하나를 고르시오`) -1);
// const shop_Popcorn = Number(prompt(`${shop.popcorn[0].name}, ${shop.popcorn[1].name}, ${shop.popcorn[2].name}, ${shop.popcorn[3].name}\n중 하나를 고르시오`) -1);
// const shop_Drink = Number(prompt(`${shop.drink[0].name}, ${shop.drink[1].name}, ${shop.drink[2].name}\n중 하나를 고르시오`) -1);
// const age = Number(prompt("나이를 입력하세요"));
// if(age <= 13){
//     const price = (movies.seat.price[Movie_Seat] * 0.7) + (shop.popcorn[shop_Popcorn].price) + (shop.drink[shop_Drink].price);
//     console.log(`영화 : ${movies.name[Movie_Choice]} 좌석 : ${movies.seat.name[Movie_Seat]} \n
//         팝콘 / 음료 : ${shop.popcorn[shop_Popcorn].name} / ${shop.drink[shop_Drink].name} \n
//         가격 : ${price}원`);
// }
// else if(60 <= age){
//     const price = (movies.seat.price[Movie_Seat] * 0.8) + (shop.popcorn[shop_Popcorn].price) + (shop.drink[shop_Drink].price);
//     console.log(`영화 : ${movies.name[Movie_Choice]} 좌석 : ${movies.seat.name[Movie_Seat]} \n
//         팝콘 / 음료 : ${shop.popcorn[shop_Popcorn].name} / ${shop.drink[shop_Drink].name} \n
//         가격 : ${price}원`);
// }
// else{
//     const price = (movies.seat.price[Movie_Seat]) + (shop.popcorn[shop_Popcorn].price) + (shop.drink[shop_Drink].price);
//     console.log(`영화 : ${movies.name[Movie_Choice]} 좌석 : ${movies.seat.name[Movie_Seat]} \n
//         팝콘 / 음료 : ${shop.popcorn[shop_Popcorn].name} / ${shop.drink[shop_Drink].name} \n
//         가격 : ${price}원`);
// }