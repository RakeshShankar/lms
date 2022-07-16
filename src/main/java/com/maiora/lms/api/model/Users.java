
package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

/**
 * Entity implementation class for Entity: Users
 *
 */
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "username"
        }),
        @UniqueConstraint(columnNames = {
            "email"
        })
})
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String name;

    @NotBlank
    @Size(max = 15)
    private String username;

    @NaturalId
    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

    @NotBlank
    @Size(max = 100)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    
	@OneToMany(mappedBy ="users")
	private Set<courses> lm_courses;
	
	@OneToMany(mappedBy ="users")
	private Set<UserCourseandStatus> lm_usercourseandstatus;
	
	@OneToMany(mappedBy ="users")
	private Set<Payment> lm_payment;
	
	@OneToMany(mappedBy ="users")
	private Set<UserTest> lm_usertest;
	
    public Users() {

    }

    public Users(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    
    public Set<courses> getLm_courses() {
		return lm_courses;
	}

	public Set<UserCourseandStatus> getLm_usercourseandstatus() {
		return lm_usercourseandstatus;
	}

	public Set<Payment> getLm_payment() {
		return lm_payment;
	}

	public Set<UserTest> getLm_usertest() {
		return lm_usertest;
	}

	public void setLm_courses(Set<courses> lm_courses) {
		this.lm_courses = lm_courses;
	}

	public void setLm_usercourseandstatus(Set<UserCourseandStatus> lm_usercourseandstatus) {
		this.lm_usercourseandstatus = lm_usercourseandstatus;
	}

	public void setLm_payment(Set<Payment> lm_payment) {
		this.lm_payment = lm_payment;
	}

	public void setLm_usertest(Set<UserTest> lm_usertest) {
		this.lm_usertest = lm_usertest;
	}

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
