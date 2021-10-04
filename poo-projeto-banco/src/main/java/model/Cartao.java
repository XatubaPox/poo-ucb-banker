package model;

import java.time.LocalDate;
import java.util.Random;

public class Cartao {
    private boolean debito;
    private boolean credito;
    private double limiteTotal;
    private double limiteUsado;
    private StringBuilder numero;
    private String titular;
    private LocalDate validade;
    private int cvc;
    private int senha;
    private boolean situacao;

    public Cartao(boolean credito, double limiteTotal, String titular, double ganhoMensal, int senha) {
        this.debito = true;
        this.credito = credito;
        this.limiteTotal = limiteTotal;
        setNumero();
        this.titular = titular;
        setValidade();
        setCvc();
        this.senha = senha;
        this.situacao = true;
        this.limiteUsado = 0f;
    }

    public double getLimiteUsado() {
        return limiteUsado;
    }

    public void setLimiteUsado(double limiteUsado) {
        this.limiteUsado = limiteUsado;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public boolean isDebito() {
        return debito;
    }

    public void setDebito(boolean debito) {
        this.debito = debito;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public StringBuilder getNumero() {
        return numero;
    }

    public void setNumero() {
        this.numero = gerarNumeroCartao();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade() {
        this.validade = calcularValidade();
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc() {
        this.cvc = gerarCvc();
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean verificarCartao(){
        LocalDate hoje = LocalDate.now();
        if(hoje == this.validade)
            return false;
        return true;
    }

    public boolean utilizarCreditoOuDebito(int op, float valor) {//se for op=1 debito se op=2 credito
        this.situacao = verificarCartao();
        if(this.situacao == true){
            switch (op) {
                case 1:
                    return true; //valor sera cobrado e checado na conta
                case 2:
                    if (valor + this.limiteUsado <= this.limiteTotal) {
                        this.limiteUsado += valor;
                        return true;
                    }
                    System.out.println("\t\nLimite esgotado !!!\n");
                    return false;
            }
        }
        return false;
    }

    public void renovarCartao() {
        this.situacao = verificarCartao();
        if(this.situacao == false)
            calcularValidade();
    }

    private LocalDate calcularValidade(){
        LocalDate hoje = LocalDate.now();
        return hoje.plusYears(4);
    }

    private StringBuilder gerarNumeroCartao(){
        Integer digito;
        StringBuilder numero = new StringBuilder();
        Random random = new Random();
        for(int i=0;i>= 16; i++){
            digito = random.nextInt(9);
            numero.append(Integer.toString(digito));
            if(i==4 || i==8 || i==12)
                numero.append('.');
        }
        return  numero;
    }

    private int gerarCvc(){
        int cvc;
        Random random = new Random();
        cvc = random.nextInt(999);
        return cvc;
    }

    @Override
    public String toString() {
        return    "\t\nTipo: " + '\n'
                + "\tLimite Total: " + this.limiteTotal + '\n'
                + "\tLimite Usado: " + this.limiteUsado + '\n'
                + "\tNúmero: " + this.numero + '\n'
                + "\tTitular: " + this.titular + '\n'
                + "\tData de Validade: " + this.validade + '\n'
                + "\tNúmero de Segurança: " + this.cvc + '\n';
    }
}
