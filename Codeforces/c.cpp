#include<bits/stdc++.h>
using namespace std;
struct node{
    int value, cost;
    node(int _v, int _c){
    value = _v;
    cost = _c;
    }

};

class comp{
    public:
     bool operator()(node &a, node &b){
        if(a.cost>b.cost) return true;
        return false;
    }
};
#define MX 105
#define INF 1000000000
#define file_read(filename)  freopen("input.txt","r",stdin);
int visited[MX];
vector<node> graph[MX];
int dist[MX];

void reset(){
    for(int i=0;i<MX;i++){
        visited[i]=0;
        dist[i]=INF;
        graph[i].clear();
    }
}
void dijkastra(int source){
    priority_queue <node, vector<node>, comp> PQ;
    PQ.push({source,0});

    while(!PQ.empty()){
         node current = PQ.top();
         PQ.pop();
         int val = current.value;
         int cost = current.cost;

         if(visited[val]==1) continue;
         visited[val]=1;
         dist[val]=cost;
         for(int i=0;i<graph[val].size();i++){
            int next = graph[val][i].value;
            int nextCost = graph[val][i].cost;
            if(visited[next]==0){
                PQ.push({next,cost+nextCost});
            }
         }

    }
}
int main(){
    file_read("");
    reset();

    int nodes, edges;
    cin>>nodes>>edges;
    for(int i=1;i<=edges;i++){
        int u, v, w;
        cin>>u>>v>>w;
        graph[u].push_back({v,w});
    }
    int source;
    cin>>source;
    dijkastra(source);

    for(int i=1;i<=nodes;i++){
        cout<<"value : "<<i<<" -> Distance : ";
        if(dist[i]==INF) cout<<"INFINITY"<<endl;
            else cout<<dist[i]<<endl;
    }
}
