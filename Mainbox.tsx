import { CSSProperties } from "react"


const Mainbox = () =>{
    const contentsbox : CSSProperties = {
        display : "grid",
        gridTemplateColumns : `repeat(3, 1fr)`,
        gap : "20px",
        backgroundColor : "red",
        width : "100px",
        height : "100px"
    };
    return <div style={contentsbox}></div>

}

export default Mainbox;