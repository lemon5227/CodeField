## 淘宝分析

- 登录需要token,cookies

```json
{
    "smsLoginApi": "/newlogin/sms/login.do?appName=taobao&fromSite=0",
    "loginApi": "/newlogin/login.do?appName=taobao&fromSite=0",
    "simLoginApi": "/newlogin/simLogin.do?appName=taobao&fromSite=0",
    "checkLoginApi": "/newlogin/checkLogin.do?appName=taobao&fromSite=0",
    "smsLoginRegApi": "/newlogin/sms/reg.do?appName=taobao&fromSite=0",
    "aKeyCheckApi": "/newlogin/akey-query.do?appName=taobao&fromSite=0",
    "getQRCodeApi": "/newlogin/qrcode/generate.do?appName=taobao&fromSite=0",
    "conLoginApi": "/newlogin/mini_continue_login.do?appName=taobao&fromSite=0",
    "sendSmsApi": "/newlogin/sms/send.do?appName=taobao&fromSite=0",
    "hasLoginApi": "/newlogin/hasLogin.do?appName=taobao&fromSite=0",
    "recommendLoginFlowApi": "/newlogin/recommendLoginFlow.do?appName=taobao&fromSite=0",
    "checkQRCodeApi": "/newlogin/qrcode/query.do?appName=taobao&fromSite=0",
    "accountCheckApi": "/newlogin/account/check.do?appName=taobao&fromSite=0",
    "aKeyPushApi": "/newlogin/akey-push.do?appName=taobao&fromSite=0"
}
```

```js
sendRequest: function(e) {
            a(e, this.getConfig("imgUrl"))
        },
postData: function(e, t) {
            var n = {};
            n[t] = e[t],
            delete e[t];
            var i = "";
            "object" == (void 0 === e ? "undefined" : o(e)) && (i = r.serialize(e)),
            s(n, this.getConfig("imgUrl") + i + "&post_res=")
        },
```

[]("https://arms-retcode.aliyuncs.com/r.png?t=api&times=1&page=login.taobao.com%2Fmember%2Flogin.jhtml&tag=null_213eedcd16451580723272705d0392&release=0.7.2&begin=1645159466415&c1=taobao_pc&c2=taobao&c3=&api=%2Fnewlogin%2Flogin.do&success=1&time=414&code=200&msg=&traceId=6d8d4f641645159466414100350cf1&pv_id=d0kU6z46r11wqjned0F948FcsIyj&domain=login.taobao.com&flag=1&sr=1549x872&vp=884x734&ct=4g&uid=mOkL9zyzrjXw7khjhr0jqI0m3vs4&sid=7zk7sz1Or0hw9zn2L1CRzwgq9vjk&pid=gf3el0xc6g%40256d85bbd150cf1&_v=1.8.30&sampling=1&dl=https%3A%2F%2Flogin.taobao.com%2Fmember%2Flogin.jhtml%3Fspm%3Da21bo.jianhua.754894437.1.5af911d990N6TY%26f%3Dtop%26redirectURL%3Dhttps%253A%252F%252Fwww.taobao.com%252F&z=kzrwn04i&post_res=")
```js
 e.exports = function(e, t) {
        try {
            var n = new a;
            n.open("POST", t, !0),
            n.setRequestHeader("Content-Type", "text/plain"),
            n.send(JSON.stringify(e))
        } catch (e) {
            r.warn("[retcode] Failed to log, exception is :\n" + e)
        }
    }
```