import { useState } from 'react';
const InputSample = () => {
    const [inputs, setInput] = useState({
        name: '',
        nickname: '',
        email: '',
    });

    const {name, nickname, email} = inputs; //inputs.name, inputs.nickname 을 구조분해할당

    const onChange = (e) => {
        const {value, name} = e.target;
        console.log(e.target.value);
        setInput({
            ...inputs, // 기존 값 유지
            [name]: value // 해당 필드만 업데이트
        });
    }
    
    const onReset = (e) => {
        setInput({
            name: '',
            nickname: '',
            email: '',
        })

    }
    return(
        <div>
            <input name="name" placeholder = "이름" onChange={onChange} value={name}/>
            <input name='nickname' placeholder = "닉네임"  onChange={onChange} value={nickname}/>
            <input name='email' placeholder = "이메일"  onChange={onChange} value={email}/>
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값: </b>
                {name}({nickname}) - {email}
            </div>
        </div>
    );
}

export default InputSample;
