const navbar = document.querySelector(".site-nav");

// shows dropdown
navbar.addEventListener("click", (e) => {
    const toggleBtn = e.target.closest(".site-nav__dropdown-toggle");
    
    if (toggleBtn) {
        toggleBtn.nextElementSibling.classList.toggle("is-hidden");
        switch (toggleBtn.getAttribute("aria-expanded")){
            case "true":
                toggleBtn.setAttribute("aria-expanded", "false");
                break;
            case "false":
                toggleBtn.setAttribute("aria-expanded", "true");
                break;
        }
    }

})