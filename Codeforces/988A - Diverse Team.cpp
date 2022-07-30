#include<bits/stdc++.h>
using namespace std;
#define file_read(filename)  freopen("input.txt","r",stdin)
#define ll long long
#define llu unsigned long long
int main()
{
    file_read("");
    int n, k;
    cin>>n>>k;
    int arr[n], brr[105]={0};
    set<int> st;
    vector<int> ans;
    for(int i=0; i<n; i++){
        int val;
        cin>>val;
        if(!st.count(val)){
            st.insert(val);
            ans.push_back(i);
        }
    }
    if(k<=st.size()){
        cout<<"YES"<<endl;
        for(int i=0; i<k; i++){
            cout<<ans[i]+1<<" ";
        }
    }else {
        cout<<"NO"<<endl;
    }

    return 0;
}
