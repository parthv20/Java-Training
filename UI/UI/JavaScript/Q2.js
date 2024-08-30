class Day {
  constructor(year, month, day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }
}

function getDaysinMonth(year, month) {
  const daysInMonth = new Date(year, month, 0).getDate();
  const daysArr = [];

  for (let day = 1; day <= daysInMonth; day++) {
    daysArr.push(new Day(year, month, day));
  }

  return daysArr;
}

const year = 2024;
const month = 8;
console.log(getDaysinMonth(year, month));
