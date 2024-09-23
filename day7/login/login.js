const User_ID = prompt("press your id");
const User_PW = prompt("press your password");

const Access = alert(User_PW.includes("it" || "IT") ? "비밀번호 설정 완료" : "비밀번호 설정 오류");


// const a = false || true;
// const b = undefined || "JavaScript";

// const username = prompt("유저 이름 입력");
// alert(`${username || 'guest'}님 환영합니다`);

// const c = true && "Hello";
// const d = false && "World!";

// console.log(d);

// const isLogin = prompt("press your password") == '1234';
// isLogin && alert(`Hello ${username}`);