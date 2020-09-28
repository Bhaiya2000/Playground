#include<iostream>
using namespace std;
int main()
{
  char a;
  int b,e,f,g,h;
  float c;
  double d;
  std::cin>>a>>b>>c>>d;
  e=sizeof(a);
  f=sizeof(b);
  g=sizeof(c);
  h=sizeof(d);
  std::cout<<e<<"\n"<<f<<"\n"<<g<<"\n"<<h;
  return(0);
}