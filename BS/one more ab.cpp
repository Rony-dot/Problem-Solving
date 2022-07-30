#include<bits/stdc++.h>
using namespace std;
/**
Next permutation is an in built algorithm that determines the next permutation
lexicographically from the current permutation.
so we just iterate till the kth place and find the permutation of that place and print it;
*/
#define file_read(filename)  freopen("input.txt","r",stdin)
#define ll long long
#define llu unsigned long long
int main()
{
//    file_read("");
    string s;
    int k;
    cin >> s >> k;
    sort(s.begin(),s.end());
    while(k>1){
        next_permutation(s.begin(),s.end());
        k--;
    }
    cout << s <<endl;
    return 0;
}

