#include<bits/stdc++.h>
using namespace std;
int main(){
    // freopen("input.txt","r",stdin); //home
    // freopen("output.txt","w",stdout);
    int t;
    scanf("%d",&t);
    while(t--){
        int n, flag=1;
        scanf("%d",&n);
        int a[n], b[n];
        for(int i=0; i<n; i++) scanf("%d",&a[i]);
        for(int i=0; i<n; i++) scanf("%d",&b[i]);
        int inf = 1e9 + 7;
        int mini = inf;
        for(int i=0; i<n; i++) {
            if(b[i]!=0 && a[i]-b[i]>=0 ) mini = min(mini, a[i]-b[i]);
            if(a[i]-b[i] < 0 ) flag = 0;
        }
        // if(mini == inf ) flag = 0;

        for(int i=0; i<n; i++) {
            if (a[i]-b[i] > mini){
                flag = 0;
                break;
            }
        }
        cout << (flag==1? "YES" : "NO")<<endl;


    }

    return 0;
}
