#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[]) {
  float valorq;
  float v[5];
  int i;
  int cont=5;

  for (i = 0; i < cont; i++) {
    printf("Digite um numero: ");
    scanf("%f", &v[i]);
  }
  valorq=v[0];
  for (i = 0; i < cont; i++) {
    if (v[i]>valorq) {
      valorq=v[i];
    }
  }

  printf("O valor encontrado foi %1.f: ",valorq);

  return 0;
}
