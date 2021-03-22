#include<bits/stdc++.h>

using namespace  std;

int main()
{
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int arr[n];
        arr[0]=n;
        for(int i=1;i<n;i++){
            arr[i]=i;
        }
        for(int i=0;i<n;i++)
            cout<<arr[i]<<" ";
        cout<<endl;

    }
}
