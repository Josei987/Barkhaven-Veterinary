const form = document.querySelector(".login-form");

const errorbox = document.getElementById("form-error");

form.addEventListener("submit", async function (event) {
    event.preventDefault();
    errorbox.textContent = "";

    const data = {
        email: form.elements["email"].value,
        password: form.elements["password"].value
    }
    
    try {
        const response = await fetch("/api/auth/login", {
            method: "POST",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(data)
        });
        if (response.ok) {
            window.location.href = "./index.html";
            return;
        }
        const body = await response.json().catch(() => ({}));
        errorbox.textContent = body.message || "Could not log in";
    } catch(error) {
        errorbox.textContent = "Could not reach server";
    }
})

