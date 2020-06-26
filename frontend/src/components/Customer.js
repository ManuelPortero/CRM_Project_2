import React, {Component, createContext} from 'react';

class Customer extends Component{
    constructor(){
        super();
        this.state = {
          visible : false,
          customer: {
            id: null,
            idCustomer: null,           
            name: null,
            surname: null,
            company: null,
            address : null,
            city: null
          },
          selectedCustomer : {
    
          }
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
      }

      save() {
        this.empleadoService.save(this.state.empleado).then(data => {
          this.setState({
            visible : false,
            customer: {
                id: null,
                idCustomer: null,           
                name: null,
                surname: null,
                company: null,
                address : null,
                city: null
              }
          });
          this.growl.show({severity: 'success', summary: 'Atención!', detail: 'Se guardó el registro correctamente.'});
          this.empleadoService.getAll().then(data => this.setState({customer: data}))
        })
      }
    
      delete() {
        if(window.confirm("¿Realmente desea eliminar el registro?")) {
          this.empleadoService.delete(this.state.selectedCustomer.id).then(data => {
            this.growl.show({severity: 'success', summary: 'Atención!', detail: 'Se eliminó el registro correctamente.'});
            this.empleadoService.getAll().then(data => this.setState({empleados: data}));
          });
        }
      }
    render(){
        return <div style={{width:'80%', margin: '0 auto', marginTop: '20px'}}>
        <Menubar model={this.items}/>
        <br/>
        <Panel header="React CRUD App">
            <DataTable value={this.state.empleados} paginator={true} rows={4} selectionMode="single" selection={this.state.selectedEmpleado} onSelectionChange={e => this.setState({selectedEmpleado: e.value})}>
              <Column field="idCustomer" header="ID Customer"></Column>             
              <Column field="name" header="Nombre"></Column>
              <Column field="surname" header="Apellido"></Column>
              <Column field="company" header="Empresa"></Column>
              <Column field="address" header="Dirección"></Column>
              <Column field="city" header="Ciudad"></Column>             
            </DataTable>
        </Panel>
        <Dialog header="Crear cliente" visible={this.state.visible} style={{width: '400px'}} footer={this.footer} modal={true} onHide={() => this.setState({visible: false})}>
            <form id="customer-form">
              <span className="p-float-label">
                <InputText value={this.state.customer.name} style={{width : '100%'}} id="nombreCustomer" onChange={(e) => {
                    let val = e.target.value;
                    this.setState(prevState => {
                        let customer = Object.assign({}, prevState.customer);
                        customer.name = val;

                        return { customer };
                    })}
                  } />
                <label htmlFor="name">Nombre</label>
              </span>
              <br/>
              <span className="p-float-label">
                <InputText value={this.state.customer.surname} style={{width : '100%'}} id="apellido" onChange={(e) => {
                    let val = e.target.value;
                    this.setState(prevState => {
                        let customer = Object.assign({}, prevState.customer);
                        customer.surname = val

                        return { customer };
                    })}
                  } />
                <label htmlFor="apellido">Apellido</label>
              </span>
              <br/>
              <span className="p-float-label">
                <InputText value={this.state.customer.company} style={{width : '100%'}} id="company" onChange={(e) => {
                    let val = e.target.value;
                    this.setState(prevState => {
                        let customer = Object.assign({}, prevState.customer);
                        customer.company = val;

                        return { customer };
                    })}
                  } />
                <label htmlFor="name">Empresa</label>
              </span>
              <br/>
              <span className="p-float-label">
                <InputText value={this.state.customer.address} style={{width : '100%'}} id="direccion" onChange={(e) => {
                    let val = e.target.value;
                    this.setState(prevState => {
                        let customer = Object.assign({}, prevState.customer);
                        customer.address = val

                        return { customer };
                    })}
                  } />
                <label htmlFor="address">Dirección</label>
              </span>
              <br/>
              <span className="p-float-label">
                <InputText value={this.state.customer.city} style={{width : '100%'}} id="city" onChange={(e) => {
                    let val = e.target.value;
                    this.setState(prevState => {
                        let customer = Object.assign({}, prevState.customer);
                        customer.city = val

                        return { empleado };
                    })}
                  } />
                <label htmlFor="city">Ciudad</label>
              </span>
            </form>
        </Dialog>
        <Growl ref={(el) => this.growl = el} />
      </div>
    
    }
}
export default Customer;