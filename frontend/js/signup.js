const form = document.querySelector(".signup-form"); // grabbing all form inputs

const errorBox = document.getElementById("form-error"); // grabbing error

form.addEventListener("submit", async function(event) {
event.preventDefault(); // stops it from getting rid of everything that was input
errorBox.textContent = ''; // clear error message

const password = form.elements["password"].value;

if(password === form.elements["confirm-password"].value) {
    errorBox.textContent = "password does not match";
    return;
}

const data = {
    firstName: form.elements["first-name"].value,
    lastName: form.elements["last-name"].value,
    email: form.elements["email"].value,
    password: form.elements["password"].value,
    phoneNumber: form.elements["phone"].value,
    streetAddress: form.elements["street-address"].value,
    state: form.elements["state"].value,
    city: form.elements["city"].value,
    zipCode: form.elements["zip-code"].value,
    emergencyContactName: form.elements["emergency-name"].value,
    emergencyContactNumber: form.elements["emergency-phone"].value,
};

const response = await fetch("/api/auth/register", {
    method: "POST",
    headers: {"Content-Type": "application/json"},
    body: JSON.stringify(data)
})

.then(res => {
    if(!res.ok) {
        return res.json();
    }
})

} )
