#include<bits/stdc++.h>
using namespace std;
int main()
{
//    freopen("input.txt","r",stdin);

    long n, k;
    cin>>n>>k;
    long arr[n];
    for(long i = 0; i<n; i++)
    {
        cin>>arr[i];
    }
    sort(arr,arr+n);
    long c =-1;
    if(k==0 && arr[0]>1)
        cout<<"1"<<endl;

    else if(k==0 && arr[0]==1)
        cout<<"-1"<<endl;

    else if(k<=n-1){
        if(arr[k-1]!=arr[k])
            cout<<arr[k-1]<<endl;
        else
            cout<<"-1"<<endl;
    }

    else if(k==n){
        cout<<arr[k-1]<<endl;
    }

    return 0;
}

