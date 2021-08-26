
#include <iostream>
#include <algorithm>
#include<bits/stdc++.h>
using namespace std;
int GCD(long long int a, long long int b)
{
    while( 1 )
    {
        a = a % b;
  if( a == 0 )
   return b;
  b = b % a;

        if( b == 0 )
   return a;
    }
}

int main()
{
//    freopen("input.txt", "r", stdin);

   double t;
    cin>>t;
    for(double cse=1; cse<=t;cse++)
    {
        double c = 0;
       double a, b, m;
        cin>>a>>b>>m;
        for (double i=0;i<=m;i++)
        {
           if(GCD(a+i,b+i)==1)
           {
               c++;
           }
        }
        cout<<"Case "<<cse<<": "<<c<<endl;
    }
//    cout << "gcd(6, 20) = " << __gcd(6, 13) << endl;

}
