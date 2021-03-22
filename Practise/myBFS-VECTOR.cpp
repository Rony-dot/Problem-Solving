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

class Graph{
public:
    int vertices_count;
    char *color;
    int *prev;
    int *d;
    vector <int > *graph;

    Graph(int vertices){
        vertices_count = vertices;
        color = new char[vertices_count];
        prev = new int[vertices_count];
        d = new int[vertices_count];
       graph = new vector <int> [vertices_count];
    }

    void addEdge(int source, int dest){
        graph[source].push_back(dest);
        graph[dest].push_back(source);
    }

    void BFS(int startVertex){
        for(int i=0;i<vertices_count;i++){
            color[i]='W';
            prev[i]=-1;
            d[i]=-1;
        }
        color[startVertex]='G';
        prev[startVertex]=-1;
        d[startVertex]=0;
        Queue q;
        q.push(startVertex);
        while(q.Size()!=0){
        int u = q.Front();
        q.pop();
        color[u]='B';
            cout << "Visited " << u << " \n";
           for(int i=0;i<graph[u].size();i++){
                int v=graph[u][i];
                if(color[v]=='W'){
                    color[v]='G';
                    d[v]=d[u]+1;
                    prev[v]=u;
                    q.push(v);
                }
            }

        }
    }
};
int main(){
    Graph g(8);
    g.addEdge(0, 1);
    g.addEdge(1, 2);
    g.addEdge(1, 3);
    g.addEdge(1, 5);
    g.addEdge(2, 4);
    g.addEdge(3, 5);
    g.addEdge(4, 6);
    g.addEdge(5, 7);
    g.addEdge(6, 7);
    g.BFS(1);
    return 0;
}
