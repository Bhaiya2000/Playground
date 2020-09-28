#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f;
  std::cin>>a>>b>>c;
  d=75*b;
  e=30*c;
  f=d+e;
  if(f<=a)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
  return(0);
}