package com.example.appweb.model;

//@Entity @Table(name = "conta")
public abstract class Conta {

    private Long numeroConta;

    //private Person pessoa;

    private Double saldo;

    public Long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}