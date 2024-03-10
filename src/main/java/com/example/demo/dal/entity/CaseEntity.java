package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Case")
public class CaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "company_address", nullable = false)
    private String companyAddress;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Lob
    @Column(name = "bank_statement", nullable = false)
    private byte[] bankStatement;

    @Column(name = "metadata")
    private String metadata;

    @Column(name = "related_party")
    private String relatedParty;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
}
