#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[]) {
  float numero,num2,div;

  printf("Digite um numero: ");
  scanf("%f", &numero);
  printf("Digite um numero: ");
  scanf("%f", &num2);
  div=numero/num2;
  printf("seu numero eh: %f\n", div);
  return 0;
}
