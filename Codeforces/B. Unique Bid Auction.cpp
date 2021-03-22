#include<bits/stdc++.h>

using namespace  std;

int main()
{
//    freopen("input.txt","r",stdin);
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int arr[n+1];
        vector<int> flag(n+10);
        for(int i=1;i<=n;i++){
            cin>>arr[i];
            flag[arr[i]]++;
        }
        int mx = INT_MAX;
        int ind = -1;
        for(int i=1;i<=n;i++){
                int k = arr[i];
            if(flag[k]==1){
                    if(arr[i]<mx){
                        mx = arr[i];
                        ind = i;
                    }
            }
        }
        cout<<ind<<endl;

    }
        return 0;


}
