
class Car {
  constructor(brand) {
    this.carname = brand;
  }
  carMethod = () => "I have a " + this.carname;
}
class Model extends Car {
  constructor(brand) {
    super(brand);
  }
  model = "mustang";
  modelMethod = () => this.carMethod() + " with model " + this.model;
}
// class Car {
//     constructor(brand) {
//       this.carname = brand;
//     }
//     carMethod = () => "I have a " + this.carname;
//   }
   
//   class Model extends Car {
//     constructor(brand) {
//       super(brand);
//     }
//     model = "mustang";
//     modelMethod = () => this.carMethod() + " and it is a " + this.model;
//   }



let myCar = new Model("ford");
let out = myCar.modelMethod();
console.log(out);


console.log(null >= 0);
console.log(undefined == 0);
console.log(undefined >= 0);
console.log(undefined < 0);



function getThis() {
  return this;
}

const obj1 = { name: "obj1" };
const obj2 = { name: "obj2" };

obj1.getThis = getThis;
obj2.getThis = getThis;

console.log(obj1.getThis()); 
console.log(obj2.getThis()); 


const obj4 = {
  name: "obj4",
  getThis() {
    return this;
  },
};

const obj5 = { name: "obj5" };

obj5.getThis = obj4.getThis;
console.log(obj5.getThis());



