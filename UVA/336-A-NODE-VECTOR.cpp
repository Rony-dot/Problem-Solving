#include<bits/stdc++.h>
using namespace std;

int  e, s, TTL;
vector <int> graph[99999];
map<int,bool> discovered;
class Queue
{
private:
    int arr[99999], f, r;
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

int BFS()
{
    int dist[99999]= {0};
    int color[99999]= {0};
    color[s]=1;
    discovered[s] = true;
    dist[s]=0;
    Queue q;
    q.push(s);
    int Count=0;
   // int reachable=1;
    while(q.Size()!=0)
    {
        int u = q.Front();
        q.pop();
        color[u]=2;
        //cout << "Visited " << u <<" : "<<dist[u]<<" \n";
        int sz = graph[u].size();
        for(int i=0; i<sz; i++)
        {
            int v = graph[u][i];
            if(discovered[v]==false && color[v]==0)
            {
                discovered[v]=true;
                color[v]=1;
                dist[v]=dist[u]+1;
                q.push(v);
               // reachable++;
                if(dist[v]>TTL)
                {
                    Count++;
                }
            }
        }
    }
    //return reachable;
    return Count;
}

int main()
{

    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);

    int Case=1;
    while(cin>>e)
    {
        if(e==0)
            break;
        for(int i=0; i<e; i++)
        {
            int u, v;
            cin>>u>>v;
            graph[u].push_back(v);
            graph[v].push_back(u);
            discovered[u] = false;
            discovered[v] = false;
        }
        while(cin>>s>>TTL)
        {
            if(s==0 && TTL==0)
                break;
            int Count = BFS();
            for(map<int,bool>::iterator it = discovered.begin(); it!= discovered.end(); it++)
            {
                if(it->first == false || it->second==false)
                {
                    Count++;
                }
            }

            cout<<"Case "<<Case++<<": "<<Count<<" nodes not reachable from node "<<s<<" with TTL = "<<TTL<<".\n";
            // Making all false
            for(map<int,bool>::iterator iter = discovered.begin(); iter != discovered.end(); iter++)
            {
                discovered[iter->first] = false;

            }
        }
        // clearing everything
        memset(graph,0,sizeof(graph));
        discovered.clear();
    }

    return 0;
}
