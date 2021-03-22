#include<bits/stdc++.h>
using namespace std;
int parent[99999];
struct edge{
    int u, v, w;
    edge(int _u, int _v, int _w){
        u = _u;
        v = _v;
        w = _w;
    }
};
void init(int n){
    for(int i=0;i<n;i++){
        parent[i]=i;
    }
}
bool comp(edge a, edge b){
    return a.w<b.w;
}
int findRepresent(int a){
    if(parent[a]==a) return a;
    else{
        return findRepresent(parent[a]);
    }
}
int makeUnion(int a, int b){
    int rep_a = findRepresent(a);
    int rep_b = findRepresent(b);
    if(rep_a!=rep_b){
        parent[rep_a]=rep_b;
        return true;
    }
    return false;

}

int main()
{
    int nodes, edges;
    cin>> nodes>>edges;
    init(nodes);
    vector <edge> graph;
    for(int i=0;i<edges;i++){
        int u, v, w;
        cin>>u>>v>>w;
        graph.push_back(edge(u,v,w));
    }
    sort(graph.begin(),graph.end(),comp);

    int sum = 0;
    for(int i=0;i<graph.size();i++){
        edge cur = graph[i];
        int ret = makeUnion(cur.u, cur.v);
        if(ret==true){
            sum = sum+cur.w;
        }
    }
    cout<<sum<<endl;

    return 0;
}
