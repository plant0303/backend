import React, { useState } from 'react'


function ThirdApp() {
    const [message, setMessage] = useState('기본값');
    const enterEcent = (e) => {
        if(e.key === 'Enter'){
            setMessage('');
            e.target.value = '';
        }
    };
    return (
        <div>
            <h3 className='alert alert-dark'>thirdApp</h3>
            <h3 style={{ color: 'red' }}>{message}</h3>

            <input type="text" className="form-control" style={{width: '300px', fontSize: '2em'}} defaultValue={message}
            onChange={(e) => {
                setMessage(e.target.value);
            }}
            />
        </div>

    )
}

export default ThirdApp
