#include <bits/stdc++.h>

#define forn(i, n) for (int i = 0; i < int(n); i++)
#define sz(v) (int)v.size()
#define all(v) v.begin(),v.end()
#define len(s) (int)s.size()

using namespace std;

const int inf = 1e9 + 7;
typedef long long ll;

void solve(){
    string s; 
    cin >> s;
    set<char> v;
    int ans = 0;
    forn(i,sz(s)) {
        v.insert(s[i]);
        if(sz(v) > 3){
            ans++;
            v.clear();
            v.insert(s[i]);
        }
    }
    cout<<ans+1<<endl;

}


int main() {
    // freopen("input.txt","r",stdin);
//    freopen("output.txt","w",stdout);
    int t;
    cin >> t;
    forn(tt, t) {
        solve();
    }
}
