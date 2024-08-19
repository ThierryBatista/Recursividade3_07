package controller;

public class SomaDigitoController 
{
 public SomaDigitoController()
 {
 super();
 }
 
 public int RecSomaDig(int numero, int cta)
 {
//assim que o numero não puder ser mais divido por 10, este irá ser adicionado ao cta e será retornado
//a função vai se dividindo por 10 e somando o resto ao cta 
 if (numero < 10)
  {
   cta = cta + numero;
   return cta;
  }
  else
  {
   return RecSomaDig(numero / 10, cta + (numero % 10));  
  }  
 }
}
