var dic = {"1":1,"2":2,"3":3,"4":4,"5":5,"6":6,"7":7,"8":8,"9":9,"a":10,"b":11,"c":12,"d":13,"e":14,"f":15,"g":16,"h":17,"i":18,"j":19,"k":20,"l":21,"m":22,"n":23,"o":24,"p":25,"q":26,"r":27,"s":28,"t":29,"u":30,"v":31,"w":32,"x":33,"y":34,"z":35};
var dic_2={1:"1",2:"2",3:"3",4:"4",5:"5",6:"6",7:"7",8:"8",9:"9",10:"a",11:"b",12:"c",13:"d",14:"e",15:"f",16:"g",17:"h",18:"i",19:"j",20:"k",21:"l",22:"m",23:"n",24:"o",25:"p",26:"q",27:"r",28:"s",29:"t",30:"u",31:"v",32:"w",33:"x",34:"y",35:"z"};
var a = "abbbb";
var b ="1";
var n = a.split("");
var m = b.split("");
var num_a=0;    
var num_b=0;
for(var i=0; i<n.length; i++){
    num_a+=dic[n[i]]*(36**(n.length-i-1));
}
for(var i=0; i<m.length; i++){
    num_b+=dic[m[i]]*(36**(m.length-i-1));
}
var total = num_a+num_b;
console.log(total);
var total_str = ""
while(total > 1){
    total_str += dic_2[total%36];
    total = parseInt(total/36);
}
total_str = total_str.split("").reverse().join("");

console.log(total_str)