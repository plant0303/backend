import React, { useState } from 'react'
import Header from './components/Header'
import Editor from './components/Editor'
import List from './components/List'
import "./App.css";
const mockData =[
  {
    id:0,
    isDone:false,
    content:"React 공부하기",
    date:new Date().getTime(),
  },
  {
    id:1,
    isDone:false,
    content:"빨래하기",
    date:new Date().getTime(),
  } ,
  {
    id:2,
    isDone:false,
    content:"노래연습하기",
    date:new Date().getTime(),
  }
];

function App() {
  const [todos, setTodos] = useState(mockData);
  const idRef = useRef(3);

  const onCreate = (content) => {
    const newTodo = {
      id: idRef.current++,
      isDone:false,
      content:content,
      date: new Date().getTime(),
    }
    setTodos([newTodo, ...todos]);
    
  } 

  return (
    <div className='App'>
      <Header/>
      <Editor onCreate={onCreate}/>
      <List id = {todos.id} isDone = {todos.isDone} content = {todos.content} date = {todos.date}/>
    </div>
  )
}

export default App
