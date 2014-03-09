
import Conta.Conta;

class Programa{
    public static void main(String [] args){
        //CHAMANDO MINHA CLASSE
        Conta minhaConta;
        minhaConta = new Conta();
       
        minhaConta.titular.nome = "Duke";
        
        //CHAMANDO VARIAVEIS DA CLASSE
        minhaConta.saldo = 1000;
        
        //CHAMANDO METODO SACA
        minhaConta.saca(100);
        
        //CHAMANDO METODO DEPOSITA
        minhaConta.deposita(1900);
        
        //METODO TRANSFERE
        //minhaConta.transferePara(minhaConta.saldo, double(1000));
                
        //IMPRIMINDO VALOR DE SALDO
        System.out.println(minhaConta.titular.nome+" SEU SALDO ATUAL É DE: "+minhaConta.saldo);
    }
}