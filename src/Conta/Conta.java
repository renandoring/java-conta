/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conta;

/**
 *
 * @author rdoring
 */
public class Conta {
    public int numero;
    public String dono;
    public double saldo;
    //public double limite;
    //public double salario;
    public Cliente titular = new Cliente();
    
    //METODO SACA
    public boolean saca(double quantidade){
        if(this.saldo < quantidade){
            //System.out.println("CAGO");
            return false;
        }else{
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }
    
    //METODO DEPOSITA
    public void deposita(double quantidade){
        this.saldo += quantidade;
    }
    
    //METODO DE TRASNFERENCIA
    public boolean transferePara(Conta destino, double quantidade){
        boolean retirou = this.saca(quantidade);
        if(!retirou){
            System.out.println("SALDO INSUFICIENTE PARA TRANSFERENCIA");
            return false;
        }else{
            destino.deposita(quantidade);
            return true;
        }
    }
}
