package com.lti.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
// compulsory annotation @entity @id



@Entity
@Table(name="STUDENTS")
public class Student {

	
	@Id
	// 20 line use li h so that we get new id automatically without manual
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="stuSeqJpa",sequenceName="stuSeqJpa",allocationSize=1)
	@Column(name="STUID")
	private int stuId;
	
	@Column(name="SNAME",length =10)
	private String stuName;
	
	@Column(name="SCORE")
	private double score;
	public Student(int stuId, String stuName, double score) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.score = score;
	}
	
	
	public Student() {
		super();
	}



	public Student(String stuName, double score) {
		super();
		this.stuName = stuName;
		this.score = score;
	}


	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", score=" + score + "]";
	}
}
