#include<bits/stdc++.h>
using namespace std;
#define ll long long
int main(void)
{
    int n;
    scanf("%d",&n);
    while(n--){
        int num1,num2,num3, flag=0;
        char c1, c2, c3;
        cin>>c1>>c2>>c3;
        num1 = c1 - 48;
        num2 = c2 - 48;
        num3 = c3 - 48;
        if(num1==7 || num2==7 || num3==7){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
    }
    return 0;
}
