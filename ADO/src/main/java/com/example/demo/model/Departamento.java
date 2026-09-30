package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
@Entity
public class Departamento {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @NotBlank
 private String nome;
 @Positive
 private Double orcamento;

 public Long getId() {
    return id;
 }
 public void setId(Long id) {
    this.id = id;
 }
 public String getNome() {
    return nome;
 }
 public void setNome(String nome) {
    this.nome = nome;
 }
 public Double getOrcamento() {
    return orcamento;
 }
 public void setOrcamento(Double orcamento) {
    this.orcamento = orcamento;
 }

 
}