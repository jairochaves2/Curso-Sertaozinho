#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[]) {
  int x,n;

  printf("Digite um numero de x: ");
  scanf("%d", &x);
  printf("Digite um numero de n: ");
  scanf("%d", &n);
  if(n==x){
    printf("os numeros sao iguais\n", );
  }
  else if (n>x) {
    printf("%d é maior que %d",n,x);
  }else{
      printf("%d é maior que %d",x,n);
  }
  return 0;
}
