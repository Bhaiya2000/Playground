#include <iostream>
using namespace std;
int main() 
{
  int n,i;
  cin>>n;
  if(n>30)
  {
    cout<<"Invalid Input";
  }
  else
  {
    if(n==1||n==2)
    {
      cout<<n;
    }
    else
    {
      int t1=1,t2=2,cur=0;
      for(i=3;i<=n;i++)
      {
        cur=t1+t2;
        t1=t2;
        t2=cur;
      }
      cout<<cur;
    }
  }
    return 0;
}