#include<iostream>
using namespace std;
int main()
{
  int mw,wf;
  std::cin>>mw>>wf;
  if(mw>wf)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(wf>mw)
     std::cout<<"Sorry, you can't enter";
   else
         std::cout<<"Yes, you can enter. Kindly use a rope.";
   return(0);
}
    