package com.workOMeter.ReviewMe.DB.Tables;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name="tbl_user_details")
@NamedQueries({
	@NamedQuery(
			name = "getUserDetails",
			query = "from UserDetails a where a.c_user_name = :name"
			)
})
public class UserDetails {

	@Id
//	@GeneratedValue(strategy = GeneratedType.IDENTITY)
	private String name;
	@Column(name="c_email_id") private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
