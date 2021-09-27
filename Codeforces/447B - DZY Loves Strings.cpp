#include<bits/stdc++.h>
using namespace std;
int main(){
    long long n,t,b,i,j,k,x,ans,l;
    long long  a[26];
    string s;
    map<int, char>ic;
    map<char, int>ci;
    cin>>s;
    long long sum=0;
    cin>>n;
    for(i=0; i<26; i++) cin>>a[i];
    for(i=0,j='a'; i<26 && j<='z' ; i++,j++)
    {
        ic[a[i]]=j;
        ci[j]=a[i];
    }

    sort(a,a+26,greater<int>());

    for(i=1; i<=s.size(); i++)
    {
        sum+=(i*ci[s[i-1]]);
    }
    l=s.size()+1;
    while(n--)
    {
        sum+=(l*a[0]);
        l++;
    }
    cout<<sum<<endl;


    return 0;
}
