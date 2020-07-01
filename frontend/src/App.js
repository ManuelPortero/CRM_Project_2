
import MenuSuperior from './components/MenuSuperior';
//import SlideShow from './components/SlideShow';
import React, { Component } from 'react';
import './App.css';
import { EmpleadoService } from './service/EmpleadoService';
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import {Panel} from 'primereact/panel';
import {Menubar} from 'primereact/menubar';
import {Dialog} from 'primereact/dialog';
import {InputText} from 'primereact/inputtext';
import {Button} from 'primereact/button';
import {Growl} from 'primereact/growl';


import 'primereact/resources/themes/nova-light/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';


// class App extends Component{
//  render(){
//    return(
//       <div className="container-fluid" >              
//        <MenuSuperior>        
//         </MenuSuperior>
//       <div className="card-body" style={{backgroundColor:'transparent'}}>

//       </div>

//       </div>
//    );
 
//    }
   
// }




export default class App extends Component{
  constructor(){
    super();
    this.state = {
      visible : false,
      empleado: {
        id: null,
        dni: null,
        name: null,
        surname: null,
        position: null
        // userlogin : null,
        // pass: null
      },
      task: {
        id: null,
        Name: null,
        Description: null,
      },
      
      customer: {
        id: null,
        IdCustomer: null,
        Name: null,
        Surname: null,
        Company: null,
        Adress: null,
        City: null
      },
      roles: {
        id: null,
        NameRole: null
      },
      
      selectedEmpleado : {

      },
      
    };

    
    this.items = [
      {
        label : 'Nuevo',
        icon  : 'pi pi-fw pi-plus',
        command : () => {this.showSaveDialog()}
      },
      {
        label : 'Editar',
        icon  : 'pi pi-fw pi-pencil',
        command : () => {this.showEditDialog()}
      },
      {
        label : 'Eliminar',
        icon  : 'pi pi-fw pi-trash',
        command : () => {this.delete()}
      }
    ];
    this.empleadoService = new EmpleadoService();
    this.save = this.save.bind(this);
    this.delete = this.delete.bind(this);
    this.footer = (
      <div>
        <Button label="Guardar" icon="pi pi-check" onClick={this.save} />
      </div>
    );
     this.handleChange = this.handleChange.bind(this);
  }

  handleChange(event) {
   this.setState({value: event.target.value});
 }
  componentDidMount(){
    //fetch("http://localhost:3000")
    this.empleadoService.getAll().then(data => this.setState({empleados: data}))
   
  }
  save() {
    this.empleadoService.save(this.state.empleado).then(data => {
      this.setState({
        visible : false,
        empleado: {
          id: 30,
          nombre: null,
          surname: null,
          dni: null,
          position : null
          // userlogin: 'hola',
          // pass: '1234'
        }
      });
      this.growl.show({severity: 'success', summary: 'Atención!', detail: 'Se guardó el registro correctamente.'});
      this.empleadoService.getAll().then(data => this.setState({empleados: data}))
    })
  }

  
  // save() {
  //   this.empleadoService.save(this.state.empleado).then(data => {

  //  //console.log("save");
  //  //console.log(data);
  //     this.setState({
  //       visible : false,
  //       empleado: {
  //         id: null,
  //         dni: null,
  //         name: null,
  //         surname: null,
  //         position: null,
  //         userlogin : null,
  //         pass: null
  //         },task: {
  //           id: null,
  //           Name: null,
  //           Description: null,
  //         },
  //         customer: {
  //           id: null,
  //           IdCustomer: null,
  //           Name: null,
  //           Surname: null,
  //           Company: null,
  //           Adress: null,
  //           City: null
  //         },
  //         roles: {
  //           id: null,
  //           NameRole: null
  //         }          
  //     });
  //     this.growl.show({severity: 'success', summary: 'Atención!', detail: 'Se guardó el registro correctamente.'});
  //     this.empleadoService.getAll().then(data => this.setState({empleados: data}))
  //   })
  // }

  delete() {
    if(window.confirm("¿Realmente desea eliminar el registro?")) {
      this.empleadoService.delete(this.state.selectedEmpleado.id).then(data => {
        this.growl.show({severity: 'success', summary: 'Atención!', detail: 'Se eliminó el registro correctamente.'});
        this.empleadoService.getAll().then(data => this.setState({empleados: data}));
      });
    }
  }

