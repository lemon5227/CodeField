var person = {
    name:['Bob','Smith'],
    age:32,
    gender:'male',
    interests:['music','skiing'],
    bio : function (){
        alert(this.name[0]+' '+this.name[1]+' '+this.age+' years old. He likes'+this.interests[0]+' and '+this.interests[1]+'.');
    },
    greetings: function () {
        alert("Hi! I\'m"+this.name[0]+'.');
    }
};
console.log(person.name[0]);
console.log(person.age);
console.log(person.interests[1]);
person.farewell = function () {
    albert("Bye everyone!")
};
var myDataName = 'height'
var myDataValue = '1.75m'
person[myDataName] = myDataValue
person;
function createNewPerson(name) {
    var obj = {};
    obj.name = name;
    obj.greeting = function () {
      alert('Hi! I\'m ' + this.name + '.');
    }
    return obj;
  }

  var salva = createNewPerson('salva');
  console.log(salva.name);
  salva.greeting();
