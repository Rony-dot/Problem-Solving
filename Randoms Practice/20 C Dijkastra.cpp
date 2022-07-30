#include<bits/stdc++.h>
#define pii pair<int,int>
#define file_read(filename)  freopen("input.txt","r",stdin)
using namespace std;
/**
here we will try to find the minimum path cost;
and keep track of parent of each vertex;
means from which vertex we can reach this one;
so while traversing the nodes if we can reach to the end node then we return true else false;
then we will back traverse from the end to start node by the parent that we stored before;
and lastly print;
Time = O(V*V) ; for each nodes we iterate all the vertex linked to this node so.
**/
const int mx = 1e5+5;
vector < pii > cost[mx];
int vis[mx],par[mx],dist[mx],N,E;
bool dijkstra(int st,int en)
{

    priority_queue< pii,vector<pii>,greater<pii> > pq;
    for(int i=1;i<=N;i++)
        dist[i] = INFINITY;
    pq.push(pii(0,st));
    par[st] = -1;
    dist[st] = 0;
    while(!pq.empty())
    {
        int h = pq.top().second;
        pq.pop();
        if(h==en)
            return true;
        vis[h] = 1;
        for(auto i : cost[h])
        {
            int w = i.second , v = i.first;
            if(!vis[v] && dist[h]+w<dist[v])
            {
                dist[v] = dist[h]+w;
                pq.push(pii(dist[v],v));
                par[v] = h;
            }
        }
    }
    return false;
}
int main()
{
    file_read("");
    int u,v,w;
    cin >> N >> E;
    for(int i=0;i<E;i++)
    {
        cin >> u >> v >> w;
        cost[u].push_back(pii(v,w));
        cost[v].push_back(pii(u,w));
    }
    if(dijkstra(1,N))
    {
        vector < int > path;
        int i = N;
        while(i!=-1)
        {
            path.push_back(i);
            i = par[i];
        }
        for(int i=path.size()-1;i>=0;i--)
            cout << path[i] << " ";
        cout << endl;
    }
    else
        cout << -1 << endl;
}
