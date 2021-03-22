#include <bits/stdc++.h>
using namespace std;
class Queue
{
private:
    int arr[10000], f, r;
public:
    Queue()
    {
        f=r=0;
    }
    void push(int a)
    {
        arr[f++]=a;
    }
    void pop()
    {
        r++;
    }
    int Size()
    {
        return f-r;
    }
    int Front()
    {
        return arr[r];
    }
};
int v, e, s, d, graph[100000][100000], TTL;

int bfs()
{
    int colour[100000]= {0}, dist[100000]= {0};
    //0:White, 1:Grey, 2:Black
    Queue q, c;
    q.push(s);
    c.push(0);
    colour[s]=1;
    while(q.Size()!=0)
    {
        int u=q.Front(), co=c.Front();
        q.pop();
        c.pop();
        colour[u]=2;
        dist[u]=co;
        for(int i=0; i<=v; i++)
        {
            if(graph[u][i]==1 && colour[i]==0)
            {
                q.push(i);
                c.push(co+1);
                colour[i]=1;
            }
        }

    }
    int Count=0;
    for(int i=0; i<=v; i++)
    {
        if(dist[i]>TTL)
            Count++;
    }
    return Count;
}

int main()
{
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);

    int Case=1;
    while(cin>>e && e!=0)
    {

        int vertex = 0;
        for(int i=0; i<e; i++)
        {
            int u, v;
            cin>>u>>v;
            graph[u][v]=graph[v][u]=1;
            int temp=(u<=v?v:u);
            vertex = vertex<temp?temp:vertex;
        }
        v=vertex;
        while(cin>>s>>TTL && s!=0 && TTL!=0)
        {
            cout<<"Case "<<Case++<<": "<<bfs()<<" nodes not reachable from node "<<s<<" with TTL = "<<TTL<<".\n";
        }
        for(int i=0; i<=vertex; i++)
        {
            for(int j=0; j<=vertex; j++)
            {
                graph[i][j]=0;
            }
        }
    }
    return 0;
}


