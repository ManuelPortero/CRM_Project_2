import React, { Component } from 'react';
import './App.css';

import MenuSuperior from './components/MenuSuperior';

import 'primereact/resources/themes/nova-light/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';


class App extends Component{
 render(){
   return(
      <div className="container-fluid" >              
       <MenuSuperior>        
        </MenuSuperior>
      <div className="card-body" style={{backgroundColor:'transparent'}}>

      </div>

      </div>
   );
 
   }
   
}
export default App;

  