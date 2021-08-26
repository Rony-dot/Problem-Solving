#include<bits/stdc++.h>
using namespace std;
int len;

bool palindrome(char s[100])
{
    int length = strlen(s);
    int lo=0;
//    for(int k=0;k<len+1;k++){
//        cout<<s[k];
//    }
    for(int hi=len;hi>=0;hi--,lo++){
        if(s[hi]!=s[lo]){
//            cout<<" not a palindrome"<<endl;
            return false;
        }
    }
//    cout<<" palindrome"<<endl;
    return true;
}

int main()
{
//    freopen("input.txt","r",stdin);
    int t;
    cin>>t;
while(t--){
  string str; // = "cbabc";
  cin>>str;
  int n;
//  cin>>n;
  len = str.length();
  char neu[len+1] ;

  int flag = 1;
  string res;
  for(int i=0;i<str.length()+1;i++)
  {
      for(int j=0;j<i;j++){
        neu[j] = str[j];
      }
      neu[i] = 'a';
      for(int j=i;j<str.length();j++){
        neu[j+1] = str[j];
      }
      neu[len+1] = '\0';
      if(palindrome(neu)==false){
         flag=0;
         res = neu;
         break;
      }
//      for(int k=0;k<len+1;k++){
//        cout<<neu[k];
//    }
//      cout<<endl;
  }

  if(flag==0){
    cout<<"YES"<<endl;
    cout<<res<<endl;
  }
  else
    cout<<"NO"<<endl;
    }
  return 0;

}

