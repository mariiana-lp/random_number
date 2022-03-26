import React, { useState, Fragment } from 'react'
import { connect } from 'react-redux';
import { fetchRandom } from '../actions';


const From = (props) => {
  const [state, setState] = useState();
  const onSubmit = (e) => {
    e.preventDefault();
    props.dispatch(fetchRandom(state));
  };
  
  return <div>
    <form className='m-3' onSubmit={onSubmit}>
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
      <button className='button btn-primary m-3' 
        type='submit'
        disabled={props.loading}>Obtener Numero</button>
    </form>
  </div>

}

  const stateMapToPros = state => {
    return {
      loading: state.view.loading
    }
  
  }


export default From
//connect(stateMapToPros)(From)