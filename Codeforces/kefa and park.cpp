#include<bits/stdc++.h>
using namespace std;
int n,m,ans=0;
int cat[100005];
vector<int> V[100005];
void dfs(int id,int prev,int ccc){

  if(ccc>m){
    return;
  }
  bool il=true;
  for(int i=0;i<V[id].size();i++){
      int to=V[id][i];
    if(to==prev) continue;
    il=false;
    if(cat[to]) dfs(to,id,ccc+1);
    else dfs(to,id,0);
  }
  if(il){
  ans++;
}
  return;
}
int main(){
  scanf("%d %d",&n,&m);
  for(int i=1;i<=n;i++) scanf("%d",&cat[i]);
  for(int i=1;i<n;i++){
    int a,b;
    scanf("%d %d",&a,&b);
    V[a].push_back(b);
    V[b].push_back(a);
  }
  dfs(1,0,cat[1]);
  printf("%d\n",ans);
  return 0;
}
