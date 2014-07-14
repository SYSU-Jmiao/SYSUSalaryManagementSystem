package com.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 工人岗位工资表
 */
@Entity
@Table(name = "worPosiSal_table")
public class WorkerPositionSalary {
	private int id;//主键
	private String positon;//岗位
	private Integer level;//级数
	private Integer salaryStandard;//工资标准
	private Integer startPayLevel;//起点薪级
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/*
	 * 岗位,假设岗位汉字长度不超过5,不可为空,可重复
	 */
	@Column(name="position", length = 10, nullable=false,unique=false)
	public String getPositon() {
		return positon;
	}
	public void setPositon(String positon) {
		this.positon = positon;
	}
	
	/*
	 * 级数,假设级数数字长度不超过5,不可为空,不可重复
	 */
	@Column(name="level", length = 5, nullable=false,unique=true)
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	/*
	 * 假设工资数字长度不超过10,不可为空,可重复
	 */
	@Column(name="salaryStandard", length = 10, nullable=false,unique=false)
	public Integer getSalaryStandard() {
		return salaryStandard;
	}
	public void setSalaryStandard(Integer salaryStandard) {
		this.salaryStandard = salaryStandard;
	}
	
	/*
	 * 假设起点薪级数字长度不超过5,不可为空,可重复
	 */
	@Column(name="startPayLevel", length = 5, nullable=false,unique=false)
	public Integer getPaylevel() {
		return startPayLevel;
	}
	public void setPaylevel(Integer startPayLevel) {
		this.startPayLevel = startPayLevel;
	}
}
