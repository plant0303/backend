import './App.css';
import Hello from './Hello';
function App() {
  const name = `"몰라"`;
  const style = {
    backgroundColor : 'black',
    color : 'white',
    fontSize: '50px',
    fontWeight: 'bold'
  }
  return (
    <>
      <Hello/>
      <div style={style}>{name}</div>
      <div className='grayssekkiya'></div>
      {/* 주석임 레알임?*/}
    </>
  );
}

export default App;