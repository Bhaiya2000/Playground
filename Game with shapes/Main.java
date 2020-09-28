#include<iostream>
using namespace std;
int main()
{
 int a,b,c;
  std::cin>>a>>b;
  c=a*2;
  if(c<=b&&c==b)
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
  return(0);
}