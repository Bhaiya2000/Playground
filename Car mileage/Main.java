#include<iostream>
using namespace std;
int main()
{
  float a,d;
  int b,c;
  std::cin>>a>>b>>c;
  d=(float)a*b;
  if(d>=c)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
  return(0);
}