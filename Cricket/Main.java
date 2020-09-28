#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g;
  float h,i,j;
  std::cin>>a>>b>>c>>d;
  e=a/6;
  f=d/6;
  g=d%6;
  h=f+g*.1;
  i=c/h;
  j=(float)b/e;
  std::cout<<e<<"\n";
  std::cout<<h<<"\n";
  std::cout<<fixed<<setprecision(1)<<i<<"\n";
  std::cout<<j<<"\n";
  if(j<=i)
    std::cout<<"Eligible to Win";
  else 
    std::cout<<"Not Eligible to Win";
  
  return(0);
  
  
}
