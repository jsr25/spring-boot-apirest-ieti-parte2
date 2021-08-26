package co.eci.edu.ieti.apirest2.service;

import co.eci.edu.ieti.apirest2.data.Task;

import java.util.List;

public interface TaskService {

    Task create(Task task );

    Task findById( String id );

    List<Task> all();

    void deleteById( String id );

    Task update( Task task, String id );
}
