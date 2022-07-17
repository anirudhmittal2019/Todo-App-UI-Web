import ReactDOM from 'react-dom';
import React from 'react';
import './index.css';
import App from './App';
function Heading(){
    return(
        <h1>Welcome to React</h1>
    )
}
ReactDOM.render(<Heading />,document.getElementById("root"));