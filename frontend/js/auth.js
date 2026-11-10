async function loginRequest(redirectTo) { // in a page, put in loginRequest method passing in the redirect link want to go; gate that blocks users from accessing certain features
    const response = await fetch("/api/auth/me"); // page checks if logged in
    if(!response.ok) { // if not, will redirect to the link passed in
        window.location.href = redirectTo;
        return null;
    }
    return response.json(); // if logged in, return email
}
