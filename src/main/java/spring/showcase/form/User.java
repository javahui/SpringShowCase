/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.showcase.form;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Bartek
 */
public class User {
    @NotEmpty
    @Size(min=10, max=20)
    private String firstname;
    @NotEmpty
    @Size(min=10, max=20)
    private String lastname;
 
    public User() {
    }
 
    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
 
    }
 
    public String getFirstname(){ return firstname; }
    public void setFirstname(String firstname){this.firstname = firstname ;}
    
    public String getLastname(){return lastname;}
    public void setLastname(String lastname){this.lastname = lastname;}
 
}
