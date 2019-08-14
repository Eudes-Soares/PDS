/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu_mesmo;

/**
 *
 * @author 20161064010002
 */
public class Eu_mesmo {

  Boolean ganhar_chocolate_na_pascoa = false;
  
    public static void main(String[] args) {
       
    }
    
    public void ganhar_chocolate(String nome_pessoa){
        
        if(nome_pessoa.equalsIgnoreCase("Shinoda")){
            ganhar_chocolate_na_pascoa = !ganhar_chocolate_na_pascoa;
            System.out.println("Muito obrigado pelo chocolate, principalmente por ter lembrado de mim!");
            //fiz o agradecimento em código JAVA pq vc 1/2 que ama^(-1)... ;)
        }
        
    }
}
