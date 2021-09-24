let myData = 'Manchester,London,Liverpool,Birmingham,Leeds,Carlisle';
myData
//字符串转化为内数组
let myarray = myData.split(',');
myarray
console.log(myarray[0]);
console.log(myarray[myarray.length-1]);
//数组转换为字符串
let myNewString = myarray.join(',');
console.log(myNewString);
let dogName = ["Rocket","Flash","Bella","Slugger"];
console.log(dogName.toString());
var newLength = myarray.push('Cardiff');
myarray;
console.log(newLength);
myarray.pop();
console.log(myarray.length);
//push压入数组末尾，unshift插入数组开头
myarray.unshift('Edinburgh');
myarray;
myarray.shift();
myarray;
