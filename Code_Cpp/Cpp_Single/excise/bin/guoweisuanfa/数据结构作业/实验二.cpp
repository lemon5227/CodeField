#include "iostream"
using namespace std;
typedef struct Link
{
    int num;
    struct Link* next;
}link;
void InitList(link* L) {
    L = new link;
    L->next = NULL;
}
void in(int n, link* L) {
    link* p = new link;
    p = L;
    for (int i = 0; i < n; i++) {
        link* temp = new link;
        cin >> temp->num;
        temp->next = NULL;
        p->next = temp;
        p = p->next;
    }
}
void show(link* L){
    link* p = L->next;
    while (p != NULL) {
        cout << p->num<<endl;
        p = p->next;
    }
}

int main() {
    link La;
    InitList(&La);
    cout << "请输入La要存入的节点数";
    int n;
    cin >> n;
    in(n, &La);
    link Lb;
    InitList(&Lb);
    cout << "请输入La要存入的节点数";
    int m;
    cin >> m;
    in(m, &Lb);
    link* p, * q;
    p = &La;
    q = &Lb;
    link lc;
    InitList(&lc);
    link* c = &lc;
    link* temp = new link;
    c->next = temp;
    c = c->next;

    while (q->next != NULL && p->next != NULL) {
        if (q->next->num > p->next->num) {
            c->next = p->next;
            p->next = p->next->next;
            c = c->next;
        }
        else
        {
            c->next = q->next;
            q->next = q->next->next;
            c = c->next;
        }
    }
    if (q->next != NULL) {
        c->next = q->next;
    }
    if (q->next != NULL) {
        c->next = p->next;
    }
    return 0;
}


