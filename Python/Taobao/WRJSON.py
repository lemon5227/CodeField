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


def readJSON(fileName):
    import json
    """读取JSON文件
    
    [description]
    
    Arguments:
        fileName {str} -- 文件路径
    
    Returns:
        dict -- 返回字典类型
    """
    if type(fileName)==str:
        file = open(fileName,mode="r",encoding="utf-8")
        data = file.read()
        data = json.loads(data,encoding="utf-8")
        file.close()
    return data
    