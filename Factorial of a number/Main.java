/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
#include<iostream>
using namespace std;
int main()
{
  int a,i,b=1;
  std::cin>>a;
  for(i=1;i<=a;i++)
  {
    b=b*i;
    
  }
  std::cout<<b;
  return(0);
}
