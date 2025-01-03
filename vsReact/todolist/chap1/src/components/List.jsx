import React from 'react'
import TodoItem from './TodoItem'
import "./List.css"

function List(props) {
    return (
        <div>
            <div className="List">
                <h4>todo List</h4>
                <input type="text" placeholder='검색어를 입력하세요' />
                <div className="todos_wrapper">
                    <TodoItem />
                    <TodoItem />
                    <TodoItem />


                
                </div>

            </div>
        </div>
    )
}

export default List
