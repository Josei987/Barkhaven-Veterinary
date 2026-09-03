document.addEventListener('DOMContentLoaded', () => {
	const hero = document.querySelector('.hero');
	if (!hero) return;

	// If you want to manage images from HTML, set a data-images attribute
	// on the .hero element with a comma-separated list of image paths.
	// Example in HTML: <section class="hero" data-images="../IMAGES/a.jpg,../IMAGES/b.jpg">
	const data = hero.getAttribute('data-images');
	const images = data
		? data.split(',').map(s => s.trim()).filter(Boolean)
		: [
				'../IMAGES/black-tan-corgi-smiling-2000-2a96b7bacf1b42d3889a2966afdf680e.jpg'
			];

	const pick = images[Math.floor(Math.random() * images.length)];
	const gradient = 'linear-gradient(rgba(0,0,0,0.5), rgba(0,0,0,0.5)), url(' + pick + ')';
	hero.style.backgroundImage = gradient;
});
