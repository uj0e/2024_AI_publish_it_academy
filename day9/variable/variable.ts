const a = "Hello";
const a1 = "world";

// 타입 어노테이션
const a2:string = "Hello World!";
const a3:boolean = false;
const a4:number[] = [1,2,3,4,5];
const a5: {
    name : string;
    isIce : boolean;
    price : number;
}[] = [
    {name : "AA", isIce : true, price : 10000},
    {name : "HA", isIce : false, price : 5000},
    {name : "HC", isIce : false, price : 11000}
];

const a6: {
    age : number;
    isMan : boolean;
    nation : string;
}[] = [
    {age : 24, isMan : true, nation : "Hello World!"},
    {age : 18, isMan : true, nation : "Hello World!"},
    {age : 31, isMan : false, nation : "Hello World!"}
];