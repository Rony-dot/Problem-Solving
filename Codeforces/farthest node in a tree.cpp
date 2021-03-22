#include<bits/stdc++.h>

using namespace std;

bool visited[99999] = {false};
int dist[99999]= {0};

void DFS(vector<pair<int, int> > edge[], int n, int source)
{
    visited[source] = true;
//    cout<< source<< " is visited, Cost is ->"<<dist[source]<<endl;
    for(int i=0; i<edge[source].size(); i++)
    {
        int next = edge[source][i].first;
        if(visited[next]==false)
        {
            dist[next]=dist[source]+edge[source][i].second;
            DFS(edge, n, next);
        }
    }
}

int main()
{
    //freopen("input.txt", "r", stdin);
//    freopen("output.txt", "w", stdout);
    int t;
    cin>>t;
    int cases = 1;
    while(t--)
    {
        int n;
        cin>>n;
        vector<pair<int, int> > edge[n];
        for(int i=0; i<n-1; i++)
        {
            int u, v, w;
            cin>>u>>v>>w;
            edge[u].push_back({v, w});
            edge[v].push_back({u, w});
        }

        DFS(edge, n, 0);
        int maxim = -100;
        int maxin = -100;
        for(int i=0; i<99999; i++)
        {
            if(visited[i]==true  && dist[i]>maxim)
            {
                maxim = dist[i];
                maxin = i;
            }
        }
//        cout<<"maxim is ->"<<maxim<<" maxin is ->"<<maxin<<endl;
        for(int i=0; i<99999; i++)
        {
            visited[i]=false;
            dist[i]=0;
        }
        DFS(edge, n, maxin);
         maxim = -100;
         maxin = -100;
        for(int i=0; i<99999; i++)
        {
            if(visited[i]==true  && dist[i]>maxim)
            {
                maxim = dist[i];
                maxin = i;
            }
        }
//        cout<<"maxim is ->"<<maxim<<" maxin is ->"<<maxin<<endl;
        for(int i=0; i<99999; i++)
        {
            visited[i]=false;
            dist[i]=0;
        }
        cout<<"Case "<<cases++<<": "<<maxim<<endl;
    }

}
