import './App.css';
import { useRef, useState } from 'react';
import UserList1 from './UserList1';
import CreateUser from './CreateUser';
function App() {
  const [inputs, setInputs] = useState({
    username: '',
    email: '',
  });
  const {username, email} = inputs;

  const users = [
    {
      id: 1,
      username: 'velopert',
      email: 'aaaa@aaa.com'
    },
    {
      id: 2,
      username: 'tester',
      email: 'bbb@bbb.com'
    },
    {
      id: 3,
      username: 'liz',
      email: 'ccc@ccc.com'
    }
  ];
  const nextId = useRef(4);
  
  const onChange = (e) => {
    const { name, value } = e.target;
    setInputs({
      ...inputs,
      [name]: value,
    });
  }

  const onCreate = () => {
    setInputs({
      username: '',
      email: ''
    })
    nextId.current += 1;
  }
  return (
    <>
      <CreateUser 
        username = {username}
        email = {email}
        onChange = {onChange}
        onCreate = {onCreate}
      />
      <UserList1 users={users}/>
    </>
  );
}

export default App;