import { CSSProperties } from "react";
import Button from "./Button";

type ButtonLayoutProps = {
    columnNumber : number;
};

const ButtonLayout = (props : ButtonLayoutProps) =>{
    const buttonGridLayout : CSSProperties = {
        display : "grid",
        gridTemplateColumns : `repeat(${props.columnNumber}, 1fr)`,
        gap : "30px"
    };
    return(
        <section style = {buttonGridLayout}>
            <Button backgroundcolor = "Primary" borderRadius="Hard"/>
            <Button backgroundcolor = "Hover" borderRadius="Smooth"/>
            <Button backgroundcolor = "Deactive" borderRadius="Circle"/>

            <Button backgroundcolor = "Primary" borderRadius="Hard"/>
            <Button backgroundcolor = "Hover" borderRadius="Smooth"/>
            <Button backgroundcolor = "Deactive" borderRadius="Circle"/>
            
            <Button backgroundcolor = "Primary" borderRadius="Hard"/>
            <Button backgroundcolor = "Hover" borderRadius="Smooth"/>
            <Button backgroundcolor = "Deactive" borderRadius="Circle"/>
        </section>
    )
}

export default ButtonLayout;