import { useState } from 'react';
import React from 'react'
import TodoItem from './TodoItem'
import "./List.css"

function List({todos}) {
  const [search, setSearch] = useState("");

  const onChangeSearch = (e) => {
    setSearch(e.target.value);
  }

  const getFilteredData = () => {
    if(search === ""){
      return todos;
      //검색창에 아무것도 입력 안되면 todos 전체를 반환
    }
    return todos.filter(todo => 
      todo.content.toLowerCase().includes(search.toLowerCase())
    );
  }
  
  const filterdTodos = getFilteredData();


  return (
    <div>
      <div className="List">
        <h4>todo List</h4>
        <input type="text" value={search} onChange={onChangeSearch} placeholder='검색어를 입력하세요' />
        <div className="todos_wrapper">
          {filterdTodos.map((todo) => {
            return <TodoItem key={todo.id} {...todo}/>
          })}
 
        </div>
      </div>
    </div>
  )
}

export default List
