#include<bits/stdc++.h>
using namespace std;
int main(){
    int n, count=0;
    string str, revstr;
    cin>>str;
    revstr = str;
    reverse(revstr.begin(), revstr.end());
    count = 0;
    for(int i=0; i<str.length()/2; i++){
        if(str[i]==revstr[i]){
            continue;
        }else{
            count++;
        }
    }
    if((str.length()%2==0 && count==1) || (str.length()%2==1 && count<=1)){
        printf("YES\n");
        return 0;
    }
    else if(count >1 ){
        printf("NO\n");
        return 0;
    }
    return 0;
}

