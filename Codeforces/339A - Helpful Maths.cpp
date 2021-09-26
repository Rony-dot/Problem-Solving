#include<bits/stdc++.h>
using namespace std;
int main(){
    string str;
    cin>>str;
    string fstr;
    int mas[105];
    int j = 0;
    for(int i=0; i<str.size(); i+=2){
            mas[j] = str[i]-48;
            j++;
    }
    sort(mas,mas+j);
    cout<<mas[0];
    for(int i=1; i<j; i++){
        cout<<"+"<<mas[i];
    }


    return 0;
}
