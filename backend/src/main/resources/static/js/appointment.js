const form = document.getElementById('appointmentForm');
const successMessage = document.getElementById('successMessage');

form.addEventListener('submit', function (event) {
    event.preventDefault();

    const data = {
        ownerName: form.ownerName.value,
        petName: form.petName.value,
        petType: form.petType.value,
        petBreed: form.petBreed.value,
        phoneNumber: form.phone.value,
        email: form.email.value,
        apptType: form.visitType.value,
        vet: form.vet.value,
        date: form.date.value,
        time: form.time.value,
        reason: form.reason.value,
    };

    fetch('/api/appointments', {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(data)
    })
    .then(res => {
        if(!res.ok) throw new Error('Server responsed with ' + res.status);
        return res.json();
    })
    .then(() => {
      successMessage.classList.add('show');
      form.reset();
      setTimeout(() => successMessage.classList.remove('show'), 3500);  
    })
    .catch(err => console.error('Booking failed', err));
})