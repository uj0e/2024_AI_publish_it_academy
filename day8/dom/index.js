// const div = document.createElement('div');

// div.innerText = 'Hello World!';
// div.style.color = 'red';
// document.body.appendChild(div);


// const button = document.createElement('button');
// button.innerText = 'Hello';
// button.style.backgroundColor = 'skyblue';
// button.style.color = 'white';
// document.body.appendChild(button);

// const Main_name = ['Hello', 'World', '!!!!'];
// const Main_style_bgc = ['yellow', 'pink', 'skyblue'];
// const Main_style_fbgc = ['black', 'white', 'orange'];

// Main_name.map((x, i)=>{
//     const button = document.createElement('button');
//     button.innerText = x;
//     button.style.backgroundColor = Main_style_bgc[i];
//     button.style.color = Main_style_fbgc[i];
//     document.body.appendChild(button);
// });


// const Main_btn = [
//     {naem : 'Hello', bgc : 'yellow', fc : 'black'},
//     {naem : 'World', bgc : 'pink', fc : 'white'},
//     {naem : '!!!!!', bgc : 'skyblue', fc : 'orange'}
// ].forEach(x=>{
//     const button = document.createElement('button');
//     button.innerText = x.naem;
//     button.style.backgroundColor = x.bgc;
//     button.style.color = x.fc;
//     document.body.appendChild(button);
// });

// const rainbowbox = Array(2000).fill().forEach(() =>{
//     const container = document.createElement('div');
//     container.classList.add('container');

//     ['red', 'orange', 'yellow', 'green','blue', '#000080', 'purple'].forEach(x=>{
//         const box = document.createElement('div');
//         box.classList.add('box');
//         box.style.backgroundColor = x;
//         container.appendChild(box);
//     });
//     document.body.appendChild(container);
// });

const title_text = [
    {main_name : '헬스/ 골프', position : '시청 피트니스온', price : '38,000원'},
    {main_name : '헬스', position : '시청 무브짐엔무브맥스PT', price : '37,000원'},
    {main_name : '헬스/ pt', position : '을지로 펄스핏 피트니스', price : '33,000원'}
];

const Main = title_text.forEach((_, ix)=>{
    const img = new Image();
    const container = document.createElement('div');
    container.classList.add('container');

    const box1 = document.createElement('div');
    box1.classList.add('box1');
    box1.style.backgroundImage = 'URL(photo1.png)';
    box1.style.backgroundSize = 'cover';
    box1.style.backgroundPosition = 'center';
    box1.style.marginBottom = '10px';
    container.appendChild(box1);
    
    const box2 = document.createElement('div');
    box2.classList.add('box2');
    
    const title1 = document.createElement('p');
    const title2 = document.createElement('p');
    const title3 = document.createElement('p');
    title1.style.color = 'red';
    title2.style.color = 'green';
    title3.style.color = 'blue';
    title1.innerText = title_text[ix].main_name;
    title2.innerText = title_text[ix].position;
    title3.innerText = title_text[ix].price;

    box2.appendChild(title1);
    box2.appendChild(title2);
    box2.appendChild(title3);

    container.appendChild(box2);

    document.body.appendChild(container);
});
