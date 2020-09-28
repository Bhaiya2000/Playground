#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a;
  float b,c;
  std::cin>>a>>b;
  if(a==3)
  {
    c=(float)b*2.0;
  std::cout<<std::fixed<<setprecision(2)<<c;
  }
  else if(a>3)
  {
    std::cout<<"Number of items is more";
  }
  else
  {
    c=(float)(b+(b/2));
    std::cout<<std::fixed<<setprecision(2)<<c;
  }
  return(0);
}