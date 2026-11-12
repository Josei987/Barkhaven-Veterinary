const navbar = document.querySelector(".site-nav");

// shows dropdown
navbar.addEventListener("click", (e) => {
    const toggleBtn = e.target.closest(".site-nav__dropdown-toggle");
    
    if (toggleBtn) {
        const isOpen = toggleBtn.getAttribute("aria-expanded") !== "true";
        toggleBtn.setAttribute("aria-expanded", String(isOpen));
        toggleBtn.nextElementSibling.classList.toggle("is-hidden", !isOpen);
    }

})