#include<bits/stdc++.h>
using namespace std;
int sum(const int *begin, const int *end);
int main(){

    int arr[]={12,14,1,15,4};
    int result = sum(arr+2,arr+4);
    cout<<result<<"\n";

    system("pause");
    return 0;
}

int sum(const int *begin, const int *end){
     int sum=0;
     const int *pointer;
     for( pointer=begin; pointer!=end;pointer++){
        sum+=*pointer;
     }
     return sum;
}
