package com.Model;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class FileData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	
	private String fname;
	@Lob
	private byte[] fdata;
	@CreationTimestamp
	private LocalDate fileCreation;
	@UpdateTimestamp
	private LocalDate fileUpdation;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public byte[] getFdata() {
		return fdata;
	}
	public void setFdata(byte[] fdata) {
		this.fdata = fdata;
	}
	public LocalDate getFileCreation() {
		return fileCreation;
	}
	public void setFileCreation(LocalDate fileCreation) {
		this.fileCreation = fileCreation;
	}
	public LocalDate getFileUpdation() {
		return fileUpdation;
	}
	public void setFileUpdation(LocalDate fileUpdation) {
		this.fileUpdation = fileUpdation;
	}
	@Override
	public String toString() {
		return "FileData [fid=" + fid + ", fname=" + fname + ", fdata=" + Arrays.toString(fdata) + ", fileCreation="
				+ fileCreation + ", fileUpdation=" + fileUpdation + "]";
	}
	

}
