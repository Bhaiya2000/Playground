#include<iostream>
int main()
{
 long a;
  int b;
  std::cin>>a;
  std::cin>>b;
  if(b<0)
  {
    std::cout<<" ";
  }
  else if(b>0)
  {
    std::cout<<a<<" is eligible for reward.";
  }
  return 0;
}