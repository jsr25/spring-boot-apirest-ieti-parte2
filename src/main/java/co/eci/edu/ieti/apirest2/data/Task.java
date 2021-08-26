package co.eci.edu.ieti.apirest2.data;

import co.eci.edu.ieti.apirest2.dto.TaskDto;

import java.util.Date;

public class Task {
    private String id;

    private String name;

    private String description;

    private String status;

    private String assignedTo;

    private Date dueDate;

    private Date created;

    public Task() {
    }

    public Task(TaskDto taskDto){
        this.name=taskDto.getName();
        this.description=taskDto.getDescription();
        this.status=taskDto.getStatus();
        this.assignedTo=taskDto.getAssignedTo();
        this.dueDate=taskDto.getDueDate();
        this.created=taskDto.getCreated();
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
