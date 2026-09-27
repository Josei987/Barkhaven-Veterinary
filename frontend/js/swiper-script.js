const swiper = new Swiper('.container.swiper', {
    loop: true,
    slidesPerView: 1,
    slidesPerGroup: 1,
    centeredSlides: false,
    spaceBetween: 30,
    roundLengths: true,

    autoplay: {
        delay: 3000,
        disableOnInteraction: false,
        pauseOnMouseEnter: true,
    },

    // Responsive breakpoints
    breakpoints: {
        0: { slidesPerView: 1},
        768: { slidesPerView: 2 },
        1024: { slidesPerView: 3 },
    },

    // Pagination
    pagination: {
        el: '.carousel-frame .swiper-pagination',
        clickable: true,
        dynamicBullets: true,
    },

    navigation: {
        nextEl: '.carousel-frame .swiper-button-next',
        prevEl: '.carousel-frame .swiper-button-prev'
    }
});


const testimonial_swiper = new Swiper('.testimonial.swiper', {
  // Optional parameters
  loop: false,
  slidesPerView: 1,
  spaceBetween: 30,
  centeredSlides: false,
});
