import axios from 'axios'; 

export class TaskService{
    baseUrl = "https://localhost:8080/api/v1/";
    getAll(){
        return axios.get(this.baseUrl + "all").then(res => res.data);
    }
    save(task) {
        return axios.post(this.baseUrl +"save", task).then(res => res.data); 
    }
    delete(id) {
        return axios.get(this.baseUrl + "delete/"+id).then(res => res.data);
    }
}
