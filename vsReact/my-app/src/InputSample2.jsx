import React, { useState, useRef } from 'react';

function InputSample2() {
  const [inputs, setInputs] = useState({
    id: '',
    nickname: '',
  });
  const idInput = useRef(null);

  const {id, nickname} = inputs;

  const onChange = (e) => {
    const {value, name} = e.target;
    setInputs({
      ...inputs,
      [name] : value
    });
  };

  const onReset = () => {
    setInputs({
      id: '',
      nickname: ''
    });
    idInput.current.focus();
  };


  return (
    <div>
      <input placeholder="이름" onChange={onChange} value={id} name='id' ref={idInput} />
      <input placeholder="닉네임" onChange={onChange} value={nickname} name='nickname' />
      <button onClick={onReset}>초기화</button>
      <div>
        <b>값: </b>
        {id} ({nickname})
      </div>
    </div>
  );
}

export default InputSample2;