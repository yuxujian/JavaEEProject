package com.javaEE.manage.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "yuTest")
public class YuTest extends BasePojo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String username;

    private Integer age;

    private String address;
    
    private String phone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "YuTest [id=" + id + ", username=" + username + ", age=" + age + ", address=" + address + ", phone="
				+ phone + "]";
	}
    
    
	
}
