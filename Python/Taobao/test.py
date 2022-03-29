from DecryptLogin import login
import re
import json
from prettytable import PrettyTable
lg = login.Login()

def writeJSON(fileName,data):
    import json
    """将数据`data`写入`fileName`
    
    [description]
    
    Arguments:
        fileName {[str]} -- 需要写入的文件的路径
        data {[str]} -- 如果data是一个对象而不是String类型，将会自动转换为string
    """
    with open(fileName,mode="w",encoding="utf-8") as file:
        if type(data) != str:
            data = json.dumps(data,ensure_ascii=False)
        file.write(data)
    file.close()

infos_return, session = lg.taobao('', '', 'scanqr')
url = 'https://cart.taobao.com/cart.htm'
headers = {
    'user-agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36',
    'sec-fetch-dest': 'document', 'sec-fetch-mode': 'navigate', 'sec-fetch-site': 'none', 'sec-fetch-user': '?1',
    'upgrade-insecure-requests': '1',
    'accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
    'accept-encoding': 'gzip, deflate, br', 'accept-language': 'zh-CN,zh;q=0.9,en;q=0.8',
    'cache-control': 'max-age=0'
}
response = session.get(url, headers=headers)
response_json = re.search('try{var firstData = (.*?);}catch', response.text).group(1)
response_json = json.loads(response_json)
data = enumerate(response_json['list'])
writeJSON("Taobao/response.json",response_json)
print( data)

