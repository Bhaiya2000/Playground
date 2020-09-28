#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  float f,e,g;
  std::cin>>a>>b>>c;
  d=(a*b*c)/100;
  e=(float)a+d;
  f=(float)(d*2)/100;
  g=e-f;
  std::cout<<d<<"\n";
  std::cout<<e<<"\n";
  std::cout<<f<<"\n";
  std::cout<<g;
  return(0);
  
}