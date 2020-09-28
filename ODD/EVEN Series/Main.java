#include <iostream>
using namespace std;

int main() 
{
   int a,d,n,term,res;
    cin>> n;
  if(n%2==1)
  {
    a=0;
    d=2;
    term=(n+1)/2;
    res=a+(2,term-1)*d;
    cout<<res;
  }
    else
    {
      a=0;
      d=1;
      term=n/2;
        res=a+(3,term-1)*d;
      cout<<res;
    }
    return 0;
}