const speciesSelect = document.getElementById('species');
const breedSelect = document.getElementById('breed');
const petForm = document.querySelector('.add-pet-form');

const breedsBySpecies = {
    cat: ['Domestic Shorthair', 'Domestic Longhair', 'Siamese', 'Persian', 'Maine Coon', 'Ragdoll', 'Bengal', 'Other', 'Mixed', 'Unknown'],
    dog: ['Labrador Retriever', 'German Shepherd', 'Golden Retriever', 'French Bulldog', 'Poodle', 'Bulldog', 'Beagle', 'Corgi', 'Pug', 'Other', 'Mixed', 'Unknown']
};

speciesSelect.addEventListener('change', () => {
    const breeds = breedsBySpecies[speciesSelect.value];
    const placeholder = document.createElement('option');
    placeholder.value = '';
    placeholder.textContent = 'Select a breed';
    placeholder.disabled = true;
    placeholder.selected = true;

    breedSelect.replaceChildren(placeholder);
    breeds.forEach((breed) => {
        const option = document.createElement('option');
        option.value = breed.toLowerCase().replaceAll(' ', '-');
        option.textContent = breed;
        breedSelect.append(option);
    });
    breedSelect.disabled = false;
});

petForm.addEventListener('submit', (event) => {
    event.preventDefault();
    window.location.assign('./add-pet-success.html');
});
