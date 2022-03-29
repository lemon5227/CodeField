import re
def md(exp):
    if '*' in exp:
        a,b = exp.split('*')
        return str(float(a)*float(b))
    elif '/' in exp:
        a,b = exp.split('/')
        return str(float(a)/float(b))

def mul_div(exp):
    while True:
        ret = re.search('\d+(\.\d+)?[*/]-?\d+(\.\d+)?',exp)
        if ret:
            atom_exp = ret.group()
            res = md(atom_exp)
            exp = exp.replace(atom_exp,res)
        else:
            return exp
def sa(exp):
    ret = re.findall('[+-]?\d+(?:\.\d+)?',exp)
    exp_sum =0
    for i in ret:
        exp_sum +=float(i)
    return exp_sum

def cal(exp):
    exp = mul_div(exp)
    sum =sa(exp)
    return sum

c = True
while c:
    a = input("请输入一个算式")
    print(cal(a))
    b = input("你还想继续算吗（是or否）")
    if b == '是':
        c =True
    elif b == '否':
        c=False
