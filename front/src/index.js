import React from 'react'
import { render } from 'react-dom'
import { createStore, applyMiddleware } from 'redux'
import { Provider } from 'react-redux'
import thunk from 'redux-thunk'
import { createLogger } from 'redux-logger'
import reducer from './reducers'
import { composeWithDevTools } from 'redux-devtools-extension'
import App from './containers/App'


render(
  <React.StrictMode>
    <App/>
  </React.StrictMode>,
  document.getElementById('root')
)
