import axios from 'axios'; 

export class EmpleadoService{
    baseUrl = "https://localhost:8080/api/v1/";
    getAll(){
        return axios.get(this.baseUrl + "all").then(res => res.data);
    }
    save(empleado) {
        return axios.post(this.baseUrl +"save", empleado).then(res => res.data); 
    }
    delete(id) {
        return axios.get(this.baseUrl + "delete/"+id).then(res => res.data);
    }
}
