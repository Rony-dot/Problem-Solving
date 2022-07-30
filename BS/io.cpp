#include<bits/stdc++.h>
using namespace std;
#define file_read(filename)  freopen("input.txt","r",stdin)
#define ll long long
#define llu unsigned long long
int main()
{
    file_read("");
    int n, a, b;
    string s1, s2;
    cin>>n;
    for(int i=0; i<n; i++){
        cin>>s1>>s2;
        cout<<s1<<" + "<<s2<<" = "<<s1+s2<<endl;
    }
    return 0;
}
