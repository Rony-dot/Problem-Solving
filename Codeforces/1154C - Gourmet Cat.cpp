#include<bits/stdc++.h>
#include<stdio.h>
using namespace std;
int main(){
    int a, b, c;
    cin>>a>>b>>c;
    int mini = min({a/3,b/2,c/2});
    int total = 7*mini;
    a -= 3*mini;
    b -= 2*mini;
    c -= 2*mini;
    int rem = total - (a+b+c);
    int arr[] = {1,1,2,3,1,3,2};
    int tempa = a, tempb = b, tempc = c, ans=0;
    for(int i=0; i<7; i++){
        int a=tempa, b=tempb, c=tempc, cnt = 0;
        for(int j=i;j<7;j++){
            if(arr[i]==1 && a!=0){
                a -= 1;
                cnt++;
            }else if(arr[i]==2 && b!=0){
                b -= 1;
                cnt++;
            }else if(arr[i]==3 && c!=0){
                c -= 1;
                cnt++;
            }else if(a==0 && b==0 && c==0){
                break;
            }
        }
        ans = max(ans,cnt);
    }
    cout<<ans+total<<endl;
    return 0;
}
