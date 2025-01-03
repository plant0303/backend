import React, {useState} from 'react';

function Counter() {
    const [result, setResult] = useState(0);

    const onIncrese = () => {
        setResult(result + 1);
    }
    const onDecrese = () => {
        setResult(result - 1);
    }
    return (
      <div>
        <h1>{result}</h1>
        <button onClick={onIncrese}>+1</button>
        <button onClick={onDecrese}>-1</button>
      </div>
    );
  }
  
  export default Counter;