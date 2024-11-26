import { useState } from "react"

const MultiInputForm = () => {
    const [formData, setFormData] = useState({
        name: '',
        email: '',
    });
    const {name, email} = formData;
    
    const handleSubmit = (e) => {
        e.preventDefault();
        console.log("submit", name, email);
    }
    const handleChange = (e) => {
        const {name, value} = e.target;
        setFormData({
            ...formData,
            [name]: value,
        })
    }
    return(
        <div>
            <h2>멀티 인풋폼</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <lable>이름
                        <input
                            type="text"
                            name="name"
                            value={formData.name}
                            onChange={handleChange}
                        />
                    </lable>
                </div>
                <div>
                    <lable>email
                        <input
                            type="text"
                            name="email"
                            value={formData.email}
                            onChange={handleChange}
                        />
                    </lable>
                </div>
                <button type="submit">전송</button>
            </form>
            <div>
                <h3>현재 인풋창에 나오는 내용</h3>
                <p>Name: {formData.name}</p>
                <p>Email: {formData.email}</p>
            </div>
        </div>
    )
}

export default MultiInputForm;