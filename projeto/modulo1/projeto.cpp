/******************************************************

Instituto Federal de São Paulo - Campus Sertãozinho
Disciplina......: M2LPBA
Programação de Computadores e Dispositivos Móveis
Aluno...........: Jose Maria Jairo Chaves

******************************************************/
#include <stdio.h>
#include <stdlib.h>

//OBJETIVO-- Funcao responsavel por avaliar se o resultado da soma e da multiplicacao é posiva ou negativa.
void positivoNegativo(int valor){
  if (valor>0){
    printf("%d, eh positiva\n", valor);
  }else if (valor<0) {
    printf("%d, eh negativa\n", valor);
  }else{
    printf("%d, eh zero\n", valor);
  }

}

int main(int argc, char const *argv[]) {
//OBJETIVO-- Declaracao das variaveis
  int v[5];
  int i;
  int cont=5;
  int soma=0;
  int multp=1;
//OBJETIVO-- Loop ultilizado para fazer a leitura de 5 valores fornecidos pelo usuario
  for (i = 0; i < cont; i++) {
    printf("Digite um numero inteiro: ");
    scanf("%d", &v[i]);
  }
//OBJETIVO-- Loop que realiza a soma dos valores que foram coletados do usuario
  for (i = 0; i < cont; i++) {
    soma=soma+v[i];
  }
//OBJETIVO-- Loop que realiza a multiplicacao dos valores que foram coletados do usuario
  for (i = 0; i < cont; i++) {
    multp=multp*v[i];
  }
//OBJETIVO-- Area de impressao dos resultados
  printf("\nA Soma: ");
  positivoNegativo(soma);
  printf("A Multiplicacao: ");
  positivoNegativo(multp);

  return 0;
}
