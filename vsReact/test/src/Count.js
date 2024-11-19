import React from 'react';

const Counter = () => {
    const [value, setValue] = React.useState(0);
    
    const onIncrease = () => {
        setValue(value + 1);
    }
    const onDecrease = () => {
        setValue(value - 1);
    }
    return(
        <>
            <div><h1>{value}</h1></div>
            <button onClick={onIncrease}>+1</button>
            <button onClick={onDecrease}>-1</button>
        </>
    )
}

export default Counter;