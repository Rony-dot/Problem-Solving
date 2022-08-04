#include<bits/stdc++.h>
using namespace std;
int main(){
//    freopen("input.txt", "r", stdin);
    int t, cs=1;
    scanf("%d",&t);
    while(t--){
        int  p, s=1, c=0;;
        scanf("%d",&p);
        for(int i=0; i<11;i++){
            if(p-s < 0){
                printf("%d\n",c);
                break;
            }
            c = p - s;
            s = s*10;
        }
    }
    return 0;
}

