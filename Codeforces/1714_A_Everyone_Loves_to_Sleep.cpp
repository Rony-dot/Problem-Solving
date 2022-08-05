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

    vector<int> vect;
    int h, m;
    forn(i, n) {
        cin >> h >> m;
        vect.push_back(h*60+m);
    }
    sort(all(vect));
    int finalH=0, finalM=0;
    int sleepTime = H*60 + M;
    int alarmTime = 0, flag=0;
    for(int i=0; i<sz(vect); i++){
        if(vect[i]>=sleepTime){
            alarmTime = vect[i];
            flag = i;
            break;
        }
    }
    alarmTime = vect[flag]; 
    
    int resultTime = 0;
    if(sleepTime < alarmTime){
        resultTime = alarmTime - sleepTime;
        finalH = (int) (resultTime/60);
        finalM = (int) (resultTime%60);
        cout<< finalH <<" " <<finalM<<endl;

    }else if(sleepTime > alarmTime){
        resultTime = (24*60) - sleepTime;
        resultTime += alarmTime;
        finalH = (int) (resultTime/60);
        finalM = (int) (resultTime%60);
        cout<< finalH <<" " <<finalM<<endl;
    }else{
        cout<<"0 0"<<endl;
    }

}
 

int main() {

    // freopen("input.txt","r",stdin);
    // freopen("output.txt","w",stdout);
    int t;
    cin >> t;
    forn(tt, t) {
        solve();
    }
}