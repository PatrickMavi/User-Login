package com.springboot.blog.entity;

import lombok.Data;

import jakarta.persistence.*;
import org.springframework.context.annotation.Role;

import java.util.Set;

@SuppressWarnings("ALL")
@Data
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {"email"})
})

public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String name;
        private String username;
        private String email;
        private String password;

        @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

        @JoinTable(name = "user_roles",
                joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
        private Set<Role> roles;

        public void setRoles(Set<com.springboot.blog.entity.Role> singleton) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setRoles'");
        }
}
