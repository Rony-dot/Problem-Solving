#include <bits/stdc++.h>
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

vector <int > graph[1000];
bool bfs(int s, int v)
{
    bool color[210];
    bool taken[210];
    for(int i=0;i<v;i++){
        color[i] = false;
        taken[i]=false;
    }
    Queue q;
    q.push(s);
    while(q.Size()!=0)
    {
       int u = q.Front();
       q.pop();
        for(int i=0;i<graph[u].size();i++)
        {
            int v = graph[u][i];

            if(taken[v]==false){
                color[v]=!color[u];
                taken[v]=true;
                q.push(v);
            }
            else if(color[u]==color[v]){
                return false;
            }
        }
    }
    return true;

}

int main()
{
    int v, e, s;
    while(cin>>v && v!=0){
    for(int i = 0; i < v; i++) graph[i].clear();
    cin>>e;
    for(int i=0;i<e;i++)
    {
        int ux, vy;
        cin>>ux>>vy;
        graph[ux].push_back(vy);
        graph[vy].push_back(ux);
    }

    s=0;
    if(bfs(0, v)){
        cout<<"BICOLORABLE.\n";
    }
    else{
        cout<<"NOT BICOLORABLE.\n";
    }
    }
//    cin>>s>>d;

   // return 0;
}

/*
6 8
1 2
1 6
1 3
2 3
3 5
3 4
5 6
4 5
1 4
*/

