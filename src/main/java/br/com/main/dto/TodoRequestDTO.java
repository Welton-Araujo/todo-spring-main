package br.com.main.dto;

import br.com.main.model.Todo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoRequestDTO {
    
    private String task;
    
    private String done;
    
    public Todo dataTransferObject() {
        return new Todo(task, done);
    }
}