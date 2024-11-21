import logo from './logo.svg';
import './App.css';
import Title from './title';
import { useState, useRef, useEffect } from 'react';

function App() {

  const [title, setTitle] = useState('자바');
  const [text, setText] = useState('');
  const [result, setResult] = useState('');
  const [timer, setTimer] = useState(1);
  const inputEl = useRef(null);
  const onSubmitResult = (e) => {
    e.preventDefault();
    if(title[title.length - 1] === text[0]){
      setTitle(prev => prev + text);
      setText('');
      inputEl.current.focus();
    } else{
      setText('');
      setResult('');
    }
  }

  const onChangeValue = (e) => {
    setText( e.target.value );
    setResult( e.target.value );
  }

  const reset = () => {
    setTitle('자바');
  }
  // useEffect(() => {
  //   const interval = setInterval(() => {
  //     setTimer(prevTimer => prevTimer + 1);
  //   }, 1000);

  //   return () => clearInterval(interval);
  // }, [])

  return (
    <div className="wrapper">
      <div>{timer}</div>      
      <Title title={title} text={text}/>

      <form onSubmit={onSubmitResult}>
        <input type="text" ref={inputEl} value={text} onChange={onChangeValue}></input>
        <button>change Title</button>
      </form>
      <button onClick={reset}>초기화</button>

      <div>값: {result}</div>
      
    </div>
  );
}

export default App;
