#include<stdio.h>
main()
{
   int n,i,fact=1;
  printf("\n enter n= ");
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  printf("\n fact=%d",fact);
}
