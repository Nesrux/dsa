package listas.java.src;

import java.util.Objects;

public class Task {
    private int id;
    private String description;
    private String tag;
    private TaskStatus status;

    public Task(
            final int id,
            final String description,
            final String tag) {
        this.id = id;
        this.description = description;
        this.tag = tag;
        this.status = TaskStatus.PENDING;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public String getTag() {
        return tag;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setStatus(final TaskStatus status) {
        this.status = status;
    }

    public void setTag(final String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Task)) {
            return false;
        }
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
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
