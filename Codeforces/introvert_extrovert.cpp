#include<bits/stdc++.h>
#include<stdio.h>
using namespace std;

int main()
{
    string str;
    pair <long long, long long> p[200005];
    long long n,i,j,x;
    stack <long long> st;

    long long cnt=0, ans=0;
    scanf("%lld", &n);
    for (i=0; i<n; i++) {
        cin >> x;
        p[i] = make_pair(x, i);
    }
    cin >> str;
    sort(p, p+n);
    j=0;

    for (i=0; i<str.size(); i++) {
        if(str[i] == '0') {
            cout << p[j].second +1 << " ", st.push(p[j].second  ),j++;
        }
        else{
            cout << st.top()+1 << " ", st.pop();
        }
    }
    cout << endl;

    return 0;
}
