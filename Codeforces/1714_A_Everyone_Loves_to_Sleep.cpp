#include <bits/stdc++.h>
 
#define forn(i, n) for (int i = 0; i < int(n); i++)
#define sz(v) (int)v.size()
#define all(v) v.begin(),v.end()
#define len(s) (int)s.size()

using namespace std;

const int inf = 1e9 + 7;
typedef long long ll;
 
void solve(){
    int n, H, M;
    cin >> n >> H >> M;

    vector<pair<int,int> > vect;
    int h, m;
    forn(i, n) {
        cin >> h >> m;
        vect.push_back(make_pair(h,m));
    }
    cout<<H<<" = "<<M<<endl;
    sort(all(vect));
    h = vect[0].first;
    m = vect[0].second;
    int finalH=0, finalM=0;
    int sleepTime = H*60 + M;
    int alarmTime = h*60 + m;
    int resultTime = 0;
    if(sleepTime < alarmTime){
        resultTime = alarmTime - sleepTime;
        int tmp = resultTime / 60;
        resultTime -= tmp * 60;
        if (resultTime > 60 ){
            finalH = resultTime / 60;
            finalM = resultTime - (resultTime*finalH);
            cout<<finalH << " : "<<finalM<<endl;
        }else{
            cout<<resultTime<<endl;
        }
    }else if(sleepTime > alarmTime){
        
    }

    // cout<<finalH <<" "  << finalM<<endl;

}
 

int main() {
    // push from stage
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    int t;
    cin >> t;
    forn(tt, t) {
        solve();
    }
}