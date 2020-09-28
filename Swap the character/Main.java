#include <iostream>
#include<stdio.h>
#include<stdlib.h>
char check(char c,int n);
using namespace std;
char check(char c,int n)
{
  if((n==1) && (c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ||c=='a' || c=='e' || c=='i' || c=='o' || c=='u'))
  {
    return '$';
  }
  else if((n==2) && (c!='A' && c!='E' && c!='I' && c!='O' && c!='U' && c!='a' && c!='e' && c!='i' && c!='o' && c!='u'))
  {
    return '#';
  }
  else if((n==3) && (c>='a' && c<='z'))
  {
       return (c-32);
  }
  return c;
}
      
int main() 
{
  int i,j;
  char string[3][100];
  for(i=0;i<3;i++)
  {
    scanf("%s",string[i]);
  }
  for(i=0;i<3;i++)
  {
    for(j=0;string[i][j]!='\0';j++)
    {
      cout<<check(string[i][j],i+1);
    }
  }
      return 0;
}