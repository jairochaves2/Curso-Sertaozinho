#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[]) {
  int numero,num2,sub;

  printf("Digite um numero: ");
  scanf("%d", &numero);
  printf("Digite um numero: ");
  scanf("%d", &num2);
  sub=numero-num2;
  printf("seu numero eh: %d\n", sub);
  return 0;
}
