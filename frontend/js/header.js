const hero = document.querySelector(".hero");
const header = document.querySelector(".l-header");


const options = {
    rootMargin: "-8% 0px 0px 0px"
};

header.addEventListener("click", (e) => {
    const toggleBtn = e.target.closest(".menu-toggle");
    if (toggleBtn){
        const isOpen = header.classList.toggle("is-menu-open");
        toggleBtn.setAttribute("aria-expanded", String(isOpen));
    }
})

// Reset menu and dropdown state when crossing the mobile breakpoint.
// Keep 1000px in sync with the menu breakpoints in master.css.
const mobileQuery = window.matchMedia("(max-width: 1000px)");

mobileQuery.addEventListener("change", () => {
    header.classList.remove("is-menu-open");
    header.querySelector(".menu-toggle")?.setAttribute("aria-expanded", "false");

    header.querySelectorAll(".site-nav__dropdown-toggle[aria-expanded='true']").forEach((btn) => {
        btn.setAttribute("aria-expanded", "false");
        btn.nextElementSibling.classList.add("is-hidden");
    });
});

if (hero && header) {
    const observer = new IntersectionObserver(([entry]) => {
        header.classList.toggle("is-over-hero", entry.isIntersecting);
    }, options);  

observer.observe(hero);
}



