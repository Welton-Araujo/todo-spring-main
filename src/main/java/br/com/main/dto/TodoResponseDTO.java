package br.com.main.dto;

import java.time.LocalDateTime;

import br.com.main.model.Todo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class TodoResponseDTO {
 
    private Long id;
    private String task;
    private String done;
    private LocalDateTime createdDate;
    
    public static TodoResponseDTO dataTransferObject(Todo todo) {
        return new TodoResponseDTO(
                todo.getId(),
                todo.getTask(),
                todo.getDone(),
                todo.getCreatedDate());
    }
}