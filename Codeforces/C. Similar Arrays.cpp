#include<bits/stdc++.h>
using namespace std;

int main()
{
//    freopen("input.txt","r",stdin);
    long n;
    cin>>n;
    long arr[n];
    long mx = LONG_MIN;
    for(long i=0; i<n; i++)
    {
        cin>>arr[i];
        if(arr[i]>mx)
            mx = arr[i];
    }
    long minn = LONG_MAX;
    for(long i = 1; i<=mx; i++)
    {
        long sum = 0;
        for(long j=0;j<n;j++){
            sum+=abs(i-arr[j]);
        }
        if(sum<minn) minn = sum;
    }
    cout<<minn<<endl;

    return 0;
}
