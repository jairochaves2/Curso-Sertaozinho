#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[]) {
  int numero,num2,mult;

  printf("Digite um numero: ");
  scanf("%d", &numero);
  printf("Digite um numero: ");
  scanf("%d", &num2);
  mult=numero*num2;
  printf("seu numero eh: %d\n", mult);
  return 0;
}
