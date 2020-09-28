#include <iostream>
#include<string.h>
using namespace std;
int main() 
{
  string a;
  int count=1,len,i;
  cin>>a;
  len=a.length();
  if(len>20)
  {
    cout<<"Invalid Input";
  }
  else
  {
    for(i=1;i<=len;i++)
    {
      if(a[i]==a[i-1])
      {
        count++;
      }
      else
      {
        cout<<a[i-1]<<count;
        count=1;
      }
    }
  }
  return 0;
}