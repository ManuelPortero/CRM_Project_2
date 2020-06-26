package com.example.demoproyecto.dao.api;
import org.springframework.data.repository.CrudRepository;
import com.example.demoproyecto.model.Task;


public interface TaskDaoAPI extends CrudRepository <Task, Long> {

}
