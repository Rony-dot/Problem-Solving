#include<bits/stdc++.h>
using namespace std;
#define ll long long
int main(void)
{
    int n;
    scanf("%d",&n);
    while(n--){
        int in=0, en=0, dr=0;
        for(int i=0; i<5; i++){
            int r;
            scanf("%d",&r);
            if(r==0){
                dr++;
            }else if(r==1){
                in++;
            }else if(r==2){
                en++;
            }
        }
        if(in>en){
            printf("INDIA\n");
        }else if(en>in){
            printf("ENGLAND\n");
        }else{
            printf("DRAW\n");
        }

    }
    return 0;
}

