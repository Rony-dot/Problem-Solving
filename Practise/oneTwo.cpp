#include <bits/stdc++.h>
 
#define forn(i, n) for (int i = 0; i < int(n); i++)
#define sz(v) (int)v.size()
#define all(v) v.begin(),v.end()
#define len(s) (int)s.size()

using namespace std;

const int inf = 1e9 + 7;
typedef long long ll;
 
void solve(){
    int n;
    cin >> n;
	int val=1;
	int num=0, rem, digits=0;
    for(;n!=0; n/=10){
		rem = n%10;
		num = num*10 + rem;
		digits++;
	}
	int cache=num%10, cnt=0;
	for(; num!=0; num/=10){
		rem = num%10;
		if(rem==cache) cnt++;
		else{
			cout<<cnt<<cache;
			cache=rem;
			cnt = 1;
		}
	}
	cout<<cnt<<cache;
	cout<<endl;

}
 
 /*
 input:
 3
 1
 11
 1211
 output:
 11
 21
 111221
 */
int main() {
    // freopen("input.txt","r",stdin);
    // freopen("output.txt","w",stdout);
    int t;
    cin >> t;
    forn(tt, t) {
        solve();
    }
}
/*
algorithm:
1. read n; // number of input lines
2. for each input number:
	a. reverse the number
	b. count the repeated value
	c. print the count, print the value
*/