#include"iostream"
using namespace std;
typedef struct Link
{
    int cishu; //多项式项的次数
    int xishu; //多项式项的系数
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
        cin >> temp->cishu;
        cin >> temp->xishu;
        temp->next = NULL;
        p->next = temp;
        p = p->next;
    }
}
int mian() {
    link la, lb, lc;
    InitList(&la);
    InitList(&lb);
    InitList(&lc);
    int n;
    in(n,&la);
    int m;
    in(m, &lb);
    link* a = &la, * b = &lb, * c = &lc;
    link* temp = new link;
    c->next = temp;
    c = c->next;
    for (int i = 0; i < n+m; i++) {
        if (a->next->cishu != b->next->cishu) {
            a->next = a->next->next;
        }
        else {
            a->next->xishu += b->next->xishu;
            b->next = b->next->next;

        }
            
    }
    return 0;

}