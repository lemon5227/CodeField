#include "iostream"
#include "queue"
#include "vector"
#include "string"
using namespace std;
struct documents {
    string name;
    int grade;
};
bool operator<(documents a, documents b){
    return a.name < b.name;
}
int main(){
    priority_queue<documents> pq;
    string x;
    int y;
    while(cin >> x >> y)
        pq.push({x,y});
    while(!pq.empty()){
        cout <<pq.top().name << " " << pq.top().grade <<endl;
        pq.pop();
    }
    return 0;
}