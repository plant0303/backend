import { useRef, useState } from 'react'
import React from 'react'
import './Editor.css';

function Editor({onCreate}) {
  const [content, setContent] = useState("");
  const inputRef = useRef();

  const onChangeContent = (e) => {
    setContent(e.target.value);
  }

  //엔터 쳤을 때
  const onKeyDown = (e) => {
    if(e.keyCode === 13) onsubmit();
  }

  const onsubmit = () => {
    if(content === ""){
      console.log("입력안됐음");
      inputRef.current.focus();
      return;
    } 
    console.log("추가됨" + content);
    onCreate(content);
    setContent("");
  }
  return (
    <div className='Editor'>
      <input
        ref={inputRef}
        value={content}
        onChange={onChangeContent}
        onKeyDown={onKeyDown}
        placeholder='새로운 Todo...'
        />
      <button onClick={onsubmit}>추가</button>
    </div>
  )
}

export default Editor
