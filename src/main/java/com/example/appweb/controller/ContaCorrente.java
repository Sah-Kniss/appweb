package com.example.appweb.controller;

import com.example.appweb.model.Conta;
import com.example.appweb.model.ContaCorrentePF;

public interface ContaCorrente {

    Double sacar(Double quantidade, Conta conta);

    void depositar(Double quantidade, Conta conta);

    void transferir(Double quantidade, Conta conta);

    Double consultaSaldo(ContaCorrentePF conta);

}