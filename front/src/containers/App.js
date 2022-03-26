import React, { Component } from 'react'
import From from '../components/From'
import Result from '../components/Result'

class App extends Component {// component stateful
  render() {
    return (
      <div>
        <h3 className='mt-5'><center>Generador Random de Enteros</center></h3>
        <From/>
        <Result/>
        
       
      </div>
    )
  }
}

export default App