  render(){
    return (
      <div style={{width:'80%', margin: '0 auto', marginTop: '20px'}}>
        <Menubar model={this.items}/>
        <br/>
        
        <Panel header="React CRUD App">
            <DataTable value={this.state.empleados} paginator={true}  selectionMode="single" selection={this.state.selectedEmpleado} onSelectionChange={e => this.setState({selectedEmpleado: e.value})}>
              <Column field="id" header="ID"></Column>
              <Column field="name" header="Nombre"></Column>
              <Column field="surname" header="Apellido"></Column>
              <Column field="dni" header="Dni"></Column>
              <Column field="position" header="Cargo"></Column>
              <Column field="userlogin" header="Usuario"></Column>
              <Column field="pass" header="Contraseña"></Column>
            </DataTable>
        </Panel>
        <Dialog header="Crear empleado" visible={this.state.visible} style={{width: '400px'}} footer={this.footer} modal={true} onHide={() => this.setState({visible: false})}>
            <form id="empleado-form">
            <span className="p-float-label">
                <InputText value={this.state.empleado.id || ''} style={{width : '100%'}} id="id" onChange={(e) => {
                    let val = e.target.value;
                    this.setState(prevState => {
                        let empleado = Object.assign({}, prevState.empleado);
                        empleado.id = val;

                        return { empleado };
                    })}
                  } />
                <label htmlFor="id">Id</label>
              </span>
              <br/>
              <span className="p-float-label">
                <InputText value={this.state.empleado.name || ''} style={{width : '100%'}} id="name" onChange={(e) => {
                    let val = e.target.value;
                    this.setState(prevState => {
                        let empleado = Object.assign({}, prevState.empleado);
                        empleado.name = val;

                        return { empleado };
                    })}
                  } />
                <label htmlFor="name">Nombre</label>
              </span>
              <br/>
              <span className="p-float-label">
                <InputText value={this.state.empleado.surname || ''} style={{width : '100%'}} id="apellido" onChange={(e) => {
                    let val = e.target.value;
                    this.setState(prevState => {
                        let empleado = Object.assign({}, prevState.empleado);
                        empleado.surname = val

                        return { empleado };
                    })}
                  } />
                <label htmlFor="surname">Apellido</label>
              </span>
              <br/>
              <span className="p-float-label">
                <InputText value={this.state.empleado.dni || ''} style={{width : '100%'}} id="Dni" onChange={(e) => {
                    let val = e.target.value;
                    this.setState(prevState => {
                        let empleado = Object.assign({}, prevState.empleado);
                        empleado.dni = val

                        return { empleado };
                    })}
                  } />
                <label htmlFor="dni">Dni</label>
              </span>
              <br/>
              <span className="p-float-label">
                <InputText value={this.state.empleado.position || ''} style={{width : '100%'}} id="cargo" onChange={(e) => {
                    let val = e.target.value;
                    this.setState(prevState => {
                        let empleado = Object.assign({}, prevState.empleado);
                        empleado.position = val

                        return { empleado };
                    })}
                  } />
                <label htmlFor="position">Cargo</label>
              </span>
            </form>
        </Dialog>
        <Growl ref={(el) => this.growl = el} />
      </div>
    );
  }

  showSaveDialog(){
     //alert("showsavedialog");
    this.setState({
      visible : true,
      empleado : {
        id: null,
        dni: null,
        name: null,
        surname: null,
        position: null
        // ,
        // userlogin : null,
        // pass: null
      },
      task: {
        id: null,
        Name: null,
        Description: null,
      },
      customer: {
        id: null,
        IdCustomer: null,
        Name: null,
        Surname: null,
        Company: null,
        Adress: null,
        City: null
      },
      roles: {
        id: null,
        NameRole: null
      }      
    });
    //document.getElementById('empleado-form').reset();
  }

  showEditDialog() {
    this.setState({
      visible : true,
      empleado : {
        id: this.state.selectedEmpleado.id,
        dni: this.state.selectedEmpleado.dni,
        name: this.state.selectedEmpleado.name,
        surname: this.state.selectedEmpleado.surname,
        position : this.state.selectedEmpleado.position
        // userlogin : this.state.selectedEmpleado.userlogin,
        // pass : this.state.selectedEmpleado.pass
      },
      task: {
        id: this.state.selectedEmpleado.id,
        Name: this.state.selectedEmpleado.Name,
        Description: this.state.selectedEmpleado.Description,
      }, 
      customer: {
        id: null,
        IdCustomer: null,
        Name: null,
        Surname: null,
        Company: null,
        Adress: null,
        City: null
      },
      roles: {
        id: null,
        NameRole: null

      }      
    })
  }
}

//export default App;

  