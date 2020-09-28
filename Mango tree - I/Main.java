#include<iostream>
using namespace std;
int main()
{
  int r,c,tn;
  std::cin>>r>>c>>tn;
  if(r==c)
 {
    if(tn%5==0)
      std::cout<<"Yes";
     else if(tn<=5)
       std::cout<<"Yes";
      else if(tn%5==1)
        std::cout<<"Yes";
    else
      std::cout<<"No";
  }
  else if(r<c)
  {
    if(tn<=6)
      std::cout<<"Yes";
    else if(tn%5==0)
      std::cout<<"Yes";
    else
      std::cout<<"No";
  }
  return(0);
}
    