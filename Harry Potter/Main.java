#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,n;
  std::cin>>a;
  b=a/10;
  c=a%10;
  d=b/10;
  e=b%10;
  f=d%10;
  g=d/10;
  n=c+g;
  std::cout<<n;
  return(0);
} 