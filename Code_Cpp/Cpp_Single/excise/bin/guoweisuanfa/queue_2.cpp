#include "bits/stdc++.h"
using namespace std;
typedef struct Queue{
    string *data;
    int front;
    int rear;
}Queue;
int InitQueue(Queue* queue){
    if(!queue){
        return 0;
    }
    queue->front =queue->rear = 0;
    return 1;
}
int EmptyQueue(Queue* queue){
    if(!queue){
        return 0;
    }
    if(queue->front == queue->rear){
        return 1;
    }
    return 0;
}
int GetQueueSize(Queue* queue){
    if(!queue){
        return 0;
    }
    if(queue->front == queue->rear){
        return 0;
    }
    return queue->rear - queue->front;
}

int AddQueue(Queue* queue,string e){

    queue->data[queue->rear] = e;
    queue->rear = queue->rear+1;
    return 1;
}
int DelQueue(Queue* queue,string *e){
    *e = queue->data[queue->front];
    queue->front =queue->front+1;
    return 1;
}
void PrintQueue(Queue * queue){
    int begin = queue->front;
    while(begin !=queue->rear){
        cout << queue->data[begin]<< endl;
        begin++;
    }
    return;
}

int main() {
    Queue boy;
    Queue gril;
    int b,g;
    string name;
    //输入男女队列人数
    cin >> b >>g;
    for(int i=0;i<b;i++){
        cin >> name;
        AddQueue(&boy,name);
    }
    for(int i=0;i<g;i++){
        cin >> name;
        AddQueue(&gril,name);
    }
    while(boy.rear!=boy.front && gril.rear != gril.front){
        DelQueue(&boy,&name);
        cout << name;
        DelQueue(&gril,&name);
        cout << "--匹配--";
        cout <<name;
    }
    cout <<endl;
    if(boy.rear !=boy.front){
        cout <<"未匹配："<<endl;
        for(int i=boy.front;i<boy.rear;i++){
            cout << boy.data[i];
        }
    }
        if(gril.rear !=gril.front){
        cout <<"未匹配："<<endl;
        for(int i=gril.front;i<gril.rear;i++){
            cout << gril.data[i];
        }
    }
    return 0;
}