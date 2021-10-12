package com.example.database;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "student")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7850506142772815515L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	@NotBlank
	private String name;

	@Column(name = "jobTitle")
	@NotBlank
	private String jobTitle;

	@Column(name = "teacher_id")
	@JsonIgnore
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Long teacher_id;

	public Long getId() {
		return id;
	}

	public Long getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(Long teacher_id) {
		this.teacher_id = teacher_id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
}