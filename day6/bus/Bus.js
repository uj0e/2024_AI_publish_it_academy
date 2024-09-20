const Bus = {
    type : ['마을 버스 (1번)', '시내 버스 (2번)', '고속 버스 (3번)', '심야 버스 (4번)'],
    price : [1500, 2000, 8000, 10000]
}
const City = {
    type : ['경기권 (1번)', '충청권 (2번)', '강원권 (3번)', '제주권 (4번)'],
    price : [2000, 3000, 3000, 10000]
}
const Seat = {
    type : ['일반석 (1번)', '프리미엄석 (2번)', '넷플릭스석 (3번)'],
    price : [1000, 3000, 4000]
}

const Bus_Choice = Number(prompt(`${Bus.type}중 하나를 고르시오`) -1);
const City_Choice = Number(prompt(`${City.type}중 하나를 고르시오`) -1);
const Seat_Choice = Number(prompt(`${Seat.type}중 하나를 고르시오`) -1);

const age  = Number(prompt('나이를 입력하세요'));

if(0 <= age && age <= 13){
    const pay = (Bus.price[Bus_Choice] + City.price[City_Choice] + Seat.price[Seat_Choice]) * 0.8;
    console.log(`${Bus.type[Bus_Choice]}\n${City.type[City_Choice]}\n${Seat.type[Seat_Choice]}\n 총 : ${pay}원`);
}
else if(65 <= age){
    const pay = (Bus.price[Bus_Choice] + City.price[City_Choice] + Seat.price[Seat_Choice]) * 0.5;
    console.log(`${Bus.type[Bus_Choice]}\n${City.type[City_Choice]}\n${Seat.type[Seat_Choice]}\n 총 : ${pay}원`);
}
else if(13 < age && age < 65){
    const pay = (Bus.price[Bus_Choice] + City.price[City_Choice] + Seat.price[Seat_Choice]);
    console.log(`${Bus.type[Bus_Choice]}\n${City.type[City_Choice]}\n${Seat.type[Seat_Choice]}\n 총 : ${pay}원`);
}
else{
    console.log("탑승 불가");
}