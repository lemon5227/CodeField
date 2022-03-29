import requests
import json # 用来解析JSON字符串
# 用这发起网络请求 你这个content也是随便找的?
# 这个是API requests 的API
#你是怎么一下找到的
#XHR里一个一个找？看接口名字 我是随便找一个接口发起请求
response = requests.get('https://api.bilibili.com/x/player/online/total?aid=977044462&cid=451985267&bvid=BV1644y1h7aA&ts=54609612')
# print(response.content ) #这个就是服务器给我们的数据 但是是字符串形式的 需要序列化(解析成Python的对象也就是dict)
# request 模拟浏览器 让服务端以为这个是一个正常的浏览器在访问它 而非是一个爬虫
data = json.loads(response.content) # 服务返回的数据
print(data)

# 之所以浏览器里面用的是XHR 就是因为 XMLHttpRequest 简写XHR
# XHR就是发起请求 和后端进行数据交互 而后端根据指定的路由返回对应的资源
# 什么是路由 也就是 各种网页链接的路径 / /index /api/resource 这类的
# 爬虫需要你对前端和后端都有了解 才能很好的掌握
# 所以了解了没
# 嗯
# 给你看个东西 Swagger 一个用来开发后端的工具