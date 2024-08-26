let userList = ["admin", "vineetks", "parth", "trial"];
let userPassword = ["admin", "vineetks", "123", "111"];
console.log(localStorage.getItem("userDetails"));
let userDetails = JSON.parse(localStorage.getItem("userDetails")) || {
  admin: {
    name: "Admin",
    address: "Masjid Banda, Hyderabad",
    phone: "9999999999",
    email: "admin@beehyv.com",
    website: "http://home.iitk.ac.in/~vineetks",
    profile_pic: "pic.png",
  },
  vineetks: {
    name: "Vineet Kumar Singh",
    address: "Masjid Banda, Hyderabad",
    phone: "9450788108",
    email: "vineet@beehyv.com",
    website: "http://home.iitk.ac.in/~vineetks",
    profile_pic: "pic.png",
  },
  parth: {
    name: "Parth Singh",
    address: "Maharashtra",
    phone: "6969696969",
    email: "parth69@69.com",
    website: "http://home.iitk.ac.in/~parth69",
    profile_pic: "pic.png",
  },
  trial: {
    name: "XYZ",
    address: "Malipur Road",
    phone: "7506940869",
    email: "srijan-singh@beehyv.com",
    website: "http://home.iitk.ac.in/~vineetks",
    profile_pic: "pic.png",
  },
  // Add other users here if needed
};

function saveDetails(){
  const details=localStorage.getItem("userDetails");
  if(details===null){
    localStorage.setItem("userDetails",JSON.stringify(userDetails))
    localStorage.setItem("userList",JSON.stringify(userList))
    localStorage.setItem("userPassword",JSON.stringify(userPassword))
  }
}
saveDetails()

const loginForm = document.getElementById("loginForm");

function redirectToProfile() {
  window.location.href = "profile.html";
}

function redirectToLogin() {
  window.location.href = "index.html";
}

function checkLoginStatus() {
  const currentUser = localStorage.getItem("currentUser");
  if (currentUser) {
    redirectToProfile();
  }
}

loginForm?.addEventListener("submit", function (event) {
  userList = JSON.parse(localStorage.getItem("userList"));
  userPassword = JSON.parse(localStorage.getItem("userPassword"));

  console.log(userList);

  event.preventDefault();
  const username = loginForm.username.value;
  const password = loginForm.password.value;
  const userIndex = userList.indexOf(username);

  if (userIndex > -1 && userPassword[userIndex] === password) {
    localStorage.setItem("currentUser", username); // Save the logged-in user
    redirectToProfile();
  } else {
    alert("Invalid username or password");
  }
});

checkLoginStatus();
