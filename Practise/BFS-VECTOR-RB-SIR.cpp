#include<bits/stdc++.h>
using namespace std;
class Queue{
private:
    int arr[1000], f, r;
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
int v, e, s, d;
vector <int> graph[10000];
int BFS(){
        int dist[v]={0};
        int color[v]={0};
        color[s]=1;
        dist[s]=0;
        Queue q;
        q.push(s);
        while(q.Size()!=0){
        int u = q.Front();
        q.pop();
        color[u]=2;
            cout << "Visited " << u << " \n";
           for(int i=0;i<graph[u].size();i++){
                int v=graph[u][i];
                if(color[v]==0){
                    color[v]=1;
                    dist[v]=dist[u]+1;
                    q.push(v);
                }
            }

        }
        return dist[d];
}
int main(){
   cin>>v>>e;
   for(int i=0;i<e;i++)
   {
       int u, v;
       cin>>u>>v;
       graph[u].push_back(v);
       graph[v].push_back(u);
   }
   cin>>s>>d;
   cout<<BFS()<<endl;
    return 0;
}
