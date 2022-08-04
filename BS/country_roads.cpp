#include<bits/stdc++.h>
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
#define file_read(filename)  freopen("input.txt","r",stdin)
#define ll long long
#define llu unsigned long long
vector<int> adj[1009], cost[1009];
int dis[1009], n;

struct node{
    int u, w;
    node(int a, int b){
        u=a;
        w=b;
    }
    bool operator < (const node & p)const{
        return p.w<w;
    }
};

void traverse(int source)
{
    priority_queue <node> pq;
    for(int i=0; i<n; i++){
         dis[i] = 20001; // INF
    }
    dis[source] = 0;
    pq.push(node(source,0));
    while(!pq.empty())
    {
        node top = pq.top(); // CUR NODE
        pq.pop(); // DELETED
        int u = top.u; // CUR NODE er vertex
        for(int i=0; i<adj[u].size(); i++) // traverse the ADJ VERTICES of CUR VERTEX
        {
            int v = adj[u][i]; // FIRST ADJ VERTEX
//            int temp = dis[u]+cost[u][i]; // total of = cost of source to node u +  cost of next adj vertex
            int temp = max(dis[u], cost[u][i]); // maximum of ( cost of source to node u ,  cost of next adj vertex)
            if(temp < dis[v]) // if it is smaller than the past calculated cost then use it
            {
                dis[v] = temp;
                pq.push(node(v, dis[v]));
            }
        }
    }
}

int main()
{
    file_read("");
    int e,u,v,w,source;
    int t,cas=1;
    cin>>t;
    while(t--)
    {
        scanf("%d%d",&n,&e);
        while(e--)
        {
            scanf("%d%d%d",&u,&v,&w);
            adj[u].push_back(v);
            adj[v].push_back(u);
            cost[u].push_back(w);
            cost[v].push_back(w);
        }
        scanf("%d",&source);
        traverse(source);
        printf("Case %d:\n",cas++);
        for(int i=0; i<n; i++)
        {
            if(dis[i]==20001)
                printf("Impossible\n");
            else
                printf("%d\n",dis[i]);
        }
        for(int i=0; i<n; i++)
        {
            adj[i].clear();
            cost[i].clear();
        }
    }
    return 0;
}
