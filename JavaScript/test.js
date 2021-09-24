var cheese = 'Cheddar';

if(cheese){
    console.log('Yay! Cheese');
}else{
    console.log('No Chess on toast')
}
var myText = 'I am a string';
var newString = myText.replace('string', 'sausage');
console.log(newString);
var myArray = ['I', 'love', 'chocolate', 'frogs'];
var madeAString = myArray.join(' ');
console.log(madeAString);
let names = ['Chris', 'Li Kang', 'Anne', 'Francesca', 'Mustafa', 'Tina', 'Bert', 'Jada']
//let para = document.createElement('p');

// Add your code here
var num = Math.floor(Math.random()*names.length);
console.log(num);
// Don't edit the code below here!
function random(x,y){
    var num = x+Math.floor(Math.random()*y);
    return num;
}
function choseName(names){
    var num = random(0,names.length);
    return names[num];
}
var result = choseName(names);
console.log(result)


section.innerHTML = ' ';

section.appendChild(para);