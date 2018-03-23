#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[]) {
  float numero,num2,soma;

  printf("Digite um numero: ");
  scanf("%f", &numero);
  printf("Digite um numero: ");
  scanf("%f", &num2);
  soma=numero+num2;
  printf("seu numero eh: %f\n", soma);
  return 0;
}
