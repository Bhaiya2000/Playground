#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a;
  b=(int)a*.5;
  if(a<=200 )
    std::cout<<"Rs."<<b;
  if(a<=400 && a>200)
    std::cout<<"Rs."<<(a*.65)+100;
  if(a<=600 && a>400)
    std::cout<<"Rs."<<(a*.80)+200;
  if(a>600 )
    std::cout<<"Rs."<<(a*1.25)+425;
  return(0);
  }