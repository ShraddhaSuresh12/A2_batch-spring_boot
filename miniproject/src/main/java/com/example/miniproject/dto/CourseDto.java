package com.example.miniproject.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="courseDetails")
public class CourseDto {
	
		@Id
		private String cname;
		private int cfees;
		private String duration;
		
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public int getCfees() {
			return cfees;
		}
		public void setCfees(int cfees) {
			this.cfees = cfees;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		@Override
		public String toString() {
			return "CourseDto [cname=" + cname + ", cfees=" + cfees + ", duration=" + duration + "]";
		}
		
}
