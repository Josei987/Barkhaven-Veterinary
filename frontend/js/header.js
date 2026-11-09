const hero = document.querySelector(".hero");
const header = document.querySelector(".l-header");


const options = {
    rootMargin: "-8% 0px 0px 0px"
};

header.addEventListener("click", (e) => {
    const toggleBtn = e.target.closest(".menu-toggle");
    if (toggleBtn){
        header.classList.toggle("is-menu-open");
    }
})

if (hero && header) {
    const observer = new IntersectionObserver(([entry]) => {
        header.classList.toggle("is-over-hero", entry.isIntersecting);
    }, options);  

observer.observe(hero);
}



