const menu = [{
    K_name : "(L) 달달커피",
    E_name : "(L) Mixed coffee",
    exp : "달달한 커피",
    Kcal : 277,
    protein : 2,
    na : 39,
    suger : 20,
    fat : 9,
    caffein : 236,
    allergy : ["우유"]
},{
    K_name : "팥인절미 1인빙수",
    E_name : "Red been injulmi",
    exp : "인절미가 들어간 1인분 빙수",
    Kcal : 569,
    protein : 11,
    na : 218,
    suger : 53,
    fat : 6,
    caffein : 0,
    allergy : ["우유", "대두"]
}
];

// div 태그 제작
const tag = document.createElement('div');

// div 태그에 우측 내용 삽입
tag.innerHTML = `
    <h4>${menu[0].K_name}</h4>
    <p style="color:gray">${menu[0].exp}</p>
    <span>${menu[0].Kcal}Kcal</span>
`;

// body 태그에 div 택 삽입
document.body.appendChild(tag);