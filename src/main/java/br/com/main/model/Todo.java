package br.com.main.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column 
	private String task;
	
	@Column
	private String done;
	
	@Column
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime createdDate;
	
	@Column
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime doneDate;
	
	@PrePersist
	public void beforeSave() {
		setCreatedDate(LocalDateTime.now());
	}

    public Todo(String task, String done) {
        super();
        this.task = task;
        this.done = done;
    }
	
	
}
