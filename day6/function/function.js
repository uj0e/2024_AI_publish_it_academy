function add (x, y){ //덧셈
    return x + y;
}
function mul (x, y){ //뻴셈
    return x - y;
}
function sub(x, y){ //곱셈
    return x * y;
}
function div(x, y){ //나눗셈
    return x / y;
}
function rem(x, y){ //나머지
    return x % y;
}
function squ(x, y){ //제곱
    return x ** y;
}
//
function h_date(){
    x = Number(prompt("연도를 입력하세요"));
    y = Number(prompt("월을 입력하세요"));
    z = Number(prompt("일을 입력하세요"));

    console.log(`${x}년도 ${y}월 ${z}일`);
}
//
function zodiac(x){
    const sky_day = x % 10;
    const ground_day = x % 12;
    const sd = ['경', '신', '임', '계', '갑', '을', '병', '정', '무', '기'];
    const gd = ['신', '유', '슬', '해', '자', '축', '인', '묘', '진', '사', '오', '미'];
    const answer = [0, 0];
    if(sky_day == 0){
        answer[0] = sd[0];
    }
    else if(sky_day == 1){
        answer[0] = sd[1];
    }
    else if(sky_day == 2){
        answer[0] = sd[2];
    }
    else if(sky_day == 3){
        answer[0] = sd[3];
    }
    else if(sky_day == 4){
        answer[0] = sd[4];
    }
    else if(sky_day == 5){
        answer[0] = sd[5];
    }
    else if(sky_day == 6){
        answer[0] = sd[6];
    }
    else if(sky_day == 7){
        answer[0] = sd[7];
    }
    else if(sky_day == 8){
        answer[0] = sd[8];
    }
    else if(sky_day == 9){
        answer[0] = sd[9];
    }
    //
    if(ground_day == 0){
        answer[1] = gd[0];
    }
    else if(ground_day == 1){
        answer[1] = gd[1];
    }
    else if(ground_day == 2){
        answer[1] = gd[2];
    }
    else if(ground_day == 3){
        answer[1] = gd[3];
    }
    else if(ground_day == 4){
        answer[1] = gd[4];
    }
    else if(ground_day == 5){
        answer[1] = gd[5];
    }
    else if(ground_day == 6){
        answer[1] = gd[6];
    }
    else if(ground_day == 7){
        answer[1] = gd[7];
    }
    else if(ground_day == 8){
        answer[1] = gd[8];
    }
    else if(ground_day == 9){
        answer[1] = gd[9];
    }
    else if(ground_day == 10){
        answer[1] = gd[10];
    }
    else if(ground_day == 11){
        answer[1] = gd[11];
    }
    console.log(`${x}년은 ${answer[0]}${answer[1]}년 입니다.`);
}

h_date();

const a = Number(prompt('년도를 입력하시오'));
zodiac(a);
