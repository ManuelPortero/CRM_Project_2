import React, {Component} from 'react';
import {Menubar} from 'primereact/menubar';
import Empleado from './Empleado';

class MenuSuperior extends Component{

    constructor(){
        super();
    

   this.items=[
        {
           label:'Empleados',
           icon:'pi pi-fw pi-user',
           items:[
              {
                 label:'Nuevo',
                 icon:'pi pi-fw pi-plus',
                 items:[
                    {
                       label:'Empleado',
                       icon:'pi pi-fw pi-bookmark',
                       command: (onClick) => {
                           {this.empleados()}
                        // event.originalEvent: Browser event
                        // event.item: MenuItem instance
                        }
                    }
    
                 ]
              },
              {
                label:'Editar',
                icon:'pi pi-fw pi-pencil'
              },
              {
                 label:'Borrar',
                 icon:'pi pi-fw pi-trash'
              },
              {
                 separator:true
              }              
           ]
        },
        {
           label:'Clientes',
           icon:'pi pi-fw pi-user',
           items:[
              {
                 label:'Nuevo',
                 icon:'pi pi-fw pi-plus',
                 items:[
                    {
                       label:'Cliente',
                       icon:'pi pi-fw pi-bookmark',
                       command: (event) => {
                           console.log(event);
                        // event.originalEvent: Browser event
                        // event.item: MenuItem instance
                        }
                    }
    
                 ]
              },
              {
                label:'Editar',
                icon:'pi pi-fw pi-pencil'
              },
              {
                 label:'Borrar',
                 icon:'pi pi-fw pi-trash'
              },
              {
                 separator:true
              }              
           ]
        },
         {
            label:'Tareas',
            icon:'pi pi-fw pi-file',
            items:[
            {
                label:'Nuevo',
                icon:'pi pi-fw pi-plus',
                command: (event) => {
                  
                // event.originalEvent: Browser event
                // event.item: MenuItem instance
                }    
                
            },
            {
                label:'Editar',
                icon:'pi pi-fw pi-pencil'
            },
            {
                label:'Delete',
                icon:'pi pi-fw pi-trash'
            },
            {
                separator:true
            }              
            ]
        },
        {
           label:'Events',
           icon:'pi pi-fw pi-calendar',
           items:[
              {
                 label:'Edit',
                 icon:'pi pi-fw pi-pencil',
                 items:[
                    {
                       label:'Save',
                       icon:'pi pi-fw pi-calendar-plus'
                    },
                    {
                       label:'Delete',
                       icon:'pi pi-fw pi-calendar-minus'
                    },
    
                 ]
              },
              {
                 label:'Archieve',
                 icon:'pi pi-fw pi-calendar-times',
                 items:[
                    {
                       label:'Remove',
                       icon:'pi pi-fw pi-calendar-minus'
                    }
                 ]
              }
           ]
        },
        {
           label:'Quit',
           icon:'pi pi-fw pi-power-off'
        }
     ];
    }
    empleados(){
       <Empleado/>
    }
    render(){
        return(   
        <div className="navbar navbar-dark bg-dark">   
            <div className="row" style={{border: '1px solid #c8c8c8', backgroundColor: ' #007bff'}}>
                <div className="col-md-2" style={{display:'inline', marginLeft:'10%'}}>
                    <h1 style={{display:'inline'}}>CRM Project</h1>
                    </div>
                    <div   className="col-md-10"style={{float:'right', display:'block',marginRight:'20%'}}>
                    <Menubar model={this.items} style={{border:'none'}}> 
                    </Menubar>
                </div>
            </div>                        
        </div>          
        );
        
    }

}

export default MenuSuperior;