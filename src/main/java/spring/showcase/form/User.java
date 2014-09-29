/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.showcase.form;

import java.io.Serializable;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Bartek
 */
public class User implements Serializable {
    @NotEmpty
    @Size(min=10, max=20)
    private String firstname;
    @NotEmpty
    @Size(min=10, max=20)
    private String lastname;
    @NotEmpty
    @Email
    private String email;
 
    public User() {
    }
 
    public User(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
 
    }
 
    public String getEmail(){ return email; }
    public void setEmail(String email){this.email = email ;}
    
    public String getFirstname(){ return firstname; }
    public void setFirstname(String firstname){this.firstname = firstname ;}
    
    public String getLastname(){return lastname;}
    public void setLastname(String lastname){this.lastname = lastname;}
 
}
