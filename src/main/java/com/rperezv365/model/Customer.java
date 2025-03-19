package com.rperezv365.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Customer
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - pvraul
 * @version 16/03/2025 - 19:10
 * @since 1.17
 */
@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String pwd;

    @Column(name = "role")
    private String role;

}
