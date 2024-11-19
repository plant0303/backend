import React from 'react';

const InputSample = () => {
    const [value, setValue] = React.useState('');
    const onChangeValue = (e) => {
        setValue(e.target.value)
    }
    const clear = () => {
        setValue('');
    }
    return(
        <>
            <input value={value} onChange={onChangeValue}/>
            <button onClick={clear}>초기화</button>            
            <div>
                <b>값: {value} </b>
            </div>
        </>
    );
}

export default InputSample;