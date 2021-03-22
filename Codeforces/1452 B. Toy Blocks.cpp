#include<bits/stdc++.h>
using namespace std;
int main()
{
//    freopen("input.txt","r",stdin);
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int sum=0;
        int mx = 0;
        for(int i=0; i<n; i++)
        {
            int k;
            cin>>k;
            sum+=k;
            mx = max(mx,k);
        }
        int ans =0;
        if(sum >= (n - 1) * mx)
        {
            ans = sum%(n-1);
        }
        else
        {
            ans = (n - 2) * mx + mx - sum;
        }
        cout<<ans<<endl;
    }
}
