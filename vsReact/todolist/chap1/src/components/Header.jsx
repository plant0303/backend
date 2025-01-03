import React from 'react'
import './Header.css'
function Header() {
  return (
    <div className='header'>
      <h3>TODAY</h3>
      <h1>{new Date().toDateString()}</h1>
    </div>
  )
}
export default Header
