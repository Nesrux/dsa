package listas.java.src;

import java.util.Objects;

public class Task {
    private Integer id;
    private String description;
    private String tag;
    private TaskStatus status;

    public Task(Integer id, String description, String tag, TaskStatus status) {
        this.id = id;
        this.description = description;
        this.tag = tag;
        this.status = status;
    }

    public Task(Integer id, String description, String tag) {
        this(id, description, tag, TaskStatus.PENDING);
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return String.format("Task id:  %d, Description: %s, Tag %s, status: %s ", getId(), getDescription(), getTag(),
                getStatus().value);
    }

    public enum TaskStatus {
        PENDING("pending"),
        COMPLETED("completed");

        private final String value;

        private TaskStatus(String status) {
            this.value = status;
        }

        public String getValue() {
            return value;
        }
    }

}
