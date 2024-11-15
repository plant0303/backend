import './App.css';
import UserCard from './UserCard';
import UserList from './UserList';

function App() {
  UserCard.defaultProps = {
    name: "이름 없음",
    age: "나이 정보 없음",
    location: "지역 정보 없음",
    job: "직업 정보 없음",
    isActive: "비활성"
  }
  return (
    <>
      <UserList/>
    </>
  );
}

export default App;