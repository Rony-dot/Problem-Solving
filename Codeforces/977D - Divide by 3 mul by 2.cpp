#include<bits/stdc++.h>
using namespace std;
#define lli long long int
#define file_read(filename)  freopen("input.txt","r",stdin);
int main()
{
//    file_read("");
    lli n;
    cin>>n;
    lli arr[n];
    vector<pair<int, lli>> cnt;
    cnt.resize(n);
    for(int i=0; i<n; i++){
        lli a;
        cin>>a;
        arr[i] = a;
        lli val = 0;
        while(a%3==0){
            val++;
            a/=3;
        }
        cnt[i].second = arr[i];
        cnt[i].first = - val;
    }
    sort(cnt.begin(), cnt.end());
    for(int i=0; i<n; i++){
        cout<<cnt[i].second<<" ";
    }

    return 0;
}
