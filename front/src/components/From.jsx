import React, { useState, Fragment } from 'react'
import { connect } from 'react-redux';


const From = () => {// component stateless
  
  return <div>
    <form className='m-3'>
      <label>EL entero debe tener un valor entre</label>
      <input id="numeroInicial" 
        className='m-3' 
        type="text" 
        size = '8'  />
      <label>y</label>
      <input id="numeroFinal" 
        className='m-3' 
        type="text" 
        size = '8'/>
      <label>(ambos incluye un limite de ±1,000,000,000).</label>
    </form>
  </div>
  
}


export default From;