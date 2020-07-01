import React, {Component} from 'react';
import {Menubar} from 'primereact/menubar';
import Empleado from './Empleado';
import Slideshow from './Slideshow';
import slide1 from "../images/slide_2.jpg";
import slide2 from "../images/slide_3.png";
import slide3 from "../images/slide_4.png";
import Carousel from 'react-bootstrap/Carousel';
// import "bootstrap/dist/css/bootstrap.css";
// import "react-bootstrap-carousel/dist/react-bootstrap-carousel.css";

const s = {
   container: "screenW screenH dGray col",
   header: "flex1 fCenter fSize2",
   main: "flex8 white",
   footer: "flex1 fCenter"
};


const slides = [slide1, slide2, slide3];

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
   //  empleados(){
   //     <Empleado/>
   //  }
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
                    <div className={s.container}>               
                <div className={s.main}>
                    <Slideshow slides={slides} />
                </div>                 

                     <Carousel>
                     <Carousel.Item>
                        <img
                           className="d-block w-100"
                           src="holder.js/800x400?text=First slide&bg=373940"
                           alt="First slide"
                        />
                        <Carousel.Caption>
                           <h3>First slide label</h3>
                           <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                        </Carousel.Caption>
                     </Carousel.Item>
                     <Carousel.Item>
                        <img
                           className="d-block w-100"
                           src="holder.js/800x400?text=Second slide&bg=282c34"
                           alt="Third slide"
                        />

                        <Carousel.Caption>
                           <h3>Second slide label</h3>
                           <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        </Carousel.Caption>
                     </Carousel.Item>
                     <Carousel.Item>
                        <img
                           className="d-block w-100"
                           src="holder.js/800x400?text=Third slide&bg=20232a"
                           alt="Third slide"
                        />

                        <Carousel.Caption>
                           <h3>Third slide label</h3>
                           <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
                        </Carousel.Caption>
                     </Carousel.Item>
                     </Carousel>
                
                  </div>
                </div>
            </div>                        
        </div>          
        );
        
    }

}

export default MenuSuperior;