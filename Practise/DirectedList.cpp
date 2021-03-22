#include<bits/stdc++.h>
using namespace std;
#define MAX 100000
vector < int > edges[MAX];
vector < int > costs[MAX];
vector < int > inDegrees[MAX];

int main(){
    int numNodes, numEdges;
     cin>>numNodes>>numEdges;
    for(int i=1;i<=numEdges;i++){
        int x, y;
        cin>>x>>y;
        edges[x].push_back(y);
        inDegrees[y].push_back(x);
        costs[x].push_back(1);
        //costs[y].push_back(1);
    }

    // prints which nodes are connected
      cout<<"\nOutDegrees\n";
    for(int i=1;i<=numNodes;i++){
            int size = edges[i].size();
        for(int j=0;j<size;j++)
            cout<<edges[i][j]<<" ";
        cout<<endl;
    }

        // prints indegree and outdegrees
        cout<<"\InDegrees\n";
     for(int i=1;i<=numNodes;i++){
            int size = inDegrees[i].size();
        for(int j=0;j<size;j++)
            cout<<inDegrees[i][j]<<" ";
        cout<<endl;
    }




    return 0;
}


