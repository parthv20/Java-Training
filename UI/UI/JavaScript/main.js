// person = {
//   firstname: "test",
//   lastname: "user",
//   fullName: function () {
//     return this.firstName + " " + this.lastName;
//   },
// };

// const member = {
//   firstName: "Hege",
//   lastName: "Nilsen",
// };

// let fullName = person.fullName.bind(member);

// console.log(fullName());

// function greet() {
//   console.log("helo");
// }

// const timeoutId = setTimeout(greet, 2000);
// // clearInterval(intervalId);
// clearTimeout(greet, 2000);

async function greet() {
  let promise = new Promise((resolve, reject) => {
    setTimeout(() => resolve("Hello"), 2000);
  });

  let result = await promise;
  console.log(result);
}

greet();
