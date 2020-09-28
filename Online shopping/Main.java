#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fc,f;
  int sa,sd,sc,s;
  int za,zd,zc,z;
  std::cin>>fa>>fd>>fc;
  std::cin>>sa>>sd>>sc;
  std::cin>>za>>zd>>zc;
  f=fa-(fd*fa)/100+fc;
  s=sa-(sd*sa)/100+sc;
  z=za-(zd*za)/100+zc;
  std::cout<<"In Flipkart Rs."<<f<<"\n";
  std::cout<<"In Snapdeal Rs."<<s<<"\n";
  std::cout<<"In Amazon Rs."<<z<<"\n";
  if(f<=s&&f<z)
    std::cout<<"He will prefer Flipkart";
  if(s<f&&s<z)
    std::cout<<"He will prefer Snapdeal";
  if(z<f&&z<s)
    std::cout<<"He will prefer Amazon";
  return(0);
  }