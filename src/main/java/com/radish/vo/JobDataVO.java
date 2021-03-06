package com.radish.vo;

import java.util.Map;

public class JobDataVO {
	// 任务ID
	private Integer id;
	// 城市
	private String city;
	// 关键词
	private String keyWord;
	// 标题
	private String title;
	// 公司名称
	private String company;
	// 职位名称
	private String job;
	// 薪水字符串
	private String salary;
	// 工作经验
	private String experience;
	// 学历
	private String education;
	// 职位要求
	private String jobRequestMessage;
	// 打开后可以获取招聘要求的url地址
	private String jobRequestUrl;
	// 关键词map
	private Map<String, Integer> keyMap;
	
	// 空构造
	public JobDataVO() {
		super();
	}
	
	public JobDataVO(Integer id, String city, String keyWord, String title, String company, String job, String salary,
			String experience, String education, String jobRequestMessage, Map<String, Integer> keyMap,String jobRequestUrl) {
		this.id = id;
		this.city = city;
		this.keyWord = keyWord;
		this.title = title;
		this.company = company;
		this.job = job;
		this.salary = salary;
		this.experience = experience;
		this.education = education;
		this.jobRequestMessage = jobRequestMessage;
		this.keyMap = keyMap;
		this.jobRequestUrl=jobRequestUrl;
	}

	/*
	 * 以下为get和set
	 */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	public String getJobRequestMessage() {
		return jobRequestMessage;
	}

	public void setJobRequestMessage(String jobRequestMessage) {
		this.jobRequestMessage = jobRequestMessage;
	}

	public String getJobRequestUrl() {
		return jobRequestUrl;
	}

	public void setJobRequestUrl(String jobRequestUrl) {
		this.jobRequestUrl = jobRequestUrl;
	}

	public Map<String, Integer> getKeyMap() {
		return keyMap;
	}
	public void setKeyMap(Map<String, Integer> keyMap) {
		this.keyMap = keyMap;
	}

	@Override
	public String toString() {
		return "JobDataVO [id=" + id + ", city=" + city + ", keyWord=" + keyWord + ", title=" + title + ", company="
				+ company + ", job=" + job + ", salary=" + salary + ", experience=" + experience + ", education="
				+ education + ", jobRequestMessage=" + jobRequestMessage + ", jobRequestUrl=" + jobRequestUrl
				+ ", keyMap=" + keyMap + "]";
	}

	
	
	
}
