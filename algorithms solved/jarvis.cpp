#include<bits/stdc++.h>
using namespace std;
int main()
{
    long long int n;
    cin>>n;
    long long int result;
    result = pow(6,n);
    result = result %10;
    cout<<result;
}
