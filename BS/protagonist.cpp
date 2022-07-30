#include<bits/stdc++.h>
using namespace std;
#define file_read(filename)  freopen("input.txt","r",stdin)
#define ll long long
#define llu unsigned long long
/**
we will first solve the elements that are always smallest and then solve the problem
by maximizing the weapons with lees weight, and then compare to find the optimum;
As much as we can take from the war axes, and then compare for the rest swords;
same compare for ware axes and swords for the left amounts;
*/
int t,p,f,cntw,cnts,w,s;
void solve(){
	if(w>s){
		swap(w,s);
		swap(cntw,cnts);
	}
	int ans=0, sum, t, temp1, temp2, cnt1, cnt2;
	for (int i=0;i<=cntw;i++){
		sum=0, temp1=p, temp2=f, cnt1=cntw, cnt2=cnts;
		t=min(i,temp1/w);
		sum += t;
        cnt1 -= t;
		temp1 -= t*w;
        t = min(cnt2,temp1/s);
		sum += t;
        cnt2 -= t;
		t = min(cnt1,temp2/w);
		sum += t;
		temp2 -= t*w;
		t = min(cnt2,temp2/s);
		sum += t;
		ans = max(sum,ans);
	}
	cout<<ans<<endl;
}
int main(){
//    file_read("");
	while(cin>>t){
		while(t--){
			cin>>p>>f;
			cin>>cnts>>cntw>>s>>w;
			solve();
		}
	}
	return 0;
}
