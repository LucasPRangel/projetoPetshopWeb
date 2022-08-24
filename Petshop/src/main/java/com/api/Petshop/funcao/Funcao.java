package com.api.Petshop.funcao;
import com.api.Petshop.funcionario.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class Funcao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	
	@Column(length=50)
	private String descricao;
	
	private float salario;
	
	@OneToMany(mappedBy = "funcao")
	private List<Funcionario> funcionarios;
	
	public Funcao(int codigo, String descricao, float salario, List<Funcionario> funcionarios) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.salario = salario;
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
