package com.taskmanagement.taskapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String date;

	    @Column(name = "`desc`") // Backticks ka use karo
	    private String desc; 

	    private String name;
	    private String status;
	    private String title;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Task(Long id, String date, String desc, String name, String status, String title) {
			super();
			this.id = id;
			this.date = date;
			this.desc = desc;
			this.name = name;
			this.status = status;
			this.title = title;
		}
		public Task() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Task [id=" + id + ", date=" + date + ", desc=" + desc + ", name=" + name + ", status=" + status
					+ ", title=" + title + "]";
		}
	
	    
	    
	    
	    
	    
	    
	
	
}	
	
	
	

