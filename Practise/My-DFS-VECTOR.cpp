#include<bits/stdc++.h>
using namespace std;
vector <int> graph[99999];
bool visited[99999];
void DFS(int n){
    visited[n]=1;
    for(int i=0;i<graph[n].size();i++){
        int v = graph[n][i];
        if(visited[v]==0){
            DFS(v);
        }
    }
}
int main(){
    int node, edge;
    cin>>node>>edge;
    for(int i=0;i<edge;i++){
        int u, v;
        cin>>u>>v;
        graph[u].push_back(v);
        graph[v].push_back(u);
    }
    DFS(0);

    for(int i=0;i<node;i++){
        if(visited[i]==1)
            cout<<"Visited -> "<<i<<"\n";
        else
             cout<<"Not Visited ->"<<i<<"\n";
    }

}
