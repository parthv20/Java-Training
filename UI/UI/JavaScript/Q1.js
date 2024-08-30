function School(name) {
  this.name = name;
}

function Employee(name, schoolName) {
  this.name = name;
  this.schoolName = schoolName;
}

function Teacher(name, schoolName, designation) {
  this.name = name;
  this.schoolName = schoolName;
  this.designation = designation;
}

// Employee should inherit from School
Employee.prototype = Object.create(School.prototype);
Employee.prototype.constructor = Employee;

// Teacher should inherit from Employee
Teacher.prototype = Object.create(Employee.prototype);
Teacher.prototype.constructor = Teacher;

// Use regular function expressions instead of arrow functions
School.prototype.getName = function () {
  return this.name;
};

Employee.prototype.getSchoolName = function () {
  return this.schoolName;
};

Teacher.prototype.getDesignation = function () {
  return this.designation;
};

// Creating instances and testing the getters
const school = new School("Beehyv School");
const employee = new Employee("Akshit", school.getName());
const teacher = new Teacher("Rakesh", school.getName(), "Mentor");

console.log("School Name:", school.getName()); // Beehyv School
console.log("Employee Name:", employee.getName()); // Akshit
console.log("Employee School Name:", employee.getSchoolName()); // Beehyv School
console.log("Teacher Name:", teacher.getName()); // Rakesh
console.log("Teacher School Name:", teacher.getSchoolName()); // Beehyv School
console.log("Teacher Designation:", teacher.getDesignation()); // Mentor
