package view;
import controller.SomaDigitoController;

public class SomaDigito 
{
 public static void main(String[]args) 
 {
  SomaDigitoController SomaDig = new SomaDigitoController();
  int numero = 88;
  int cta = 0;
  int soma = SomaDig.RecSomaDig(numero, cta);
  System.out.println(soma);

 }

}
