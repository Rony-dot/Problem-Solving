#include<bits/stdc++.h>
using namespace std;
#define file_read(filename)  freopen("input.txt","r",stdin)
#define ll long long
#define llu unsigned long long
int main()
{
//    file_read("");
    int n;
    cin>>n;
    vector<string> str(n);
    for(int i=0; i<n; i++){
        cin>>str[i];
    }
    sort(str.begin(), str.end(),
        [&] (const string &str, const string &t) {
		return str.size() < t.size();
	});
	for(int i=0; i<n-1; i++){
        if(str[i+1].find(str[i]) == string::npos){
            cout<<"NO"<<endl;
            return 0;
        }
	}
	cout<<"YES"<<endl;
    for(auto it : str){
        cout<<it<<endl;
    }
    return 0;
}
