import axios from 'axios'; 

export class EmpleadoService{
    baseUrl = "http://localhost:8080/api/v1/";

     
    getAll(){
        try{           

            return axios.get(this.baseUrl + "all").then(res => res.data).catch(error=>{console.log(error)});

        }catch(e){
            console.log(e.response);
        }
        
    }
    save(empleado) {             
         if(empleado.id===null){empleado.id=Math.floor(Math.random()*10000); }        
        return axios.put(this.baseUrl + "save", empleado).then(res => res.data); 
    }
    delete(id) {
        return axios.get(this.baseUrl + "delete/"+id).then(res => res.data);
    }
}
