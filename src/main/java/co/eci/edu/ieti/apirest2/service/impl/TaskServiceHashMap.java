package co.eci.edu.ieti.apirest2.service.impl;

import co.eci.edu.ieti.apirest2.data.Task;
import co.eci.edu.ieti.apirest2.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
public class TaskServiceHashMap implements TaskService {
    private final HashMap<String, Task> hashMap = new HashMap<>();
    private Integer sequence;
    public TaskServiceHashMap() {
        sequence=0;
    }

    @Override
    public Task create(Task task) {
        task.setId("Task_"+sequence);
        hashMap.put(task.getId(),task);
        sequence++;
        return task;
    }

    @Override
    public Task findById(String id) {
        return hashMap.get(id);
    }

    @Override
    public List<Task> all() {
        List<Task> tasks= new ArrayList<>();
        for(String stg: hashMap.keySet()){
            tasks.add(hashMap.get(stg));
        }
        return tasks;
    }

    @Override
    public void deleteById(String id) {
        hashMap.remove(id);
    }

    @Override
    public Task update(Task task, String id) {
        hashMap.put(id,task);
        return task;
    }
}
