// | (union) : or
const b: string | number = "1";

const b1:{name : string, age: string | number}[] =[
    {name : 'stive', age : "25"},
    {name : 'tom', age : 20},
    {name : 'elic', age : "18"}
];

// &(intersection [and])
// const b2: never => never 타입
const b2: {name : string} & {age : number} = {
    age : 21,
    name : "stive"
};

const b3: any = "Hello World!"; // 모든 타입

const b4 : (x:string) => string = (x) => `${x}맛 아이스크림`;

const b5 : (x:number) => number = (x) => x**2;

//typeAlias
type Person = {name : string, age: number, gender: string;};
type College = {id : number, grade : number, major : string};
type CollegeStudent = Person & College;

const c1: Person = {
    name : "stive",
    age : 21,
    gender : "man"
};
const c2 : Person[] = [];

const c3 : CollegeStudent = {
    name : "stive",
    age : 21,
    gender : "man",
    id : 201910055,
    grade : 4,
    major : "컴퓨터공학과"
};

type Product = {name : string, price : number};
type Meal = {
    calories : number,
    category : string
};
type Dessert = {
    calories : number,
    sweetnesslevel : number
};

const saltBread : Product & Meal = {
    name : "saltBread",
    calories : 150,
    category : "빵",
    price : 1500
};

const eggTart : Product & Dessert = {
    name : "eggTart",
    calories : 200,
    price : 2500,
    sweetnesslevel : 3
};

//typeliteral
type Depth = 1 | 2 | 3 | 4 | 5;
const d1 : Depth = 5;

type jobType = "warrior" | "wizard" | "arrow" | "thief";

const d2 : {
    id : string,
    level : number,
    job : jobType
} = {
    id : "ujoe",
    level : 25,
    job : "wizard"
};
type Hamburger = "불고기 버거" | "새우 버거" | "치즈 버거" | "치킨 버거";
type Side = "감자튀김" | "치즈스틱" | "코울슬로" | "해쉬브라운";
type Drinks = "콜라" | "제로콜라" | "환타" | "사이다";

type setMenu = {
    main : Hamburger,
    side : Side,
    drink : Drinks
};
const myBurger : setMenu = {
    main : "치킨 버거",
    side : "해쉬브라운",
    drink : "콜라"
};

//
type Breads = "화이트" | "위트" | "허니오트";
type Main = "소고기" | "돼지고기" | "새우" | "계란";
type Vegetable = ["양파", "양배추", "양상추", "올리브"];
type Cheese = "아메리칸" | "슈레드" | "모짜렐라";
type Sause = "머스타드" | "캐찹" | "칠리" | "후추";
type subway = {
    bread : Breads,
    main : Main,
    vegetable : Vegetable,
    cheese : Cheese,
    sause : Sause
};

const e1 : subway = {
    bread : "허니오트",
    main : "소고기",
    vegetable : ["양파", "양배추", "양상추", "올리브"],
    cheese : "아메리칸",
    sause : "칠리"
};