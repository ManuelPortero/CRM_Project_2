import axios from 'axios'; 

export class EmpleadoService{
    baseUrl = "https://localhost:8080/api/v1/";
    getAll(){
        return axios.get(this.baseUrl + "all").then(res => res.data);
    }
    save(empleado) {
        return axios.post(this.baseUrl +"save", empleado).then(res => res.data); 
    }
}
