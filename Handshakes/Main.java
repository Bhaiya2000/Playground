#include<iostream>
using namespace std;
int main()
{
  int a,i=1,c;
  c=a;
  std::cin>>a;
  for(i=1;i<=a/2;i++)
  {
    c=a*i;
  }
  if(a%2==0)
  {
    std::cout<<c-2;
  }
  else
  {
  std::cout<<c;
  }
  return(0);
}
