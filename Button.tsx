import { CSSProperties } from "react";

type buttonProps = {
    backgroundcolor : "Primary" | "Hover" | "Deactive";
    borderRadius : "Hard" | "Smooth" | "Circle";
  };
  
  const Button = (props : buttonProps)=>{
    const backgroundColorMap = {
        Primary : "red",
        Hover : "green",
        Deactive : "blue"
    };
    const borderRadiusMap = {
      Hard : "0px",
      Smooth : "6px",
      Circle : "25px"
    };
    const buttonStyle : CSSProperties = {
      backgroundColor : backgroundColorMap[props.backgroundcolor],
      borderRadius : borderRadiusMap[props.borderRadius],
      padding : "10px 40px",
      color : "white",
      fontSize : "32px",
      border : "none"
    };
    return <button style={buttonStyle}>Button</button>
  };
  export default Button;